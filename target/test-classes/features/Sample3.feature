Feature: using Examples


Scenario Outline: checking Age Functionality using Examples
Given User navigates to Age Page
When User enter name : "<name>"
And User enter age : <age>
And Click on Submit button
Then User see message : "<message>"
@Working
Examples:
|name|age|message|
|  Bob   | 39  | Hello, Bob, you are an adult  |
|  Alla  | 4   | Hello, Alla, you are a kid    |
|  Jane  | 15  | Hello, Jane, you are a teenager |
@NotWorking
Examples:
|name    |age  |message                        |
|  Mary  | 17  | Hello, Mary, you are a Kid    |
