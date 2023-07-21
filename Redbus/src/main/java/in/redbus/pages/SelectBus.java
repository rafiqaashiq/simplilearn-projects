package in.redbus.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBus {

	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id='result-section']/div[1]/div/div[2]/div/div[4]/div[2]")
	private WebElement viewBuses;

	@FindBy(xpath = "(//div[contains(@class,'view-seats')])[1]")
	private WebElement viewSeat;

	@FindBy(xpath = "(//li[contains(@class,'db oh')])[1]")
	private WebElement boardingPoint;

	@FindBy(xpath = "(//li[contains(@class,'db oh')])[4]")
	private WebElement droppingPoint;

	@FindBy(id = "gotoseat_btn")
	private WebElement allSeats;

	@FindBy(xpath = "(//div[contains(@class,'lh-24')])[1]")
	private WebElement BusId;

	public SelectBus(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickViewBus() {
		wait.until(ExpectedConditions.visibilityOf(viewBuses));
		viewBuses.click();
	}

	public void clickViewSeat() {
		wait.until(ExpectedConditions.visibilityOf(viewSeat));
		viewSeat.click();
	}

	public void selectBoardingPoint() {
		wait.until(ExpectedConditions.visibilityOf(boardingPoint));
		boardingPoint.click();
	}

	public void selectDroppingPoint() {
		wait.until(ExpectedConditions.visibilityOf(droppingPoint));
		droppingPoint.click();
	}

	public void selectSeat() {
		wait.until(ExpectedConditions.visibilityOf(allSeats));
		allSeats.click();
	}

	public String viewBusId() {
		String id = BusId.getText();
		return id;
	}
}
