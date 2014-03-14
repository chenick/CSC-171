/*
 * File Name: MinorsorMajors.java														
 * Author: Charles Henick
 * Date: 09/22/13
 * Course: CSC171 Fall 2013
 * Lab Session: TR 6:15-7:30PM
 * Lab TA: --
 */

package CSC171_Lab1;

import java.util.Scanner;

public class MinorsorMajors 
{
	public static void main(String [] args)												//Main method
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many Home Runs does this player have this season? ");	//User queries
		String num1 = scan.next();
		
		System.out.println("Is this player a fan favorite? (Yes or No)");
		String fanFav = scan.next();
		
		int numHR = Integer.parseInt(num1);
		
		//Conditional statements below
		System.out.println(fanFav.equals("Yes") ? "Player is a fan favorite!" : "Player is not a fan favorite.");
		if (numHR >= 0 && numHR <= 5)
			if (fanFav.equals("Yes"))
				System.out.println("Designate player for minor league assignment, although they are a fan favorite");
			else
				System.out.println("Designate player for minor league assignment, they are not a fan favorite");
		else if (numHR >= 6 && numHR <= 29)
			if (fanFav.equals("Yes"))
				System.out.println("Keep player in major leagues, they are a fan favorite");
			else
				System.out.println("Keep player in major leagues, although they are not a fan favorite");
		else if (numHR >= 30 && numHR <= 72)
			if (fanFav.equals("Yes"))
				System.out.println("Negotiate contract extension with player, they are a fan favorite");
			else
				System.out.println("Negotiate contract extension with player, although they are not a fan favorite");
		else
			System.out.println("This player has broken the single season HR record and is a franchise player");
		
			
	}
}
