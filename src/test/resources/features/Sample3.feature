Feature: Using Examples

  Scenario Outline: checking Age functionality using examples
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : "<age>"
    And Click on Submit button
    Then User see message : "<message>"
    Examples:
      | name  | age | message                        |
      | Nancy | 26  | Hello, Nancy, you are an adult |
      | Robin | 5   | Hello, Robin, you are a kid    |
