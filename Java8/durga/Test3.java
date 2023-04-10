package Java8.durga;
interface Interf2{
	default void m1()
	{
		System.out.println("Default Method");
		
	}
}

public class Test3 implements Interf2 {
	public void m1()
	{
		System.out.println("overriding version of default method");
	}
	public static void main(String []args)
	
	{
		Test t = new Test();
		t.m1();
		
	 
	}

}
