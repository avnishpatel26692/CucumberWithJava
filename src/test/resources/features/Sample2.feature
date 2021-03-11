Feature: Introduction to cucumber
  As a test engineer I want to write and execute simple scenario



  Scenario: Navigate to Go to Link Page
    When User navigates to Link Page
    Then user should verify page is opened correctly

    @AgeScenario1
    Scenario: Check Age page functionality
      Given User navigates to Age page
      When User enter name : "Veronika"
      And user enter Age : 24
      And Click on submit button
      Then User see message : "Hello, Veronika, you are an adult"