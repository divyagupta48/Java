abstract class Shape
{
abstract void draw();
abstract void erase();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing triangle");
	}
	void erase()
	{
		System.out.println("Erasing triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("Erasing square");
	}
}
	


