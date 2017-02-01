//using while loop
import java.io.*;
public class DemoOfWhile
{

	public static void main(String[] args)throws IOException
	{
		System.out.println("Demo of while loop to print reverse of a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,d,rev=0;
		System.out.println("enter the number to be reversed");
		n=Integer.parseInt(br.readLine());
	while(n>0)
	{
		d=n%10;
		rev=(rev*10)+d;
		n=n/10;
	}
     System.out.println("reverse of number is:"+rev);
	}

}
