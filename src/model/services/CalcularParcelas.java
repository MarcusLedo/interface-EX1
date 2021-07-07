package model.services;

import model.entities.Contrato;
import model.entities.Parcela;
import java.util.Calendar;

public class CalcularParcelas {
	
	private static Calendar cal = Calendar.getInstance();
	
	private ServicoPagamento servico;
	
	public CalcularParcelas(ServicoPagamento servico) {
		this.servico = servico;
	}
	
	public void processarContrato(Contrato contrato, int mes, int nParcelas) {
		Parcela parcela = contrato.getParcelas().get(mes - 1);
		double amount = contrato.getTotalValue() / nParcelas;
		cal.setTime(parcela.getData());
		cal.add(Calendar.MONTH, mes);
		
		parcela.setAmount(servico.calcularValor(amount, mes));
		parcela.setData(cal.getTime());
		
	}
}
