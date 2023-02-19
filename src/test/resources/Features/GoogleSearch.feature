Feature: Perform a google search

  Scenario: Validate google search is working
    Given browser  is open
    And user is on google home page
    When user enters a text in searchbox
    And press enter
    Then user is navigated to search results
