@regression @part4
Feature: Introduction to cucumber part 4
  As a test engineer
  I want to be able to write and execute a scenario with steps that have tables

  Background:
    Given User navigates to Age page using PO


  Scenario: a new scenario 1 with table
    When I enter values using PO:
      | name | Ann |
      | age  | 5   |
    And I enter values using PO:
    Then user see message using PO : "Hello, Ann, you are a kid"
  Scenario: a new scenario 1 with table
    When I enter values using PO:
      | name | Bob |
      | age  | 61  |
    And I enter values using PO:
    Then user see message using PO : "Hello, Bob, you are an adult"
  @debug
  Scenario Outline: a new scenario outline 2
    When I enter values using PO:
      | name | <name> |
      | age  | <age>  |
    And I enter values using PO:
    Then user see message using PO : "<message>"
    Examples:
      | name | age | message                      |
      | Ann  | 5   | Hello, Ann, you are a kid    |
      | Bob  | 61  | Hello, Bob, you are an adult |
