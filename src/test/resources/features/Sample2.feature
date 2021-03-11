@Regression
Feature:Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

@LinkScenario @Test1 //any number of tags is allowed
  Scenario: Navigate to Link Page
    When user navigates to Link Page
    Then user should  verify page is opened correctly

    @AgeScenario1
    Scenario: CheckAge page functionality for kid
      Given user navigates to Age page
      When user enter name : "Vasja"
      And user enter age : 5
      And Click on submit button
      Then user sees message : "Hello, Vasja, you are a kid"

  @AgeScenario2
  Scenario: CheckAge page functionality for Teenager
    Given user navigates to Age page
    When user enter name : "Vasjanzz"
    And user enter age : 15
    And Click on submit button
    Then user sees message : "Hello, Vasjanzz, you are a teenager"