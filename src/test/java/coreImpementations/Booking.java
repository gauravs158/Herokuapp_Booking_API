package coreImpementations;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import specBuilders.RequestBuilder;
import specBuilders.ResponseBuilder;

import static io.restassured.RestAssured.given;
public class Booking {
	Response response;
	RequestBuilder requestBuilder = new RequestBuilder();
	ResponseBuilder responseBuilder = new ResponseBuilder();
	RequestSpecification rs;
	CreateBody createBody = new CreateBody();
	public void enterDetails() {
		
		rs = 	given()
					.spec(requestBuilder.getCreateBookingRequestSpecification())
					.body(createBody.createBookingPayload());
	}
	
	public Response hitHTTPRequest() {
		response = 	rs
					.when()
					.post("/booking")
					.then()
					.spec(responseBuilder.getResponseSpecification()).extract().response();
		
		return response;
	}
}
