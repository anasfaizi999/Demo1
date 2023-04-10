package com.anas;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String args[]) {
// TreeMap<Integer, String> treeMap = new TreeMap<>();
		TreeMap<String, Integer> treeMap = new TreeMap<>();

// treeMap.put(3, "A");
// treeMap.put(2,"B");
// treeMap.put(1,"C");
 treeMap.put("A", 3);
 treeMap.put("B", 2);
 treeMap.put("C", 1);
 treeMap.put("D", 1);
 System.out.println(treeMap);
	}
}