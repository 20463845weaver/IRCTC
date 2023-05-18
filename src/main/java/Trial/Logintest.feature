Feature: Login Feature

Scenario: Login with valid data 
Given I Launch the Application
When I entered the username
And I entered the password
And I clicked on the login button
Then I Verified that user got logged in sucessfully 