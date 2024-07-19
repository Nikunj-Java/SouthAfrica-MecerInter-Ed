package com.testngselenium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
	
	//WebDriver driver1;
	//AndroidDriver<MobileElement>
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		//set the device name
		cap.setCapability("deviceName", "Redmi 10A");
		//set device id from adb devices
		cap.setCapability("uuid","HAGEUCSSOFXC5LVC");
		//set platform name
		cap.setCapability("platformName", "Android");
		//set mobile version
		cap.setCapability("platformVersion", "11 RP1A.200720.011");
		//set package name
		cap.setCapability("appPackage", "com.miui.calculator");
		//to get package name download : apk info
		//set package name
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		//set appium driver name
		cap.setCapability("automationName", "UiAutomator2");
		
		URL url=new  URL("http://192.168.1.100:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application is Started");
		
		
	}

}
