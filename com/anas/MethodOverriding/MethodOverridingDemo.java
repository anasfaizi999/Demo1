package com.anas.MethodOverriding;

import com.anas.inheritance.Bicycle;
import com.anas.inheritance.MountainBike;

public class MethodOverridingDemo {
	
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10,1);
		System.out.println("Bicycle gear is:" + bicycle.gear);
		System.out.println("Bicycle speed is:" + bicycle. speed);
		bicycle.applyBrake(1);
		System.out.println("Bicycle speed after appying breaks is:" + bicycle.speed);
		
		Bicycle mountainBike = new MountainBike(50,50,3);
		System.out.println("MountainBike Gear is:" + mountainBike.gear);
		System.out.println("MountainBike speed is:" + mountainBike.speed);
		
	}

}
