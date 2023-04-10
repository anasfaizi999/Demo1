package Thread.Durga;

public class ThraedDemo {
	public static void main(String[] args) {
		
		Thread t = new Thread();
		t.run();
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thraed");
		}
	}

}