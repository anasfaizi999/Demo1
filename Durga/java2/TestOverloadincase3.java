package Durga.java2;

  class TestOverloadincase3 {

public void m1(String s)
{
	System.out.println("String Version");
}
public void m1(StringBuffer sb)
{
System.out.println("StringBuffer Version");
}
public static void main(String[]args){
	
	Test t = new Test();
	t.m1("durga");
	t.m1(new StringBuffer("durga"));
	t.m1(null);
	
}

{	
}

}