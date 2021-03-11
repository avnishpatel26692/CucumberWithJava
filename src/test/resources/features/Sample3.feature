Feature: Using Examples

  Scenario Outline: checking Age functionality using Examples
    Given User navigate to Age Page
    When user enter name:"<name>"
    And user enter age: <age>
    And click on submit button
    Then user see message: "<message>"
    Examples:
    |name|age|message|
    | Aizhan | 31 | Hello, Aizhan, you are an adult |
    | Ivan | 6 | Hello, Ivan, you are a kid |
    | Lusy | 15 | Hello, Lusy, you are a teenager  |
    | Lusy | 15 | Hello, Lusy, you are a kid |




