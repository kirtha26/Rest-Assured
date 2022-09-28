import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExamples1 extends DataForTests {
	
	
	 
	   // @Test(dataProvider="DataForPost")
	
	public void test_post(String firstname,String lastname,String subjectId) {
		
	
	JSONObject request=new JSONObject();
	
	request.put("firstname",firstname);
	request.put("lastname", lastname);
	request.put("subjectId",subjectId);
	//request.put("id",5 );
	
	baseURI = "http://localhost:3000/";
	
	given().
	    contentType(ContentType.JSON).accept(ContentType.JSON).
	    
	    header("Content-Type","application/json").
	    
	    body(request.toJSONString()).
	    
	    
	   when().
	       post("/users").
	   then().
	   
	      statusCode(201).
	      log().all();
	    
	    
	}
	   
	  
  //@Test(dataProvider="dataDelete")
		
		public void test_delete(int userId) {
			
		
	
		
		baseURI = "http://localhost:3000/";
		
	  
		    
		   when().
		       delete("/users/"+userId).
		   then().
		   
		      statusCode(200).
		      log().all();
		    
		    
		}
        @Parameters({"userId"})
		@Test()
		public void test_delete2(int userId) {
			
			
			
			System.out.println("Value for userId is :"+userId);
			baseURI = "http://localhost:3000/";
			
		  
			    
			   when().
			       delete("/users/"+userId).
			   then().
			   
			      statusCode(200).
			      log().all();
			    
			    
			}
}
