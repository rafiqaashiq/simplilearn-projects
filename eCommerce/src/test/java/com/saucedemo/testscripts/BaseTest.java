package com.saucedemo.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void launchApplication() {

		// disable push notifications in chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// 1) open the browser
		driver = new ChromeDriver(options);

		// 2) maximize it
		driver.manage().window().maximize();

		// 3) navigate to "https://www.redbus.in/"
		driver.get("https://www.saucedemo.com/");
	}

	@AfterTest
	public void closeBrowser() {
		// close the browser
		driver.quit();
	}
}
