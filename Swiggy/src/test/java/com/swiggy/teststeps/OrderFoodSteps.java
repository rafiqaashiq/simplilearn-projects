package com.swiggy.teststeps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver {

	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@When("he type {string} in the delivery location and then selects 1st option from the drop-down")
	public void he_type_in_the_delivery_location_and_then_selects_1st_option_from_the_drop_down(String string) {
		landingPage.deliveryLocation(string);
	}

	@When("click on the first restaurant shown under Top restaurant chains in Hyderabad")
	public void click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() {
		restaurantPage.selectRestaurant();
	}

	@When("click on Add button corresponding to first listed dish")
	public void click_on_add_button_corresponding_to_first_listed_dish() {
		foodPage.clickAdd();
	}

	@When("hover over Cart in the top right corner")
	public void hover_over_cart_in_the_top_right_corner() {
		foodPage.hoverOverCart();
	}

	@When("click on Check Out in the sub-menu")
	public void click_on_check_out_in_the_sub_menu() {
		foodPage.clickCheckout();
	}

	@When("verify the text {string} is visible on the next page")
	public void verify_the_text_is_visible_on_the_next_page(String string) {
		String expectedTxt = string;
		String actualTxt = checkoutPage.verifyText();
		Assert.assertEquals(actualTxt, expectedTxt);
	}
}
