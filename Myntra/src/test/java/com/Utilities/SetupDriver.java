package com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// singletone class/ /(base class)

public class SetupDriver {
	
	public static  WebDriver driver;
	//SetupDriver.driver

	public static void getChromeDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\md200\\git\\repository9\\Myntra\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/login");
	}
//SetupDriver.getDriver()
	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDown() {
		
			driver.quit();
		
	
			
		}
	

}



