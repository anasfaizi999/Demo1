package Java8.durga;

//class MyRunnable implements Runnable
//{
//	public void run()
//{
//	for(int i=0; i<10;i++) {
//		System.out.println("Child Thread");
//		
//	}
//}
//}

public class Test1 {
	public static void main(String[] args) {
		//MyRunnable r= new MyRunnable();
		Runnable r =()->{
			for(int i =0; i<10;i++)
			{
				System.out.println("Child Thread-1");
				
			}
		};
		Thread t= new Thread(r);
		t.start();
		for(int i =0; i<10; i++) {
			System.out.println("Main Thread-1");
		}
	}

}