package CSC171_Lab1;

import java.util.Scanner;

public class FavoriteFood 
{
	public static void main(String [] args)
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("What is your favorite food? ");
	String favfood = scan.next();
	System.out.print("How many times do you eat this food for dinner per month? ");
	String num2 = scan.next();
	
	int timespermonth = Integer.parseInt(num2);
	int k = 1;
	
	while(k <= timespermonth)
	{
		System.out.println("Time " + k + ": You ate " + favfood + " for dinner.");
		System.out.println("Did you drink water with this meal? ");
		String wateryn = scan.next();
		if(wateryn.equals("Yes"))
			System.out.println("Your beverage during this meal was water.");
		else
			System.out.println("You did not drink water with this meal.");
		k = k + 1;
	}
	
	}
	
}
