package in.SportyShoes.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdersPage {

	JavascriptExecutor js;
	WebDriverWait wait;
	Actions actions;

	@FindBy(xpath = "(//h5[contains(@class,'title')])[1]")
	private WebElement message;

	public OrdersPage(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public String displayAddProd() {
		String msg = message.getText();
		return msg;
	}
}
