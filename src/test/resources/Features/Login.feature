@smokeTest
Feature: Check Covid status feature

  Scenario Outline: Login page
    Given user is on login page
    When user gives <username> and <password>
    And user clicks on login button
    Then user logs in successfully

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
