package specBuilders;

import java.util.HashMap;
import java.util.Map;

import coreImpementations.CreateHeaders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

	RequestSpecification req;
	String url = "https://restful-booker.herokuapp.com";
	CreateHeaders ch = new CreateHeaders();
	
	Map<String,String> createBookingHeader = new HashMap<String,String>();
		public RequestSpecification getCreateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getCreateBookingHeaders()).build();
			return req;
		}
		
		public RequestSpecification getUpdateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getUpdateBookingRequestSpecification()).build();
			return req;
		}
		
		public RequestSpecification getPartialUpdateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getPartialUpdateBookingRequestSpecification()).build();
			return req;
		}
}
