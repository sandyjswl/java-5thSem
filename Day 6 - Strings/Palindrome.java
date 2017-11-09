
import java.io.*;

class Palindrome
{

	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);

		System.out.println("Enter A String :");
		String st=br.readLine();

		StringBuffer str =new StringBuffer(st);	
		
		StringBuffer str1 =new StringBuffer(str.reverse());	
		String strev= str1.toString();
		
	//	String strev =(new StringBuffer(str.reverse())).toString();			
		
		
		if((strev.equalsIgnoreCase(st)))
			System.out.println("The String is Palindrome");
		else
			System.out.println("The String is not Palindrome");
		

	}



}
