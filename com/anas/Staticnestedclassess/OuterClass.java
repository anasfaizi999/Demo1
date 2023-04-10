package com.anas.Staticnestedclassess;

 public class OuterClass {
	  static int outerStaticMember = 10;
	  
	  int instanceMember = 10;
	  
	  private static int outerprivateMember = 30;
	  
	  
	  static class   StaticNestedClass {
		  void display() {
 
			System.out.println("static member of outer class =" + outerStaticMember);
			
			System.out.println(" private static member of outer class =" + outerprivateMember);
			
			//System.out.println("non static member of outer class = " + instanceMember);
			
		  }
		  
	  }

}
