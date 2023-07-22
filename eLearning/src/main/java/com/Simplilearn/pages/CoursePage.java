package com.Simplilearn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoursePage {

	private WebDriverWait wait;

	
	@FindBy(xpath = "//h1[contains(text(), 'Automation Test Engineer')]")
	private WebElement title;
	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String verifyTitle() {
		wait.until(ExpectedConditions.visibilityOf(title));
		String text = title.getText();
		return text;
	}
}
