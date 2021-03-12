Feature: Introduction to cucumber part 1
  As a test engineer
  I want to be able to write and execute a simple scenario

  Scenario: Navigate to link Page
    When User navigates to Link Page
    Then User should be verified page is opened correctly

  Scenario: Check Age Page functionality for adult
    Given User navigates to Age Page
    When User enter name : "Zeel"
    And User enter age : 26
    And Click on Submit button
    Then User see message : "Hello, Ann, you are an adult"

Scenario: Check Age Page functionality for kid
  Given User navigates to Age Page
  When User enter name : "Kate"
  And User enter age : 4
  And Click on Submit button
  Then User see message : "Hello, Kate, you are a kid"

  Scenario: Check Age Page functionality for teenager
  Given User navigates to Age Page
  When User enter name : "Max"
  And User enter age : 16
  And Click on Submit button
  Then User see message : "Hello, Max, you are a teenager"