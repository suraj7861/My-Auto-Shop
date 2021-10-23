package com.autoShop;

public class Ford extends Car {
	
	//variable declaration
	int year;
	int manufacturerDiscount;
	
	//constructor
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	//method: get sale price of Ford
	@Override
	public double getSalePrice() {
		salePrice = regularPrice - manufacturerDiscount;
		return salePrice;	
	}

	@Override
	public String toString() {
		return "speed = "+speed +", regularPrice = "+regularPrice+", color ="+color+ ", year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + " ,salePrice = "+getSalePrice();
	}
	
	

}
