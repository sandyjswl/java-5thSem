
import java.io.*;

class FullName
{

	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);

		System.out.println("Enter First Name :");
		String fn=br.readLine();

		StringBuffer fnb =new StringBuffer(fn);		
		fnb.append(" ");
		
		System.out.println("Enter Last Name :");
		String ln=br.readLine();
		fnb.append(ln);
		

		System.out.println("The Name is "+fnb);
			
		System.out.println("Enter Middle Name :");
		String mn=br.readLine();
		
		

		int index= fnb.indexOf(" ");
		fnb.insert(index," ");
		fnb.insert(index+1,mn);
				
		
		System.out.println("The Full Name  is:"+fnb);


	}



}
