Feature: Using Examples

  @AgeScenario1
  Scenario Outline: CheckAge page functionality for kid
    Given user navigates to Age page
    When user enter name : "<name>"
    And user enter age : "<age>"
    And Click on submit button
    Then user sees message : "<message>"
    Examples:
    |name|age|message|
    | ABC | 29 | Hello, ABC, you are an adult |
    | ASD | 9 | Hello, ASD, you are a kid |
    | UNO | 19 | Hello, UNO, you are a teenager |
    | ONU | 19 | Hello, ONU, you are a kid |