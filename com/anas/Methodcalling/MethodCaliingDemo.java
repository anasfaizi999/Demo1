package com.anas.Methodcalling;

import com.anas.StaticDemo.Student;

public class MethodCaliingDemo {

	public static void main(String[] args) {
		int i = 1;
		changeValue1(i);
		System.out.println("i is: " +i);
		
		Student john = new Student("john", 25, "East,California");
		
	//	System.out.println(john.getName());
		//System.out.println(john.getAge());
		//System.out.println(john.getAddress());
		}
	
	private static void changeValue1(int i) {
		i = i +1;
	}
	
	static void changeNameInSameObject(Student student) {
		student.setName("jane");
			}
	//static void changeNameInDiffObject(Student student) {
		// student newStudent = new Student("jane",student.getAge(), student)
	

	private static void changeValue(int i) {
		// TODO Auto-generated method stub
		
	}
}
