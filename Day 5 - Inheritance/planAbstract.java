
import java.util.Scanner;

abstract class plan
{
	float rate;
	abstract void getRate(float rate);
	float calculateBill()
	{
		return rate*250;
	
	}
	

}

class commercialPlan extends plan
{
	void getRate(float rate)
	{
		this.rate= rate;
	}
	

}

class domesticPlan extends plan
{
	void getRate(float rate)
	{
		this.rate= rate;
	}

}

public class planAbstract
{

	public static void main(String args[])
	{
		System.out.println("Enter the Rate:\n");
		Scanner sc= new Scanner(System.in);
		float rate=sc.nextFloat();
		
		plan object=new commercialPlan();
		object.getRate(rate);
		float ans=object.calculateBill();	
		System.out.printf("THE ANSwer is "+ans);

		

	}

}

