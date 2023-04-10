package Java8.durga.stream;

import java.util.ArrayList;

public class toArray {
	 

		public static void main(String[] args) {
			
			ArrayList<Integer> l = new ArrayList<>();
			l.add(10);
			l.add(0);
			l.add(15);
			l.add(5);
			l.add(20);
			Integer[] i=l.stream().toArray(Integer[]::new);
			 for(Integer i1:i)
			 {
				 System.out.println(i1);
			 }
			
//			l.stream().forEach(System.out::println);       // or Method ref
//			l.stream().forEach((s)->System.out.println(s)); // or forEach(lambdexpa)
		}
	}


