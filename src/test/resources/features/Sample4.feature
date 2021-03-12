Feature: Data Table Examples


#  Scenario: Check Age page functionality for Kid
#    Given User navigates to Age Page
#    When User enters value
#    |name|Ann
#    |age |5
#   # When User enter name : "Ann"
#   # And User enter age : 5
#    And Click on Submit button
#    Then User see message : "Hello, Ann, you are a kid"

  Scenario: a new scenario with 1 row table
    Given I click on action page
    When I clicked on checkboxes:
    | Option 1|
    | Option 3|
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 3" is seen

  Scenario: a new scenario with 1 row table
    Given I click on action page
    When I clicked on checkboxes:
      | Option 2|
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 2" is seen

  Scenario: a new scenario with 1 row table
    Given I click on action page
    When I clicked on checkboxes:
      | Option 1|
      | Option 2|
      | Option 3|
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 2, Option 3" is seen

