//demonstration of static variable,method,block
public class DemoOfStatic 
{
	static int a;
	static void func()
	{
		System.out.println("value of a in func:"+a);
	}
     static
     {
    	 System.out.println("Welcome!");
     }
	public static void main(String[] args)
	{
		System.out.println("Demonstration of static variable,method,block");
		System.out.println("calling func() function without assigning any value to static variable a");
	func();
	a=5;
	System.out.println("assigning 5 to a and then calling function again");
	func();
	System.out.println("value of a in main:"+a);
	}
}
