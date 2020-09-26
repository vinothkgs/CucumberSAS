Feature: to validate the all functionality in home page
Background:
Given user is on home page


@Login
Scenario: to validate the login functionality
When user has enter the username and password
|userName|Password|
|vinothkgs|Chennai|
|kumar|mumbai|

Then user getting error message

@Panner
Scenario: to validate the panner
When user has check the panner text
And user has check the panner link

@Submenu
Scenario: to validate the submenu
When user has click the all submenu




