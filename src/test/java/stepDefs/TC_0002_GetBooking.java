package stepDefs;

import org.testng.asserts.SoftAssert;

import coreImpementations.Heart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.cucumber.java.en.Then;

public class TC_0002_GetBooking {
	String bookingID;
	int statusCode;
	SoftAssert sa = new SoftAssert();
	Heart heart;
	
	public TC_0002_GetBooking(Heart heart) {
		this.heart = heart;
	}
	
  @And("the user notes the generated bookingID")
  public void the_user_notes_the_generated_bookingID(){
	  statusCode = heart.response.getStatusCode();
	  JsonPath js = new JsonPath(heart.stringResponse);
	  System.out.println(heart.stringResponse);
	  bookingID = js.getString("bookingid");
  }

  @When("the user hits GetBookingAPI using the generated bookingID")
  public void the_user_hits_GetBookingAPI_using_the_generated_bookingID(){
  }
  
  @And("the user creates JsonResponsebody")
  public void the_user_creates_JsonResponsebody() {
	  
  }

  @Then("the user gets same data as entered for new booking")
  public void the_user_gets_same_data_as_entered_for_new_booking(){
  }

}
