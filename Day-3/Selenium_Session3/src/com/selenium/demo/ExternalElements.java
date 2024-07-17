package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElements {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Admin/Desktop/demo1234.html");
		
		WebElement btn1=driver.findElement(By.id("btn1"));
		btn1.click();
		driver.switchTo().alert().accept();
		
		WebElement btn2=driver.findElement(By.id("btn2"));
		btn2.click();
		driver.switchTo().alert().dismiss();
		
		WebElement btn3=driver.findElement(By.id("btn3"));
		btn3.click();
		driver.switchTo().alert().sendKeys("Nikunj Soni");
		driver.switchTo().alert().accept();
		
		WebElement text=driver.findElement(By.id("text"));
		System.out.println(text.getText());
		
		driver.close();
	}
}
