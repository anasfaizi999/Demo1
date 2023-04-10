package com.anas.StaticDemo;

public class Staticdemo {
	public static void main(String[] args) {
		Student john = new Student("john", 25,"23 East, California");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		System.out.println(john.college);
	}

}
