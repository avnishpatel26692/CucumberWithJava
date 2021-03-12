#Feature: Sample2
#
#    Scenario: Check age page
#      When user navigates to Age page
#      When User enter name : "Ann"
#      And User enter age : 5
#      And Click on Submit button
#      Then User see message : "Hello, Ann, you are a kid"
#
#  Scenario Outline: checking Age Functionality using Examples
#    Given user navigates to Age page
#    When User enter name : "<name>"
#    And User enter age : <age>
#    And Click on Submit button
#    Then User see message : "<message>"
#    Examples:
#      |name|age|message|
#      |  ABC   | 29  | Hello, ABC, you are an adult   |
#      |  Ann   | 5   | Hello, Ann, you are a kid   |
#      |  Robin | 15  |    Hello, Robin, you are a teenager  |
#      |     Sam|15   |     Hello, Sam, you are a Kid   |
#    @SomeTag
#    Examples:
#      |name|age|message|
#      |  tester   | 29  | Hello, tester, you are an adult   |


  @regression
  Feature: Introduction to cucumber part 2
  As a test engineer
  I want to be able to write and execute a scenario with parameters
  Scenario: a new scenario 1 with regex
    Given I am on age page using PO
    When I enter name: "Ann" using PO
    And I enter age: 5 using PO
    And I click submit age using PO
    Then I see message: "Hello, Ann, you are a kid" using PO
  Scenario: a new scenario 2 with regex
    Given I am on age page using PO
    When I enter name: "Bob" using PO
    And I enter age: 61 using PO
    And I click submit age using PO
    Then I see message: "Hello, Bob, you are an adult" using PO