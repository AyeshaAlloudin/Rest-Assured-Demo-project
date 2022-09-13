package api.com.tests;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class posttest {
	@Test
	public void post() throws IOException {
		/*Map<String, Object> map = new HashMap<String, Object>();
		JSONObject request = new JSONObject(map);
	request.put("name", "morpheus122");
	request.put("job", "QAAutomationEngineer");
	System.out.println(request.toJSONString());
	*/
	;
	byte[] b = Files.readAllBytes(Paths.get("payLoad.json"));

    //convert byte array to string
    String bdy = new String(b);
	Response res = RestAssured.given()
			
			.header("Content-Type","application/json").
			contentType(ContentType.JSON).
			  accept(ContentType.JSON).
			  body(bdy)
			.when().
			post("https://reqres.in/api/users").then()
			
			.extract().response();
	System.out.println("-----The status code is---- " + res.statusCode());
	System.out.println("-----The status line is-----" + res.statusLine());
	System.out.println("-----The response body -----" + res.prettyPrint());
	System.out.println("-----Validate status code is 201 -----" + res.then().assertThat().statusCode(201));
	}	
	


}
