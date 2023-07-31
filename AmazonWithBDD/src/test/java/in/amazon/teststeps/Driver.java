package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AddToCart;
import in.amazon.pages.AllBooks;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools {

	protected static LandingPage landingPage;
	protected static AllBooks allBooks;
	protected static AddToCart addToCart;
	protected static SignIn signIn;

	public static void init() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		landingPage = new LandingPage(driver);
		allBooks = new AllBooks(driver);
		addToCart = new AddToCart(driver);
		signIn = new SignIn(driver);
	}
}
