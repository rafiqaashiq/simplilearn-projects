package in.SportyShoes.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.SportyShoes.pages.HomePage;

public class AddToCartTest extends UserLoginTest {

	@Test
	public void addProductToCart() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		String expectedMsg;
		String actualMsg;

		// click on the first product
		homePage.add1stProd();

		// verify whether the product is added to cart
		expectedMsg = "Success!";
		actualMsg = homePage.verifyAddProd();
		Assert.assertEquals(actualMsg, expectedMsg);

		// click on the home tab
		homePage.clickHomepage();

		// click on the second product
		homePage.add2ndProd();

		// verify whether the product is added to cart
		expectedMsg = "Success!";
		actualMsg = homePage.verifyAddProd();
		Assert.assertEquals(actualMsg, expectedMsg);
	}
}
