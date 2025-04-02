package stepDefs;

import org.testng.asserts.SoftAssert;

import coreImpementations.Heart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.cucumber.java.en.Then;

public class TC_0002_GetBooking {
	int statusCode;
	SoftAssert sa = new SoftAssert();
	Heart heart;
	JsonPath js;
	String response;
	public TC_0002_GetBooking(Heart heart) {
		this.heart = heart;
	}
	
  @And("the user notes the generated bookingID")
  public void the_user_notes_the_generated_bookingID(){
	  statusCode = heart.response.getStatusCode();
	  js = new JsonPath(heart.stringResponse);
	  System.out.println(heart.stringResponse);
	  heart.bookingID = js.getString("bookingid");
  }

  @When("the user hits GetBookingAPI using the generated bookingID")
  public void the_user_hits_GetBookingAPI_using_the_generated_bookingID(){
	  System.out.println("*******GetBookingAPI*********GetBookingAPI********GetBookingAPI*******GetBookingAPI*******GetBookingAPI*******GetBookingAPI*******");
//	  heart.bookingID = js.getString("bookingid");
	  System.out.println("heart.bookingID is :"+heart.bookingID);
	  heart.getCreateGetBookingObject().getDetails(heart);
	  
//	  response = given().log().all().baseUri("https://restful-booker.herokuapp.com")
//			  .when().get("/booking/"+heart.bookingID)
//			  .then().log().all().extract().asString();
  }
  
  @And("the user creates JsonResponsebody")
  public void the_user_creates_JsonResponsebody() {
	  heart.getCreateGetBookingObject().hitHTTPRequest(heart);
	  System.out.println("in the_user_creates_JsonResponsebody method:"+heart.response.asPrettyString());
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
  }

  @Then("the user gets same data as entered for new booking")
  public void the_user_gets_same_data_as_entered_for_new_booking(){
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	  js = new JsonPath(heart.response.asString());
	  String firstname = js.getString("firstname");
	  String lastname = js.getString("lastname");
	  String totalprice = js.getString("totalprice");
	  String depositpaid = js.getString("depositpaid");
	  String additionalneeds = js.getString("additionalneeds");
	  String checkin = js.getString("bookingdates.checkin");
	  String checkout = js.getString("bookingdates.checkout");
	  System.out.println("firstname is :"+ firstname);
	  System.out.println("lastname is :"+ lastname);
	  System.out.println("totalprice is :"+ totalprice);
	  System.out.println("depositpaid is :"+ depositpaid);
	  System.out.println("additionalneeds is :"+ additionalneeds);
	  System.out.println("checkin is :"+ checkin);
	  System.out.println("checkout is :"+ checkout);
	  sa.assertEquals(firstname, "Gaurav");
	  sa.assertEquals(lastname, "Samantaray");
	  sa.assertEquals(Integer.parseInt(totalprice), 33576);
	  sa.assertEquals(Boolean.parseBoolean(depositpaid), true);
	  sa.assertEquals(additionalneeds, "Hot Water");
	  sa.assertEquals(checkin, "2025-01-01");
	  sa.assertEquals(checkout, "2025-03-01");
	  System.out.println("*******GetBookingAPIend*********GetBookingAPIend********GetBookingAPIend*******GetBookingAPIend*******GetBookingAPIend*******GetBookingAPIend*******");
	  sa.assertAll();
  }

}
