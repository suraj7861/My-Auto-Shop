package com.autoShop;

public class Sedan extends Car {
	
	//variable declaration
	int length;

	//constructor
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	@Override
	public double getSalePrice() {
		if (length >  20) {
			salePrice = regularPrice * 0.95;
		}
		else {
			salePrice = regularPrice * 0.90;
		}
		return salePrice;
		
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + " ,salePrice = "+getSalePrice();
	}
	
	
}
