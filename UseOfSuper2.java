//subclass
public class UseOfSuper2 extends UseOfSuper
{
	int i;
	UseOfSuper2(int b)
	{
		super(b);//use of super in constructors
		super.i=3;//use in member hiding
		i=4;
}
	void show()
	{
		super.show();//use of super in methodd overriding
		System.out.println("show function of Subclass:");
		System.out.println("i in super class="+super.i);
		System.out.println("i in subclass="+i);
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Use of super keyword");
	UseOfSuper2 ob=new UseOfSuper2(5);
	ob.show();
	}
}
