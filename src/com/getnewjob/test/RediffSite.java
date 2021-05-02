package com.getnewjob.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSite {

	public static void main(String[] args) {
		//Invoke Browser Properties
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Launch the application
		driver.get("https://rediff.com");
		//Get Title
		System.out.println(driver.getTitle());
		//Click on Sign-in link
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//Fill username & password
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("dilip");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("123456");
		//Click on Sign Button
		driver.findElement(By.xpath("//*[@value='Sign in']")).click();

	}

}
