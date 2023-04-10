package Revesion.java;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("anas");
		l.add("faizi");
		//l.remove("faizi");
		l.add(1, "linked");
		l.removeFirst();
		l.set(1, "imran");
		System.out.println(l);
		
		
		
	}

}
