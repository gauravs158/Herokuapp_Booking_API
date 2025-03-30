package stepDefs;

import org.testng.asserts.SoftAssert;

import coreImpementations.Booking;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.cucumber.java.en.Then;

public class TC_0001_BookTickets {
	
	Booking booking = new Booking();
	Response response;
	String stringResponse;
	String bookingID;
	int statusCode;
	SoftAssert sa = new SoftAssert();
  @Given("the user enters details for new booking")
  public void the_user_enters_details_for_new_booking(){
	  booking.enterDetails();
  }

  @When("the user hits POST http request")
  public void the_user_hits_post_http_request(){
	  response = booking.hitHTTPRequest();
	  stringResponse = response.asPrettyString();
  }

  @Then("the bookingID is generated")
  public void the_booking_id_is_generated(){
	  statusCode = response.getStatusCode();
	  JsonPath js = new JsonPath(stringResponse);
	  bookingID = js.getString("bookingid");
	  System.out.println(bookingID);
	  sa.assertEquals(statusCode, 200);
	  sa.assertAll();
  }

}
