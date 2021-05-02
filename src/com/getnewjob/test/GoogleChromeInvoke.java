package com.getnewjob.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleChromeInvoke {

	public static void main(String[] args) {
		// Invoke Google Chrome Browser property
		/*System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser_Driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		// Invoke Mozilla Firefox Browser property
		/*System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser_Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		
		// Invoke IE Browser property
		System.setProperty("webdriver.ie.driver", "D:\\Software\\Browser_Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		// Maximize the Browser
		driver.manage().window().maximize();
		// Launch Browser
		driver.get("https://google.co.in");
		// Get Title of the browser
		System.out.println(driver.getTitle());
		// Close the Browser
		driver.close();

	}

}
