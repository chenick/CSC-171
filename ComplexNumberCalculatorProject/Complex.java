
public class Complex 
{
	private double real;												//Initialize private instance variables
	private double imaginary;
	
	public Complex()													//Constructor
	{
		real = 0;
		imaginary = 0;
	}
	
	public Complex(double x, double y)							
	{
		real = x;
		imaginary = y;
	}
	
	public double getReal()												//Accessor for Real Part
	{
		return real;
	}
	
	public double getImaginary()										//Accessor for Imaginary Part
	{
		return imaginary;
	}
	
	public double getMagnitude()										//Dynamic Polar Coordinate Magnitude
	{
		return Math.sqrt((real * real) + (imaginary * imaginary));		//Pythagorean Theorem
	}
	
	public double getAngle()											//Dynamic Polar Coordinate Angle
	{
		return Math.atan2(imaginary, real);								//Source: Oracle Java Doc
	}
	
	//Sources for Complex Numbers Arithmetic: www.clarku.edu and www.mathportal.org
	
	public Complex Add(Complex ComplexNumber)							//Dynamic Addition
	{
		Complex c = new Complex();
		
		c.real = real + ComplexNumber.real;
		c.imaginary = imaginary + ComplexNumber.imaginary;
		
		return c;
	}
	
	public static Complex Add(Complex c1, Complex c2)					//Static Addition
	{
		Complex c3 = new Complex();
		
		c3.real = c1.real + c2.real;
		c3.imaginary = c1.imaginary + c2.imaginary;
		
		return c3;
	}
	
	public Complex Subtract(Complex ComplexNumber)						//Dynamic Subtraction
	{
		Complex c = new Complex();
		
		c.real = real - ComplexNumber.real;
		c.imaginary = imaginary - ComplexNumber.imaginary;
		
		return c;
	}
	
	public static Complex Subtract(Complex c1, Complex c2)				//Static Subtraction
	{
		Complex c3 = new Complex();
		
		c3.real = c1.real - c2.real;
		c3.imaginary = c1.imaginary - c2.imaginary;
		
		return c3;
	}
	
	public Complex Multiply(Complex ComplexNumber)						//Dynamic Multiplication
	{
		Complex c = new Complex();
		
		c.real = (real * ComplexNumber.real) - (imaginary * ComplexNumber.imaginary);
		c.imaginary = (real * ComplexNumber.imaginary) + (imaginary * ComplexNumber.real);
		
		return c;
	}
	
	public static Complex Multiply(Complex c1, Complex c2)				//Static Multiplication
	{
		Complex c3 = new Complex();
		
		c3.real = (c1.real * c2.real) - (c1.imaginary * c2.imaginary);
		c3.imaginary = (c1.real * c2.imaginary) + (c1.imaginary * c2.real);
		
		return c3;
	}
	
	public Complex Divide(Complex ComplexNumber)						//Dynamic Division
	{
		Complex c = new Complex();
		
		double conjugate = (ComplexNumber.real * ComplexNumber.real) + (ComplexNumber.imaginary * ComplexNumber.imaginary);
		
		if (conjugate != 0)
		{
			c.real = ((real * ComplexNumber.real) + (imaginary * ComplexNumber.imaginary)) / conjugate;
			c.imaginary = ((imaginary * ComplexNumber.real) - (real * ComplexNumber.imaginary)) / conjugate;
		}
		else
		{
			c.real = 0;
			c.imaginary = 0;
		}
		
		return c;
	}
	
	public static Complex Divide(Complex c1, Complex c2)				//Static Division
	{
		Complex c3 = new Complex();
		
		double conjugate = (c2.real * c2.real) + (c2.imaginary * c2.imaginary);
		
		if ((conjugate != 0))	
		{
			c3.real = ((c1.real * c2.real) + (c1.imaginary * c2.imaginary)) / conjugate;
			c3.imaginary = ((c1.imaginary * c2.real) - (c1.real * c2.imaginary)) / conjugate;
		}
		else
		{
			c3.real = 0;
			c3.imaginary = 0;
		}
		return c3;
	}
	
	public String toString()											//Formatting toString Method
	{
		if (real == 0)
		{
			if (imaginary == 0)
				return "0";												//Return 0 if both real and imaginary are 0
			else
				return String.format("%.1fi", imaginary);				//1 decimal place for imaginary parts
		}
		else
		{
			if (imaginary == 0)
				return String.format("%.1f", real);						//1 decimal place for real parts
			else if (imaginary < 0)
				return String.format("%.1f%.1fi", real, imaginary);		//No plus sign if imaginary part is neg
			else
				return String.format("%.1f%+.1fi", real, imaginary);	//Plus sign if imaginary part is pos
		}
	}
}
