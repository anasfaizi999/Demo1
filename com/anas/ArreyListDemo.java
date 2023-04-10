package com.anas;

import java.util.ArrayList;
import java.util.List;

public class ArreyListDemo {
	public static void main(String[] args) {
		List<Integer> arraylist= new ArrayList<Integer>(5);
		for (int i= 1; i<=5; i++)
			arraylist.add(i);
		
		//printing elements
		System.out.println(arraylist);
		
		// Remove element at index 3
		arraylist.remove(3);
		
		//Displaying the arraylist
		//after deletion
		System.out.println(arraylist);
//printing element one by one 
		for (int i = 0; i< arraylist.size(); i++)
			System.out.print(arraylist.get(i) +" " );
	//	for (int i : arraylist) {

			//System.out.println(i);
		  	
			
		}
	
		
			
		
	}
 // }
