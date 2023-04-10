package Java.durga.javaaa8;

interface InterF3 { 
	 public void sum(int a,int b); 
	 } 

	public class FIWithLambda2Sum {

		public static void main(String[] args) {
			
			InterF3 i = (a,b) -> System.out.println("Sum:" +(a+b)); 
			i.sum(5,4);
		}

	}