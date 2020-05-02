package com.Stepdeff;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.action.LoginAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraStepdeff {
	WebDriver driver;

	LoginAction logAct= new LoginAction(); 

@Given("^Browse to Myntra home page$")
public void browse_to_Myntra_home_page() throws Throwable {
	logAct.launchLoginPage();
  
}

@When("^enter current email address and password$")
public void enter_current_email_address_and_password() throws Throwable {
	logAct.inputEmail("email"); 
	logAct.inputPassword("password");  
}

@And("^click Login button$")
public void click_Login_button() throws Throwable {
 logAct.inputLogin();  
}

@Then("^successfully login$")
public void successfully_login() throws Throwable {
  String Title = "Myntra";
  String GetTitle= driver.getTitle();
  System.out.println("This is Myntra");
  Assert.assertEquals(Title, GetTitle);
  System.out.println("I am successfully log in  Myntra Homepage");
  driver.quit();
	//Assert.assertEquals(S, get title);
   
}

}
