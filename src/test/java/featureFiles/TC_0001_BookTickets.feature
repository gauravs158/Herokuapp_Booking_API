Feature: Create a new booking and verify if the bookingID is generated

Scenario: Create a new booking and verify if the bookingID is generated
		Given the user enters details for new booking
    When the user hits POST http request
    Then the bookingID is generated