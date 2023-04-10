package Java8.durga;

import java.util.function.Predicate;

public class Test4 {
	public static void main(String[] args) {
		String[] s = {"nag","anas","faizi"};
		Predicate<String> p = s1->s1.length()%2==0;
		
		for(String s1: s)
		{
			if(p.test(s1))
			{
				System.out.println(s1);
			 
			}
		}
	}

}
