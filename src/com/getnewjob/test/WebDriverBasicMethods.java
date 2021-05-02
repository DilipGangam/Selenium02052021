package com.getnewjob.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicMethods {

	public static void main(String[] args) {
		
		//Invoke Browser Properties
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Launch Browser
		driver.get("https://idrivesafely.com");
		//Get Title of the page
		System.out.println(driver.getTitle());
		//Get Current Url of the page
		System.out.println(driver.getCurrentUrl());
		//Get Page Source
		//System.out.println(driver.getPageSource());
		//Open new url
		//driver.navigate().to("https://aceable.com");
		//Back the Browser
		//driver.navigate().back();
		//Foward the Browser
		//driver.navigate().forward();
		//close the browser
		driver.close();

	}

}
