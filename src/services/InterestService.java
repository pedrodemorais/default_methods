package services;

import java.security.InvalidParameterException;

public interface InterestService {
	double getInterestRate();
	
	default double payment(double amount, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses não pode ser menor que 1");
		} else
			return amount * Math.pow(1 + getInterestRate() / 100, meses);

	}


}
