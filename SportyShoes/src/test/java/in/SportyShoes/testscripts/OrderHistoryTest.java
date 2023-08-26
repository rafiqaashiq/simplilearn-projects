package in.SportyShoes.testscripts;

import org.testng.annotations.Test;

import in.SportyShoes.pages.HomePage;
import in.SportyShoes.pages.OrdersPage;

public class OrderHistoryTest extends UserLoginTest {

	@Test
	public void orderHistory() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		OrdersPage ordersPage = new OrdersPage(driver);

		// click on orders tab
		homePage.clickOrders();

		// display total no. of. orders
		System.out.println(ordersPage.displayAddProd());
	}
}
