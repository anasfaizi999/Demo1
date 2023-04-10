package com.anas;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		//System.out.println("Stack:" + stack);
		
		String poppedElement = stack.pop();
		System.out.println("popped element: " + poppedElement);
		
		System.out.println("Now the stack looks like: " + stack);
		
		String poppedElement1 = stack.pop();
		System.out.println("popped element1:" + poppedElement1);
		
		String poppedElement2 = stack.peek();
		System.out.println("top element:" + poppedElement2);
		
		System.out.println("Now the stack looks like:" + stack);
		
	}

}
 