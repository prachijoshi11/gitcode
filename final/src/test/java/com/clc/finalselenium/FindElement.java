package com.clc.finalselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String tagName ="";
		driver.get("https://mail.google.com/mail/u/0/");
	tagName= 	driver.findElement(By.id("identifierId")).getTagName();
		System.out.println(tagName);
		driver.close();
		

}

}