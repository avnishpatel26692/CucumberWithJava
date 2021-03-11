@Main
Feature: Check age page
  Check age page functionality.
  @Kid
  Scenario: Check kid Age page functionality
    Given User navigates to Age Page
    When User enter name : "Bill"
    And User enter age : 2
    And Click on Submit button
    Then User see message : "Hello, Bill, you are a kid"
  @Adult
  Scenario: Check adult Age page functionality
    Given User navigates to Age Page
    When User enter name : "Nancy"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, Nancy, you are an adult"
  @Kid @Adult
  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then user should verify page is opened correctly