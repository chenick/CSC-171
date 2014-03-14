/*
 * Name: Charlie Henick
 * Assignment Number: 10
 * Course: CSC 171
 * Lab Session: MW 12:30-1:45PM
 * TA: Mark Mullock
 * File Name: MoreMethods.java
 * 
 */

import java.util.*;

public class MoreMethods 
{
	public static void main(String [] args)
	{
		System.out.println(prime(17));				//Test #1
		OneHundredPrimes();							//Test #2
		System.out.println(reverseNumber(22000));	//Test #3
		System.out.println(GCD(75, 90));			//Test #4
		GuessNumber();								//Test #5
	}
	//#1
	public static boolean prime(Integer n)
	{
		boolean prime = false;
		
		if (n == 2)
			prime = true;
		else
		{
			for(int k = 2; k < n; k++)
			{
				int remainder = n % k;
			
				if (remainder != 0) 
					prime = true;
				else
				{
					prime = false;
					break;
				}
			}
		}
		return prime;
	}
	//#2
	public static void OneHundredPrimes()
	{
		int i = 0;
		int k = 2;
		while(i < 100)
		{
			if (prime(k) == true)
			{
				System.out.print(k + " ");
				i++;
				k++;
			}
			else
				k++;
		}
		System.out.println();
	}
	//#3
	public static Integer reverseNumber(Integer n)
	{
		String s = Integer.toString(n);
		int k = s.length();
		int j = 0;
		int m = 1;
		char[] number = s.toCharArray();
		
		if (number[0] == '-')			//Ensures that a negative number retains its minus sign
			j = 1;
		
		if (number[k-1] == '0')			//Ensures that reversed numbers do not begin with a 0
			m = 2;
		
		String newNum = "";
		
		for(int i = k-m; i >= j; i--)
			newNum = newNum + number[i];
		
		if (j == 1)
			newNum = "-" + newNum;
		
		int reverseNum = Integer.parseInt(newNum);
		
		return reverseNum;
	}
	//#4
	public static int GCD(int x, int y)	//From class demonstration
	{
		if (y == 0)
			return x;
		return GCD(y, x%y);
	}
	//#5
	public static void GuessNumber()
	{
		int n = 99;
		
		Random generator = new Random();
		
		int randomIndex = generator.nextInt(n);
		int randomNumber = randomIndex + 1;
		int k = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter an integer guess between 1 and 100: ");
		int input = s.nextInt();
		
		while (input != randomNumber)
		{
			if (input > randomNumber)
				System.out.println("Your guess is too high. Guess again: ");
			else
				System.out.println("Your guess is too low. Guess again: ");
			input = s.nextInt();
			k++;
		}
		System.out.println("Correct! You took " + k + " guesses to correctly guess the number.");
	}
	
}
