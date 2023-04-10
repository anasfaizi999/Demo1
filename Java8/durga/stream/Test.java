package Java8.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(4);
	    marks.add(5);
		marks.add(7);
		marks.add(8);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
	      System.out.println(updatedMarks);

	}

}
