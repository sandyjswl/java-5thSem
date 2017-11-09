
import java.io.*;
class StringReverse
{

	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.println("Enter a String :");
		String str1=br.readLine();
		StringBuffer str =new StringBuffer(str1);
		System.out.println("The String before reverse: "+str);
		System.out.println("The String after reverse: "+str.reverse());	


	}
	
}
