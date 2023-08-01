package com.swiggy.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.CheckoutPage;
import com.swiggy.pages.FoodPage;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.RestaurantPage;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static RestaurantPage restaurantPage;
	protected static FoodPage foodPage;
	protected static CheckoutPage checkoutPage;

	public static void init() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		landingPage = new LandingPage(driver);
		restaurantPage = new RestaurantPage(driver);
		foodPage = new FoodPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}

}
