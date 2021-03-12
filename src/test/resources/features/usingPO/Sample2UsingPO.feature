Feature:Introduction to cucumber part 2
  As a test engineer I want to write and execute a simple scenario



  Scenario: a new scenario 1 with regex
    Given I am on the page using PO
    When user enter name : "Vasja" using PO
    And user enter age : "5" using PO
    And Click on submit button using PO
    Then user sees message : "Hello, Vasja, you are a kid" using PO

  Scenario: a new scenario 2 with regex
    Given I am on the page using PO
    When user enter name : "Bob" using PO
    And user enter age : "61" using PO
    And Click on submit button using PO
    Then user sees message : "Hello, Bob, you are an adult" using PO

  Scenario: a new scenario 3 with regex
    Given I am on the page using PO
    When user enter name : "McMac" using PO
    And user enter age : "361" using PO
    And Click on submit button using PO
    Then user sees message : "Hello, Bob, you are an immortal" using PO