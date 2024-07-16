package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//1. get by id
		WebElement email_id=driver.findElement(By.id("email"));
		 
		//2. get by name
		WebElement email_name=driver.findElement(By.name("email"));
		 
		System.out.println("Email by id and name: "+email_id.equals(email_name));
		
		//3. linked text
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		//4.xpath
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		System.out.println("Email by id and xpath: "+email_id.equals(email_xpath));
		
		//5. fullxpath
		WebElement email_fullxpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		
		System.out.println("Email by id and fullxpath: "+email_id.equals(email_fullxpath));
		
		
		//6.cssSelector
		WebElement email_css=driver.findElement(By.cssSelector("#email"));
		
		System.out.println("Email by xpath and cssSelector: "+email_xpath.equals(email_css));
		
		//7. tag
		WebElement password=driver.findElement(By.cssSelector("input[name=pass]"));

		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));
		
		//8.list of web elements
		
		List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of WebElements: "+e.getAttribute("placeholder"));
		} 
		
		driver.close();
	}
	

}
