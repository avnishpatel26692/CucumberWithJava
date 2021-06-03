  @Agree
Feature: Agree Checkbox
  As a test engineer
  I want to be able to write and execute a simple scenario

  @Agreepressed
  Scenario: AgreeCheckBox
    Given I am on the checkout
    Then I click on Continue button
    Then I click at checkbox Agree Terms
    And I click on Continue button
    Then I find confirm button

  @Agreeunpressed
  Scenario: AgreeCheckbox not pressed
      Given I am on the checkout
      And I click on Continue button
      Then I see a warning message
