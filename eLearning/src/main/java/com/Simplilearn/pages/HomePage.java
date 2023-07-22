package com.Simplilearn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private Actions actions;
	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"menu-button\"]/span")
	private WebElement allCourse;

	@FindBy(xpath = "//*[@id=\"megamenu-box\"]/ul/li[11]/a")
	private WebElement softwareDev;

	@FindBy(xpath = "//*[@id=\"megamenu-box\"]/ul/li[11]/ul/li[2]/div[2]/div[2]/a/a/span")
	private WebElement automation;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		actions = new Actions(driver);
	}

	public void hoverAllCourse() {
		wait.until(ExpectedConditions.visibilityOf(allCourse));
		actions.moveToElement(allCourse).build().perform();
	}

	public void hoverSoftwareDev() {
		wait.until(ExpectedConditions.visibilityOf(softwareDev));
		actions.moveToElement(softwareDev).build().perform();
	}

	public void clickAutomation() {
		wait.until(ExpectedConditions.visibilityOf(automation));
		automation.click();
	}
}
