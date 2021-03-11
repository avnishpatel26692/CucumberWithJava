Feature: Introduction to cucumber part 2
  Test of writing and executing a scenario

  @Sample1
  Scenario: Simple scenario 2 - Navigate to link page
    When User navigates to Link Page
    Then User should verify if page is open correctly

  @AgeScenario
  Scenario: Simple scenario 3 - Check Age page functionality
    Given User navigates to Age page
    When User enters name : "Egils"
    And User enters age : "27"
    And User clicks on Submit button
    Then User receives Hello message

