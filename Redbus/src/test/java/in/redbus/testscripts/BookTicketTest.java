package in.redbus.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.redbus.pages.LandingPage;
import in.redbus.pages.SelectBus;

public class BookTicketTest extends BaseTest {

	@Test
	public void bookTicket() {
		
		LandingPage landingPage = new LandingPage(driver);
		
		// 4) Enter 'From' city - Mumbai
		landingPage.enterFromCity("Mumbai");
		
		// 5) Enter 'To' city - Pune
		landingPage.enterToCity("Pune");
		
		// 6) Pick up 28th from Calendar
		landingPage.enterDate();
		
		// 7) Click on 'Search Buses' button
		landingPage.searchBus();
		
		SelectBus selectBus = new SelectBus(driver);
		
		// 8) Click on 'View Buses' corresponding to first search result on the next page
		selectBus.clickViewBus();
		
		// 9) Click 'View Seats' corresponding to first bus
		selectBus.clickViewSeat();
		
		// 10) Select Boarding point and Dropping points
		selectBus.selectBoardingPoint();
		selectBus.selectDroppingPoint();
		
		// 11) Click 'View Seats' button
		selectBus.selectSeat();
		
		// verify bus id
		String expectedBusId = "MSRTC - 738783";
		String actualBusId = selectBus.viewBusId();
		Assert.assertEquals(actualBusId, expectedBusId);
	}
}
