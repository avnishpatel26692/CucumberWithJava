Feature: Using Examples

  Scenario Outline: checking Age Functionality using Examples
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : "<age>"
    And click on Submit button
    Then User see message : "<message>"
    Examples:
    |name|age|message|
    | ABC   | 29  | Hello, ABC, you are an adult  |
    | Ann   | 5  | Hello, Ann, you are a kid  |
    | Robin   | 15  | Hello, Robin, you are a teenager  |
    | Sam   | 15  | Hello, ABC, you are a kid  |
