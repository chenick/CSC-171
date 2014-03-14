import java.util.Scanner;


public class Factorial 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a positive integer to compute its factorial: ");
		String num1 = scan.next();
		
		int NUM1 = Integer.parseInt(num1);
		
		//Because ints are 32-bit, they can have a maximum value of 2,147,483,647 and can thus
		//only calculate factorials correctly through 12!
		int f = 1;
		
		for (int k = 0; k < NUM1; k++)
		{
			f = f * (NUM1-k);
		}
		System.out.println("First Calculation: " + NUM1 + "! is "+ f);
		
		//Because longs are 64-bit, they can have a maximum value of 9,223,372,036,854,775,807 and can thus
		//calculate factorial correctly through 20!
		long c = 1;
		
		for (int i = 0; i < NUM1; i++)
		{
			c = c * (NUM1-i);
		}
		System.out.println("Second Calculation: " + NUM1 + "! is "+ c);
	}
}
