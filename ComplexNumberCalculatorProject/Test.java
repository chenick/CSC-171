
public class Test 
{
	public static void main(String args[])
	{
		String args0 = args[0];
		//String args0 = "complex-instance";
		
		if (args0.equals("rational-class"))								//Static Rational Number Test
	
			int args1 = Integer.parseInt(args[1]);
			int args2 = Integer.parseInt(args[2]);
			int args3 = Integer.parseInt(args[3]);
			int args4 = Integer.parseInt(args[4]);
			
			//int args1 = 1;												//Used for manually testing on Mac
			//int args2 = 3;
			//int args3 = 4;
			//int args4 = 6;
			
			System.out.println("rational-class");
			System.out.println(args1);
			System.out.println(args2);
			System.out.println(args3);
			System.out.println(args4);
			
			for (int a = -1 * args1; a <= args1; a++)
				for (int b = 1; b <= args2; b++)
					for (int c = -1 * args3; c <= args3; c++)
						for (int d = 1; d <= args4; d++)
						{
							Rational testR1 = new Rational(a, b);
							Rational testR2 = new Rational(c, d);
						
							System.out.print(testR1 + "; ");
							System.out.print(testR2 + ", ");
							System.out.print("eq? " + testR1.Equals(testR2) + ", ");
							System.out.print("cmp? " + testR1.compareTo(testR2) + ", ");
							System.out.print("+= " + Rational.Add(testR1, testR2) + ", ");
							System.out.print("-= " + Rational.Subtract(testR1, testR2) + ", ");
							System.out.print("*= " + Rational.Multiply(testR1, testR2) + ", ");
							System.out.print("/= " + Rational.Divide(testR1, testR2));
						
							System.out.println();
						}
		}
		
		else if (args0.equals("rational-instance"))						//Dynamic Rational Number Test
		{
			int args1 = Integer.parseInt(args[1]);
			int args2 = Integer.parseInt(args[2]);
			int args3 = Integer.parseInt(args[3]);
			int args4 = Integer.parseInt(args[4]);
			
			//int args1 = 1;						
			//int args2 = 3;
			//int args3 = 4;
			//int args4 = 6;
			
			System.out.println("rational-instance");
			System.out.println(args1);
			System.out.println(args2);
			System.out.println(args3);
			System.out.println(args4);
			
			for (int a = -1 * args1; a <= args1; a++)
				for (int b = 1; b <= args2; b++)
					for (int c = -1 * args3; c <= args3; c++)
						for (int d = 1; d <= args4; d++)
						{
							Rational testR1 = new Rational(a, b);
							Rational testR2 = new Rational(c, d);
						
							System.out.print(testR1 + "; ");
							System.out.print(testR2 + ", ");
							System.out.print("eq? " + testR1.Equals(testR2) + ", ");
							System.out.print("cmp? " + testR1.compareTo(testR2) + ", ");
							System.out.print("+= " + testR1.Add(testR2) + ", ");
							System.out.print("-= " + testR1.Subtract(testR2) + ", ");
							System.out.print("*= " + testR1.Multiply(testR2) + ", ");
							System.out.print("/= " + testR1.Divide(testR2));
						
							System.out.println();
						}
		}
		
		else if (args0.equals("complex-class"))							//Static Complex Number Test
		{
			double args1 = Double.parseDouble(args[1]);
			double args2 = Double.parseDouble(args[2]);
			double args3 = Double.parseDouble(args[3]);
			double args4 = Double.parseDouble(args[4]);
			
			//double args1 = 1;
			//double args2 = 2;
			//double args3 = 1;
			//double args4 = 2;
			
			System.out.println("complex-class");
			System.out.println(args1);
			System.out.println(args2);
			System.out.println(args3);
			System.out.println(args4);
			
			for (double a = -1 * args1; a <= args1; a++)
				for (double b = -1 * args2; b <= args2; b++)
					for (double c = -1 * args3; c <= args3; c++)
						for (double d = -1 * args4; d <= args4; d++)
						{
							Complex testC1 = new Complex(a, b);
							Complex testC2 = new Complex(c, d);
						
							System.out.print(testC1 + "; ");
							System.out.print(testC2 + ", ");
							System.out.print("polar= " + String.format("%.3f", testC1.getMagnitude()) + "," + String.format("%.3f", testC1.getAngle()) + "; ");
							System.out.print(String.format("%.3f", testC2.getMagnitude()) + "," + String.format("%.3f", testC2.getAngle()) + ", ");
							System.out.print("+= " + Complex.Add(testC1, testC2) + ", ");
							System.out.print("-= " + Complex.Subtract(testC1, testC2) + ", ");
							System.out.print("*= " + Complex.Multiply(testC1, testC2) + ", ");
							System.out.print("/= " + Complex.Divide(testC1, testC2));
						
							System.out.println();
						}
		}
		
		else if (args0.equals("complex-instance"))						//Dynamic Complex Number Test
		{
			double args1 = Double.parseDouble(args[1]);
			double args2 = Double.parseDouble(args[2]);
			double args3 = Double.parseDouble(args[3]);
			double args4 = Double.parseDouble(args[4]);
			
			//double args1 = 1;
			//double args2 = 2;
			//double args3 = 1;
			//double args4 = 2;
			
			System.out.println("complex-instance");
			System.out.println(args1);
			System.out.println(args2);
			System.out.println(args3);
			System.out.println(args4);
			
			for (double a = -1 * args1; a <= args1; a++)
				for (double b = -1 * args2; b <= args2; b++)
					for (double c = -1 * args3; c <= args3; c++)
						for (double d = -1 * args4; d <= args4; d++)
						{
							Complex testC1 = new Complex(a, b);
							Complex testC2 = new Complex(c, d);
						
							System.out.print(testC1 + "; ");
							System.out.print(testC2 + ", ");
							System.out.print("polar= " + String.format("%.3f", testC1.getMagnitude()) + "," + String.format("%.3f", testC1.getAngle()) + "; ");
							System.out.print(String.format("%.3f", testC2.getMagnitude()) + "," + String.format("%.3f", testC2.getAngle()) + ", ");
							System.out.print("+= " + testC1.Add(testC2) + ", ");
							System.out.print("-= " + testC1.Subtract(testC2) + ", ");
							System.out.print("*= " + testC1.Multiply(testC2) + ", ");
							System.out.print("/= " + testC1.Divide(testC2));
						
							System.out.println();
						}
		}
	}
}
