package coreImpementations;

import createJSON.BookingDates;
import createJSON.CreateBooking;

public class ObjectFactory {
	CreateBooking createBooking;
	BookingDates bookingDates;
	
	public ObjectFactory() {
		this.createBooking = new CreateBooking();
		this.bookingDates = new BookingDates();
	}
	
	public BookingDates getBookingDates() {
		bookingDates.setCheckin("2025-01-01");
		bookingDates.setCheckout("2025-03-01");
		return bookingDates;
	}
	public CreateBooking getCreateBooking() {
		createBooking.setFirstname("Gaurav");
		createBooking.setLastname("Samantaray");
		createBooking.setDepositpaid(true);
		createBooking.setTotalprice(33576);
		createBooking.setAdditionalneeds("Hot Water");
		createBooking.setBookingdates(getBookingDates());
		return createBooking;
	}
}
