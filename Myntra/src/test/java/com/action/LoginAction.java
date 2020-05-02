package com.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Element.LoginElement;
import com.Utilities.SetupDriver;

public class LoginAction {

	LoginElement logElmt;
	WebDriver driver;

	public LoginAction() {

		logElmt = new LoginElement();
		
		PageFactory.initElements(SetupDriver.driver, logElmt);

	}

	public String launchLoginPage() {
		SetupDriver.driver.get("https://www.myntra.com/login");

		String title = SetupDriver.driver.getTitle();
		return title;
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
		logElmt.email.sendKeys("zebjubair@gmail.com");
		Thread.sleep(2000);

	}

	public void inputPassword(String password) throws InterruptedException {
		logElmt.password.sendKeys("Zebun1705@");
		Thread.sleep(5000);
	}

	public void inputLogin() throws InterruptedException {
		logElmt.Login.click();

		Thread.sleep(5000);
	}

	// TODO Auto-generated method stub

}


