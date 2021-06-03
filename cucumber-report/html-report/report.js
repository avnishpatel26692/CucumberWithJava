$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/3.feature");
formatter.feature({
  "line": 2,
  "name": "Introduction to cucumber part 3",
  "description": "As a test engineer\r\nI want to be able to write and execute a simple scenario",
  "id": "introduction-to-cucumber-part-3",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Numbers"
    }
  ]
});
formatter.before({
  "duration": 1768673200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "NumbersTooSmall",
  "description": "",
  "id": "introduction-to-cucumber-part-3;numberstoosmall",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@NumbersTooSmall"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User navigate to Number page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter number: 5",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "appear message : \"Number is too small\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NumbersCheckSteps.user_navigate_to_Number_page()"
});
formatter.result({
  "duration": 959711400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 19
    }
  ],
  "location": "NumbersCheckSteps.user_enter_number(int)"
});
formatter.result({
  "duration": 97797800,
  "status": "passed"
});
formatter.match({
  "location": "NumbersCheckSteps.click_on_Submit_Button()"
});
formatter.result({
  "duration": 85631500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too small",
      "offset": 18
    }
  ],
  "location": "NumbersCheckSteps.appear_message(String)"
});
formatter.result({
  "duration": 30418000,
  "status": "passed"
});
formatter.after({
  "duration": 3158350400,
  "status": "passed"
});
formatter.before({
  "duration": 1106393900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "NumbersTooBig",
  "description": "",
  "id": "introduction-to-cucumber-part-3;numberstoobig",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@NumbersTooBig"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User navigate to Number page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User enter number: 101",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "click on Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "appear message : \"Number is too big\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NumbersCheckSteps.user_navigate_to_Number_page()"
});
formatter.result({
  "duration": 913991100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "101",
      "offset": 19
    }
  ],
  "location": "NumbersCheckSteps.user_enter_number(int)"
});
formatter.result({
  "duration": 113888400,
  "status": "passed"
});
formatter.match({
  "location": "NumbersCheckSteps.click_on_Submit_Button()"
});
formatter.result({
  "duration": 45561400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number is too big",
      "offset": 18
    }
  ],
  "location": "NumbersCheckSteps.appear_message(String)"
});
formatter.result({
  "duration": 27528900,
  "status": "passed"
});
formatter.after({
  "duration": 3124541700,
  "status": "passed"
});
formatter.before({
  "duration": 1048230800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "NumbersCorrect",
  "description": "",
  "id": "introduction-to-cucumber-part-3;numberscorrect",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@NumbersCorrect"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User navigate to Number page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enter number: 81",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click on Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "appear text : \"Square root of 81 is 9.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NumbersCheckSteps.user_navigate_to_Number_page()"
});
formatter.result({
  "duration": 985322700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "81",
      "offset": 19
    }
  ],
  "location": "NumbersCheckSteps.user_enter_number(int)"
});
formatter.result({
  "duration": 112450300,
  "status": "passed"
});
formatter.match({
  "location": "NumbersCheckSteps.click_on_Submit_Button()"
});
formatter.result({
  "duration": 49959200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Square root of 81 is 9.00",
      "offset": 15
    }
  ],
  "location": "NumbersCheckSteps.appear_text(String)"
});
formatter.result({
  "duration": 9027800,
  "status": "passed"
});
formatter.after({
  "duration": 3660317600,
  "status": "passed"
});
});