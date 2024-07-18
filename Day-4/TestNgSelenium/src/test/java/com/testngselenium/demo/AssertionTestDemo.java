package com.testngselenium.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AssertionTestDemo {
	
	WebDriver driver= null;
	SoftAssert soft=null;
  @Test
  public void TitleTest() {
	  
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
	  soft.assertEquals(driver.getTitle(), "Google");
	  soft.assertAll();
	  driver.close();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  soft= new SoftAssert();
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
	  driver= new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  soft=null;
	  driver=null;
	  
  }

}
