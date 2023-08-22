package in.Reqres.ReqresEndProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETRequest extends TestBase{

	@Test
	public void getRequest() {
		RestAssured
			.when()
				.get("https://reqres.in/api/users?page=2")
			.then()
				.assertThat()
				.statusCode(200);
		
		logger.info("Resource received");
	}
}
