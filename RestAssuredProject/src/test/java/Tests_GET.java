import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_GET {
	
	
	@Test
	public void Test_1() {
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
		
		.body("data.id[2]",equalTo(8))
		//.log().all();this is to get all values in output
		.body("data.first_name", hasItems("Michael","Lindsay"));
		
	}

}
