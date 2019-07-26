package com.clc.finalselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/facebook.html");
		//driver.get("http://demo.guru99.com/test/newtours/");
	driver.get("http://demo.guru99.com/test/newtours/index.php");
		//driver.findElement(By.id("email")).click();
		//driver.findElement(By.name("email")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.cssSelector("css=input#email")).click();
		//driver.findElement(By.cssSelector("css=input.inputtext")).click();
		//driver.findElement(By.cssSelector("css=input[@name='email']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).click();
		//driver.findElement(By.cssSelector("css=input.inputtext[tabindex=1]")).click();
		//driver.findElement(By.cssSelector("css=font:contains("Password:")")).click();
		//driver.findElement(document.getElementById("persist_box")).click();
	//driver.findElement(By.xpath("//html//body//div[2]//table//tbody//tr//td[2]//table//tbody//tr[4]//td//table//tbody//tr//td[2]//table//tbody//tr[2]//td[3]//form//table//tbody//tr[3]//td[2]//img")).click();
	driver.findElement(By.xpath("//html//body//div[2]//table//tbody//tr//td[2]//table//tbody//tr[2]//td//table//tbody//tr//td[2]//a")).click();
}
}