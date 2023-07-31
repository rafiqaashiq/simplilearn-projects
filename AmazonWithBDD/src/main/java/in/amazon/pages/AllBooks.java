package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllBooks {

	private WebDriverWait wait;

	@FindBy(xpath = "//i[contains(@class,'medium-4')]")
	private WebElement fourstar;

	@FindBy(xpath = "(//div[contains(@class,'s-image-fixed')])[1]")
	private WebElement firstBook;

	public AllBooks(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void select4star() {
		fourstar.click();
	}

	public void selectBook() {
		wait.until(ExpectedConditions.elementToBeClickable(firstBook));
		firstBook.click();
	}
}
