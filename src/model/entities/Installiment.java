package model.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Installiment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date duoDate;
	private Double amount;
	
	public Installiment() {
	}

	public Installiment(Date duoDate, Double amount) {
		super();
		this.duoDate = duoDate;
		this.amount = amount;
	}

	public Date getDuoDate() {
		return duoDate;
	}

	public void setDuoDate(Date duoDate) {
		this.duoDate = duoDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return sdf.format(duoDate) + " - " + String.format("%.2f", amount);
	}
	
}
