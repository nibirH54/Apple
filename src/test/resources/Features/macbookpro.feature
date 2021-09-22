Feature: Test search functionality in Apple home page
  Scenario: Check search option for a specific product
    Given a user navigate to the apple home page
    Then user clicks on search button
    When user types a specific product to search
    Then user lands on that products page

