package Revesion.java;

import java.util.Comparator;
import java.util.TreeSet;


public class TreesetDemo1 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(8);
		t.add(5);
		t.add(10);
		t.add(9);
		t.add(0);
		System.out.println(t);
	}
}
		class MyComparator1 implements Comparator{
			public int compare(Object o1, Object o2) {
				Integer I1 = (Integer)o1;
				Integer I2 = (Integer)o2;
				
				if(I1<I2) {
					return -1;
				}
				else if(I1>I2) {
					return 1;
				}
				else {
					return 0;
					 
				}
				
			}			
			
	
}		
		
	


