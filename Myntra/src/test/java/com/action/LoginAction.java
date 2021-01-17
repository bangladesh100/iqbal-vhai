package com.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Element.LoginElement;
import com.Utilities.SetupDriver;

public class LoginAction {

	LoginElement logElmt=null;
	WebDriver driver;

	public LoginAction() {

		LoginElement logElmt = new LoginElement();

		PageFactory.initElements(SetupDriver.driver, logElmt);

		// PageFactory.initElements(SetupDriver.driver, logElmt);
		// System.out.println( driver.getTitle());

	}

	public void launchLoginPage() {
		SetupDriver.driver.get("https://www.myntra.com/login");

		System.out.println(SetupDriver.driver.getTitle());

	}

	/*
	 * public void navigateToProfile() throws InterruptedException {
	 * System.out.println(">>Navigating to the profile"); Actions action = new
	 * Actions(SetupDriver.driver);
	 * action.moveToElement(logElmt.Profile).build().perform(); Thread.sleep(5000);
	 * 
	 * }
	 */

	public void inputEmail(String email) throws InterruptedException {

		//logElmt.getEmail().sendKeys("zebjubair@gmail.com");
		//Thread.sleep(2000);
		logElmt.getEmail().sendKeys("9345890");
		Thread.sleep(2000);

	}

	public void inputPassword(String password) throws InterruptedException {
		logElmt.getPassword().sendKeys("Zebun1705@");
		Thread.sleep(5000);
	}

	public void inputLogin() throws InterruptedException {
		logElmt.getLogin().click();

		Thread.sleep(5000);
		
	}

	// TODO Auto-generated method stub

}
