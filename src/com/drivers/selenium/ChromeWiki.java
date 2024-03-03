package com.drivers.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWiki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // Initiating chromeDriver

		driver.get("https://www.wikipedia.org/"); // opening the website on chromedriver
		System.out.println("URL of the current page is: " + driver.getCurrentUrl()); // printing the url of the current
																						// page
		WebElement searchBox = driver.findElement(By.name("search")); // creating webelement for search box
		driver.manage().window().maximize(); // maximizing the browser window
		searchBox.sendKeys("Artificial Intelligence"); // entering the search query
		searchBox.submit(); // submitting search query

		 WebElement history = driver.findElement(By.linkText("History"));
		 history.click();
		 WebElement sectionTitle= driver.findElement(By.id("History"));
		System.out.println("history section title is: " + sectionTitle.getText()); //print the title of history page
		driver.close(); // closing this driver

	}

}
