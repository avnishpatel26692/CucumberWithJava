Feature: Introduction to cucumber
  As a test engineer I want to write and execute simple scenarios.

#  Scenario: Navigate to Link Page
#    When User navigates to the page
#    Then User should verify that page is opened correctly

  Background:
    Given User navigates to Age Page

  @WorkingTest
  Scenario: Check Age page functionality for Adult
    When User enter name : "ABC"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, ABC, you are an adult"

  @WorkingTest
  Scenario: Check Age page functionality for Kid
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

  @FailedTest
  Scenario: Check Age page functionality for a Teenager
    When User enter name : "Robin"
    And User enter age : 15
    And Click on Submit button
    Then User see message : "Hello, Robin, you are an adult"