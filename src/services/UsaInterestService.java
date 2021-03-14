package services;

public class UsaInterestService implements InterestService {
	private double getInterestRate;
	
	public UsaInterestService(double taxaDeJuro) {
		this.getInterestRate = taxaDeJuro;
	}

	@Override
	public double getInterestRate() {
		return getInterestRate;
	}


}
