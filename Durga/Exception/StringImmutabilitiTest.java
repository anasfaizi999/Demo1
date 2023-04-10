package Durga.Exception;

public class StringImmutabilitiTest {
	public static void main(String[] args) {
		
		String s = new String("anas");
		String s1 = s .toUpperCase();
		String s2 = s .toLowerCase();
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		
	}

}

class Test3{
	  
	public static void main(String[] args) {
		
		String s1 = "anas";
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		
	}
}
