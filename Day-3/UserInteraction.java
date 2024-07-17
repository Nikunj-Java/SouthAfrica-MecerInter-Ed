package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {
	
	public static void main(String[] args) {
		
		//link:https://myaccount.google.com/
		
		System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
			WebElement Email= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
			
			Actions builder=new Actions(driver);
			
			Action serierOfAction=builder 
					.moveToElement(Email)
					.click()
					.keyDown(Email,Keys.SHIFT)
					.sendKeys(Email,"Nikunj Soni")
					.doubleClick(Email)
					.contextClick()
					.build();
			serierOfAction.perform();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			 driver.close();
		}
		
	}

}
