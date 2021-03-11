Feature: using example


  Scenario Outline: Check Ages functionality using Example
    Given User navigate to AgePage
    When User enters name : "<name>"
    And User enters age : "<age>"
    And Click on submit button
    Then User see the message : "<message>"

    @Working
    Examples:
      | name | age | message |
      | Boo  | 29  |  Hello, Boo, you are an adult |
      | Ann  |  5  |   Hello, Ann, you are a kid   |
      | Robin| 15  | Hello, Robin, you are a teenager |
    @NotWorking
    Examples:
      | Sam |   15  | Hello, Sam, you are a kid   |

