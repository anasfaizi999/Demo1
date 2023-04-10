package com.anas;

public class Student implements Comparable<Student> {
private	String name;
private	int age;
private	int address;
	
	public Student(String name, int age, int address) {
		this.name = name;
		this.age = age;
		this.address = address;
		
	
	
	}

	

	public Student(int i, String string, int address2) {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student o) {
	
		return this.age - o.age;
	}
	
	
}
