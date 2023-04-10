package Java8.durga;
interface Interf1
{
	public void add(int a,int b);
	abstract class Demo implements Interf1{
		public void add(int a,int b) {
		}
		// System.out.println("The sum:" + (a+b));
	}
}
public class Test {
	public static void main(String[] args) {
		Interf1 i = (a,b)->System.out.println("The sum:"+(a+b));//
		 i.add(10, 20);
		 i.add(100, 200);
		 i.add(1000, 2000);
		 
	}

	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
