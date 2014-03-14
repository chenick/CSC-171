import java.util.*;

public class MultiDimensionalArrays 
{
	public static void main(String args [])
	{
		//#1
		String[][] friends = new String[2][3];
		
		friends[0][0] = "Blake";
		friends[0][1] = "Alex";
		friends[0][2] = "Ariel";
		friends[1][0] = "Josh";
		friends[1][1] = "Jean";
		friends[1][2] = "Louis";
		//#2
		String[][] cheeses = {{"Brie", "American"}, {"Swiss", "Cheddar"}, {"Bleu", "Gouda"}};
		
		PrintArray(friends);		//Test #1 and #3
		PrintArray(cheeses);		//Test #2
		PrintArray(Random(10,10)); 	//Test #4 and #5
	}
	//#3
	public static void PrintArray(String[][] a)
	{
		int rows = a.length;
		int columns = a[0].length;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//#4
	public static Integer[][] Random(int a, int b)
	{
		Integer[][] random = new Integer[a][b];
		Random generator = new Random();
		
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				random[i][j] = generator.nextInt((a*b)+1);

		return random;
	}
	//#5
	public static void PrintArray(Integer[][] a)
	{
		int rows = a.length;
		int columns = a[0].length;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
