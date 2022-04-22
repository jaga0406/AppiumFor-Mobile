package com.lao.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class Calculator {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
	
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("platformVersion", "9");
      capabilities.setCapability("udid", "af23c5860306");
      capabilities.setCapability("deviceName", "Redmi");
      capabilities.setCapability("appPackage", "com.miui.calculator");
      capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
      
//      capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//      capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
//      capabilities.setCapability(MobileCapabilityType.UDID, "Android");
//      capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
      
    
		URL url = new URL("http://127.0.0.1:4744/wd/hub");
		driver = new AndroidDriver(url, capabilities);
        System.out.println("Thirandidu seese");
        
      
	}

}
