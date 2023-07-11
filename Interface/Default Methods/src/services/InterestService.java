package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	public Double getInterestRate();
	
	default Double getTotalLoan(Double loan, Integer months) {
		if (months < 1) {
			throw new InvalidParameterException("Months cannot be lower than 1");
		}
		
		return loan * Math.pow((1 + getInterestRate()/100), (double)months);
		
	}
	
}
