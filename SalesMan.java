//Salesman
import java.io.*;
public class SalesMan
{
public static void main(String arg[])throws IOException
{
	int a[][]=new int[5][5];
	int i,j,saleNum,ch,value;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	do
	{
		System.out.println("***MENU1***");
		System.out.println("1.SALESMAN1");
		System.out.println("2.SALESMAN2");
		System.out.println("3.SALESMAN3");
		System.out.println("4.SALESMAN4");
		System.out.println("ENTER THE SALESMAN NUMBER");
		saleNum=Integer.parseInt(br.readLine());
		for(i=1;i<=4;i++)
		{
		System.out.println("ENTER VALUE FOR QUARTER"+i);
		value=Integer.parseInt(br.readLine());
		a[saleNum-1][i-1]=value;
		}
		System.out.println("ENTER 1 TO CONTINUE & 0 TO EXIT");
		ch=Integer.parseInt(br.readLine());
	}while(ch!=0);
    for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
			{
			a[i][4]+=a[i][j];
			}
	}
    for(i=0;i<5;i++)
  	{
  		for(j=0;j<4;j++)
  			{
  			a[4][i]+=a[j][i];
  			}
  	}
	System.out.println("\t\t   QUARTER1\t  QUARTER2\t QUARTER3 \t QUARTER4\t   Total");
     for(i=0;i<5;i++)
     {
    	 if(i!=4)
    	 System.out.print("Salesman"+(i+1));
    	 else
         System.out.print("Total"+"\t");
    	 for(j=0;j<5;j++)
    		 System.out.print("\t\t"+ a[i][j]);
    	 System.out.println();
     }
     }
}
