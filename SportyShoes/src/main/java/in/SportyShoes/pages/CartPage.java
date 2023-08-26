package in.SportyShoes.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	JavascriptExecutor js;
	WebDriverWait wait;
	Actions actions;

	@FindBy(xpath = "(//a[contains(text(),'Place Order')])")
	private WebElement placeOrder;

	@FindBy(xpath = "(//strong[contains(text(),'Success')])")
	private WebElement message;

	public CartPage(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickPlaceOrder() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", placeOrder);
		js.executeScript("arguments[0].click()", placeOrder);
	}

	public String verifyPlaceOrder() {
		String msg = message.getText();
		return msg;
	}
}
