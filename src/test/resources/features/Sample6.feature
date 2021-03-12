@Regression
Feature: Introduction to cucumber
  As a test engineer
  I want to write and execute a simple scenario

  Background:
    Given User navigates to Age page
    And click Submit button

  @SmokeTest @Test1
  Scenario: Navigate to Go to link page
    When User navigates to link page
    Then User should verify page is opened correctly

  @SanityTest
  Scenario: Check Age page functionality
    When user enter name : "Boo"
    And user enter age : "29"
    And click Submit button
    Then user see message : "Hello, Boo, you are an adult"

  @SanityTest
  Scenario: Check Ages page functionality
    When User enters name : "Ann"
    And User enters age : "5"
    And click Submit button
    Then User see the message : "Hello, Ann, you are a kid"


  Scenario: Check Ages functionality
    When enter name : "Robin"
    And enter age : "15"
    And click Submit button
    Then see message : "Hello, Robin, you are a teenager"

  Scenario: Check Age functionality
    When name : "Sam"
    And age : "15"
    And click Submit button
    Then message : "Hello, Robin, you are a kid"

