package ThreadDemon.durga;
class MyThreadA extends Thread
{
	public void run()
	{
		for(int i =0; i<10;i++)
		{
			System.out.println("child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			
			
			}
		}
	}
public class DemonThreadDemo {
	public static void main(String[] args) {
		MyThreadA t = new MyThreadA();
		t.setDaemon(true);
		t.start();
		System.out.println("End od the main Thraed");
	}

}
