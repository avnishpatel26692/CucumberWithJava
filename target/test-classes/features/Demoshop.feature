  @Demoshoplogin
  Feature: Demoshop testing precondition

  @Demoshop
  Scenario: DemoshopHomePage
    Given User navigate to Demoshop homepage
    Then User enter user name
    And User enter password
    Then User is logged in