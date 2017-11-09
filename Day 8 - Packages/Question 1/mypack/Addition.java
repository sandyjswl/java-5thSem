package mypack;

public class Addition
{
	int n1,n2,res;
	public Addition(int a, int b)
	{	
		n1=a;
		n2=b;
	}
	public void sum()
	{
		res=n1+n2;
	}
	public void display()
	{
		System.out.println("The Sum is  "+res);
	}
}
