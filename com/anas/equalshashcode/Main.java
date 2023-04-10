package com.anas.equalshashcode;

public class Main {
	public static void main(String [ ] args){
Student john = new Student(1,"john", "23 East, California");
Student john2 = new Student(2,"john" ,"23 East, California");
Student john3 = new Student(3, "john", "23 East, California");

System.out.println(john.equals(john2));
}
} 
