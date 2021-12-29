package mode.entities;

import java.util.Date;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	private Installiment installiments;
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue, Installiment installiments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installiments = installiments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	public Installiment getInstalliments() {
		return installiments;
	}
	
	public void setInstalliments(Installiment installiments) {
		this.installiments = installiments;
	}

	public double totalValue() {
		
	}
	

}
