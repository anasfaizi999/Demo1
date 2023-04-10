package Java8.durga;

public class Withanonymousinrclass {
	public static void main(String[] args) {
		Runnable r =  ()->{    
			                 // lemda expression
//		 		{
//		public void run()
//		{
       for (int i= 0; i<10;i++)
   {
        	System.out.println("Child Thread");
//        }
	}	
	};	
		
		Thread  t =new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("MAin Thraed");
		}
}
}


