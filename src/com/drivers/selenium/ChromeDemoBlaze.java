package com.drivers.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemoBlaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle(); //to get actual title of the page
		System.out.println("Current page title is: " + actualTitle); // printing the current page title
		String expectedTitle = "STORE"; // storing expected page title

		if (actualTitle.equalsIgnoreCase(expectedTitle)) {  //validating page title actual vs expected
			System.out.println("Page landed on correct website");

		} else {
			System.err.println("Page title does not match");

		}

	}
}