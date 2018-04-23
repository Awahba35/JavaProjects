package Model;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 * @author ahmed Wahba
 * 4/22/2018
 * This program displays the change breakdown of which coins you return to user.

 */

public class ComputeChange {

	public static void main(String[] args) {
		
		 double amt = getInputFromUser();

	        int remainingCents = (int) (amt * 100);         

	        int quarters = remainingCents / 25;
	        remainingCents %= 25;

	        int dimes = remainingCents / 10;
	        remainingCents %= 10;

	        int nickles = remainingCents / 5;
	        remainingCents %= 5;

	        int pennies = remainingCents;

	        System.out.println(String.format(
	                    "Quarters %d, Dimes %d, Nickles %d, Cents %d", quarters,
	                    dimes, nickles, pennies));      
	    }


	    private static double getInputFromUser() {
	        double amt = BigDecimal.ZERO.doubleValue();
	        do {
	            Scanner keyboard = new Scanner(System.in);
	            System.out.print("Change in Coins\n" + "----------------\n\n");
	            System.out.println("Enter the amount less than $1.00, but\n"
	                    + "more than zero.");
	            System.out.print("\nEnter amount: ");
	            amt = keyboard.nextDouble();
	        } while (amountGreaterThanOne(amt) || amountIsZero(amt));
	        return amt;
	    }


	    private static boolean amountIsZero(double amt) {
	        return (BigDecimal.valueOf(amt).compareTo(BigDecimal.ZERO) == 0);
	    }


	    private static boolean amountGreaterThanOne(double amt) {
	        return BigDecimal.valueOf(amt).compareTo(BigDecimal.ONE) > 0;
	    }
	}





