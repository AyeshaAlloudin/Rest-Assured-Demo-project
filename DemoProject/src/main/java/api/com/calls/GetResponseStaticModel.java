package api.com.calls;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetResponseStaticModel {
	Properties pro = new Properties();

	// This will fetch the response body as is and log it. given and when are
	// optional here
	public void getstaticmodel() {
		Response res = RestAssured.given().header("x-api-key", pro.ApiKey).when().get(pro.getStaticModel).then()
				.extract().response();
		System.out.println("-----The status code is---- " + res.statusCode());
		System.out.println("-----The status line is-----" + res.statusLine());
		System.out.println("-----The response body -----" + res.prettyPrint());
		System.out.println("-----Validate status code is 200 -----" + res.then().assertThat().statusCode(200));
	}
}
