
class StudentTest
{
	int rollNumber,math,chemistry;

	void getRollNumber(int r)
	{
		rollNumber=r;
	}
	void getMarks(int m, int c)
	{
		math=m;
		chemistry=c;
	}
	void displayMarks()
	{
		System.out.println("The Marks in Chemistry is  "+chemistry+"\nThe Marks in Maths is "+math);
	}
	void displayRollNumber()
	{
		System.out.println("The Roll Number is "+rollNumber);
	}

}
interface Sports
{
	final int sportWt=55;
	void displayWt();

}

class Result extends StudentTest implements Sports
{

	void displayResult()
	{
		displayMarks();
		displayRollNumber();
		System.out.println("The Total Score is : "+(math+chemistry+sportWt));
	}
	public void displayWt()
	{
		System.out.println("The Sport Wt is "+sportWt);
	}

}

class Interfaces1
{
	public static void main(String args[])
	{



		Result result = new Result();
		result.getRollNumber(64);
		result.getMarks(50,51);
		result.displayResult();
		result.displayWt();


	}

}
