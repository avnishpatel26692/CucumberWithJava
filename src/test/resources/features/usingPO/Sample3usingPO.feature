@regression @part4

Feature: Introduction to cucumber part 4
  As a test engineer
  I want to be able to write and execute a scenario with steps that have tables

  Background:
    Given I am on age page

  Scenario: a new scenario 1 with table
    When I enter values using PO:
      | name | Ivan |
      | age  | 6   |
    And I click submit age using PO
    Then I see message: "Hello, Ivan, you are a kid" using PO

  Scenario: a new scenario 1 with table
    When I enter values using PO:
      | name | Aizhan |
      | age  | 31  |
    And I click submit age using PO
    Then I see message: "Hello, Aizhan, you are an adult" using PO

  @debug
  Scenario Outline: a new scenario outline 2
    When I enter values using PO:
      | name | <name> |
      | age  | <age>  |
    And I click submit age using PO
    Then I see message: "<message>" using PO
    Examples:
      | name | age | message                      |
      | Ivan  | 5  | Hello, Ivan, you are a kid    |