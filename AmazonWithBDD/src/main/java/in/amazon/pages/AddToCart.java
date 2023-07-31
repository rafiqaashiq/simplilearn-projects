package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//span[contains(text(), 'Added to Cart')]")
	private WebElement addedToCartTxt;

	@FindBy(id = "sc-buy-box-ptc-button")
	private WebElement buyBtn;

	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAddToCart() {
		addToCartBtn.click();
	}

	public String verifyAddedTxt() {
		String text = addedToCartTxt.getText();
		return text;
	}

	public void clickBuyBtn() {
		buyBtn.click();
	}
}
