Feature: Introduction to cucumber
  As a test engineer I want to write a simple scenario


  Scenario: Navigate Go to Link Page
    When User navigate to link Page
    Then User should verify page is opened correctly


  Scenario: Check Age page functionality
    Given User navigate to Age Page
    When user enter name:"Aizhan"
    And user enter age: 31
    And click on submit button
    Then user see message: "Hello, Aizhan, you are an adult"

  Scenario: Check Age page functionality
    Given User navigate to Age Page
    When user enter name:"Ivan"
    And user enter age: 6
    And click on submit button
    Then user see message: "Hello, Ivan, you are a kid"