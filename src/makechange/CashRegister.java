package makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		// declare variables
		double priceDouble = 0.0;	// item price
		double paidDouble = 0.0;	// dollars paid
		double changeDouble = 0;	// change = price - paid

		// prompt for the price of the item and store as type double.
		System.out.println("What is the price of the item?");
		priceDouble = kb.nextDouble();

		// prompt for the amount paid 
		System.out.println("What is the amount paid?");
		paidDouble = kb.nextDouble();
		
		// calculate change as price - paid and store in changeDouble  
		changeDouble = paidDouble - priceDouble;
		paidDouble = formatDouble(paidDouble);
		priceDouble = formatDouble(priceDouble);
		changeDouble = formatDouble(changeDouble);
	
		if ( changeDouble < 0 ) {
			System.out.println("Must pay at least the price of the item.");
		}
		
		else if (priceDouble == paidDouble) {
		System.out.println("No change. You paid the exact amount due. Thanks, come again.");
		}
		
		else if (paidDouble > priceDouble) {
		//	confirm amount paid and total change due back to customer.
		
		System.out.println("You tendered $" + paidDouble + " for the item priced $" + priceDouble + ".");
		System.out.println("Your change is $" + changeDouble + "," + "\n" + "provided with the following # of each denomination:");
		}
		

		//Print number of each denomination (only those necessary)
		// call method that calculates number of each denomination totaling change due.
		denominations(changeDouble);
		
		kb.close();
		
	}

	
	public static double formatDouble(double difference) {
		DecimalFormat df = new DecimalFormat("#.00");
		difference = Double.valueOf(df.format(difference));
		return difference;
	}
	

	public static void denominations(double change) {
		
		double remaining = change; 	// remaining change due
		int Twenties = 0; 			// number of twenties
		int Tens = 0;				// number of tens
		int Fives = 0;				// number of fives
		int Ones = 0;				// number of ones
		int Quarters = 0;			// number of quarters
		int Dimes = 0;				// number of dimes
		int Nickels = 0;			// number of nickels
		int Pennies = 0;			// number of pennies
		
		//Calculate and then print out the number of each currency denomination, if any.
		
		if (remaining >= 20.0) {
			Twenties++;
			Twenties *= remaining / 20.0;
			remaining = remaining % 20.0;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 10.0) {
			Tens++;
			Tens *= remaining / 10.0;
			remaining = remaining % 10.0;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 5.0) {
			Fives++;
			Fives *= remaining / 5.0;
			remaining = remaining % 5.0;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 1.0) {
			Ones++;
			Ones *= remaining / 1.0;
			remaining = remaining % 1.0;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 0.25) {
			Quarters++;
			Quarters *= remaining / 0.25;
			remaining = remaining % 0.25;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 0.10) {
			Dimes++;
			Dimes *= remaining / 0.10;
			remaining = remaining % 0.10;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 0.05) {
			Nickels++;
			Nickels *= remaining / 0.05;
			remaining = remaining % 0.05;
			remaining = formatDouble(remaining);
		}
		
		if (remaining >= 0.01) {
			Pennies++;
			Pennies *= remaining / 0.01;
			remaining = remaining % 0.01;
			remaining = formatDouble(remaining);
		}

			
		if (Twenties != 0) {
			System.out.println("Twenties: " + Twenties);
		}
		if (Tens != 0) {
			System.out.println("Tens: " + Tens);
		}
		if (Fives != 0) {
			System.out.println("Fives:" + Fives);
		}
		if (Ones != 0) {
			System.out.println("Ones: " + Ones);
		}
		if (Quarters != 0) {
			System.out.println("Quarters: " + Quarters);
		}
		if (Dimes != 0) {
			System.out.println("Dimes: " + Dimes);
		}
		if (Nickels != 0) {
			System.out.println("Nickels: " + Nickels);
		}
		if (Pennies != 0) {
			System.out.println("Pennies: " + Pennies);
		}
	}
}