package com.anas.Trycatch;

import java.util.ArrayList;
import java.util.List;

 

public class WriterHelper {
	public void writeList() {
		try {
			
			List<Integer> list = new ArrayList<>(10);
			list.add(10);
			
			System.out.println("Entering" + "try statement");
			Integer a = list.get(0);
			System.out.println("accessing the first element:" + a);
			
			
			} catch (IndexOutOfBoundsException e) {
				System.err.println("caught IndexOutOfBoundsException:" + e.getMessage());
			} finally {
				System.out.println("this will always be executed");
				
			}
	}

}
