package coreImpementations;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import specBuilders.BuildRequestSpec;
import specBuilders.BuildResponseSpec;

public class Heart {
	public Response response;
	public RequestSpecification rs;
	public String stringResponse;
	public CreateHeaders createHeaders;
	public CreateBody createBody;
	public CreateQueryParams createQueryParams;
	public BuildRequestSpec buildRequestSpec;
	public BuildResponseSpec buildResponseSpec;
	public ObjectFactory objectFactory;
	public Booking booking;
	public utilities.PropertiesReader propertiesReader;
	String url;
	
	public Heart(){
		this.objectFactory = new ObjectFactory();
		this.propertiesReader = new utilities.PropertiesReader();
		this.url = propertiesReader.getProperties();
	}
	
	public Booking getBookingObject() {
		return booking = new Booking();
	}
	public CreateHeaders getCreateHeadersObject() {
		return createHeaders = new CreateHeaders();
	}
	public CreateBody getCreateBodyObject() {
		return createBody = new CreateBody();
	}
	public CreateQueryParams getCreateQueryParamsObject() {
		return createQueryParams = new CreateQueryParams();
	}
	public BuildRequestSpec getBuildRequestSpecObject() {
		return buildRequestSpec = new BuildRequestSpec();
	}
	public BuildResponseSpec getBuildResponseSpecObject() {
		return buildResponseSpec = new BuildResponseSpec();
	}
}
