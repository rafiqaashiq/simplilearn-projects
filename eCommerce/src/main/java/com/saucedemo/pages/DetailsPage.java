package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement zipCode;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	public DetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstname(String firstname) {
		firstName.click();
		firstName.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		lastName.click();
		lastName.sendKeys(lastname);
	}
	
	public void enterZipcode(String zipcode) {
		zipCode.click();
		zipCode.sendKeys(zipcode);
	}
	
	public void clickContinue() {
		continueBtn.click();
	}
}
