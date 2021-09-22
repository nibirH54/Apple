Feature: Test login functionalities for Apple

  @positive_test
  Scenario: Check login is successful with valid credentials for single user
    Given a user is on the apple home page
    And user navigate to apple sign in page
    When user clicks on sign in upon entering the data

    |userid            |password      |
    |Nibirh54@gmail.com|Appletest12345|

    Then user logs into apple account


  @negative_test
  Scenario: Check login is successful with invalid credentials
    Given a user is on the apple home page
    And user navigate to apple sign in page
    When user clicks on sign in upon entering the data

      |userid            |password      |
      |Nibirh54@gmail.com|Appletest44444|
    Then user is failed to login










