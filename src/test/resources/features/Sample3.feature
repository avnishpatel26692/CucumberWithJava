Feature: Check age page
  Check age page functionality.

  Scenario Outline: Check kid Age page functionality
    Given User navigates to Age Page
    When User enter name : "<name>"
    And User enter age : <age>
    And Click on Submit button
    Then User see message : "<message>"
    @Working
    Examples:
    |name|age|message|
    |Lisa|5|Hello, Lisa, you are a kid|
    |Steph|12|Hello, Steph, you are a kid|
    |Bill|60 |Hello, Bill, you are an adult|

    @NotWorking
    Examples:
    |name|age|message|
    |Billiot|12 |Hello, Bill, you are an adult|

