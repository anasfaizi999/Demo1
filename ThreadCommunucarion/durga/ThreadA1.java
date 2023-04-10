package ThreadCommunucarion.durga;

public class ThreadA1 {
	public static void main(String[] args) throws InterruptedException { //throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		b.join();
		//Thread.sleep(10000);
		System.out.println(b.total);
		
	}}
class ThreadB extends Thread{
	int total = 0;
	public void run() {
		for(int i= 1;i<=100;i++) {
			total = total+i;
		}
		 
		
		}
	}

 
	

	  