
import java.util.Scanner;


abstract class Loan
{
	double loanAmount,interestRate,years;
	abstract double calculateInterest();
	abstract void display();
	Loan(double p, double r, double t)
	{
		loanAmount=p;
		interestRate=r;
		years=t;
	}

}

class EducationLoan extends Loan
{
	EducationLoan(double p, double r, double t)
	{
		super(p,r,t);
	}
	double calculateInterest()
	{
		return ((loanAmount*interestRate*years)/100);
	}
	void display()
	{
		System.out.println("Simple Interest is: "+calculateInterest());
	}


}

class HomeLoan extends Loan
{
	HomeLoan(double p, double r, double t)
	{
		super(p,r,t);
	}
	double calculateInterest()
	{
		return (loanAmount*Math.pow((1+(interestRate/100)),years));
	}
	void display()
	{
		System.out.println("Compound Interest is: "+calculateInterest());
	}


}
class Interfaces3
{
	public static void main(String args[])
	{
		Loan loan;
		System.out.println("ENter the Loan Amount, Interest Rate and No of Years: ");
		Scanner sc =new Scanner(System.in);
		double p=sc.nextDouble();
		double r= sc.nextDouble();
		double t=sc.nextDouble();

		EducationLoan loan1 = new EducationLoan(p,r,t);
		loan=loan1;
		loan.display();

		HomeLoan loan2=new HomeLoan(p,r,t);
		loan=loan2;
		loan.display();


	}


}
