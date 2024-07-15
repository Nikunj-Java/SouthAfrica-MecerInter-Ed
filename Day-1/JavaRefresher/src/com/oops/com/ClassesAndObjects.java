package com.oops.com;

public class ClassesAndObjects {
	
	
	public static void main(String[] args) {
		
		//object Creation
		Car c1= new Car("Ferrari", "Porsche", "XYZ", 2024);
		//access the methods from class
		c1.Display();
		
		Student s1=new Student();
		s1.setName("Nikunj Soni");
		s1.setRollNo(23);
		s1.setEmail("nikunj@gmail.com");
		
		System.out.println("Student Info:"+s1.getName()+","+s1.getRollNo()+","+s1.getEmail());
	}
	
	

}
