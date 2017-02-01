//demonstration of for each loop
import java.io.*;
public class DemoForEach
{
	public static void main(String[] args)throws IOException 
	{
		System.out.println("Demo of for each loop to print the sum of array");
		int n,i,s=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the length of the array");
		n=Integer.parseInt(br.readLine());
		int list[]=new int[n];
		System.out.println("enter the array");
		for(i=0;i<n;i++)
			list[i]=Integer.parseInt(br.readLine());
		for(int x : list)
	{
		s=s+x;
	}
    System.out.println("sum="+s);
	}
}
