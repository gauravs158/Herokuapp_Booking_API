package specBuilders;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class BuildResponseSpec {

	ResponseSpecification res;
	
	public ResponseSpecification getResponseSpecification() {
			res = new ResponseSpecBuilder().build();
//			res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
			return res;
		}
}
