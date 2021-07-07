package model.entities;

import java.util.Date;

public class Parcela {
	private Date data;
	private double amount;
	
	public Parcela(Date data, double amount) {
		this.data = data;
		this.amount = amount;
	}
	
	public Parcela(Date date) {
		this.data = date;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
