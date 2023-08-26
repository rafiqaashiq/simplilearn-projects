package in.SportyShoes.testscripts;

import org.testng.annotations.Test;

import in.SportyShoes.pages.LoginPage;

public class UserLoginTest extends BaseTest {

	@Test
	public void userLogin() {

		LoginPage loginPage = new LoginPage(driver);

		// enter email
		loginPage.enterEmail(name + "@gmail.com");

		// enter password
		loginPage.enterPassword(password);

		// click login
		loginPage.clickLogin();
	}
}
