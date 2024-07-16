package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	
	public static void main(String[] args) {
		
		//link:https://github.com/mozilla/geckodriver/releases
		System.setProperty("webdriver.gecko.driver", "D:\\Phase-5\\Drivers2024\\geckodriver-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		  
	             try {
	            	// Maximize the browser window
	 	            driver.manage().window().maximize();
	 	            driver.manage().deleteAllCookies();
	 	             
	 	            driver.get("https://www.google.com/");
	 	    
	 	            WebElement searchBtn = driver.findElement(By.name("q"));
	 	            searchBtn.sendKeys("Browserstack Guide");
	 	            searchBtn.sendKeys(Keys.RETURN);
	 	            
					Thread.sleep(2000);
					System.out.println("Title of the Page is: "+driver.getTitle());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					 
				}
	             finally {
	            	 driver.quit();
				}
	             
	            
	        
		 
		
	}

}
