package com.autoShop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		System.out.println("Welocome to My Auto Shop ");
		
		//object create of Truck
		Car truck = new Truck(80, 8000, "blue", 500);
		truck.getSalePrice();
		System.out.println(truck);
		
		//object create of Ford 1
		Car ford1 = new Ford(100, 9000, "black", 2020, 1000);
		ford1.getSalePrice();
		System.out.println("Ford 1 = "+ford1);
		
		//object create of Ford 2
		Car ford2 = new Ford(120, 10000, "yellow", 2018, 1500);
		ford2.getSalePrice();
		System.out.println("Ford 2 = "+ford2);

		//object create of Sedan
		Car sedan = new Sedan(900, 7000, "red", 22);
		sedan.getSalePrice();
		System.out.println(sedan);
	}

}
