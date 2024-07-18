package com.testngselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupTest {
	
	
	WebDriver driver=null;
	
  @Test(groups = "Chrome")
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://www.facebook.com/");
	  
		  try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  
  @Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
  public void loginWithChrome() {
	  driver.findElement(By.id("email")).sendKeys("Nikunj@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Nikunj@123456_123");
	  driver.findElement(By.name("login")).click();
	  
		  try {
			Thread.sleep(2000);
			driver.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
  }
  
  @Test(groups = "Firefox")
  public void launchFirefox() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Phase-5\\Drivers2024\\geckodriver-win64\\geckodriver.exe");
	  driver =new FirefoxDriver();
	  driver.get("http://www.facebook.com/");
	  
		  try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
  
  @Test(groups = "Firefox",dependsOnMethods = {"launchFirefox"})
  public void loginWithFirefox() {
	  driver.findElement(By.id("email")).sendKeys("Nikunj@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Nikunj@123456_123");
	  driver.findElement(By.name("login")).click();
	  
		  try {
			Thread.sleep(2000);
			driver.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  
  }
  
}
