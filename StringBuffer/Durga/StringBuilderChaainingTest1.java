package StringBuffer.Durga;

public class StringBuilderChaainingTest1 {
public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder();
	sb.append("anas").append("faizi").reverse().insert(2, "xyz").delete(3, 7);
	System.out.println(sb);
}
}