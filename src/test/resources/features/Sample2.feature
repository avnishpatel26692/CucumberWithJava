Feature: Introduction to cucumber

Scenario: Navigate to Link Page
When User navigates to Link Page
Then user should verify page is opened correctly


Scenario: Check Age page functionality
Given User navigates to Age Page
When User enter name : "Mara"
And User enter age : "40"
And Click on Submit button
Then User see message : "Hello, Mara, you are an adult"

