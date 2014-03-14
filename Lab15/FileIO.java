import java.util.*;

import javax.swing.JFileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class FileIO 
{
	//#1
	///public static void main(String args[]) throws Exception
	///{
	///	Scanner scanner = new Scanner(System.in);
	///	System.out.println("Please enter the name of a file: ");
	///	String FileName = scanner.nextLine();
	///	FillRandom(FileName);
	///	PrintFile(FileName);
	///	SquareNumber(FileName);
	///	PrintFile(FileName);
	///}
	
	//#2
	public static void FillRandom(String File) throws Exception, Exception
	{
		PrintWriter writer = new PrintWriter(File, "UTF-8");
		Random generator = new Random();
		
		int random = (generator.nextInt(11)) + 10;

		for (int i = 0; i < random; i++)
		{
			//Generate number between 33 and 126, then cast it as a char
			int chr1 = generator.nextInt(93) + 33;
			int chr2 = generator.nextInt(93) + 33;
			int chr3 = generator.nextInt(93) + 33;
			String ch1 = Character.toString((char) chr1);
			String ch2 = Character.toString((char) chr2);
			String ch3 = Character.toString((char) chr3);
			
			String rands = ch1 + ch2 + ch3;
			int randi = (generator.nextInt(10)) + 1;
			writer.println(rands + " " + randi);
		}
		writer.close();
	}
	
	//#3
	public static void PrintFile(String File) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader(File));
		String line = null;
		while ((line = reader.readLine()) != null)
		{
			System.out.println(line);
		}
		System.out.println();
	}
	
	//#4
	public static void SquareNumber(String File) throws Exception
	{
		BufferedReader reader1 = new BufferedReader(new FileReader(File));
		PrintWriter writer1 = new PrintWriter("Temp.txt", "UTF-8");
		String line1 = null;
		while ((line1 = reader1.readLine()) != null)
		{
			String[] parts = line1.split(" ");
			String part1 = parts[0];
			String part2 = parts[1];
			int originalnum = Integer.parseInt(part2);
			int squarednum = originalnum * originalnum;
			writer1.println(part1 + " " + squarednum);
		}
		writer1.close();
		//Re-write Original file with Squared Number from Temp.txt
		PrintWriter writer2 = new PrintWriter(File, "UTF-8");
		BufferedReader reader2 = new BufferedReader(new FileReader("Temp.txt"));
		String line2 = null;
		while ((line2 = reader2.readLine()) != null)
		{
			writer2.println(line2);
		}
		writer2.close();
	}
	//#5
	public static void main(String args[]) throws Exception
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(fileChooser);
		
		File fileName = fileChooser.getSelectedFile();
		FillRandom(fileName.toString());
		PrintFile(fileName.toString());
		SquareNumber(fileName.toString());
		PrintFile(fileName.toString());
	}
}
