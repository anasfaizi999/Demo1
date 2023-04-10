package ThreadCommunucarion.durga;

public class ThreadA {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB1 b  = new ThreadB1();
		b.start();
		//Thread.sleep(1000);
		synchronized (b) {
			System.out.println("Main Thread Trying to call wait method");
			b.wait();
			System.out.println("Main thread got notification call");
			System.out.println(b.total);
				}
		}
	}

class ThreadB1 extends Thread{
	
	int total = 0;
	public void run() {
		synchronized(this) {
			
		System.out.println("Child thread starts calculation ");
		for(int i= 1;i<=100;i++) {
			total = total+i;
		}
		System.out.println("Child giving notification call");
			
		this.notify();
		}
	}
}

	 
	

