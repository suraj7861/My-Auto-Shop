package com.autoShop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		System.out.println("Welocome to My Auto Shop ");
		
		//object create
		Car truck = new Truck(80, 8000, "blue", 500);
		truck.getSalePrice();
		System.out.println(truck);
		Car ford = new Ford(100, 9000, "black", 2020, 1000);
		ford.getSalePrice();
		System.out.println(ford);
		Car sedan = new Sedan(900, 7000, "red", 22);
		sedan.getSalePrice();
		System.out.println(sedan);
		

	}

}
