import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetAndPostExamples {
	
	@Test
	public void testGet() {
		
		baseURI="https://reqres.in/api/users?page=2";
		given().get("/users?page=2").then().statusCode(200);
	}

}
