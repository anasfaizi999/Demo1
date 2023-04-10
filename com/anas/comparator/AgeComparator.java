package com.anas.comparator;

import java.util.Comparator;

import com.anas.Student;


public class AgeComparator implements Comparator<Student> {
	
	
		
		
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getAge() <o2.getAge()) {
				return 1;
			}
			
			if (o1.getAge() < o2.getAge()) {
				return -1;
		}
			else {
				
			return 0;	
			
			}
	 
}
}
