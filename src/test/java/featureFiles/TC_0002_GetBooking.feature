Feature: Create a new booking and use the created booking ID in Booking - GetBooking

Scenario: Create a new booking and use the created booking ID in Booking - GetBooking

		Given the user enters details for new booking
    And the user hits POST http request
    And the user notes the generated bookingID
    When the user hits GetBookingAPI using the generated bookingID
    And the user creates JsonResponsebody
    Then the user gets same data as entered for new booking