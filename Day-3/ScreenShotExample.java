package com.selenium.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Drivers2024\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		//risky code
		try {
			Thread.sleep(3000);
			FileHandler.copy(src, new File("D://2024//SouthAfrica//Day-3//Screenshot//oracle.png"));
			System.out.println("Screenshot Taken Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			driver.close();
		}
			
	}

}
