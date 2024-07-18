package com.testngselenium.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void Hello() {
		System.out.println("Welcome to TestNg");
		
	}
	@Test
	public void  HelloWorld() {
		System.out.println("Hello World Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method..");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method..");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class..");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class..");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test..");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test..");
	}
	
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit..");
	}
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println("AFter Suit..");
	}
  
}
