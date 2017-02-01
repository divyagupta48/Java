import java.io.IOException; 
 public class DemoChecked
 {
	void m()throws IOException 
	{
		throw new IOException("device error");//checked exception
	} 
	void n()throws IOException 
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
	System.out.println("Demonstration of Exception Propogation in Checked Exceptions:");
	DemoChecked obj=new DemoChecked(); 
	obj.p();
	System.out.println("Normal flow...");
	} 
	}

