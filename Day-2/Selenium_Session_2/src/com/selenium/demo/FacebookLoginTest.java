package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		System.out.println("Title: "+driver.getTitle());
		
		WebElement email=driver.findElement(By.id("email"));
		
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("demo@gmail.com");
		
		
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("1234567890");
		
		WebElement submit=driver.findElement(By.name("login"));
		submit.click();
		 
		
		//driver.close();
	}

}
