Feature: Introduction to cucumber part 2
  As a test engineer
  I want to be able to write and execute a simple scenario

  @AgeScenario
  Scenario: Age Scenario
    Given User navigate to Age page
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"
