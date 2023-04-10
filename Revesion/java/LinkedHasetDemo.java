    package Revesion.java;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHasetDemo {
public static void main(String[] args) {
	
	LinkedList l = new LinkedList();
	l.add(10);
	l.add("anas");
	l.add("c");
	System.out.println(l);
	 
//	Object a = l.get(0);
//	System.out.println(a);
	
	
	Object arrayy[]= l.toArray();
	System.out.println("linkesHasset converted into Array="+l) ;
	
	//Object arrayy[]= l.toArray();
	//System.out.println("linkesHasset converted into Array="+l) ;
	
	
}
}
