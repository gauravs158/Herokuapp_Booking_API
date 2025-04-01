package coreImpementations;

import createJSON.CreateBookingPojo;

public class CreateBody {
	
	public CreateBookingPojo createBookingPayload(Heart heart) {
		return heart.objectFactory.getCreateBooking();
	}
}
