package specBuilders;

import java.util.HashMap;
import java.util.Map;
import coreImpementations.Heart;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BuildRequestSpec {

	RequestSpecification req;
	String url = "https://restful-booker.herokuapp.com";
	
	Map<String,String> createBookingHeader = new HashMap<String,String>();
		public RequestSpecification getCreateBookingRequestSpecification(Heart heart) {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(heart.getCreateHeadersObject().getCreateBookingHeaders()).build();
			return req;
		}
		
		public RequestSpecification getUpdateBookingRequestSpecification(Heart heart) {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(heart.getCreateHeadersObject().getUpdateBookingRequestSpecification()).build();
			return req;
		}
		
		public RequestSpecification getPartialUpdateBookingRequestSpecification(Heart heart) {
			req = new RequestSpecBuilder().setBaseUri(url).addHeaders(heart.getCreateHeadersObject().getPartialUpdateBookingRequestSpecification()).build();
			return req;
		}
}
