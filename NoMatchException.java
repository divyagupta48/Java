import java.io.*;
class NoMatchExcption
{
public static void main(String[] args)throws IOException
{
	    String x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Demonstration of Exception thrown when input string is equal to India : ");
		x=br.readLine();
		if(x.equalsIgnoreCase("INDIA"))
		{
			try
			{
				throw new HandleExcption(x);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
			System.out.println("String correct..!");
	}

}
