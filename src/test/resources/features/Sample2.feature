Feature:Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

@LinkScenario
  Scenario: Navigate to Link Page
    When user navigates to Link Page
    Then user should  verify page is opened correctly

    @AgeScenario1
    Scenario: CheckAge page functionality
      Given user navigates to Age page
      When user enter name : "Vasja"
      And user enter age : 5
      And Click on submit button
      Then user sees message : "Hello, Vasja, you are a kid"
