package Durga.Exception;

public class Testcase3 {
public static void main(String [] args) {
	
	try
	{
		System.out.println("try");
		System.out.println(10/0);
	}
	catch (NullPointerException e)
	{
		System.out.println("catch");
	}
	finally
	{
		System.out.println("finally");
		
	}
}
}
