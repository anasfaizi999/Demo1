package Revesion.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o2, Object o1) {

		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		
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
	
	
	
	
	

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet  t = new TreeSet (new MyComparator());
		t.add(56);
		t.add(89);
		t.add(70);
		t.add(null);
		
		System.out.println(t);
	    TreeSet<Integer> t1 = new TreeSet<>();
		t1 = 	(TreeSet<Integer>) t.stream().sorted().collect(Collectors.toSet());
	    System.out.println(t);
	}

}
