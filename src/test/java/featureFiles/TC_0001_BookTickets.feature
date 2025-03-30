Feature: Create a new booking and use the created booking ID in Booking - GetBooking

  Scenario: Create a new booking and use the created booking ID in Booking - GetBooking
  
    Given the user enters details for new booking
    When the user hits POST http request
    Then the bookingID is generated