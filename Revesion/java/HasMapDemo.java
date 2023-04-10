package Revesion.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Anas", 20);
		m.put("Faizi", 10);
		m.put("Imran", 30);
		m.put("Wali", 8);
		m.put("Xysz", 9);
		System.out.println(m);
		System.out.println(m.put("Faizi", 10));
		Set s= m.keySet();
		System.out.println(s);
		Collection c =m.values();
		System.out.println(c);
		Set s1 =m.entrySet();
		System.out.println(s1);
		
	}

}
