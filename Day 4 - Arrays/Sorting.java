
import java.util.Scanner;
class Operation
{
	  void ascending(int a[])
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	  void descending(int a[])
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	
	  void display(int s[])
	{
		for(int i=0;i<s.length;i++)
			System.out.print(" "+s[i]);
	}

}



class Sorting
{
	public static void main(String args[])
	{
		int s[]=new int [5];	
		System.out.println("ENter 5 Integers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			s[i]=sc.nextInt();
		
		Operation obj = new Operation();

		System.out.println("Before Sorting: ");
		obj.display(s);

		obj.ascending(s);		
		
		System.out.printf("\n\nAfter Sorting Ascending: ");
		obj.display(s);	
		
		
		System.out.println();
		
		obj.descending(s);
		
		System.out.println();
		System.out.printf("\n\nAfter Sorting Descending: ");
		obj.display(s);	
		System.out.println();	
	
		
		
	}
	
	

}
