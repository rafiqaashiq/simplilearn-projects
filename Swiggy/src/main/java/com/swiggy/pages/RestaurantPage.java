package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantPage {

	private WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class,'sc-kgflAQ cGeVnN')])[1]")
	private WebElement restaurant;
	
	public RestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void selectRestaurant() {
		wait.until(ExpectedConditions.visibilityOf(restaurant));
		restaurant.click();
	}
}
