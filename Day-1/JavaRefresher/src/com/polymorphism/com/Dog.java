package com.polymorphism.com;

public class Dog extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		System.out.println("Dog Sound....Bhow");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
	}
	
	 

}
