 
Feature: Signing up for a LinkedIn account using Gherkin language

  Scenario: Signing LinkedIn Account with Valid Data
    Given I launch the Application
    When I entered the email or phone
    When I entered the password
    When I clicked on Signin Button
    Then I verified that user got signed up successfully