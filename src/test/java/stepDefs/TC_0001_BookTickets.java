package stepDefs;

import org.testng.asserts.SoftAssert;
import coreImpementations.Heart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.cucumber.java.en.Then;

public class TC_0001_BookTickets {
	
	Heart heart;
	int statusCode;
	String bookingID;
	SoftAssert sa = new SoftAssert();
	
	public TC_0001_BookTickets(Heart heart) {
		this.heart = heart;
	}
  @Given("the user enters details for new booking")
  public void the_user_enters_details_for_new_booking(){
	  heart.getBookingObject().enterDetails(heart);
  }

  @When("the user hits POST http request")
  public void the_user_hits_post_http_request(){
	  heart.response = heart.getBookingObject().hitHTTPPOSTRequest(heart);
	  System.out.println("++++++++++++++++++++++");
	  System.out.println("heart.response.asPrettyString(): "+heart.response.asPrettyString());
	  heart.stringResponse = heart.response.asPrettyString();
  }

  @Then("the bookingID is generated")
  public void the_booking_id_is_generated(){
	  statusCode = heart.response.getStatusCode();
	  System.out.println("statusCode is: "+statusCode);
	  JsonPath js = new JsonPath(heart.stringResponse);
	  System.out.println(heart.stringResponse);
	  bookingID = js.getString("bookingid");
	  System.out.println(bookingID);
	  sa.assertEquals(statusCode, 200);
	  sa.assertAll();
  }

}
