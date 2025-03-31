package coreImpementations;

import createJSON.CreateBooking;

public class CreateBody {
	
	public CreateBooking createBookingPayload(Heart heart) {
		
//		heart.objectFactory.getCreateBooking().setFirstname("Gaurav");
//		heart.objectFactory.getCreateBooking().setLastname("Samantaray");
//		heart.objectFactory.getCreateBooking().setDepositpaid(true);
//		heart.objectFactory.getCreateBooking().setTotalprice(33576);
//		heart.objectFactory.getCreateBooking().setAdditionalneeds("Hot Water");
//		heart.objectFactory.getBookingDates().setCheckin("2025-01-01");
//		heart.objectFactory.getBookingDates().setCheckout("2025-03-01");
//		heart.objectFactory.getCreateBooking().setBookingdates(heart.objectFactory.getBookingDates());
		
		return heart.objectFactory.getCreateBooking();
	}
}
