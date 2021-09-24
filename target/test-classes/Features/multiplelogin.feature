Feature: Test login for Apple website
  Scenario: Check login is successful with valid userid and password
    Given a user browses to the apple page
    And user lands to apple sign in page
    When user clicks on sign in upon entering userid "nibirh54@gmail.com" and password "Appletest12345"
    Then user signs in to the apple account

  Scenario Outline: Check login is successful with valid userid and password for multiple users
    Given a user browses to the apple page
    And user lands to apple sign in page
    When user clicks on sign in upon entering userid "<userid>" and password "<password>"
    Then user signs in to the apple account

    Examples:
    |userid              |password      |
    |Nibirh54@gmail.com  |Appletest12345|
    |Nibirh91@gmail.com  |Appletest54321|
    |Nibirwasif@yahoo.com|Appletest12345|



