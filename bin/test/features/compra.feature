Feature: Product purchase on Demo Web Shop

  As a registered user
  I want to add a product to the cart and complete the purchase
  So that I can confirm a successful order on the store

  Scenario: Successful product purchase in Desktops
    Given the user logs in with valid credentials
    When the user navigates to Computers and Desktops subcategory
    And adds the first available product to the cart
    And proceeds to checkout with delivery data
    And selects credit card as payment method
    And completes the credit card information
    And confirms the order
    Then the confirmation message should contain "Your order has been successfully processed!"