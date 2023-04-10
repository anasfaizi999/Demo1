package com.demo;

import java.util.IdentityHashMap;

public class IdentityHashMapDmo {
	public static void main(String[] args) {
		
	IdentityHashMap m = new IdentityHashMap();  // we are used before HashMap m= new HasMap();
	
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	
	m.put(i1,"pawan");
	m.put(i2,"kalyan");
	System.out.println(m);
	

}
}