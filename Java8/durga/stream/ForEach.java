package Java8.durga.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

//import java.util.ArrayList;
//import java.util.function.*;
//
//public class ForEach {
//	 
//	public static void main(String[] args) {
//		ArrayList<Integer> l =new ArrayList<Integer>();
//		l.add(10);
//		l.add(0);
//		l.add(15);
//		l.add(5);
//		l.add(20);
//		System.out.println(l);
//		Consumer<Integer> c=i->{
//			System.out.println("The Square of "+i+"is:"+(i*i));
//		};
//		
//		l.stream().forEach(c);
//}	
//		
//	}

//public class ForEach {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(0);
//		l.add(15);
//		l.add(5);
//		l.add(20);
//		System.out.println(l);
//		 
//		l.stream().forEach(System.out::println);       // or Method ref
//		l.stream().forEach((s)->System.out.println(s)); // or forEach(lambdexpa)
//	}
//}
//




public class ForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		Integer[] i=l.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		 
		 
	}
}


