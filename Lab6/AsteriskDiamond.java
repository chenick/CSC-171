package CSC171_Lab1;

import java.util.Scanner;

public class AsteriskDiamond 
{
	public static void main(String [] args)
	{
		int i;
		int j;
		int k;
		int l;
		double toprows;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows would you like the diamond to be? ");
		String num1 = scan.next();
	
		int rows = Integer.parseInt(num1);
		if (rows % 2 == 0)
			toprows = rows/2;
		else
			toprows = (rows + 1)/2;
		
		do
		{
			l = (int)(toprows);						//Number of rows in top and bottom level of diamond
		}
		while (l % 2 == 0);
		
		for (i = 1; i <= l; i++)
		{
			for (k = l; k > i; k--)
				System.out.print(" ");
			for (j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
					
		}
		for (i = l; i > 0; i--)
		{
			for(k = l; k > i; k--)
				System.out.print(" ");
			for (j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
		}
	}
}
