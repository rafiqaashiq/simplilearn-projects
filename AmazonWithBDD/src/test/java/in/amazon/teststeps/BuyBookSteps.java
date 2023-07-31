package in.amazon.teststeps;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BuyBookSteps extends Driver {

	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he type {string} in the search box and then select 3rd option from the drop-down")
	public void he_type_in_the_search_box_and_then_select_3rd_option_from_the_drop_down(String string) {
		landingPage.searchItem(string);
	}

	@When("select rating 4star and above from left side bar")
	public void select_rating_4star_and_above_from_left_side_bar() {
		allBooks.select4star();
	}

	@When("click on the first search result")
	public void click_on_the_first_search_result() {
		allBooks.selectBook();
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("click Add to Cart button")
	public void click_add_to_cart_button() {
		addToCart.clickAddToCart();
	}

	@When("verify the text - {string} is displayed")
	public void verify_the_text_is_displayed(String string) {
		String expectedTxt = string;
		String actualTxt = addToCart.verifyAddedTxt();
		Assert.assertEquals(actualTxt, expectedTxt);
	}

	@When("click on Proceed to Buy button")
	public void click_on_proceed_to_buy_button() {
		addToCart.clickBuyBtn();
	}

	@When("he verify user is on the Sign in page")
	public void he_verify_user_is_on_the_sign_in_page() {
		String expectedTxt = "Sign in";
		String actualTxt = signIn.verifySignInTxt();
		Assert.assertEquals(actualTxt, expectedTxt);
	}
}
