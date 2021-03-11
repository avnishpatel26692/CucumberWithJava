
Feature: Introduction to Cucumber
  As a test engineer I want to write and execute a simple scenario

  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then User should verify page is opened correctly

  @AgeScenario1
    Scenario: Check Age page functionality
      Given User navigates to Age Page
      When User enter name : "Sandra"
      And User enter age : "26"
      And click on Submit button
      Then User see message : "Hello, Sandra, you are an adult"

@AgeScenario2
  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Ann"
    And User enter age : 5
    And click on Submit button
    Then User see message : "Hello, Ann, you are a kid"


