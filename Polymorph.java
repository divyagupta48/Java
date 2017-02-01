
public class Polymorph 
{
	public static void main(String[] args) 
	{
	Shape sha;
	Circle c=new Circle();
	Triangle t=new Triangle();
	Square s=new Square();
	System.out.println("to demonstrate runtime polymorphism");
	sha=c;
	System.out.println("Implementation of circle class:");
	sha.draw();
	sha.erase();
	sha=t;
	System.out.println("Implementation of triangle class:");
	sha.draw();
	sha.erase();
	sha=s;
	System.out.println("Implementation of square class:");
	sha.draw();
	sha.erase();
	}
}
