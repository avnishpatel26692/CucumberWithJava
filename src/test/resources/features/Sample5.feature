Feature: Two Column Data Table

#  Scenario Outline: checking Age Functionality using Examples
#    Given User navigates to Age Page
#    When User enters value
#    |name|Ann|
#    |age|5|
##    When User enter name : "<name>"
##    And User enter age : "<age>"
#    And click on Submit button
#    Then User see message : "<Hello, Ann, you are a kid>"

  @Sample5 @Test1
  Scenario: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|Ann|
      |age |5  |
    And click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

  @Sample5 @Test2
  Scenario Outline: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|<name>|
      |age | <age> |
    And click on Submit button
    Then User see message : "<message>"
    Examples:
      |name|age|message|
      |  ABC   | 29  | Hello, ABC, you are an adult   |
      |  Ann   | 5   | Hello, Ann, you are a kid   |
      |  Robin | 15  |    Hello, Robin, you are a teenager  |
      |     Sam|15   |     Hello, Robin, you are a Kid   |

    @Sample5 @Test3
      Scenario: 3 column Data Table
      Given I have the following order
# 1st line is always a header, the following lines will have values
      |vegetable| quantity | cost |
      | cucumber  |   4    |  10  |
      | carrot    |   5    |   6  |
      | potato    |   6    |   4  |