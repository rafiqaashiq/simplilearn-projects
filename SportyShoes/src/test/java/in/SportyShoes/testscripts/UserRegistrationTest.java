package in.SportyShoes.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.SportyShoes.pages.LoginPage;
import in.SportyShoes.pages.RegistrationPage;

public class UserRegistrationTest extends BaseTest {

	@Test
	public void registerNewUser() {

		LoginPage loginPage = new LoginPage(driver);
		RegistrationPage registrationPage = new RegistrationPage(driver);

		// click "register here" for registering new user
		loginPage.clickRegisterUser();

		// enter user name
		registrationPage.enterUsername(name);

		// enter email
		registrationPage.enterEmail(name + "@gmail.com");

		// enter password
		registrationPage.enterPassword(password);

		// click on register button
		registrationPage.clickRegister();

		// verify user registration
		String expectedMsg = "Hello " + name + " !";
		String actualMsg = registrationPage.verifyRegistraion();
		Assert.assertEquals(actualMsg, expectedMsg);
	}
}
