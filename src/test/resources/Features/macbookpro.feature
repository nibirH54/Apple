Feature: Test search functionality in Apple home page
  Scenario: Check search option for a specific product
    Given a user navigate to the apple home page
    Then user clicks on search button
    When user types a specific product to search
    Then user lands on that products page

  Scenario: Check functionality to navigate to the mac page
    Given a user is at apple page
    When user clicks on store option in menu
    Then user lands on retail page
    And user clicks on Mac option to navigate to the mac page

  Scenario: Check functionality to navigate to the shop iphone page
    Given a user browses to the apple home page
    Then user clicks on iphone option in the menu bar
    And user clicks on shop iphone option
    Then user is able to view all available iphone to buy

  Scenario: Check functionality to navigate to the shop ipad page
    Given a user goes to the apple home page
    Then user clicks on ipad option in the menu bar
    And user clicks on shop ipad option
    Then user is able to view all available ipad to buy

  Scenario: Check functionality to navigate to the shop apple watch page
    Given a user lands on the apple home page
    Then user clicks on watch option in the menu bar
    And user clicks on shop watch option
    Then user is able to view all available apple watch to buy