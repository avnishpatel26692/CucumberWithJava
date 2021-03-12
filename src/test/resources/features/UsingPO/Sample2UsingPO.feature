Feature: introduction to cucumber part 2

  Background:
    Given User navigates to Age page using PO

Scenario: Check Age page functionality
When user enter name using PO : "Boo"
And user enter age using PO : "29"
And click Submit button using PO
Then user see message using PO : "Hello, Boo, you are an adult"

@SanityTest
Scenario: Check Ages page functionality
When user enter name using PO : "Ann"
And user enter age using PO : "5"
And click Submit button using PO
Then user see message using PO : "Hello, Ann, you are a kid"

