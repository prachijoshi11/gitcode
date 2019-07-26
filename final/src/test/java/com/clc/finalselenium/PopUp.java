package com.clc.finalselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/popuptest2.html");
		driver.close();
	}
}
