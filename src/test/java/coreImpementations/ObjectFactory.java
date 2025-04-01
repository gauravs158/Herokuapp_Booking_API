package coreImpementations;

import createJSON.BookingDatesPojo;
import createJSON.CreateBookingPojo;

public class ObjectFactory {
	CreateBookingPojo createBookingPojo;
	BookingDatesPojo bookingDates;
	
	public ObjectFactory() {
		this.createBookingPojo = new CreateBookingPojo();
		this.bookingDates = new BookingDatesPojo();
	}
	
	public BookingDatesPojo getBookingDates() {
		bookingDates.setCheckin("2025-01-01");
		bookingDates.setCheckout("2025-03-01");
		return bookingDates;
	}
	public CreateBookingPojo getCreateBooking() {
		createBookingPojo.setFirstname("Gaurav");
		createBookingPojo.setLastname("Samantaray");
		createBookingPojo.setDepositpaid(true);
		createBookingPojo.setTotalprice(33576);
		createBookingPojo.setAdditionalneeds("Hot Water");
		createBookingPojo.setBookingdates(getBookingDates());
		return createBookingPojo;
	}
}
