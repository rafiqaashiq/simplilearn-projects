package in.SportyShoes.SportyShoesRESTAssured;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTProduct extends TestBase {

	@BeforeMethod
	public void createPayLoad() {
		RestAssured.baseURI = "http://localhost:9010/";
		RestAssured.basePath = "/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000";
		logger.info("Payload created");
	}
	
	@Test
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
			.when()
				.post()
			.then()
				.statusCode(400)
				.extract().response();
		
		logger.info("Resource created");
	}
}
