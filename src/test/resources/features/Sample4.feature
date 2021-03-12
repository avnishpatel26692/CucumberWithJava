Feature: Data Table Examples

#  Scenario Outline: checking Age Functionality using Examples
#    Given User navigates to Age Page
#    When User enters value
#    |name|Ann|
#    |age|5|
##    When User enter name : "<name>"
##    And User enter age : "<age>"
#    And click on Submit button
#    Then User see message : "<Hello, Ann, you are a kid>"

  Scenario: a new scenario with 1-row table
    Given I am on Action Page
    When I clicked on checkboxes:
    |Option 1|
    |Option 3|
    And I click on checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 3" is seen

  Scenario: a new scenario with 1-row table
    Given I am on Action Page
    When I clicked on checkboxes:
      | Option 2 |
    And I click on checkbox button
    Then message for checkboxes "You selected value(s): Option 2" is seen

  Scenario: a new scenario with 1-row table
    Given I am on Action Page
    When I clicked on checkboxes:
      | Option 1 |
      | Option 2 |
      | Option 3 |
    And I click on checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 2, Option 3" is seen

