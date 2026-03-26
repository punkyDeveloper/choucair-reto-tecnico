Feature: User registration on Demo Web Shop

  As a new user
  I want to register on the Demo Web Shop
  So that I can make purchases on the platform

  Scenario: Successful user registration
    Given the user navigates to the Demo Web Shop page
    When the user registers with valid data
    Then the registration success message should contain "Your registration completed"