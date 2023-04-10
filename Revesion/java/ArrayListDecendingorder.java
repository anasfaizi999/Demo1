package Revesion.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDecendingorder {
	public static void main(String[] args) {
		ArrayList t =new ArrayList();
		t.add("Faizi");
		t.add("Anas");
		t.add("hasim");
		t.add("Imran");
		System.out.println("Unsorted Arralist result"+t);
		//Collections.reverseOrder();
		Collections.sort(t, Collections.reverseOrder());
		System.out.println("Decending order Result" + t);
		
				
	}

}
