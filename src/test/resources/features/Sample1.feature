Feature: Introduction to cucumber part 1
  As a test engineer
  I want to be able to write and execute a simple scenario

  @Sample1
  Scenario: Simple scenario
    When I am on the home page
    Then I should see home page header
    And I should see home page description
    And I should see menu

    Scenario: simple scenario1
      Given user open facebook page
      When user enters username and password
      And user clicks on login button
      Then user should be logged successfully
      And user can logout
      And user is on home page
      And user open facebook page