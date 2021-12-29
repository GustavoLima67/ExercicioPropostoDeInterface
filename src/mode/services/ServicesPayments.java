package mode.services;

import mode.entities.Contract;

public class ServicesPayments {

	private ContractProccesing contractProccesing;
	private Contract contract;
	
	public ServicesPayments() {
	}

	public ServicesPayments(ContractProccesing contractProccesing, Contract contract) {
		this.contractProccesing = contractProccesing;
		this.contract = contract;
	}

	public ContractProccesing getContractProccesing() {
		return contractProccesing;
	}

	public void setContractProccesing(ContractProccesing contractProccesing) {
		this.contractProccesing = contractProccesing;
	}
	
	public Contract getContract() {
		return contract;
	}
	
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
}
