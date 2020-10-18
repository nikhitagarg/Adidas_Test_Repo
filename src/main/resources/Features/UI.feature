@UITest
Feature: Test UI

  @Step1 @UITest
  Scenario: Add products to cart and purchase
    Given User opens the webpage
    And navigate to category "Laptops"
    And Add products in cart
    |Sony vaio i5|
    And navigate to category "Laptops"
    And Add products in cart
    |Dell i7 8gb|
    When User navigates to cart
    And deletes the product "Sony vaio i5"
    Then User places order
    And fills order details
    |Name|Test User|
    |Country|India |
    |City   |Delhi |
    |Credit Card|4242424242424242|
    |Month      |12              |
    |Year       |2025            |



