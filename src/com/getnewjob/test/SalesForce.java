package com.getnewjob.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {

		// Invoke Browser Properties
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Launch Application
		driver.get("https://login.salesforce.com");
		//Get title of the page
		System.out.println(driver.getTitle());
		//Fill the edit boxes
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dilip");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("123456");
		//Click on login button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Capture the error message
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		//driver.close();
	}

}
