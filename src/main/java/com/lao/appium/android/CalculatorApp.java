package com.lao.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CalculatorApp {

	public static RemoteWebDriver driver;
 
public void setUp() throws InterruptedException {

//Set up desired capabilities and pass the Android app-activity and app-package to Appium
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("platformVersion", "9");
 capabilities.setCapability("udid", "af23c5860306");
 capabilities.setCapability("deviceName", "Redmi");
 capabilities.setCapability("appPackage", "com.miui.calculator");
 capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
    
    
//Create RemoteWebDriver instance and connect to the Appium server
//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
      
  try {  
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }
 catch (MalformedURLException e) {
        e.printStackTrace();
   }
Thread.sleep(2000);
   }
 
public String testCalculator() throws Exception
{
setUp();
WebElement firstNum=driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
firstNum.click();
WebElement plus=driver.findElement(By.id("com.google.android.calculator:id/op_add"));
plus.click();
WebElement secondNum=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
secondNum.click();
WebElement equals=driver.findElement(By.id("com.google.android.calculator:id/eq"));
equals.click();
  
String result=driver.findElement(By.id("com.google.android.calculator:id/result")).getText();
return result;
}

public static void main(String[] args) throws Exception {

  CalculatorApp app=new CalculatorApp();
  System.out.println("The result is : "+app.testCalculator());
 }
}
