package com.action;




import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Element.ManElement;
import com.Utilities.SetupDriver;

public class ManAction {
	ManElement ManElm;
 WebDriver driver;

	public ManAction() {
		this.ManElm = new ManElement();
		PageFactory.initElements(SetupDriver.driver, ManElm);
	}

	public void LauchLoginPage() {
		SetupDriver.driver.get("https://www.myntra.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void menmenuoption() throws InterruptedException  {
		// System.out.println(">> MAN ")

		Actions action = new Actions(SetupDriver.driver);
		// action.moveToElement(driver.findElement(By.xpath("id")))
		action.moveToElement(ManElm.menmenuoption).perform();
		Thread.sleep(3000);

	}

	public void Tshirt() {

		ManElm.TShirt.click();
		Assert.assertEquals("T-Shirts", "T-Shirts");

	}

	public void Brand() {
		ManElm.Brand.click();

		//Alert alert = SetupDriver.driver.switchTo().alert();
		//alert.dismiss();

	}

	public void Price() { 
		ManElm.price.click();
	}

	/*
	 * public void Wishlist() { ManElm.wishlist.click(); Actions action = new
	 * Actions(SetupDriver.driver);
	 * //action.moveToElement(driver.findElement(By.xpath("id")))
	 * action.moveToElement(ManElm.wishlist).perform();
	 * 
	 * }
	 * 
	 * public void Size() { ManElm.Size .click(); }
	 */

	//public void sizeOfTshirt() {
		//ManElm.Lsize();
	

	public void size() {
		ManElm.Lsize.click();
	}
	public void ADDtoBag() {
		ManElm.Addtobag.click();
	}

}
