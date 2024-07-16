package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) {
		//Step:1
		//check your chrome version:  Help>aboutgooglechrome
		//download selenium google chrome driver
		//link:https://developer.chrome.com/docs/chromedriver/downloads
		//link:https://googlechromelabs.github.io/chrome-for-testing/#stable
		//save the driver to some folder
		
		//Step:2
		//download selenium library
		//link:https://www.selenium.dev/downloads/
		//goto>project>right click>buildpath>configure build path> library> classpath> click on add external jar and add all the jar files here
		
		//step:3 INITIALIZING THE DRIVER
		
		String path="D:\\Phase-5\\Drivers2024\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new  ChromeDriver();
		
		//step: 4 URL TO TARGET
		
		String url="https://www.google.com/";
		driver.get(url);
		
		driver.close();
		System.out.println("Driver is working Perffectly");
		
		
	}

}
