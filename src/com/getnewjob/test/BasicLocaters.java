package com.getnewjob.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocaters {

	public static void main(String[] args) {
		// Invoke Browser Properties
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Lanuch Application
		driver.get("https://facebook.com");
		// Get Title
		System.out.println(driver.getTitle());
		// Fill Edit Boxes
		/*driver.findElement(By.id("email")).sendKeys("dilip");
		driver.findElement(By.id("pass")).sendKeys("123456");
		// Click on Forgotten link password
		driver.findElement(By.linkText("Forgotten password?")).click();
		// close the browser
		driver.close();*/
		
		//By using X-path fill username and password edit boxes
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dilip");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		//Click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
