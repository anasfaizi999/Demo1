package ThreadDemon.durga;

public class TestB {
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		System.out.println("End of main thread");
	 t.stop();
	 
	}
}
