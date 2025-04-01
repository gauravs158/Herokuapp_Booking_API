package stepDefs;

import org.testng.asserts.SoftAssert;

import coreImpementations.Heart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.cucumber.java.en.Then;
import static io.restassured.RestAssured.*;

public class TC_0002_GetBooking {
	int statusCode;
	SoftAssert sa = new SoftAssert();
	Heart heart;
	JsonPath js;
	
	public TC_0002_GetBooking(Heart heart) {
		this.heart = heart;
	}
	
  @And("the user notes the generated bookingID")
  public void the_user_notes_the_generated_bookingID(){
	  statusCode = heart.response.getStatusCode();
	  js = new JsonPath(heart.stringResponse);
	  System.out.println(heart.stringResponse);
  }

  @When("the user hits GetBookingAPI using the generated bookingID")
  public void the_user_hits_GetBookingAPI_using_the_generated_bookingID(){
	  System.out.println("*******************************************");
	  heart.bookingID = js.getString("bookingid");
	  System.out.println("heart.bookingID is :"+heart.bookingID);
	  
	  String response = given().log().all().baseUri("https://restful-booker.herokuapp.com")
			  .pathParam("id", heart.bookingID)
			  .when().get("/booking")
			  .then().log().all().extract().asString();
	  System.out.println(response);
//	  heart.response = heart.getCreateGetBookingObject().hitHTTPRequest(heart);
//	  System.out.println("heart.response is :"+heart.response);
//	  System.out.println("*******************************************");
  }
  
  @And("the user creates JsonResponsebody")
  public void the_user_creates_JsonResponsebody() {
	  
  }

  @Then("the user gets same data as entered for new booking")
  public void the_user_gets_same_data_as_entered_for_new_booking(){
  }

}
