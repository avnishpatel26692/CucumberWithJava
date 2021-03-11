Feature: As a Test Engineer I want to be able to create simple scenarios.

  @LinkScenario
  Scenario: Navigate to the Link Page
    When user navigates to Link Page
    Then user should verify the page is opened correctly

  @AgePageScenario
  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Nancy"
    And User enter age : "26"
    And Click on Submit button
    Then User see message : "Hello, Nancy, you are an adult"



