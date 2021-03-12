Feature: Two Column Data Table

  @Sample5 @Test1
  Scenario: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|Ivan|
      |age |6  |
    And Click on Submit button
    Then User see message : "Hello, Ivan, you are a kid"
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
      | Aizhan | 31 | Hello, Aizhan, you are an adult |
      | Ivan | 6 | Hello, Ivan, you are a kid |
      | Lusy | 15 | Hello, Lusy, you are a teenager  |
      | Lusy | 15 | Hello, Lusy, you are a kid |
