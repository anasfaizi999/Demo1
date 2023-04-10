package Thread.Durga;

class MyThread1 extends Thread{
	public void run() {
for(int i = 0;i<10;i++) {
	System.out.println("anas Thread");
	try {Thread.sleep(2000);
	}
	catch(InterruptedException e) {}
	}
}
}
public class ThreadJoinDemo {
	 public static void main(String[]args) throws InterruptedException{
		 
		 MyThread t = new MyThread();
		 t.start();
		 t.join ();
		 for(int i= 0; i<10;i++) {
			 System.out.println("faizi Thread");
			 
			 
		 }
	 }


	

}
