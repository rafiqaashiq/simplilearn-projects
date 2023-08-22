package in.Reqres.ReqresEndProject;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTRequest extends TestBase {

	HashMap<String, String> map = new HashMap<String, String>();

	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "zepher");
		map.put("job", "developer");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users";
		logger.info("Payload created");
	}
	
	@Test
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
			.when()
				.post()
			.then()
				.statusCode(201)
				.extract().response();
		
		logger.info("Resource created");
	}
}
