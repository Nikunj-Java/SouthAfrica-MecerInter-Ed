package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {
	
	
	public static void main(String[] args) {
		
		//Step:1 Initialise Driver
		System.setProperty("wedriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//Step:2 Trageting URL
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title: "+driver.getTitle());
		 
		
		//driver.close();
	}

}
