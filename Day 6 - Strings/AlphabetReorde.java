
import java.io.*;

class AlphabetReorde
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);

		System.out.println("Enter A String :");
		String st=br.readLine();

		StringBuffer str =new StringBuffer(st);	
		char temp;
		for(int i=0; i<=str.length()-1; i++)
		{
			for(int j=0;j<str.length()-i-1; j++)
			{
				

				if(str.charAt(j)>str.charAt(j+1))
				{
			
					str.insert(j,str.charAt(j+1));
					str.delete(j+2,j+3); 
					
				}
			}		

		}	

			
		System.out.println("Answer :"+str);

		

	}


}
