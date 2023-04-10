package Durga.Exception;

public class Test {
	private static final String S2 = null;
	private static final String S1 = null;

	public static void main(String [] args)
	{
		try
		{
			System.out.println(10/0);
			System.out.println(S1==S2);// risky code, code which may or may not contain error
		}
		catch (ArithmeticException e) // catch (Exception e)        
		{
			System.out.println("ArithmeticException e"); // System.out.println(" Exception");   // contain solution for try block
		}
		catch (Exception e)        // catch (ArithmeticException e)
		{
			System.out.println(" Exception"); // System.out.println("ArithmeticException e");
			
		}
	}
	

}
