package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleWebSite2 {

	 public static void main(String[] args) {
	        // Set the path to the chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");

	        // Initialize the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the Oracle account creation page
	            driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Fill in the form fields
	            driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("nikunj@example.com");
	            driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("NikunjPassword123!");
	            driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("NikunjPassword123!");
	            driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Nikunj");
	            driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Soni");
	            driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Software Engineer");
	            driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("1234567890");
	            driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("MecerInter-Ed");
	            driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("123 XYZqwertyuio");
	            driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Mumbai");
	            driver.findElement(By.id("sView1:r1:0:state::content")).sendKeys("Maharashtra");
	            driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("400001");
	            driver.findElement(By.id("sView1:r1:0:country::content")).sendKeys("India");

	            // Select the terms and conditions checkbox
	            WebElement termsCheckbox = driver.findElement(By.id("sView1:r1:0:b1"));
	            if (!termsCheckbox.isSelected()) {
	                termsCheckbox.click();
	            }

	            // Submit the form
	            driver.findElement(By.id("sView1:r1:0:b1")).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	             driver.quit();
	        }
	    }
}
