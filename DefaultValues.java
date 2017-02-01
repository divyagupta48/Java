//default value of primitives data types
public class DefaultValues
{
	short s;
	byte b;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean t;
	public static void main(String args[])
	{
	DefaultValues ob=new DefaultValues();
		System.out.println("Demonstration of primitive data types default values without using static keyword:");
		System.out.println("short:"+ob.s);
		System.out.println("byte:"+ob.b);
		System.out.println("int:"+ob.i);
		System.out.println("long:"+ob.l);
		System.out.println("float:"+ob.f);
		System.out.println("double:"+ob.d);
		System.out.println("char:"+ob.c);
		System.out.println("boolean:"+ob.t);
      }
}
