class Calculate
{
	double pi=3.14;
	double result;
	void volume(double r)
	{
		
		result=(1.333*pi*r*r*r);
	}
	void volume(double r, double h)
	{
		result=(0.333*pi*r*r*h);
	}
	void volume(double l, double b, double h)
	{
		result= (l*b*h);
	}
	void display()
	{
		System.out.println("The Volume is "+result);
	}
	
}



class Shape1
{
	public static void main(String args[])
	{
		double l= Double.parseDouble(args[0]);
		Calculate obj= new Calculate();
		if(args.length==1)
		{
			
			obj.volume(l);
			obj.display();
		}
		else if (args.length==2)
		{
			double b=Double.parseDouble(args[1]);
			obj.volume(l,b);
			obj.display();
		}
		else if (args.length==3)	
		{
			double b=Double.parseDouble(args[1]);
			double h=Double.parseDouble(args[2]);
			obj.volume(l,b,h);
			obj.display();
			
		}
		
	}
}
