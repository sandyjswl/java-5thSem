class Result
{
	static int fact(int n)
	{
		if (n==1)
			return 1;
		else
			return(n*fact(n-1));
	}
	

	
}



class Factorial
{
	public static void main(String args[])
	{
		int n,res;
		n=Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)
		{
			res=Result.fact(i);
			System.out.println("The factorial of "+i+" is "+res);
		}
		
	}

}
