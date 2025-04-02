package coreImpementations;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class CreateBooking {
	public void enterDetails(Heart heart) {
		
		heart.rs = 	given().log().all()
					.spec(heart.getBuildRequestSpecObject().getCreateBookingRequestSpecification(heart))
					.body(heart.getCreateBodyObject().createBookingPayload(heart));
	}
	public void enterUpdatedDetails(Heart heart) {
		
		heart.rs = 	given().log().all()
					.spec(heart.getBuildRequestSpecObject().getCreateBookingRequestSpecification(heart))
					.body(heart.getCreateBodyObject().updateBookingPayload(heart));
	}
	
	public Response hitHTTPPOSTRequest(Heart heart) {
		heart.response = 	heart.rs
							.when()
							.post("/booking")
							.then().log().all()
							.spec(heart.getBuildResponseSpecObject().getResponseSpecification()).extract().response();
		
		return heart.response;
	}
	
	public Response hitHTTPPUTRequest(Heart heart) {
		heart.response = 	heart.rs
							.when()
							.put("/booking")
							.then().log().all()
							.spec(heart.getBuildResponseSpecObject().getResponseSpecification()).extract().response();
		
		return heart.response;
	}
}
