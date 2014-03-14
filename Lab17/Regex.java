import java.util.Scanner;

public class Regex
{
	public static void main(String args [])
	{		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstname = scan.nextLine();
		System.out.println("Please enter your last name: ");
		String lastname = scan.nextLine();
		System.out.println("Please enter your street address: ");
		String street = scan.nextLine();
		System.out.println("Please enter your city: ");
		String city = scan.nextLine();
		System.out.println("Please enter your state: ");
		String state = scan.nextLine();
		System.out.println("Please enter your zip code: ");
		String zip = scan.nextLine();
		System.out.println("Please enter your phone number: ");
		String phone = scan.nextLine();
		
		if(!checkFirstName(firstname))
			System.out.println("You have entered an invalid first name.");
		if(!checkLastName(lastname))
			System.out.println("You have entered an invalid last name.");
		if(!checkStreet(street))
			System.out.println("You have entered an invalid street address.");
		if(!checkCity(city))
			System.out.println("You have entered an invalid city.");
		if(!checkState(state))
			System.out.println("You have entered an invalid state.");
		if(!checkZip(zip))
			System.out.println("You have entered an invalid zip code.");
		if(!checkPhone(phone))
			System.out.println("You have entered an invalid phone number.");
		else
			System.out.println("Great!");
	}
	
	public static boolean checkFirstName(String s)
	{
		//Must begin with uppercase letter, then can be any lower or uppercase letters
		return (s.matches("[A-Z][a-zA-Z]*"));
	}
	
	public static boolean checkLastName(String s)
	{
		//Must begin with an uppercase letter, then can be any lower or uppercase letters, or - or '
		return (s.matches("[A-Z]+[a-zA-Z]*['-]*[a-zA-Z]*"));
	}
	
	public static boolean checkStreet(String s)
	{
		//Must be a string of digits, followed by one or more words beginning with capital letters
		return (s.matches("\\d+\\s[A-Z][a-z]+(\\s[A-Z][a-z]+)*"));
	}
	
	public static boolean checkCity(String s)
	{
		//Uppercase letter followed by any other letters, can have a space
		return (s.matches("[A-Z][a-zA-Z]+(\\s[A-Z][a-zA-Z]+)*"));
	}
	
	public static boolean checkState(String s)
	{
		//Must be exactly 2 uppercase letters
		return (s.matches("[A-Z]{2}"));
	}
	
	public static boolean checkZip(String s)
	{
		//Must be exactly 5 digits, or 5 digits followed by a - and then 4 more digits
		return (s.matches("(\\d{5})([-]\\d{4})*"));
	}
	
	public static boolean checkPhone(String s)
	{
		//Must be either 7 or 10 digits
		return (s.matches("([1-9]\\d{2}-[1-9]\\d{2}-\\d{4})|([1-9]\\d{2}-\\d{4})"));
	}
}
