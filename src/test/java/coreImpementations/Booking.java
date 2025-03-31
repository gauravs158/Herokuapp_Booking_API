package coreImpementations;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class Booking {
	public void enterDetails(Heart heart) {
		
		heart.rs = 	given().log().all()
					.spec(heart.getBuildRequestSpecObject().getCreateBookingRequestSpecification(heart))
					.body(heart.getCreateBodyObject().createBookingPayload(heart));
	}
	
	public Response hitHTTPRequest(Heart heart) {
		heart.response = 	heart.rs
							.when()
							.post("/booking")
							.then().log().all()
							.spec(heart.getBuildResponseSpecObject().getResponseSpecification()).extract().response();
		
		return heart.response;
	}
}
