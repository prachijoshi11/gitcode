package com.clc.finalselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/facebook.html");
		//driver.get("http://demo.guru99.com/test/newtours/");
	
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/ajax.html");
driver.findElement(By.id("no")).click();
driver.findElement(By.id("buttoncheck")).click();
	}
}
