package in.SportyShoes.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	JavascriptExecutor js;
	WebDriverWait wait;
	Actions actions;

	@FindBy(xpath = "(//a[contains(text(),'Cart')])[1]")
	private WebElement cart;

	@FindBy(xpath = "//a[contains(text(),'Orders')]")
	private WebElement orders;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[1]")
	private WebElement prod1;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[2]")
	private WebElement prod2;

	@FindBy(xpath = "(//strong[contains(text(),'Success')])")
	private WebElement message;

	@FindBy(xpath = "(//a[contains(text(),'Home')])")
	private WebElement homepage;

	public HomePage(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickCart() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", cart);
		js.executeScript("arguments[0].click()", cart);
	}

	public void clickOrders() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", orders);
		js.executeScript("arguments[0].click()", orders);
	}

	public void add1stProd() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", prod1);
		js.executeScript("arguments[0].click()", prod1);
	}

	public void add2ndProd() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", prod2);
		js.executeScript("arguments[0].click()", prod2);
	}

	public String verifyAddProd() {
		String msg = message.getText();
		return msg;
	}

	public void clickHomepage() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", homepage);
		js.executeScript("arguments[0].click()", homepage);
	}
}
