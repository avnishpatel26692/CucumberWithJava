Feature: Using Examples

  Scenario Outline: checking Age Functionality using Examples
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : <age>
    And Click on Submit button
    Then User see message : "<message>"
    Examples:
    |name|age|message|
    |Zeel |26 |Hello, Zeel, you are an adult|
    |Ann  |6  |Hello, Ann, you are a kid    |
    |Robin|15 |Hello, Robin, you are a teenager|
    |Sam  |15 |Hello, Robin, you are a kid     |

  Scenario Outline: checking Age Functionality using Examples
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : <age>
    And Click on Submit button
    Then User see message : "<message>"
    @Working
    Examples:
      |name|age|message|
      |Zeel |26 |Hello, Zeel, you are an adult|
      |Ann  |6  |Hello, Ann, you are a kid    |
      |Robin|15 |Hello, Robin, you are a teenager|
    @NotWorking
    Examples:
      |name|age|message|
      |Sam  |15 |Hello, Robin, you are a kid     |