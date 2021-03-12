@Regression
Feature: Introduction to cucumber
  As a test engineer I want to write a simple scenario

 Background:
   Given User navigate to Age Page

  @SmokeTest
Scenario: Check Age page functionality for adult
When user enter name:"Aizhan"
And user enter age: 31
And click on submit button
Then user see message: "Hello, Aizhan, you are an adult"

  @SanityTest
Scenario: Check Age page functionality for kid
When user enter name:"Ivan"
And user enter age: 6
And click on submit button
Then user see message: "Hello, Ivan, you are a kid"

  @FailedTest
Scenario: Check Age page functionality for teenager
When user enter name:"Lusy"
And user enter age: 15
And click on submit button
Then user see message: "Hello, Lusy, you are a kid"

  @SmokyTest
Scenario: Check Age page functionality for teenager
When user enter name:"Lusy"
And user enter age: 15
And click on submit button
Then user see message: "Hello, Lusy, you are a teenager"