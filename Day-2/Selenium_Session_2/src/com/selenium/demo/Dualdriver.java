package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dualdriver {
	
	public static void main(String[] args) {
		//link:https://github.com/mozilla/geckodriver/releases
				System.setProperty("webdriver.gecko.driver", "D:\\Phase-5\\Drivers2024\\geckodriver-win64\\geckodriver.exe");
				
				WebDriver driver= new FirefoxDriver();
				WebDriver driver1= new ChromeDriver();
				 
				driver.get("https://www.google.com/");
				driver1.get("https://www.google.com/");
				driver.quit();
				driver1.quit();
	}

}
