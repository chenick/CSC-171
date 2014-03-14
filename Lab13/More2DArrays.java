import java.util.*;

public class More2DArrays 
{
	public static void main(String args [])
	{
		//Test #1
		System.out.println("TEST FOR #1:");							
		Integer[][] test = Random(4,5);
		PrintArray(test);
		ReplaceArray(test, 13);
		PrintArray(test);
		//Test #2
		System.out.println("TEST FOR #2:");							
		Integer[][] test2 = {{7, -3, 5}, {15, 30, 6}, {13, -1, 7}};
		PrintArray(test2);
		Integer[][] test3 = {{-5, 10, 2}, {23, 6, 2}, {4, 9, 2}};
		PrintArray(test3);
		if (AddArrays(test2, test3) == null)
			System.out.println("Arrays are not of equal size");
		else
			PrintArray(AddArrays(test2, test3));
		//Test #3
		System.out.println("TEST FOR #3:"); 						
		PrintArray(test2);
		PrintArray(test3);
		if (SubtractArrays(test2, test3) == null)
			System.out.println("Arrays are not of equal size");
		else
			PrintArray(SubtractArrays(test2, test3));
		//Test #4
		System.out.println("TEST FOR #4:"); 						
		Integer[][] test4 = TriangleArray(4);
		PrintArray(test4);
		ReplaceArray(test4, 5);
		PrintArray(test4);
		if (AddArrays(test4, TriangleArray(4)) == null)
			System.out.println("Arrays are not of equal size");
		else
			PrintArray(AddArrays(test4, TriangleArray(4)));
		if (SubtractArrays(test4, TriangleArray(4)) == null)
			System.out.println("Arrays are not of equal size");
		else
			PrintArray(SubtractArrays(test4, TriangleArray(4)));
	}
	
	//#1
	public static void ReplaceArray(Integer[][] a, int k)
	{
		int rows = a.length;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j] = k;
			}
		}
	}
	//#2
	public static Integer[][] AddArrays(Integer[][] a, Integer[][] b)
	{
		int rows = a.length;

		Integer[][] sum = new Integer[rows][];
		
		if (a.length == b.length)
		{
			for (int i = 0; i < rows; i++)
			{
				if (a[i].length == b[i].length)
				{
					sum[i] = new Integer[a[i].length];
					for (int j = 0; j < a[i].length; j++)
					{
						sum[i][j] = a[i][j] + b[i][j];
					}
				}
				
				else
					return null;
			}
		return sum;
		}
		
		else
			return null;
	}
	//#3
	public static Integer[][] SubtractArrays(Integer[][] a, Integer[][] b)
	{
		int rows = a.length;

		Integer[][] diff = new Integer[rows][];
		
		if (a.length == b.length)
		{
			for (int i = 0; i < rows; i++)
			{
				if (a[i].length == b[i].length)
				{
					diff[i] = new Integer[a[i].length];
					for (int j = 0; j < a[i].length; j++)
					{
						diff[i][j] = a[i][j] - b[i][j];
					}
				}
				
				else
					return null;
			}
		return diff;
		}
		
		else
			return null;
	}
	//#4
	public static Integer[][] TriangleArray(int a)
	{
		Integer[][] b = new Integer[a][];
		
		int rows = b.length;
		int counter = 1;
		
		for (int i = 0; i < rows; i++)
		{
			b[i] = new Integer[i+1];
			for (int j = 0; j < i+1; j++)
			{
				b[i][j] = counter;
				counter++;
			}
		}
		
		return b;
	}
	//Printing String Arrays
	public static void PrintArray(String[][] a)
	{
		int rows = a.length;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//Printing Integer Arrays
	public static void PrintArray(Integer[][] a)
	{
		int rows = a.length;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	//Random 2D Array Generator
	public static Integer[][] Random(int a, int b)
	{
		Integer[][] random = new Integer[a][b];
		Random generator = new Random();
		
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				random[i][j] = generator.nextInt((a*b)+1);

		return random;
	}

}
