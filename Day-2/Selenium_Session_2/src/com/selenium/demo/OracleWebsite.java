package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleWebsite {
	
	public static void main(String[] args) {
		//step:1 Creating System Environment
		System.setProperty("webdriver.chrome.driver","D:\\\\Phase-5\\\\Drivers2024\\\\chromedriver.exe");
		
		//step:2 initializing chrome
		WebDriver driver= new ChromeDriver();
		
		//step:3 giving a base url
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		try {
			Thread.sleep(2000);
			WebElement email= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
			email.sendKeys("nikunjSoni@gmail.com");
			
			WebElement password= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
			password.sendKeys("Nikunj@123");
			
			WebElement repassword= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
			repassword.sendKeys("Nikunj@123");
			
			WebElement DropDown = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));  
			Select dropdown = new Select(DropDown); 
			dropdown.selectByVisibleText("India"); 
			
			WebElement name1= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
			name1.sendKeys("Nikunj");
			
			WebElement name2= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
			name2.sendKeys("Soni");
			
			WebElement job= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:jobTitle::content\"]"));
			job.sendKeys("Trainer");
			
			WebElement phone= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
			phone.sendKeys("9876543210");
			
			WebElement company= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
			company.sendKeys("MECER-INTER-ED");
			
			WebElement add= driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]"));
			add.sendKeys("qwertyuiopasdfghjkzxcvbnm");
			
			WebElement city= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
			city.sendKeys("Mumbai");
			
			driver.findElement(By.id("sView1:r1:0:state::content")).sendKeys("Maharashtra");
			
			
			WebElement zipcode= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
			zipcode.sendKeys("400001");
			
			// Select the terms and conditions checkbox
	        WebElement termsCheckbox = driver.findElement(By.id("sView1:r1:0:b1"));
	        if (!termsCheckbox.isSelected()) {
	            termsCheckbox.click();
	        }
			
			driver.findElement(By.id("sView1:r1:0:b1")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			driver.quit();
		}
		
		
		
		 
		
	}
}
