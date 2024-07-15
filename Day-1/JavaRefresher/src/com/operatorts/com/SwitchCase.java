package com.operatorts.com;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		System.out.println("Choose +,-,*,/");
		String op=sc.next();
		
		switch (op) {
			
		case "+": System.out.println("Addition: "+(num1+num2)); break;
		case "-": System.out.println("Subtraction: "+(num1-num2)); break;
		case "*": System.out.println("Multiplication: "+(num1*num2)); break;
		case "/": System.out.println("Division: "+(num1/num2)); break;
		
		default: System.out.println("Choose Your Operator");
		}
		
	}
}
