Feature: Introduction to cucumber part 3
  Test of writing and executing a several scenarios


Scenario Outline:  Check Age page functionality with multiple examples
Given User navigates to Age page
When User enters name : <name>
And User enters age : <age>
And User clicks on Submit button
Then User receives Hello message : <message>
  Examples:
  |name|age|message|
  |"Egils"| "27"  | "Hello, Egils, you are an adult"  |
  |"Egils"| "7"  | "Hello, Egils, you are a kid"  |
  |"Egils"| "17"  | "Hello, Egils, you are a teenager"  |