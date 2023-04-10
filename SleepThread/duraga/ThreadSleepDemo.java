package SleepThread.duraga;

class MYThread extends Thread{
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("I am Lazy Thraed");
				Thread.sleep(2000);	
			}
		}
		catch(InterruptedException e) {
			System.err.println("I got interruptd ");
			
		}
	}
}

public class ThreadSleepDemo {
	public static void main(String[] args) {
		MYThread t= new MYThread();
		t.start();
		//t.interrupted();
		System.out.println("End of main thread");
		
		
	}

}
