package com.polymorphism.com;

public class methodOverloading {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		 methodOverloading m=new methodOverloading();
		 System.out.println("Result: "+m.add(3, 8,7));
	}

}
