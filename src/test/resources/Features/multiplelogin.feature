Feature: Test login functionalities for Apple

  @dataDriven_test
  Scenario: Check login is successful with valid credentials for multiple users
    Given a user is on the apple home page
    And user navigate to apple sign in page
    When user clicks on sign in upon entering the data

      |userid              |password      |
      |Nibirh54@gmail.com  |Appletest12345|
      |Nibirh91@gmail.com  |Appletest54321|
      |Nibirwasif@yahoo.com|Appletest12345|

    Then user logs into apple account

  Scenario: