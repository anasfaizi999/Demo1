package StringBuffer.Durga;

public class SBtrimToSizeTest3 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(1000);
		sb.append("ABC");
		System.out.println(sb.capacity());
		 sb.trimToSize();
		 System.out.println(sb.capacity());
		 
		 
		
	}

}
