package Java.durga.javaaa8;


interface InterF2 { 
 public void sum(int a,int b); 
 } 

class Demo implements InterF2 { 
 public void sum(int a,int b) { 
	 System.out.println("Sum :" +(a+b)); 
 } 
 } 

public class FIWithOutLambda2 {

	public static void main(String[] args) {
		
		InterF2 i = new Demo();
		i.sum(2,4);
		i.sum(1,99);

		
	}

}
