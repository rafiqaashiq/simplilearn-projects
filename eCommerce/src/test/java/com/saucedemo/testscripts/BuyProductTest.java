package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.DetailsPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.SignInPage;
import com.saucedemo.pages.VerifyOrder;

public class BuyProductTest extends BaseTest {

	@Test
	public void buyProduct() {
		
		SignInPage signInPage = new SignInPage(driver);
		HomePage homePage = new HomePage(driver);
		CartPage cartPage = new CartPage(driver);
		DetailsPage detailsPage = new DetailsPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		VerifyOrder verifyOrder = new VerifyOrder(driver);
		
//		1) Enter ‘standard_user’ as username and ‘secret_sauce’ as password
		signInPage.enterUsername("standard_user");
		signInPage.enterPassword("secret_sauce");
		signInPage.clickLogin();
		
//		2) Add first product in the cart
		homePage.clickAddToCart();
		
//		3) Click on Cart icon at top right corner
		homePage.clickCart();
		
//		4) Click on ‘Checkout’ button
		cartPage.clickCheckout();
		
//		5) Enter your details
		detailsPage.enterFirstname("zepher");
		detailsPage.enterLastname("z");
		detailsPage.enterZipcode("600016");
		
//		6) Click on ‘Continue’ button
		detailsPage.clickContinue();
		
//		7) Click ‘Finish’ button
		checkoutPage.clickFinish();
		
//		8) Verify the text ‘Thank you for your order!’ is visible
		String expectedTitle = "Thank you for your order!";
		String actualTitle = verifyOrder.verifyTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
}
