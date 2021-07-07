package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contrato {
	private Integer numero;
	private Date data;
	private double totalValue;
	private List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato(Integer numero, Date data, double totalValue) {
		this.numero = numero;
		this.data = data;
		this.totalValue = totalValue;
	}

	public Integer getNumero() {
		return numero;
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTotalValue() {
		return totalValue;
	}
	
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}


	public void addParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void removeParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}

	
	
}
