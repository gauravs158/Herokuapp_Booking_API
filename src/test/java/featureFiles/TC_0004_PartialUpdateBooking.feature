Feature: Partially Update the booking using previously created booking ID

Scenario: Partially Update the booking using previously created booking ID

		Given the user creates authToken
		And the user enters details for new booking
    And the user hits POST http request
    And the user notes the generated bookingID
    When the user hits PatchUpdateBookingAPI using the generated bookingID
    Then the user gets data as per PatchUpdateBookingAPI