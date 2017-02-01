import java.io.*;
 public class DemoUnchecked
 {
	void m()
	{
		throw new ArithmeticException("Arithmetic error");//Unchecked exception
	} 
	void n() 
	{ 
		m();
		} 
	void p()
	{ 
		try 
		{
			n();
	}
	catch(Exception e) 
		{
		System.out.println("Exception handled...!"); 
		}
	}
	public static void main(String args[])
	{ 
	System.out.println("Demonstration of Exception Propogation in Unchecked Exceptions:");
	DemoUnchecked obj=new DemoUnchecked(); 
	obj.p();
	System.out.println("Normal flow...");
	} 
	}

