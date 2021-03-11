Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario


  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then user should verify page is opened correctly

  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "ABC"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, ABC, you are an adult"

