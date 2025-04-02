package coreImpementations;

import createJSON.CreateBookingPojo;

public class CreateBody {
	
	public CreateBookingPojo createBookingPayload(Heart heart) {
		return heart.objectFactory.getCreateBooking();
	}
	
	public CreateBookingPojo updateBookingPayload(Heart heart) {
		return heart.objectFactory.getUpdateBooking();
	}
}
