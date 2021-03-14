package services;

public class BrazilInterestService implements InterestService {
	private double interestRate;

	public BrazilInterestService(double taxaDeJuro) {
		this.interestRate = taxaDeJuro;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
