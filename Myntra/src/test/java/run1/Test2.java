package run1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test2 {

	@Test
	public void myTest() {

		System.setProperty("webdriver.chrome.driver",

		"C:\\Users\\md200\\git\\repository9\\Myntra\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotels.com/");
		driver.manage().window().maximize();

		// Assert.assertEquals(driver, "https://www.hotels.com/");
		Assert.assertEquals("https://www.hotels.com/", driver.getCurrentUrl());
		System.out.println("Test case current url validation is done.");

		System.out.println("This is the page title: " + driver.getTitle());

		// Assert.assertEquals("Deals & Discounts for Hotel Reservations from Luxury
		// Hotels to Budget Accommodations", driver.getTitle());

		driver.close();

	}
}
