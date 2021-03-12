Feature: Testing error cases for numbers and text and correct number case
@Scenario1
  Scenario Outline: Testing error cases
    Given User on Number Page
    When User enter number: "<number>"
    And User click submit button
    Then User sees error message: "<errorMessage">
    Examples:
    | number | errorMessage |
    |45      |number is too small|
    |103     |number is too big  |
    |lol     |Please enter a number|

  @Scenario2
    Scenario: Testing correst number
      Given User on Number Page
      When User enter number: "70"
      And User click submit button
      Then User sees message: "Square root of 70 is 8.37"
