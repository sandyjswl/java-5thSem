public class Swap
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Before Swapping");
		System.out.println("A="+a+"  B="+b);
		a=a+b;	
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("A="+a+"  B="+b);
	}
}
