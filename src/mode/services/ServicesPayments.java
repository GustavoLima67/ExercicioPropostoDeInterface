package mode.services;

public class ServicesPayments {

	private ContractProccesing contractProccesing;
	
	public ServicesPayments() {
	}

	public ServicesPayments(ContractProccesing contractProccesing) {
		super();
		this.contractProccesing = contractProccesing;
	}

	public ContractProccesing getContractProccesing() {
		return contractProccesing;
	}

	public void setContractProccesing(ContractProccesing contractProccesing) {
		this.contractProccesing = contractProccesing;
	}
	
}
