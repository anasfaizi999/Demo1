package Java8.durga.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarksOfFaildStudents {
public static void main(String[] args) {
	
	ArrayList<Integer>marks = new ArrayList<Integer>();
	marks.add(70);
	marks.add(45);
	marks.add(10);
	marks.add(65);
	marks.add(20);
	marks.add(25);
	System.out.println(marks);
	List<Integer> noOfFaildStudents = marks.stream().filter(n->n<35).collect(Collectors.toList());
	System.out.println(noOfFaildStudents);
	
}
}
