Feature: Facebook Login Functionality

  Scenario: Successfull login with valid credentials
    Given User is on the Facebook login page
    When User enters valid username and password
    And User clicks on the login button
    Then User should see the home page
