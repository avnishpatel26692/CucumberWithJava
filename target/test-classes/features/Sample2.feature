Feature: Introduction to cucumber
  As a test engineer I want to write and execute simple scenarios.

  Scenario: Navigate to Link Page
    When User navigates to the page
    Then User should verify that page is opened correctly

  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Nancy"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, Nancy, you are an adult"