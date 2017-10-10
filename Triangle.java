public class Triangle
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);	
		int b=Integer.parseInt(args[1]);
		
		Triangle tr=new Triangle();
		double res=tr.area(a,b);
		System.out.println("The result is  " +res);
		
	}

	double area(int b,int h)
	{
		return (0.5*b*h);
	}
}
