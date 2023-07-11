package services;

import java.security.InvalidParameterException;

public class BrazilianInterestService implements InterestService{
	
	private final Double rate = 2.0;
	private Double interestRate;
	//private Integer installments;
	
	
	public BrazilianInterestService() {
	}
	
	/*public BrazilianInterest(Double interestRate, Integer installments) {
		this.interestRate = interestRate;
		this.instalments = installments;
	}*/
	
	public BrazilianInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return this.interestRate;
	}
	
	/*public Integer getTnstalments() {
		return this.instalments;
	}*/
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	/*public void setInstalments(Integer installments) {
		this.instalments = installments;
	}*/

	/*public Double getTotalLoan(Double loan) {
		return loan * Math.pow(rate, installments);
	}*/
	
	
	
}
