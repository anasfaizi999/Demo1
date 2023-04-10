package Durga.String.java;

import java.util.Scanner;

public class ClassTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city name:");
		String name = sc.nextLine().toLowerCase().trim() ;  //before add toLowerCase(); and Then Execute program. before use .trim(); for any spase .
		
		
		if(name.equals("hydrabad")) //add spase 2times
		{ 
			
			System.out.println("Hello Hydrabadi; Assalamualaikum...");
		}
		else if (name.equals("ghaziabad"))
		{
			System.out.println("Hello Ghaziabad, Salam...");
		}
		else if (name.equals("patna"))
		{ 
	
			System.out.println("Hello Patna, Namaskar.");
			
		}
		else
		{
			System.out.println("Please Inter Valid City Nme");
		
		}
		
	}

}
