package api.com.calls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostSchedulePrediction {
	Properties pro = new Properties();

	public void postsechudleprediction() throws IOException {

		byte[] b = Files.readAllBytes(Paths.get("payLoad.json"));

		// convert byte array to string
		String bdy = new String(b);
		Response res = RestAssured.given()
				.header("x-api-key", pro.ApiKey)
				 .header("Content-Type", "application/json")
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(bdy).when()
				.post("pro.postscheduleprediction").then()

				.extract().response();
		System.out.println("-----The status code is---- " + res.statusCode());
		System.out.println("-----The status line is-----" + res.statusLine());
		System.out.println("-----The response body -----" + res.prettyPrint());
		System.out.println("-----Validate status code is 201 -----" + res.then().assertThat().statusCode(201));
	}

}
