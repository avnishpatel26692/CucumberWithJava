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

  @Sample5 @Test3
  Scenario: 3 column Data Table
    Given I have the following order
      | vegetable | quantity | cost |
      | cucumber  |   4    |  10  |
      | carrot    |   5    |   6  |
      | potato    |   6    |   4  |