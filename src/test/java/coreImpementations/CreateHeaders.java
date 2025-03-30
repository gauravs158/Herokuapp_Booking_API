package coreImpementations;

import java.util.HashMap;
import java.util.Map;

public class CreateHeaders {
	Map<String,String> headerMap = new HashMap<String,String>();
	public Map<String,String> getCreateBookingHeaders() {
		headerMap.put("Accept", "application/json");
		headerMap.put("Content-Type", "application/json");
		
		return headerMap;
	}
	
	public Map<String,String> getUpdateBookingRequestSpecification() {
		headerMap.put("Accept", "application/json");
		headerMap.put("Content-Type", "application/json");
		
		return headerMap;
	}
	
	public Map<String,String> getPartialUpdateBookingRequestSpecification() {
		headerMap.put("Accept", "application/json");
		headerMap.put("Content-Type", "application/json");
		
		return headerMap;
	}
}
