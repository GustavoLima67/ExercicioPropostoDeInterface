package mode.entities;

import java.sql.Date;

public class Installiment {

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
	
}
