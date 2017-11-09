public class Calculator
{
	public static void main(String args[])
	{
	      int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String c=args[2];
		int res=0;
		switch(c)
		{
			case "+": 
				{
					res=a+b;
					System.out.println("Result is "+res);
					break;
				}
			case "/": 
				{
					res=a/b;
					System.out.println("Result is "+res);
					break;
				}
			case "-":
				{
					res=a-b;
					System.out.println("Result is "+res);
					break;
				}
			case "*":
				
				{
					res=a*b;
					System.out.println("Result is "+res);
					break;
				}
					
	}
}
}
