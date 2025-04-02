package stepDefs;

import coreImpementations.Heart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TC_0003_UpdateBooking {
	Heart heart;
	String response;
	String authToken;
	String body = "{\r\n"
			+ "    \"username\" : \"admin\",\r\n"
			+ "    \"password\" : \"password123\"\r\n"
			+ "}";
	public TC_0003_UpdateBooking(Heart heart) {
		this.heart = heart;
	}
	
	@Given("the user creates authToken")
	public void the_user_creates_authToken() {
		authToken = given().baseUri("https://restful-booker.herokuapp.com").body(body).contentType("application/json")
		.when().post("/auth").then().log().all().extract().asString();
		System.out.println("AuthToken is: "+authToken);
	}
	
	@When("the user hits UpdateBookingAPI using the generated bookingID")
	public void the_user_hits_UpdateBookingAPI_using_the_generated_bookingID() {
		response = given().log().all().baseUri("https://restful-booker.herokuapp.com").header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(heart.getCreateBodyObject().updateBookingPayload(heart)).accept(ContentType.JSON)
		.when().put("/booking/"+heart.bookingID).then().log().all().extract().asString();
	}
	
	@Then("the user gets data as per updatedBooking")
	public void the_user_gets_same_data_as_per_updatedBooking() {
		System.out.println("*********updatedBookingAPI*********updatedBookingAPI*********updatedBookingAPI*********updatedBookingAPI*********");
		System.out.println("UpdateBookingAPi response: "+response);		
		System.out.println("*********updatedBookingAPI*********updatedBookingAPI*********updatedBookingAPI*********updatedBookingAPI*********");
	}
}