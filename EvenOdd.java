package multithreading;
class Even extends Thread
{
	public void run()
	{
		for(int i=1;i<20;i++)
		{
			if(i%2==0)
			System.out.println("From Even:i="+i);
		}
		System.out.println("Exit from Even");
	}
}
class Odd extends Thread
{
	public void run()
	{
		for(int j=1;j<20;j++)
		{
			if(j%2!=0)
			System.out.println("From Odd:j="+j);
		}
		System.out.println("Exit from Odd");
	}
}
public class EvenOdd extends Thread
{
public static void main(String[] args) {
	Even objEven=new Even();
	Odd objOdd=new Odd();
	System.out.println("Start thread Even");
	objEven.start();
	System.out.println("Start thread Odd");
	objOdd.start();
	System.out.println("End of main thread");
	}

}
