@Regression
Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

  Background:
    Given User navigates to Age Page using PO


  Scenario: Check Age page functionality for Adult
    When User enter name : "ABC" using PO
    And User enter age : "29" using PO
    And Click on Submit button using PO
    Then User see message : "Hello, ABC, you are an adult" using PO


  Scenario: Check Age page functionality for Kid
    When User enter name : "Ann" using PO
    And User enter age : "5" using PO
    And Click on Submit button using PO
    Then User see message : "Hello, Ann, you are a kid" using PO


  Scenario: Check Age page functionality for a Teenager
    When User enter name : "Robin" using PO
    And User enter age : "15" using PO
    And Click on Submit button using PO
    Then User see message : "Hello, Robin, you are a teenager" using PO


  Scenario: Check Age page functionality
    When User enter name : "Sam" using PO
    And User enter age : "15" using PO
    And Click on Submit button using PO
    Then User see message : "Hello, Sam, you are a teenager" using PO