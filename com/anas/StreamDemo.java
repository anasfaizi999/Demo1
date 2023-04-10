//package com.anas;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Stream;
//
// class StreamDemo {
//	
//	public static void main(String args[]) {
//		
//		List<Integer> numbersList = new ArrayList<>();
//		numbersList.add(10);
//		numbersList.add(20);
//		numbersList.add(30);
//		numbersList.add(40);
//		
//		List<Integer> squaresList= new ArrayList<>();  
//		for(Integer i: numbersList) {
//			squaresList.add(i*i);
//		}
//		
//		Stream<Integer> collectors;
//		List<Integer>squaresList1= numbersList.stream().map(x-> x*x).collect( collectors.toList());
//		System.out.println("List of squared number:" + squaresList1);
//		
//		
//		Set<Integer> squareSet= new HashSet<>();
//		for(integer i : numbersList) {
//			squaresList.add(i*i);
//			
//		}	
//	
//		Set<integer> squareSet =
//			numbersList.stream().map(x->x*x).collect(collectors.toSet());
//		System.out.println("Set of squared numbers:" + squareSet);
//		List<String> language = new ArrayList<>();
//		languages.add("java");
//		languages.add("python");
//		languages.add("scale");
//		
//		List<String> filterResult = new ArrayList<>();
//		for (String s: filterResult) {
//			if(s.starsWith("p")) {
//				filterResult.add(s);
//				
//			}
//		}
//		
//		
//	List<String> filterResult = languages.stream().filter(s->s.starsWith("p")).collect(collectors.toList());
//		System.out.println("Languages starting with 'p':" + filterResult);
//		
//	 		List<String> sortedList =
//				languages.stream().sorted().collect(collectors.toList());
//		System.out.println("languages sorted alphabetically:" + sortedList);
//		
//	demonstration of forEach method
//		System.out.println("printing all elements one by one:");
//		numbersList.stream().map(x->x*x).forEach(y->System.out.println("element is:" + y));
//		
//		demonstration ofreduce method
//		int sum =
//	numbersList.stream().reduce(0, (ans,i)-> ans+1);
//		
//		System.out.println("sum of all elements in the numberList:" + sum);
//		
//		
//	}
//
//}
