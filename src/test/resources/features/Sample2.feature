Feature: Sample2

    Scenario: Check age page
      When user navigates to Age page
      When User enter name : "Ann"
      And User enter age : 5
      And Click on Submit button
      Then User see message : "Hello, Ann, you are a kid"