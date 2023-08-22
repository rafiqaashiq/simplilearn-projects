package in.Reqres.Reqes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETERequest {

	@Test
	public void deleteResourse() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/99";
		
		RestAssured
			.given()
				.contentType("application/json")
			.when()
				.delete()
			.then()
				.statusCode(204);
	}
}
