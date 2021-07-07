package model.services;


public class PayPal implements ServicoPagamento {
	
	
	public double calcularValor(Double amount, int mes) {
		double total = (double) amount + (0.01 * amount) * mes;
		
		return total + total * 0.02;
	}
}
