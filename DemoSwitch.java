//demonstration of switch by month number and corresponding name
import java.io.*;
public class DemoSwitch
{

	public static void main(String args[])throws IOException
	{
		System.out.println("Demonstration of switch case by month number and corresponding name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("enter the number of the month");
		n=Integer.parseInt(br.readLine());
	switch(n)
	{
	case 1:
		System.out.println("month : january"); 
	    break;
	case 2:
		System.out.println("month : february"); 
		break;
	case 3:
		System.out.println("month : March"); 
		break;
	case 4:
		System.out.println("month : April"); 
		break;
	case 5:
		System.out.println("month : May"); 
		break;
	case 6:
		System.out.println("month : June"); 
		break;
	case 7:
		System.out.println("month : July"); 
		break;
	case 8:
		System.out.println("month : August"); 
		break;
	case 9:
		System.out.println("month : September"); 
		break;
	case 10:
		System.out.println("month : October"); 
		break;
	case 11:
		System.out.println("month : November"); 
		break;
	case 12:
		System.out.println("month : December"); 
		break;
	default:
		System.out.println("Invalid choice");
	}
         }
}
