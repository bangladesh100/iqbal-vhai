package com.Stepdeff;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.Utilities.SetupDriver;
import com.action.ManAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManStepdef {
	WebDriver driver;
	ManAction ManAct = new ManAction();

	@Given("^Myntra site is launched$")
	public void myntra_site_is_launched() throws Throwable {
		ManAct.LauchLoginPage();

		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();

	}

	@When("^Customer explore the MEN menu option$")
	public void customer_explore_the_MEN_menu_option() throws Throwable {
		ManAct.menmenuoption();
	}

	@When("^Customer should be able to choose T-Shirt$")
	public void customer_should_be_able_to_choose_T_Shirt() throws Throwable {
		ManAct.Tshirt();
	}

	@When("^Choose the brand of his choice$")
	public void choose_the_brand_of_his_choice() throws Throwable {

		// Alert alert = SetupDriver.driver.switchTo().alert();
		// alert.dismiss();

		ManAct.Brand();

	

	}

	/*
	 * @And("^user able tp click price$") public void user_able_tp_click_price()
	 * throws Throwable { ManAct.Price();
	 */
	

	
	@And("^user select L size t shirt$")
	public void user_select_L_size_t_shirt() throws Throwable {
		ManAct.size();
	}



    @And("^user able tp click price$")
     public void user_able_tp_click_price() throws Throwable {
	ManAct.Price();
    }
	@Then("^Product will be added to Bag$")
	public void product_will_be_added_to_Bag() throws Throwable {
		ManAct.ADDtoBag();
	}

}
