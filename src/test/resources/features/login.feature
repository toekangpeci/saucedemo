Feature: Login page
  Scenario: successful login using valid email and password
    Given I Open browser
    And Open website saucedemo
    And Located on saucedemo website
    And I Input valid email
    And I Input Valid password
    When I click on login button
    Then redirect page to home page