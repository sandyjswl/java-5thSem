
import java.util.Scanner;
interface Area
{
	double pi=3.14;
	double compute(double x, double y);

}

interface Display
{
	void show(double r);

}

class Rectangle implements Area,Display
{

	public double compute(double x, double y)
	{
		return(x*y);
	}
	public void show(double r)
	{
		System.out.println("The Area of rectangle is : "+r);
	}

}

class Circle implements Area,Display
{
	public double compute(double x, double y)
	{
		return(pi*x*x);
	}
	public void show(double r)
	{
		System.out.println("The Area of Circle is : "+r);
	}
}

class Interfaces2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double result1,result2;
		System.out.println("Enter the Length and Breadth of Rectangle: ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Enter the Radius of Circle: ");
		double r=sc.nextDouble();

		Rectangle rect =new Rectangle();

		result1=rect.compute(l,b);
		rect.show(result1);
		Circle circle=new Circle();

		result2=circle.compute(r,b);
		circle.show(result2);


	}

}
