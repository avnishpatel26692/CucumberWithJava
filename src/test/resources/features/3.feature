   @Numbers
Feature: Introduction to cucumber part 3
  As a test engineer
  I want to be able to write and execute a simple scenario

  @NumbersTooSmall
  Scenario: NumbersTooSmall
    Given User navigate to Number page
    When User enter number: 5
    And click on Submit Button
    Then appear message : "Number is too small"

  @NumbersTooBig
  Scenario: NumbersTooBig
    Given User navigate to Number page
    When User enter number: 101
    And click on Submit Button
    Then appear message : "Number is too big"

  @NumbersCorrect
  Scenario: NumbersCorrect
    Given User navigate to Number page
    When User enter number: 81
    And click on Submit Button
    Then appear text : "Square root of 81 is 9.00"