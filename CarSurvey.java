//counting the no. of cars in a particular city
import java.io.*;
public class CarSurvey 
{
public static void main(String[] args)throws IOException 
	{
			int a[][]=new int[4][5];
		int i,j,carModel,city,ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("***MENU1***");
			System.out.println("1.DELHI");
			System.out.println("2.MUMBAI");
			System.out.println("3.CHENNAI");
			System.out.println("4.KOLKATA");
			System.out.println("ENTER THE CITY NUMBER");
			city=Integer.parseInt(br.readLine());
			System.out.println("***MENU2***");
			System.out.println("1.MARUTI-K10");
			System.out.println("2.ZEN-ASTELO");
			System.out.println("3.WAGNOR");
			System.out.println("4.MARUTI-SX4");
			System.out.println("ENTER THE CAR MODEL NUMBER");
			carModel=Integer.parseInt(br.readLine());
			a[city-1][carModel-1]+=1;
			System.out.println("ENTER 1 TO CONTINUE & 0 TO EXIT");
			ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
		a[i][4]=a[i][4]+a[i][j];
		}
		}
		System.out.println("\t   Maruti-K10\t  Zen-Astelo\t   Wagnor \t Maruti-SX4\t\tTotal");
	     for(i=0;i<4;i++)
	     {
	    	 if(i==0)
	    		 System.out.print("Delhi");
	    	 else if(i==1)
	    		 System.out.print("Mumbai");
	    	 else if(i==2)
	    		 System.out.print("Chennai");
	    	 else
	    		 System.out.print("Kolkata");
	    	 for(j=0;j<5;j++)
	    		 System.out.print("\t\t"+ a[i][j]);
	    	 System.out.println();
	     }
	     }
}
