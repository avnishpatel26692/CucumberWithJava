Feature: Two Column Data Table

  @Sample5 @Test1
  Scenario: Check Age page functionality for Kid
    Given User navigates to Age Page
    When User enter details
      |name|Sarah|
      |age |7  |
    And Click on Submit button
    Then User see message : "Hello, Sarah, you are a kid"

  @Sample5 @Test2
  Scenario Outline: Check Age page functionality for any Person
    Given User navigates to Age Page
    When User enter details
      |name|<name>|
      |age | <age> |
    And Click on Submit button
    Then User see message : "<message>"
    Examples:
      |name|age|message|
      |  Mary   | 29  | Hello, Mary, you are an adult   |
      |  Bob    | 5   | Hello, Bob, you are a kid   |
      |  Robb   | 15  | Hello, Robb, you are a teenager |
      |  Yaga   | 185 | Hello, Yaga, you are an immortal|
      |  Ilya   | 33  | Hello, Bob, you are a kid   |

  @Sample5 @Test3
  Scenario: 4 column Data Table
    Given I have the following order
      | vegetable | quantity | cost | sum |
      | cucumber  |   4    |  10  |  40   |
      | carrot    |   5    |   6  |  30   |
      | potato    |   6    |   4  |  24   |

  @Sample5 @Test3-1
  Scenario: 6 column Data Table
    Given I have the following order in webshop
      | clothes   | size | color  | quantity | cost | sum  |
      | dress    |   8   |  black |  1   |  120     | 120  |
      | turtleneck | 8   | white  |  3   | 15       | 45   |
      | trousers  |   10 |  blue  |  2   |  50    |  100   |