import java.util.*;

class Area{
	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double t=TriArea(a,b);
		double c=CircleArea(a);
		double s=SquareArea(a);
		System.out.println("Area of Triangle = "+t);
		
		System.out.println("Area of Circle = "+c);
		
		System.out.println("Area of Square = "+s);
	}

	static double TriArea(double a, double b)
	{
		return (a*b)/2;
	}

	static double CircleArea(double a)
	{
		return (2*3.14*a);
	}

	static double SquareArea(double a)
	{
		return (4*a);
	}
}