package com.anas.Staticnestedclassess;

import com.anas.Staticnestedclassess.OuterClass.StaticNestedClass;

public class StaticNestedClassDemo {
	
private static StaticNestedClass nestedObjected;

public static void main(String[] args) {
	//acceccing a static nested class
	StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
	
	nestedObject.display();
}
}
