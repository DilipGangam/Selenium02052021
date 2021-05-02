package com.getnewjob.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		//Invoke Browser properties
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Launch application
		//driver.get("https://google.co.in");
		driver.get("https://amazon.in");
		//Get Title
		System.out.println(driver.getTitle());
		//Enter something in google search
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("persistent systems");
		//Click on Images link
		//driver.findElement(By.xpath("//div[@class='gb_9d gb_i gb_og gb_fg']/div[2]/a")).click();
		//Click on Brazil link in the footer
		driver.findElement(By.xpath("//a[normalize-space()='Brazil']")).click();
		
	}

}
