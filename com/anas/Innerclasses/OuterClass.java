package com.anas.Innerclasses;

public class OuterClass {
	
	class InnerClass{
		
	public void display() {
		System.out.println("This is a class method");
	}
	}

	void outerClassMethod() {
		
		System.out.println("in the outer Class Method");
		
		class MethodlocalClass{
			
		}  
	}
}
