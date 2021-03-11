Feature: Introduction to cucumber part 1
  As a test engineer
  I want to be able to write and execute a simple scenario


  Scenario: Simple scenario
    When I am on the home page
    Then I should see home page header
    And I should see home page description
    And I should see menu


    Scenario: Simple scenario 1
      Given user open facebook page
      When user enters username and password
      And user clicks on login button
      Then user should be logged in successfully
      And user can logout
      And user is on home page