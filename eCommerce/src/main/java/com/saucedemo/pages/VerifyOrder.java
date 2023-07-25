package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrder {

	@FindBy(xpath = "//h2[contains(text(), 'Thank you')]")
	private WebElement title;
	
	public VerifyOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() {
		String text = title.getText();
		return text;
	}
}
