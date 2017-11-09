import java.util.*;
class Calculation
{
	double breadth,height;
	//double res;
	double side1,side2,side3;
	double result=0;
	Calculation(double b, double h)
	{
		breadth=b;
		height=h;
	}
	Calculation(double s1, double s2, double s3)
	{
		side1=s1;
		side2=s2;
		side3=s3;
		
	}

	
	void result()
	{
		result=(0.5*breadth*height);
	}
	void result1()
	{
		double s;
		s=(side1+side2+side3)/2;
		
		result=(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));	
	}	
	
	void display()
	{
		System.out.println("The area of the traingle using   is "+result);
	}

}




class Area
{
	public static void main(String args[])
	{
		double b,h,side;
		b=Double.parseDouble(args[0]);
		h=Double.parseDouble(args[1]);
		

		if(args.length==3)
		{

			side=Double.parseDouble(args[2]);
			Calculation triangle=new Calculation(b,h,side);
			
			
			triangle.result1();
			triangle.display();
			//System.out.println("The area of the traingle using Method 1 is "+res1);
		}
		else if(args.length==2)
		{
			Calculation triangle=new Calculation(b,h);
			triangle.result();
			triangle.display();
		
			//System.out.println("The area of the traingle using Method 2 is "+res2);		
		}	

	//	Calculation triangle=new Calculation(b,h);
		
			
				
	}
}
