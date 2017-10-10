class Volume
{
	double pi=3.14;
	double r;
	double h;
	double b,l;
	double result;
	Volume(double radius)
	{
		r=radius;
	}
	Volume(double radius, double height)
	{
		r=radius;
		h=height;
	}
	Volume(double length, double breadth, double height)
	{
		l=length;
		b=breadth;
		h=height;
	}
	void sphere()
	{
		double temp=1.333;
		result=(temp*pi*r*r*r);
	}
	void cone()
	{
		double temp=0.333;
		result=(temp*pi*r*r*h);
	}
	void box()
	{
		result= (l*b*h);
	}
	void display()
	{
		System.out.println("The Volume is "+result);
	}
	
}



class Shape
{
	public static void main(String args[])
	{
		double l= Double.parseDouble(args[0]);
		if(args.length==1)
		{
			
			Volume obj =new Volume(l);
			obj.sphere();
			obj.display();
		}
		else if (args.length==2)
		{
			double b=Double.parseDouble(args[1]);
			Volume obj =new Volume(l,b);
			obj.cone();
			obj.display();
		}
		else if (args.length==3)	
		{
			double b=Double.parseDouble(args[1]);
			double h=Double.parseDouble(args[2]);
			Volume obj =new Volume(l,b,h);
			obj.box();
			obj.display();
			
		}
		
	}
}
