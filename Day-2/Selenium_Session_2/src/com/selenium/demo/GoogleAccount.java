package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		List<WebElement> list= driver.findElements(By.id("identifierId"));
		
		for(WebElement e:list) {
			System.out.println("List of WebElements: "+e.getAttribute("placeholder"));
		} 
		
		driver.close();
	}
}
