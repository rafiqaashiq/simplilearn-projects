package in.Reqres.Reqes;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RegisterUser {

	HashMap<String, String> map = new HashMap<String, String>();

	@BeforeMethod
	public void createPayLoad() {
		map.put("email", "zepher@gmail.com");
		map.put("password", "password123");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/register";
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
				.statusCode(200)
				.log().all()
				.extract().response();
	}
}
