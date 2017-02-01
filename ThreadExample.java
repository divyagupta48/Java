package multithreading;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=1500;i++)
		{
			System.out.println("From A:i="+i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=1500;j++)
		{
			System.out.println("From B:j="+j);
		}
		System.out.println("Exit from B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=1500;k++)
		{
			System.out.println("From C:k="+k);
		}
		System.out.println("Exit from C");
	}
}
public class ThreadExample extends Thread
{
public static void main(String arg[])
{
	A objA=new A();
	B objB=new B();
	C objC=new C();
	objC.setPriority(Thread.MAX_PRIORITY);
	objB.setPriority(objA.getPriority()+1);
	objA.setPriority(3);
	System.out.println("Start thread A");
	objA.start();
	System.out.println("Start thread B");
	objB.start();
	System.out.println("Start thread C");
	objC.start();
	System.out.println("End of main thread");
}
}
