Feature: Two column data tables

#Scenario: Check Ages page functionality
#  Given User navigate to AgePage
#  When User enters name : "Ann"
#  And User enters age : "5"
#  And Click on submit button
#  Then User see the message : "Hello, Ann, you are a kid"
@Sample5 @Test1
  Scenario: Check Ages page functionality
    Given User navigate to AgePage
    When User enters details
    |name| Ann |
    | age| 5 |
    And Click on submit button
    Then User see the message : "Hello, Ann, you are a kid"

  @Sample5 @Test2
  Scenario Outline: Check Age page functionality
    Given User navigate to AgePage
    When User enters details
      |name|<name>|
      |age | <age> |
    And Click on submit button
    Then User see message : "<message>"
    Examples:
      |name|age|message|
      |  ABC   | 29  | Hello, ABC, you are an adult   |
      |  Ann   | 5   | Hello, Ann, you are a kid   |
      |  Robin | 15  |    Hello, Robin, you are a teenager  |
      |     Sam|15   |     Hello, Sam, you are a Kid   |