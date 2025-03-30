package coreImpementations;

import createJSON.BookingDates;
import createJSON.CreateBooking;

public class Booking {
	CreateBooking createBooking = new CreateBooking();
	BookingDates bookingDates = new BookingDates();
	public void createBookingObject() {
		createBooking.setFirstname("Gaurav");
		createBooking.setLastname("Samantaray");
		createBooking.setDepositpaid(true);
		createBooking.setTotalprice(33576);
		createBooking.setAdditionalneeds("Hot Water");
		bookingDates.setCheckin("2025-01-01");
		bookingDates.setCheckout("2025-03-01");
		createBooking.setBookingdates(bookingDates);
	}
}
