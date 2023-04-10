package com.anas.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.anas.Student;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student john = new Student(3,"john", 18);
		Student jane = new Student(1, "jane", 21);
		Student tom = new Student(2,"Tom",20);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		Collections.sort(list);
		System.out.println("Student after natural sorting: ");
		list.forEach(student ->System.out.println(student.getName()));
		
		Collections.sort(list, new AgeComparator());
		System.out.println("Students after AGE sorting: ");
		list.forEach(student -> System.out.println(student.getName()));
		
		
	}

}
