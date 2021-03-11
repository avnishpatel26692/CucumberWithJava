Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

  Scenario: Navigate to Link Page
    When User navigate to Link Page
    Then user should be verify page is opened correctly

    @AgeScenario1
  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Zeel"
    And User enter age : 26
    And Click on Submit button
    Then User see message : "Hello, Zeel, you are an adult"

    @AgeScenario2
  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

