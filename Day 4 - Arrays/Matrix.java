
import java.util.Scanner;
class Operation
{

	void addition(int a[][],int b[][], int res[][])
	{
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
				res[i][j]=a[i][j]+b[i][j];

	}

	void subtraction(int a[][], int b[][], int res1[][])
	{
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
				res1[i][j]=b[i][j]-a[i][j];



	}



	  void display(int res[][])
	{
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{

				System.out.print(" "+res[i][j]);
			}
			System.out.println();
		}
	}

}



class Matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter  Size of Matrix 1:");
		int size1=sc.nextInt();
		int a[][]=new int [size1][size1];

		System.out.println("Enter elements for Matrix 1: ");
		for(int i=0;i<size1;i++)
			for(int j=0;j<size1;j++)
				a[i][j]=sc.nextInt();



		System.out.println("ENter  Size of Matrix 2:");
		int size2=sc.nextInt();
		int b[][]=new int [size2][size2];

		int res[][]=new int[size1][size2];
		int res1[][]=new int[size1][size2];
		


		System.out.println("Enter elements for Matrix 2: ");
		for(int i=0;i<size2;i++)
			for(int j=0;j<size2;j++)
				b[i][j]=sc.nextInt();


		Operation obj = new Operation();
		obj.addition(a,b,res);
		System.out.println("After Addition ");

		obj.display(res);

		obj.subtraction(a,b,res1);
		System.out.println("After Subtraction ");

		obj.display(res1);






	}



}
