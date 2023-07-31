package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	@FindBy(xpath = "//h1[contains(text(),'Sign in')]")
	private WebElement signInTxt;

	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifySignInTxt() {
		String text = signInTxt.getText();
		return text;
	}
}
