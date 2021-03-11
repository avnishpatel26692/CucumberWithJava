@Regression
Feature: Introduction to cucumber
  As a test engineer
  I want to write and execute a simple scenario
@SmokeTest @Test1
  Scenario: Navigate to Go to link page
    When User navigates to link page
    Then User should verify page is opened correctly

@SanityTest
    Scenario: Check Age page functionality
      Given User navigates to Age page
      When user enter name : "Boo"
      And user enter age : "29"
      And click Submit button
      Then user see message : "Hello, Boo, you are an adult"

@SanityTest
  Scenario: Check Ages page functionality
    Given User navigate to AgePage
    When User enters name : "Ann"
    And User enters age : "5"
    And Click on submit button
    Then User see the message : "Hello, Ann, you are a kid"


  Scenario: Check Ages functionality
    Given navigate to AgePage
    When enter name : "Robin"
    And enter age : "15"
    And Click on submit
    Then see message : "Hello, Robin, you are a teenager"

  Scenario: Check Age functionality
    Given navigate to Page
    When name : "Sam"
    And age : "15"
    And submit
    Then message : "Hello, Robin, you are a kid"

