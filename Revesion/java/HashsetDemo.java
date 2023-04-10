package Revesion.java;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("b");
		h.add("d");
		h.add("c");
		h.add(null);
		h.add(10);
		System.out.println(h);
		System.out.println(h.add(10));
		
		Object arrayy[]= h.toArray();
		System.out.println(Arrays.toString(arrayy));
	}

}
