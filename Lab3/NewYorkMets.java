/*
 * File Name: NewYorkMets.java														
 * Author: Charles Henick
 * Date: 09/22/13
 * Course: CSC171 Fall 2013
 * Lab Session: TR 6:15-7:30PM
 * Lab TA: --
 */

package CSC171_Lab1;

public class NewYorkMets 
{
	private String PlayerHomeTown;									//Initialization
	private String PlayerPosition;
	private Integer PlayerUniformNumber;
	
	public NewYorkMets(String town, String position, int number)	//Constructor
	{
		PlayerHomeTown = town;
		PlayerPosition = position;
		PlayerUniformNumber = number;	
	}
	
	public void setPlayerHomeTown(String town)						//Mutator Method for PlayerHomeTown
	{
		PlayerHomeTown = town;
	}
	
	public String getPlayerHomeTown()								//Accessor Method for PlayerHomeTown
	{
		return PlayerHomeTown;
	}
	
	public void setPlayerPosition(String position)					//Mutator Method for PlayerPosition
	{
		PlayerPosition = position;
	}
	
	public String getPlayerPosition()								//Accessor Method for PlayerPosition
	{
		return PlayerPosition;
	}
	
	public void setPlayerUniformNumber(Integer number)				//Mutator Method for PlayerUniformNumber
	{
		PlayerUniformNumber = number;
	}
	
	public Integer getPlayerUniformNumber()							//Accessor Method for PlayerUniformNumber
	{
		return PlayerUniformNumber;
	}
	
	public void displayMessage()									//Method to display information
	{
		System.out.printf("%s for the New York Mets is no. %d, and comes from %s\n", getPlayerPosition(), getPlayerUniformNumber(), getPlayerHomeTown());
	}
}
