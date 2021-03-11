Feature: Introduction to cucumber
  Some sample text here (definitions or stuff like that)



  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then user should verify page is opened correctly

  Scenario: Check age page
    Given User navigates to Age Page
    When User enter name : "John"
    And User enter age : 21
    And Click on Submit button
    Then User see message : "Hello, John, you are an adult"

  Scenario: Check Age page functionality
    Given User navigates to Age Page
    When User enter name : "Nancy"
    And User enter age : 29
    And Click on Submit button
    Then User see message : "Hello, Nancy, you are an adult"



  Scenario: Check Age page functionality2
    Given User navigates to Age Page
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

