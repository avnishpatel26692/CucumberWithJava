Feature: Using Examples

  Scenario Outline: checking Age Functionality using Examples
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : "<age>"
    And Click on Submit button
    Then User see message : "<message>"
    Examples:
    |name|age|message|
    |Zeel |26 |Hello, Zeel, you are an adult|
    |Kate |4  |Hello, Kate, you are a kid   |
    |Max |16 |Hello, Ben, you are a teenager|
