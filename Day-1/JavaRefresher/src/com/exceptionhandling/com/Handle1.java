package com.exceptionhandling.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handle1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		sc.close();
		
		try {
			//risky code
			int divide=num1/num2;
			System.out.println("Division of "+num1+" by "+num2 +" is :"+divide);
			 
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		System.out.println("End of program");
	}

}
