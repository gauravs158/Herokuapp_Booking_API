package specBuilders;

import java.util.HashMap;
import java.util.Map;

import coreImpementations.CreateHeaders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

	RequestSpecification req;
	String url;
	CreateHeaders ch = new CreateHeaders();
	
	Map<String,String> createBookingHeader = new HashMap<String,String>();
		public void getCreateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getCreateBookingHeaders()).build();
		}
		
		public void getUpdateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getUpdateBookingRequestSpecification()).build();
		}
		
		public void getPartialUpdateBookingRequestSpecification() {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(ch.getPartialUpdateBookingRequestSpecification()).build();
		}
}
