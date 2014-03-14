
public class Rational 
{
	private int numerator;												//Initialize private instance variables
	private int denominator;
	
	public Rational()													//Constructor
	{
		numerator = 0;
		denominator = 1;												//Denominator cannot equal 0
	}	
	
	public Rational(int x, int y)									
	{
		if (y == 0)
		{
			numerator = 0;
			denominator = 1;
			//System.out.print("Cannot work by 0");
			//System.exit(0);											//Terminates program
		}																//Source: www.codingforums.com
			
		numerator = x;
		denominator = y;
		//int GCD = GCD(x, y);											//E.C. - (REDUCTION)
		//numerator = x/GCD;
		//denominator = y/GCD;
	}
	
	public int getNumerator()											//Accessor for Numerator
	{
		return numerator;
	}
	
	public int getDenominator()											//Accessor for Denominator
	{
		return denominator;
	}
	
	//private int GCD(int x, int y)										//E.C. - (REDUCTION)
	//{
	//	if(y == 0) 
	//		return x;
	//	return GCD(y, x%y);
	//}
	
	//Source for Rational Numbers Arithmetic: www.mathisfun.com
	
	public boolean Equals(Rational r)									//Tests Equality between Rational Numbers
	{
		int product1 = numerator * (r.getDenominator());
		int product2 = denominator * (r.getNumerator());
		
		if (product1 == product2)
			return true;
		else
			return false;
	}
	
	public String compareTo(Rational r)									//Dynamic Compare
	{
		double r1float = (double) numerator/denominator;
		double r2float = (double)(r.getNumerator())/(r.getDenominator());
		
		if (r1float > r2float)
			return "1";
		else if (r1float < r2float)
			return "-1";
		else if (Equals(r))
			return "0";
		else
			return "";
	}
	
	public Rational Add(Rational r)										//Dynamic Addition
	{
		Rational r3 = new Rational();
		
		r3.numerator = (numerator * (r.getDenominator())) + (denominator * (r.getNumerator()));
		r3.denominator = denominator * (r.getDenominator());
		
		return r3;
	}
	
	public static Rational Add(Rational r1, Rational r2)				//Static Addition
	{
		int r3numerator = ((r1.getNumerator()) * (r2.getDenominator())) + ((r1.getDenominator()) * (r2.getNumerator()));
		int r3denominator = (r1.getDenominator()) * (r2.getDenominator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public Rational Subtract(Rational r)								//Dynamic Subtraction
	{
		int r3numerator = numerator * (r.getDenominator()) - denominator * (r.getNumerator());
		int r3denominator = denominator * (r.getDenominator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public static Rational Subtract(Rational r1, Rational r2)			//Static Subtraction
	{
		int r3numerator = ((r1.getNumerator()) * (r2.getDenominator())) - ((r1.getDenominator()) * (r2.getNumerator()));
		int r3denominator = (r1.getDenominator()) * (r2.getDenominator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public Rational Multiply(Rational r)								//Dynamic Multiplication
	{
		int r3numerator = numerator * (r.getNumerator());
		int r3denominator = denominator * (r.getDenominator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public static Rational Multiply(Rational r1, Rational r2)			//Static Multiplication
	{
		int r3numerator = (r1.getNumerator()) * (r2.getNumerator());
		int r3denominator = (r1.getDenominator()) * (r2.getDenominator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public Rational Divide(Rational r)									//Dynamic Division
	{
		
		int r3numerator = numerator * r.getDenominator();
		int r3denominator = denominator * r.getNumerator();
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public static Rational Divide(Rational r1, Rational r2)				//Static Division
	{
		int r3numerator = (r1.getNumerator()) * (r2.getDenominator());
		int r3denominator = (r1.getDenominator()) * (r2.getNumerator());
		
		return new Rational(r3numerator, r3denominator);
	}
	
	public String toString()											//Formatting toString Method
	{
		//if (denominator == 1)											//E.C. - (REDUCTION)
		//	return Integer.toString(numerator);
		//else if (denominator == -1)
		//	return Integer.toString(-1 * numerator);
		if ((numerator == 0) || (denominator == 0))						
			return "0";													//Return 0 if numerator or denominator is 0
		else if ((numerator > 0) && (denominator < 0))
			return (-1 * numerator) + "/" + (-1 * denominator);			//Ensures proper sign precedes numerator only
		else if ((numerator < 0) && (denominator < 0))
			return (-1 * numerator) + "/" + (-1 * denominator);
		else
			return numerator + "/" + denominator;
	}
}
