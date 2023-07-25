package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement pwd;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String userid) {
		username.click();
		username.sendKeys(userid);
	}
	
	public void enterPassword(String pwdid) {
		pwd.click();
		pwd.sendKeys(pwdid);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
}
