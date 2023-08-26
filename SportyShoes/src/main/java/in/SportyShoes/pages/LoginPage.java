package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement login;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement register;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String mailid) {
		email.click();
		email.sendKeys(mailid);
	}

	public void enterPassword(String pwd) {
		password.click();
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		login.click();
	}

	public void clickRegisterUser() {
		register.click();
	}
}
