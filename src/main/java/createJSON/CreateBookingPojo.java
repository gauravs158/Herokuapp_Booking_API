package createJSON;

public class CreateBookingPojo {
	
	String firstname;
	String lastname;
	int totalprice;
	boolean depositpaid;
	BookingDatesPojo bookingdates;
	public BookingDatesPojo getBookingdates() {
		return bookingdates;
	}
	public void setBookingdates(BookingDatesPojo bookingdates) {
		this.bookingdates = bookingdates;
	}
	String additionalneeds;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public boolean isDepositpaid() {
		return depositpaid;
	}
	public void setDepositpaid(boolean depositpaid) {
		this.depositpaid = depositpaid;
	}
	public String getAdditionalneeds() {
		return additionalneeds;
	}
	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}

}
