Feature: addItemToCart
  Scenario: successful adding item to cart
    Given I Open browser
    And Open website saucedemo
    And Located on saucedemo website
    And I Input valid email
    And I Input Valid password
    When I click on login button
    Then redirect page to home page
    And user click add to cart item
    When all item added to cart
    Then cart item increase