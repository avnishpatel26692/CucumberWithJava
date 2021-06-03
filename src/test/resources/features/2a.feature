

@Regression
Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario
  Background:
    Given User navigates to Age Page
  @SmokeTest
  Scenario: Check Age page functionality for Adult
    When User enter name : "ABC"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, ABC, you are an adult"
  @SanityTest
  Scenario: Check Age page functionality for Kid
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"
  @SanityTest
  Scenario: Check Age page functionality for a Teenager
    When User enter name : "Robin"
    And User enter age : 15
    And Click on Submit button
    Then User see message : "Hello, Robin, you are a teenager"
  @FailedTest
  Scenario: Check Age page functionality
    When User enter name : "Sam"
    And User enter age : 15
    And Click on Submit button
    Then User see message : "Hello, Robin, you are a kid"

