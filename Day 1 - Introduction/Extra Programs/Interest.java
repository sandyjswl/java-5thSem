public class Interest
{

	Interest(int p,int n,int r)
	{
		
			double res=(p*n*r)/100;
			System.out.println("The Simple Interest is "+res);
		
	}

	public static void main(String args[])
	{
		int p=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		int r=Integer.parseInt(args[2]);
		Interest obj=new Interest(p,n,r);		
	}
}
