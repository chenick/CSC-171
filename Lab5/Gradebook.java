package CSC171_Lab1;

import java.util.Scanner;

public class GradeBook 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int total;
		int gradeCounter;
		int numericalgrade;
		double average;
		String finallettergrade = "";
		
		total = 0;
		gradeCounter = 0;
		numericalgrade = 0;
		
		while(gradeCounter <= 100)
		{
			System.out.println("Enter letter grade: ");
			String lettergrade = input.next();
			if (lettergrade.equals("A"))
				numericalgrade = 100;
			if (lettergrade.equals("B"))
				numericalgrade = 90;
			if (lettergrade.equals("C"))
				numericalgrade = 70;
			if (lettergrade.equals("D"))
				numericalgrade = 60;
			if (lettergrade.equals("F"))
				numericalgrade = 50;
			if (lettergrade.equals("N"))
				numericalgrade = 0;
			if (lettergrade.equals("Q"))
				break;
			total = total + numericalgrade;
			gradeCounter = gradeCounter + 1;
		}
		
		average = total/gradeCounter;
		
		if (average > 0)
			if (average >= 50)
				if(average >= 65)
					if (average >= 68)
						if (average >= 70)
							if (average >= 73)
								if (average >= 78)
									if(average >= 80)
										if (average >= 83)
											if (average >= 88)
												if (average >= 90)
													if (average >= 93)
														if (average >= 98)
															finallettergrade = "A+";
														else
															finallettergrade = "A";
													else
														finallettergrade = "A-";
												else
													finallettergrade = "B+";
											else
												finallettergrade = "B";
										else
											finallettergrade = "B-";
									else
										finallettergrade = "C+";
								else
									finallettergrade = "C";
							else
								finallettergrade = "C-";
						else
							finallettergrade = "D+";
					else
						finallettergrade = "D";
				else
					finallettergrade = "F";
			else
				finallettergrade = "N";
		System.out.println("The student's numerical grade is "+ average +", so they received a " + finallettergrade);
	}
}
