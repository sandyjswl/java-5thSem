
import java.io.*;
import java.util.Scanner;

class CitySort
{
	public static void main(String args[]) throws IOException
	{
		String s[]=new String [5];			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 String :");
		for(int i=0;i<5;i++)
			s[i]=sc.nextLine();
		
		System.out.println("Cities Before Sorting.......");
		for(int i=0;i<s.length;i++)
			System.out.print(" "+s[i]);
		
		String temp;
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-i-1;j++)
			{
				if((s[j].compareTo(s[j+1]))>0)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		
		System.out.println("\n\nCities after Sorting.......");
		for(int i=0;i<s.length;i++)
			System.out.print(" "+s[i]);
		

	}


}
