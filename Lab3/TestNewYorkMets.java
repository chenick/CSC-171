/*
 * File Name: TestNewYorkMets.java														
 * Author: Charles Henick
 * Date: 09/22/13
 * Course: CSC171 Fall 2013
 * Lab Session: TR 6:15-7:30PM
 * Lab TA: --
 */

package CSC171_Lab1;

import java.util.Scanner;

public class TestNewYorkMets 
{
	public static void main(String [] args)										//Main method
	{
		Scanner scan = new Scanner(System.in);
		
		NewYorkMets Player1 = new NewYorkMets("Norfolk, VA", "3B", 5);			//Initializing players
		NewYorkMets Player2 = new NewYorkMets("New London, CT", "SP", 33);
		
		System.out.println("Player 1: ");										//Displaying original player info
		Player1.displayMessage();
		System.out.println("Player 2: ");
		Player2.displayMessage();
		
		System.out.println();
		
		System.out.println("What is the first player's new home town? ");		//Calling methods in NewYorkMets.java
		String newHomeTown = scan.nextLine();
		Player1.setPlayerHomeTown(newHomeTown);
		
		System.out.println("What is the first player's new uniform number? ");
		int newUniformNumber = scan.nextInt();
		Player1.setPlayerUniformNumber(newUniformNumber);
		
		System.out.println();
		
		System.out.println("Player 1: ");										//Displaying altered and unchanged info
		Player1.displayMessage();
		System.out.println("Player 2: ");
		Player2.displayMessage();
	}
}
