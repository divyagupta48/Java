//demo of labeled loop;multiple of 5 will not be printed
public class DemoOfLabeled 
{

	public static void main(String args[]) 
	{
		System.out.println("Demo of labeled loop;multiple of 5 will not be printed");
		int i,j;
	outer:for(i=1;i<=20;i++)
		{
			for(j=1;j<=1;j++)
			{
				if(i%5==0)
				continue outer;
				else
					System.out.println(i);
			}
		}

	}

}
