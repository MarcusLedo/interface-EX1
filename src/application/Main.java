package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.CalcularParcelas;
import model.services.PayPal;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		CalcularParcelas processarParcela = new CalcularParcelas(new PayPal());
		
		System.out.println("Enter contract data: ");
		System.out.print("-> Number: ");
		int number = sc.nextInt();
		System.out.print("-> Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("-> Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(number, date, valor);
		
		System.out.print("-> Numero de parcelas: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			contrato.addParcela(new Parcela(date));
			processarParcela.processarContrato(contrato, (i + 1), N);
		}
		
		System.out.println();
		
		for(Parcela x : contrato.getParcelas())
			System.out.println(sdf.format(x.getData()) + " - " +  String.format("%.2f", x.getAmount()));
			
		
		sc.close();
	}

}
