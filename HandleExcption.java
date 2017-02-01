import java.io.*;
public class HandleExcption extends Exception
{
	String s;
	HandleExcption(String str)
	{
		s=str;
	}
	public  String toString()
	{
		return "Invalid string "+s;
	}
}