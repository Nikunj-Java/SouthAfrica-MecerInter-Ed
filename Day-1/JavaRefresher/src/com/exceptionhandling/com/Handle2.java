package com.exceptionhandling.com;

import java.util.Scanner;

public class Handle2 {
	
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int number;
		
		try {
			//risky code
			number=Integer.parseInt(str);
			System.out.println(number);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			sc.close();
			System.out.println("End of Program");
		}
		
	}

}
