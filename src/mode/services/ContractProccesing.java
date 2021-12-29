package mode.services;

public class ContractProccesing {

	private Integer numberInstaliments;
	
	public ContractProccesing() {
	}

	public ContractProccesing(Integer numberInstalliments) {
		super();
		this.numberInstaliments = numberInstalliments;
	}

	public Integer getNumberVerlangde() {
		return numberInstaliments;
	}

	public void setNumberVerlangde(Integer numberInstaliments) {
		this.numberInstaliments = numberInstaliments;
	}
	
}