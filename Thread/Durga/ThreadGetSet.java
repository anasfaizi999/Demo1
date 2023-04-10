package Thread.Durga;


class Test extends Thread {
	public void run() {
		System.out.println("run method executed by Thrad:"+ Thread.currentThread().getName());
			}
}
public class ThreadGetSet {

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		System.out.println("main method executed by Thread:"+ Thread.currentThread().getName());

	}

}
