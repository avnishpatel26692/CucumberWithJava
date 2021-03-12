$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample2UsingPO.feature");
formatter.feature({
  "line": 2,
  "name": "Introduction to cucumber part 2",
  "description": "As a test engineer\r\nI want to be able to write and execute a scenario with parameters",
  "id": "introduction-to-cucumber-part-2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 1344965200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "a new scenario 1 with regex",
  "description": "",
  "id": "introduction-to-cucumber-part-2;a-new-scenario-1-with-regex",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on age page using PO",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter name: \"Ann\" using PO",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter age: 5 using PO",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click submit age using PO",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see message: \"Hello, Ann, you are a kid\" using PO",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps4PO.i_am_on_age_page_using_PO()"
});
formatter.result({
  "duration": 853137100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ann",
      "offset": 15
    }
  ],
  "location": "Steps4PO.i_enter_name_using_PO(String)"
});
formatter.result({
  "duration": 76733500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    }
  ],
  "location": "Steps4PO.i_enter_age_using_PO(int)"
});
formatter.result({
  "duration": 36031900,
  "status": "passed"
});
formatter.match({
  "location": "Steps4PO.i_click_submit_age_using_PO()"
});
formatter.result({
  "duration": 77296000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Ann, you are a kid",
      "offset": 16
    }
  ],
  "location": "Steps4PO.i_see_message_using_PO(String)"
});
formatter.result({
  "duration": 17821300,
  "status": "passed"
});
formatter.after({
  "duration": 3085951000,
  "status": "passed"
});
formatter.before({
  "duration": 997146600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "a new scenario 2 with regex",
  "description": "",
  "id": "introduction-to-cucumber-part-2;a-new-scenario-2-with-regex",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am on age page using PO",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter name: \"Bob\" using PO",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter age: 61 using PO",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click submit age using PO",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I see message: \"Hello, Bob, you are an adult\" using PO",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps4PO.i_am_on_age_page_using_PO()"
});
formatter.result({
  "duration": 866128000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob",
      "offset": 15
    }
  ],
  "location": "Steps4PO.i_enter_name_using_PO(String)"
});
formatter.result({
  "duration": 71984300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "61",
      "offset": 13
    }
  ],
  "location": "Steps4PO.i_enter_age_using_PO(int)"
});
formatter.result({
  "duration": 35515600,
  "status": "passed"
});
formatter.match({
  "location": "Steps4PO.i_click_submit_age_using_PO()"
});
formatter.result({
  "duration": 183888100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Bob, you are an adult",
      "offset": 16
    }
  ],
  "location": "Steps4PO.i_see_message_using_PO(String)"
});
formatter.result({
  "duration": 17408000,
  "status": "passed"
});
formatter.after({
  "duration": 3095353400,
  "status": "passed"
});
});