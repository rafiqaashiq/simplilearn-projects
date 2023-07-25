package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cartBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCart() {
		addToCart.click();
	}
	
	public void clickCart() {
		cartBtn.click();
	}
}
