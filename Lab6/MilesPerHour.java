package CSC171_Lab1;

import java.util.Scanner;

public class MilesPerHour {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a miles per hour: ");
		String num1 = scan.next();
		System.out.print("Please enter a number of hours: ");
		String num2 = scan.next();
		
		double mph = Double.parseDouble(num1);
		int hrs = Integer.parseInt(num2);
		int temphrs = 0;
		
		for(temphrs = 0; temphrs <= hrs; temphrs++)
		{
			double tempmiles = temphrs * mph;
			System.out.println("After " + temphrs + " hour you will have gone " + tempmiles + " miles.");
		}
	}
}
