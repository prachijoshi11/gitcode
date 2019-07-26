package com.clc.finalselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\New folder\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	//System.setProperty("webdriver.firefox.driver", "C:\\SeleniumBrowserDrivers\\New folder\\geckodriver.exe");
	//WebDriver driver= new FirefoxDriver();
	
	String expectedTitle = "YouTube";
	String actualTitle = "";
	driver.get("https://www.youtube.com/");
	actualTitle = driver.getTitle();
	if (actualTitle.contentEquals(expectedTitle)) {
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	driver.close();
   
}
}