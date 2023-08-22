package in.Reqres.Reqes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LoggingTest {

	@Test
	public void getRequest() {
		RestAssured
			.when()
				.get("https://reqres.in/api/unknown")
			.then()
				.assertThat()
				.statusCode(200)
				.log().all();
	}
}
