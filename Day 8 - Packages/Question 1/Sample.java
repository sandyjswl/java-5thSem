import java.util.Scanner;
import mypack.*;
import mypack.pack1.*;
import java.util.Date;

class DateNow implements DateTime
{
	public void displayDateTime()
	{
		Date date=new Date();
		System.out.println("Current Date & Time is "+date);
	}
}

class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Addition addition =new Addition(a,b);
		addition.sum();
		addition.display();
		System.out.println("The Difference is "+Subtraction.diff(a,b));
		DateNow date=new DateNow();
		date.displayDateTime();
		Display.display();
		
						
	}

}

