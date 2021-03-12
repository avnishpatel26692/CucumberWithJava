Feature: Two Column Data Table

  @Sample5 @Test1
  Scenario: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|Ann|
      |age |5  |
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"
  @Sample5 @Test2
  Scenario Outline: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|<name>|
      |age | <age> |
    And Click on Submit button
    Then User see message : "<message>"
    Examples:
      |name|age|message|
      |  ABC   | 29  | Hello, ABC, you are an adult   |
      |  Ann   | 5   | Hello, Ann, you are a kid   |
      |  Robin | 16  | Hello, Robin, you are a teenager  |
      |   Sam  | 7   | Hello, Sam, you are a kid   |