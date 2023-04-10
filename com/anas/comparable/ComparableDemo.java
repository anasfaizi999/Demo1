package com.anas.comparable;

import java.util.ArrayList;
import java.util.Collections;

 

public class ComparableDemo {
	public static void main(String [ ] args){ 
		ArrayList<Student> list = new ArrayList<Student>();
Student john = new Student(3,"john", 23);
Student jane = new Student(1,"jane" ,18);
Student tom = new Student(2, "tom", 20);

list.add(john);
list.add(jane);
list.add(tom);

Collections.sort(list);
System.out.println("Student after sorting :");
list.forEach(student ->System.out.println(student.getName()));

}

}
