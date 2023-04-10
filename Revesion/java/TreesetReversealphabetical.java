package Revesion.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetReversealphabetical {
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator11());
		t.add("lnas");
		t.add("faizi");
		t.add("zaid");
		t.add("imran");
		t.add("wali");		
		t.add("boys");
		t.add("toys");
		System.out.println(t);
		
		
	}

}
class MyComparator11 implements Comparator{
	public int compare(Object o1,Object o2) {
		 String s1 = o1.toString();
		 String s2 = o2.toString();
//		// return s2.compareTo(s1);  for alphabetical oreder;
//		//
//		 return s1.compareTo(s2); 
		 int i1 =s1.length();
		 int i2 = s2.length();
		 if(i1<i2) {
		 
		 return -1;
		 
		 } else if(i1>i2) {
		 return 1;
	}
		 else {
			 return s1.compareTo(s1);
		 
		  
		 
	}
	
	}}
