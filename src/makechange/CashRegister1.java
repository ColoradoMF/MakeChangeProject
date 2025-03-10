package makechange;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// declare variables
		double enteredItemPrice = 0.0;
		int itemPriceInt = 0;
		double enteredAmountTendered = 0.0;
		int amountTenderedInt = 0;
		double displayedChangeDue = 0;
		int changeDueInt = 0;
		
		int numTwenties = 0;
		int numTens = 0;
		int numFives = 0;
		int numOnes = 0;
		int numQuarters = 0;
		int numDimes = 0;
		int numNickels = 0;
		int numPennies = 0;

		// prompt for the price of the item.
		System.out.println("What is the price of the item? :");

		enteredItemPrice = keyboard.nextDouble();

		// convert user's enteredItemPrice in dollar format (floating point)
		// to store dollar values as an Int for accurate calculations
		
		itemPriceInt = (int)(enteredItemPrice * 100);
		
			//System.out.println(enteredItemPrice);
			//System.out.println(itemPriceInt);

		// prompt for the price of the item.
		System.out.println("What dollar amount is being tendered?: $");
		
		// convert user's enteredItemPrice in dollar format (floating point)
		// to store as an Int for accurate calculations 
		
		enteredAmountTendered = keyboard.nextDouble();
		
		System.out.println("enteredAmountTendered - enteredItemPrice = " + (enteredAmountTendered - enteredItemPrice));
		
		if ( enteredAmountTendered < enteredItemPrice ) {
		System.out.println("To purchase this item kindly tender more than $" + (itemPriceInt / 100) + ".");	
		}
	
		amountTenderedInt = (int)(enteredAmountTendered);
		 
		
		displayedChangeDue = enteredAmountTendered - enteredItemPrice; 
		changeDueInt = itemPriceInt - amountTenderedInt;
		
		
		//
		System.out.println("You tendered $" + (double)amountTenderedInt);
		
		//Print total amount of change due back to customer
		System.out.println("Your change is $" + (double)changeDueInt / 100);
		
		//Print number of each denomination (only if being provided)
		System.out.println("Change provided with the following cash monetary denominations:");
		
		
		numTwenties = changeDueInt / 2000;
			if (numTwenties > 0) {
				System.out.println("$20 Bills : " + numTwenties);
			}
			else
		
		numTens = (changeDueInt / 1000);
			if (numTens > 0) {
				System.out.println("$10 Bills : " + numTens);
			}
			else
		
		numFives = (changeDueInt / 100) / 20;
			if (numFives > 0) {
				System.out.println("$5 Bills : " + numFives);
			}
			else
		
		numOnes = (changeDueInt / 100) / 20;
			if (numOnes > 0) {
				System.out.println("$1 Bills : " + numOnes);
			}
			else
				
		numQuarters = (changeDueInt / 100) / 20;
			if (numQuarters > 0) {
				System.out.println("Quarters : " + numQuarters);
			}
			else
				
		numDimes = (changeDueInt / 100) / 20;
			if (numDimes > 0) {
				System.out.println("Dime Coins : " + numDimes);
			}
			else
		
		numNickels = (changeDueInt / 100) / 20;
			if (numNickels > 0) {
				System.out.println("Nickels : " + numNickels);
			}
			else
			
		numPennies = (changeDueInt / 100) / 20;
			if (numPennies > 0) {
				System.out.println("Pennies : " + numPennies);
			}
		
			
			



		
		keyboard.close();
	}

}