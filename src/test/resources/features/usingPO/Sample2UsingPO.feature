@regression
  Feature:
    Blabalblabal
      Very important definition

  Scenario: a new scenario
    Given I am on age page using PO
    When I enter name: "Ann" using PO
    And I enter age: "5" using PO
    And I click submit age using PO
    Then I see message: "Hello, Ann, you are a kid" using PO

    Scenario: a new scenario2
      Given I am on age page using PO
      When I enter name: "Blaze" using PO
      And I enter age: "69" using PO
      And I click submit age using PO
      Then I see message: "Hello, Blaze, you are an adult" using PO