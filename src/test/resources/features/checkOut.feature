
Feature: Checkout page
  Scenario: successful checkout
    Given success login and go to homepage
    And redirect page to home page2
    And user done adding item to cart
    When user click cart and go to cart page
    Then user can see displayed selected item
    And user click checkout and directed to your-information-page
    And user fill first name
    And user fill last name
    And user fill postal code
    When user click continue
    Then directed to overview-page and user can see all item and information
    When user click continue and directed to finished-page
    Then user located in finished-page

  Scenario: unsuccessful checkout - not fill firstname
    Given success login and go to homepage
    And redirect page to home page2
    And user done adding item to cart
    When user click cart and go to cart page
    Then user can see displayed selected item
    And user click checkout and directed to your-information-page
    And user fill last name
    And user fill postal code
    When user click continue
    Then user should see error message "Error: First Name is required"

  Scenario: unsuccessful checkout - not fill last name
    Given success login and go to homepage
    And redirect page to home page2
    And user done adding item to cart
    When user click cart and go to cart page
    Then user can see displayed selected item
    And user click checkout and directed to your-information-page
    And user fill first name
    And user fill postal code
    When user click continue
    Then user should see error message "Error: Last Name is required"

  Scenario: unsuccessful checkout - not fill postal code
    Given success login and go to homepage
    And redirect page to home page2
    And user done adding item to cart
    When user click cart and go to cart page
    Then user can see displayed selected item
    And user click checkout and directed to your-information-page
    And user fill first name
    And user fill last name
    When user click continue
    Then user should see error message "Error: Postal Code is required"
