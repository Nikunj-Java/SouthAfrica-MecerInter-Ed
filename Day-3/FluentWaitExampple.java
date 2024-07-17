package com.selenium.demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExampple {
	
	
	public static void main(String[] args) {
		//link:http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html
		//link: https://the-internet.herokuapp.com/dynamic_loading/1
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
			
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		WebElement element=driver.findElement(By.id("demo"));
		String getTextFromLine=element.getText();
		 
		
		//fluent wait
		 
		FluentWait<WebDriver> fwait= new  FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement text= fwait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub

				WebElement element=driver.findElement(By.id("demo"));
				String getTextFromLine=element.getText();
				
				if(getTextFromLine.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(getTextFromLine);
					System.out.println("Element Loaded Successfully");
					return element;
				}
				else {
					System.out.println("Fluent Wait Fails! Element Not Loaded Yet");
					return null;
				}
			}
			
		});
 
		
		driver.close();
		 
		
	}

}
