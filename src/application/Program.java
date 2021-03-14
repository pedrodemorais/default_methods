package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		final double juro = 1.0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		
		InterestService brazil= new UsaInterestService(juro) ;
		System.out.println("Valor a ser pago após "+months+" meses:");
		System.out.printf("R$ %.2f",brazil.payment(amount, months));

	}

}
