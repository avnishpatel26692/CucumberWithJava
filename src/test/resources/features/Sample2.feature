@Regression
Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

  @SmokeTest @Test1
  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then user should verify page is opened correctly

  @SmokeTest
  Scenario: Check Age page functionality for Adult
    Given User navigates to Age Page
    When User enter name : "ABC"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, ABC, you are an adult"

    @SanityTest
  Scenario: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

  @SanityTest
  Scenario: Check Age page functionality for a Teenager
    Given User navigates to Age Page
    When User enter name : "Robin"
    And User enter age : 15
    And Click on Submit button
    Then User see message : "Hello, Robin, you are a teenager"

    @FailedTest
  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Sam"
    And User enter age : 15
    And Click on Submit button
    Then User see message : "Hello, Robin, you are a kid"

