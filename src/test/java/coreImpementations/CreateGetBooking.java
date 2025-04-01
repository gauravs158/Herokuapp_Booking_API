package coreImpementations;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class CreateGetBooking {
	public void getDetails(Heart heart) {
		
		heart.rs = 	given().log().all()
					.spec(heart.getBuildRequestSpecObject().getGetBookingRequestSpecification());
		System.out.println("heart.rs is : "+heart.rs);
	}
	
	public Response hitHTTPRequest(Heart heart) {
		getDetails(heart);
		heart.response = 	heart.rs
							.when()
							.get("booking/:613")
//							.get("booking/")
							.then().log().all()
							.spec(heart.getBuildResponseSpecObject().getResponseSpecification()).extract().response();
		System.out.println("In CreateGetBooking - hitHTTPRequest method");
		return heart.response;
	}
}
