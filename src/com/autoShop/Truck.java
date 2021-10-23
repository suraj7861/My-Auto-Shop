package com.autoShop;

public class Truck extends Car {
	
	//variable
	int weight;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	//method: get sale price of Truck
	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			salePrice = regularPrice * 0.90;
		}
		else {
			salePrice = regularPrice * 0.80;
		}
		return salePrice;
		
	}

	@Override
	public String toString() {
		return "Truck = speed = "+speed +", regularPrice = "+regularPrice+", color ="+color+ ", weight = " + weight + ", salePrice = "+getSalePrice();
	}
	
		
}
