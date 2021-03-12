Feature: Testing task 2

  #https://kristinek.github.io/site/tasks/list_of_people
  @FirstTest
  Scenario Outline: add, edit, remove and reset
    Given I am on Employee page
    When click on Add person
    And fill all fields: "<name>", "<surname>", "<job>", "<DataEnter>", "<selectedCheck>", "<gender>", "<status>"
    Then click button add
    When click on edit button
    And edit something: "<name1>", "<surname1>", "<job1>", "<DataEnter1>", "<selectedCheck1>", "<gender1>", "<status1>"
    And click on edit-button
    And remove a person
    Then reset list
    Examples:
      | name     | surname |     job           | DataEnter | selectedCheck | gender | status   |    name1    | surname1 |     job1      | DataEnter1 | selectedCheck1 | gender1 | status1     |
      | Dmitrijs | Lvovs   | Quality Engineer  | 01/05/1999|    english    | male   | employee |    Sergej   |  Orlov   |    QA         | 01/05/1999 |    french      |   male  |  intern     |
      | Evgenij  | Orlov   | Quality Engineer  | 01/05/1979|    spanish    | male   | intern |    Evgenij  |  Orlov   |    GameDev    | 01/05/1979 |    spanish     |   male  |  employee   |
      | Ekaterina| Velika  | Team manager      | 04/07/2000|    french     | female | contractor |    Ekaterina|  Velika  |   Team manager| 04/07/2000 |    french      |   female|  contractor   |

  @SecondTest
  Scenario: check how working clear button
    Given I am on Employee page
    When click on Add person
    And fill all fields: "Ivan", "Kotcov", "Software developer", "02/09/1985", "spanish", "male", "intern"
    And click clear-button
    Then check empty fields