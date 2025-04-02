Feature: Update the booking using previously created booking ID

Scenario: Update the booking using previously created booking ID

		Given the user creates authToken
		And the user enters details for new booking
    And the user hits POST http request
    And the user notes the generated bookingID
    When the user hits UpdateBookingAPI using the generated bookingID
    Then the user gets data as per updatedBooking