package com.drivers.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		System.out.println("Current page URL is: " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
		System.out.println("Browser is closed");

	}

}
