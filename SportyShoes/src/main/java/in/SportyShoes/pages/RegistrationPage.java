package in.SportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement register;

	@FindBy(xpath = "//p[contains(text(),'Hello')]")
	private WebElement message;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		name.click();
		name.sendKeys(username);
	}

	public void enterEmail(String mailid) {
		email.click();
		email.sendKeys(mailid);
	}

	public void enterPassword(String pwd) {
		password.click();
		password.sendKeys(pwd);
	}

	public void clickRegister() {
		register.click();
	}

	public String verifyRegistraion() {
		String msg = message.getText();
		return msg;
	}
}
