Feature: Introduction to cucumber part 1
  As a test engineer
  I want to be able to write and execute a simple scenario
#// lines 2:3 - any description. lines 7:10 - each line is a Gherkin, associated with a step definition
  @Sample1
  Scenario: Simple scenario
    When I am on the home page
    Then I should see home page header
    And I should see home page description
    And I should see menu

    Scenario: Simple Scenario2
      Given user opens Facebook page
      And user enters username and password
      And user click on login button
      Then user should be logged in successfully
      And user is can logout
      And user is on homepage
