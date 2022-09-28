import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Tests_POST {
	
	//this is creating resources or code using post method
	
	//@Test
	public void test_1_post() {
		
		
		/* we use map key value pair in java
		 Map<String,Object>map=new HashMap<String,Object>();
		
		map.put("name", "kir");
		map.put("job", "qa");
		System.out.println(map);
		JSONObject request=new JSONObject(map);
		we can do without map also*/
		
		JSONObject request = new JSONObject();
		
		request.put("name", "kir");
		request.put("job", "qa");
		
		//to convert this into JSON format //we send request
		
		System.out.println(request);
		//or
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when().post("https://reqres.in/api/users").
		then().statusCode(201);
		//for post 201 is successful html status code post
		
	}
	
	
	//@Test
	public void test_2_put() {
		
		
		//i am coppied from post above method except i change in given () there in post changed put
		
		
		/* we use map key value pair in java
		 Map<String,Object>map=new HashMap<String,Object>();
		
		map.put("name", "kir");
		map.put("job", "qa");
		System.out.println(map);
		JSONObject request=new JSONObject(map);
		we can do without map also*/
		
		JSONObject request = new JSONObject();
		
		request.put("name", "kir");
		request.put("job", "qa");
		
		//to convert this into JSON format //we send request
		
		System.out.println(request);
		//or
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
		//for put 200 is successful html status code for put
		
	}
	
	//

	@Test
	public void test_4_delete() {
		
		
		//i am coppied from patch above method except i change in given () there in patch changed delete
		
		
		
		
		given()
		
	.when()
	      .delete("https://reqres.in/api/users/2").
	then().statusCode(204).log().all();
		//for delete 204 is successful html status code for delete
		
	}


}
