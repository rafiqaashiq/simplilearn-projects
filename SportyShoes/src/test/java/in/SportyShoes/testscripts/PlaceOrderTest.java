package in.SportyShoes.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.SportyShoes.pages.CartPage;
import in.SportyShoes.pages.HomePage;

public class PlaceOrderTest extends UserLoginTest {

	@Test
	public void placeOrder() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		CartPage cartPage = new CartPage(driver);

		// click on cart tab
		homePage.clickCart();

		// click on place order button
		cartPage.clickPlaceOrder();

		// verify whether the product is ordered
		String expectedMsg = "Success!";
		String actualMsg = cartPage.verifyPlaceOrder();
		Assert.assertEquals(actualMsg, expectedMsg);
	}
}
