Feature: Introduction to cucumber part 2
  As a test engineer
  I want to be able to write and execute a simple scenario

  @LinkPageScenario
  Scenario: Navigate to Link Page
    When User navigates to Link Page
    Then User verifies that page opened successfully

    @AgeScenario2
    Scenario Outline: Check Age page functionality
      Given User navigates to Age Page
      When User enter name "<name>" and enter age "<age>" and press button
      Then User see message "<message>"
      @Working
      Examples:
      |name|age|message|
      |  Gleb  |  27 |  Hello, Gleb, you are an adult     |
      |  Bob  |  5 |  Hello, Bob, you are a kid     |
      |  John  |  30 |  Hello, John, you are an adult     |
      @NotWorking
      Examples:
      |name|age|message|
      |  Andrew  | 5  |   Hello, Andrew, you are an adult    |

  @MapExample
  Scenario Outline: Check Age page functionality
    Given User navigates to Age Page
    When User enter name, age and press button
    |name|<name>|
    |age |<age>|
    Then User see message "<message>"
    Examples:
      |name|age|message|
      |  Gleb  |  27 |  Hello, Gleb, you are an adult     |
      |  Bob  |  5 |  Hello, Bob, you are a kid     |
      |  John  |  30 |  Hello, John, you are an adult     |

  @MapsExample
  Scenario: 3 column Data Table
    Given I have the following order
      | vegetable | quantity | cost | color|
      | cucumber  |   4    |  10  | red    |
      | carrot    |   5    |   6  | green  |
      | potato    |   6    |   4  | blue   |