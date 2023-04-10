package Durga.Exception;


public class StringEx {

	public static void main(String[] args) {
		
		String s1 = "Imran";
		String s2 = "Imran";
		
		try {
			System.out.println(s1.equals(s2));
		}
		catch(Exception e)
		{System.out.println("String are not equal");
		}
	}

}
