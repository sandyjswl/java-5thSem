package mypack1;

public class ComplexNumber
{
	int real,img;
	public ComplexNumber()
	{
		real=0;
		img=0;
	}
	public ComplexNumber(int a, int b)
	{
		real=a;
		img=b;
	}
	public ComplexNumber addComplex(ComplexNumber b)
	{
		
		b.real=real+b.real;
		b.img=img+b.img;
		return b;	
	}

	public void display()
	{
		System.out.print(real+"+"+img+"i");
	}
}
