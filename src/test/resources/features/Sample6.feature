@Regression
Feature: Introduction to cucumber
  As a test engineer I want to write and execute a simple scenario

  Background:
    Given User navigates to Age Page

  @SmokeTest
  Scenario: Check Age page functionality
    When User enter name : "Zeel"
    And User enter age : 26
    And Click on Submit button
    Then User see message : "Hello, Zeel, you are an adult"

  @SmokeTest
  Scenario: Check Age page functionality
    When User enter name : "Ann"
    And User enter age : 5
    And Click on Submit button
    Then User see message : "Hello, Ann, you are a kid"

