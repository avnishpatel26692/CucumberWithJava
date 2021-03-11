$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Task1.feature");
formatter.feature({
  "line": 1,
  "name": "Testing error cases and correct number case",
  "description": "//#https://kristinek.github.io/site/tasks/enter_a_number",
  "id": "testing-error-cases-and-correct-number-case",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Testing error cases",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-error-cases",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on number page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter number: \u003cnumber\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit number",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see a message: \u003cerrorMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-error-cases;",
  "rows": [
    {
      "cells": [
        "number",
        "errorMessage"
      ],
      "line": 11,
      "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;1"
    },
    {
      "cells": [
        "dad",
        "Please enter a number"
      ],
      "line": 12,
      "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;2"
    },
    {
      "cells": [
        "101",
        "Number is too big"
      ],
      "line": 13,
      "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;3"
    },
    {
      "cells": [
        "45",
        "Number is too small"
      ],
      "line": 14,
      "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1341116600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Testing error cases",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on number page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter number: dad",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit number",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see a message: Please enter a number",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.i_am_on_number_page()"
});
formatter.result({
  "duration": 857821300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_enter_number_dad()"
});
formatter.result({
  "duration": 62055900,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 35355600,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Please_enter_a_number()"
});
formatter.result({
  "duration": 18350500,
  "status": "passed"
});
formatter.after({
  "duration": 3101204700,
  "status": "passed"
});
formatter.before({
  "duration": 992384100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Testing error cases",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on number page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter number: 101",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit number",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see a message: Number is too big",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.i_am_on_number_page()"
});
formatter.result({
  "duration": 877064400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "101",
      "offset": 16
    }
  ],
  "location": "SampleSteps.i_enter_number(int)"
});
formatter.result({
  "duration": 57804600,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 35247000,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Number_is_too_big()"
});
formatter.result({
  "duration": 16553000,
  "status": "passed"
});
formatter.after({
  "duration": 3095930400,
  "status": "passed"
});
formatter.before({
  "duration": 999178200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Testing error cases",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-error-cases;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on number page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter number: 45",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click submit number",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I see a message: Number is too small",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.i_am_on_number_page()"
});
formatter.result({
  "duration": 861264800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45",
      "offset": 16
    }
  ],
  "location": "SampleSteps.i_enter_number(int)"
});
formatter.result({
  "duration": 52783000,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 34613700,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Number_is_too_small()"
});
formatter.result({
  "duration": 16729200,
  "status": "passed"
});
formatter.after({
  "duration": 3084431100,
  "status": "passed"
});
formatter.before({
  "duration": 990029200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Testing correct numbers",
  "description": "",
  "id": "testing-error-cases-and-correct-number-case;testing-correct-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am on number page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter number: \"64\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click submit number",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I see a new message: \"Square root of 64 is 8.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.i_am_on_number_page()"
});
formatter.result({
  "duration": 868854800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "64",
      "offset": 17
    }
  ],
  "location": "SampleSteps.i_enter_number(String)"
});
formatter.result({
  "duration": 53301900,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 38490900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Square root of 64 is 8.00",
      "offset": 22
    }
  ],
  "location": "SampleSteps.i_see_a_new_message(String)"
});
formatter.result({
  "duration": 3376700,
  "status": "passed"
});
formatter.after({
  "duration": 3084453900,
  "status": "passed"
});
});