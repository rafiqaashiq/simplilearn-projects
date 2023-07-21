package in.redbus.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	private WebDriverWait wait;

	@FindBy(xpath = "(//input[contains(@class,'hrsLPT')])[1]")
	private WebElement fromCity;
	
	@FindBy(xpath = "(//text[contains(@class,'placeHolder')])[1]")
	private WebElement selectFromCity;
	
	@FindBy(xpath = "(//input[contains(@class,'sc-bxi')])[1]")
	private WebElement toCity;
	
	@FindBy(xpath = "(//text[contains(@class,'placeHolder')])[2]")
	private WebElement selectToCity;
	
	@FindBy(id = "search_button")
	private WebElement searchBuses;
	
	@FindBy(xpath = "(//span[contains(@class,'DayTiles')])[34]")
	private WebElement selectDate;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void enterFromCity(String cityFrom) {
		fromCity.click();
		fromCity.sendKeys(cityFrom);
		wait.until(ExpectedConditions.visibilityOf(selectFromCity));
		selectFromCity.click();
	}
	
	public void enterToCity(String cityTo) {
		toCity.click();
		toCity.sendKeys(cityTo);
		wait.until(ExpectedConditions.visibilityOf(selectToCity));
		selectToCity.click();
	}
	
	public void enterDate() {
		searchBuses.click();
		wait.until(ExpectedConditions.visibilityOf(selectDate));
		selectDate.click();
	}
	
	public void searchBus() {
		searchBuses.click();
	}
}
