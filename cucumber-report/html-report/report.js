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
  "duration": 1349099000,
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
  "duration": 950379500,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_enter_number_dad()"
});
formatter.result({
  "duration": 57698400,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 31381800,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Please_enter_a_number()"
});
formatter.result({
  "duration": 17449900,
  "status": "passed"
});
formatter.after({
  "duration": 3090116100,
  "status": "passed"
});
formatter.before({
  "duration": 1002470800,
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
  "duration": 862903500,
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
  "duration": 55233100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 34327100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Number_is_too_big()"
});
formatter.result({
  "duration": 16758600,
  "status": "passed"
});
formatter.after({
  "duration": 3089865800,
  "status": "passed"
});
formatter.before({
  "duration": 991609200,
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
  "duration": 869983500,
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
  "duration": 50421100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_click_submit_number()"
});
formatter.result({
  "duration": 35518200,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.i_see_a_message_Number_is_too_small()"
});
formatter.result({
  "duration": 15869300,
  "status": "passed"
});
formatter.after({
  "duration": 3096888000,
  "status": "passed"
});
});