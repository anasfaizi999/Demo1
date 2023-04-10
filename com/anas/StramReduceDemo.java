package com.anas;

import java.util.ArrayList;
import java.util.List;

public class StramReduceDemo {
	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<>();
	numbersList.add(10);
	numbersList.add(20);
	numbersList.add(30);
	numbersList.add(40);
	
	List<String> languages = new ArrayList<>();
	languages.add("scale");
	languages.add("java");
	languages.add("python");
	languages.add("basic");
	
	int sum = numbersList.stream().reduce(0,(ans,i)-> ans+1); 
	
	System.out.println("sum of all elements in the numberlist:" + sum);
	
	}

}
