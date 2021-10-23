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
	
	@Override
	public double getSalePrice() {
		salePrice = regularPrice - manufacturerDiscount;
		return salePrice;	
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + " ,salePrice = "+getSalePrice();
	}
	
	

}
