Feature: To validate the flight search functionality
Background: Given User is oon home page

@Round
Scenario: To validate the roundtrip functionality

When User has enter the from to onbard date and return date and select traveler and click search button

Then user getting corresponding flights

@OneWay
Scenario: to validate the one way trip

When user has enter the from to and provide date 

Then user getting correct flight list

And user has enter the traveler information



