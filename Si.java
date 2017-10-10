class Interest
{
	int principle,rate,time;
	int res;
	Interest(int p,int r,int t)
	{
		principle=p;
		rate=r;
		time=t;			
	}
	void calculate()
	{
		res=(principle*rate*time)/100;
	}
	void display()
	{
		System.out.println(" The Simple Interest is "+res);
	}

}





class Si
{
	public static void main(String args[])
	{
		int p=Integer.parseInt(args[0]);
		int r=Integer.parseInt(args[1]);
		int t=Integer.parseInt(args[2]);
		
		Interest p1= new Interest(p,r,t);
		p1.calculate();
		p1.display();
	}

}
