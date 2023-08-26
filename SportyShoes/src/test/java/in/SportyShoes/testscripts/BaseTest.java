package in.SportyShoes.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;

	String name = "user";
	String password = "asdf1234";

	@BeforeTest
	public void launchApplication() {

		// disable push notifications in chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// 1) open the browser
		driver = new ChromeDriver(options);

		// 2) maximize it
		driver.manage().window().maximize();

		// 3) navigate to "http://localhost:9010/" for accessing Sporty Shoes
		driver.get("http://localhost:9010/");
	}

	@AfterTest
	public void closeBrowser() {
		// close the browser
		driver.quit();
	}
}