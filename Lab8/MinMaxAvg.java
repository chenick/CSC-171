import java.util.Scanner;

public class MinMaxAvg 
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please enter a positive integer (or negative integer to quit): ");
		int input = s.nextInt();
		
		double numints = 1;
		int max = input;
		int min = input;
		double total = input;
		double avg;
		
		while (input > 0)
		{
			System.out.print("Please enter a positive integer (or negative integer to quit): ");
			input = s.nextInt();
			
			if (input < 1)
				break;
			else if (input > max)
				max = input;
			else if (input < min)
				min = input;
	
			numints++;
			total = total + input;
		}
		
		avg =  total/numints;
		
		System.out.println("The maximum number entered was " + max);
		System.out.println("The minimum number entered was " + min);
		System.out.println("The average of the numbers entered is " + avg);
		System.out.println("The total positive integers entered was " + numints);
	}
}
