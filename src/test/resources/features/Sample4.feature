Feature: Data Table Examples


  Scenario: a new scenario with 1-row table
    Given I am on action page
    When I clicked on checkboxes:
      | Option 1 |
      | Option 3 |
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 3" is seen
  Scenario: a new scenario with 1-row table
    Given I am on action page
    When I clicked on checkboxes:
      | Option 2 |
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 2" is seen

  Scenario: a new scenario with 1-row table
    Given I am on action page
    When I clicked on checkboxes:
      | Option 1 |
      | Option 2 |
      | Option 3 |
    And I click the result checkbox button
    Then message for checkboxes "You selected value(s): Option 1, Option 2, Option 3" is seen