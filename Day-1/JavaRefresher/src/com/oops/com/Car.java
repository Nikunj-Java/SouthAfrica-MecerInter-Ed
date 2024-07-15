package com.oops.com;

public class Car {
	
	String name;
	String brand;
	String model;
	int year;
	
	public Car(String name, String brand, String model, int year) {
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void Display() {
		System.out.println("Name: "+name);
		System.out.println("Brand Name: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
	
	

}
