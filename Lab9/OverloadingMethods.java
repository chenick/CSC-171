import java.util.Scanner;

public class OverloadingMethods 
{
	public static void main(String [] args)
	{
		printNameAddress();						//#1 Test
		printNameAddress();
		printNameAddress();
		printMail("Ted");						//#2 Test
		for (int n = 1; n <= 5; n++)			//#3 Test
			System.out.println(n + " squared is " + squareNum(n));
		for (double n = 0.5; n <= 5; n++)		//#4 Test
			System.out.println(n + " squared is " + squareNum(n));
		for (int n = 1; n <= 5; n++)			//#5 Test
			System.out.println(n + " cubed is " + cubeNum(n));
		for (double n = 0.5; n <= 5; n++)		//#6 Test
			System.out.println(n + " cubed is " + cubeNum(n));
		int x = 7;								//#7 and #8 Test
		long y = 16;
		System.out.println(x + "! is " + Factorial(x));	
		System.out.println(y + "! is " + Factorial(y));	
		int a = 456;							//#9 and #10 Test
		int b = 6231;
		int c = 12;
		int d = 246;
		System.out.println("The maximum of " + a + " and " + b + " is " + maxNum(a,b));
		System.out.println("The maximum of " + a + ", " + b + " and " + c + " is " + maxNum(a,b,c));
		System.out.println("The maximum of " + a + ", " + b + ", " + c + " and " + d + " is " + maxNum(a,b,c,d));
	}
	//#1
	public static void printNameAddress()
	{
		System.out.println("Charlie Henick lives at 13 Gin Lane, New York, NY");
	}
	//#2
	public static void printMail(String s)
	{
		System.out.println("Dear " + s + ", You may have already won a million dollars.");
	}
	//#3
	public static Integer squareNum(Integer n)
	{
		int q = n * n;
		return q;
	}
	//#4
	public static Double squareNum(Double n)
	{
		double q = n * n;
		return q;
	}
	//#5
	public static Integer cubeNum(Integer n)
	{
		int w = squareNum(n) * n;
		return w;
	}
	//#6
	public static Double cubeNum(Double n)
	{
		double w = squareNum(n) * n;
		return w;
	}
	//#7
	public static Integer Factorial(Integer n)
	{		
		int NUM1 = n;
		int f = 1;
		
		for (int k = 0; k < NUM1; k++)
			f = f * (NUM1-k);
		
		return f;
	}
	//#8
	public static Long Factorial(Long l)
	{
		long NUM1 = l;
		long c = 1;
		
		for (int i = 0; i < NUM1; i++)
			c = c * (NUM1-i);
		
		return c;
	}
	//#9
	public static Integer maxNum(Integer a, Integer b)
	{
		int max = 0;
		
		if (a >= b)
			max = a;
		else
			max = b;
		
		return max;
	}
	//#10
	public static Integer maxNum(Integer a, Integer b, Integer c)
	{
		int max = 0;
		max = maxNum(maxNum(a,b), c);
		return max;
	}
	public static Integer maxNum(Integer a, Integer b, Integer c, Integer d)
	{
		int max = 0;
		max = maxNum(maxNum(a,b), maxNum(c,d));
		return max;
	}
}
