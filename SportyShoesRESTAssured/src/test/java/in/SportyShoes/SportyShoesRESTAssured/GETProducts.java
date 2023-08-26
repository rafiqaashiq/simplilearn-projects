package in.SportyShoes.SportyShoesRESTAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETProducts extends TestBase {

	@Test
	public void getRequest() {
		RestAssured
			.when()
				.get("http://localhost:9010/get-shoes")
			.then()
				.assertThat()
				.statusCode(200);
		
		logger.info("Resource received");
	}
}
