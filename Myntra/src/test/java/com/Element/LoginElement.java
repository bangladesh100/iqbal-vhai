package com.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElement {

	@FindBy (name="email")
	public WebElement email;
	
	@FindBy (name= "password")
	public WebElement password;
	
	@FindBy(className="login-login-button") 	
	public WebElement Login;
	
	
}
