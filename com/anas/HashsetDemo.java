 package com.anas;

import java.util.*;

public class HashsetDemo {
	public static void main(String args[]) {
		
		Set<String> HashSet = new HashSet();
	 
		HashSet.add("A");
		HashSet.add("B");
		boolean r1= HashSet.add("C");
		System.out.println(r1);
    	boolean r2 = HashSet.add("C");
    	System.out.println(r2);
    	
		
		System.out.println(HashSet);
		
		System.out.println("List contains C or not?" + HashSet.contains("C"));
		
			HashSet.remove("A");
			
		
		
		
		
	}

}
