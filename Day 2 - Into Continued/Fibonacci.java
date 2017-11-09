public class Fibonacci
{

	public static void main(String args[])
	{
		int a= Integer.parseInt(args[0]);
		int b=0,c=1;
		int sum=0;
//		System.out.printf("0 ");
		for(int i=0;i<a;i++)
		{
			sum=b+c;
			System.out.printf(" "+sum);
			b=c;
			c=sum;
		}
			
	}
}
