package com.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManElement {

	@FindBy(xpath = ("(//*[@class='desktop-main'])[1]"))
	public WebElement menmenuoption;

	@FindBy(xpath = ("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a"))
	public WebElement TShirt;

	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div/main/div[3]/div[1]/section/div/div[3]/ul/li[3]/label")
	public WebElement Brand;

	//@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[1]/p[1] ")
	//public WebElement price;
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/ul/li[2]/label/h4")
	public WebElement size;
		
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[2]/div/ul/li[3]/label")
	public WebElement Lsize;
	
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]")
	public WebElement price;

	// @FindBy(xpath=("//li[2]//a[1]//div[2]//h4[2]//span[3]"))
	// public WebElement Size;
	// @FindBy(xpath=("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[5]/div[3]/span[1]"))
	@FindBy(xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")
	public WebElement Addtobag;
}    
