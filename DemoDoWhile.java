//using do while loop to print the reverse of a number
import java.io.*;
public class DemoDoWhile
{
public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n,d,rev=0;
	System.out.println("Demonstration of do while loop to print the reverse of a number");
	System.out.println("enter the number to be reversed");
	n=Integer.parseInt(br.readLine());
	do
	{
		d=n%10;
		rev=(rev*10)+d;
		n=n/10;
	}while(n>0);
	System.out.println("Reverse:"+rev);
	}

}
