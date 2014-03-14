/*
 * Name: Charlie Henick
 * Assignment Number: 11
 * Course: CSC 171
 * Lab Session: MW 12:30-1:45PM
 * TA: Mark Mullock
 * File Name: MoreMethods.java
 */

import java.util.*;

public class Arrays 
{
	//#1
	public static void main(String args [])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		int N = s.nextInt();
		
		printArray(Random(N));					//Test #2
		printArray(Copy(Random(N)));			//Test #4
		System.out.println(Minimum(Random(N)));	//Test #5
		System.out.println(Maximum(Random(N))); //Test #6
	}
	//#2
	public static int [] Random(int N)
	{
		Random generator = new Random();
		
		int [] z = new int[N];
		
		for (int i = 0; i < N; i++)
			z[i] = generator.nextInt(N+1);	//N+1 assumes inclusive range
		
		return z;
	}
	//#3
	public static void printArray(int [] a)
	{
		for (int i = 0; i < (a.length); i++)
			System.out.print(a[i] + (i == (a.length-1) ? "": ", "));
		System.out.println();
	}
	//#4
	public static int [] Copy(int [] a)
	{
		int [] b = new int[a.length];
		
		for (int i = 0; i < (a.length); i++)
			b[i] = a[i];
		
		return b;
	}
	//#5
	public static Integer Minimum(int [] a)
	{
		int minimum = a[0];
		
		for (int i = 0; i < (a.length); i++)
			if (a[i] < minimum)
				minimum = a[i];
		
		return minimum;
	}
	//#6
		public static Integer Maximum(int [] a)
		{
			int maximum = a[0];
			
			for (int i = 0; i < (a.length); i++)
				if (a[i] > maximum)
					maximum = a[i];
			
			return maximum;
		}
}
