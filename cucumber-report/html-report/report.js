$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample3.feature");
formatter.feature({
  "line": 1,
  "name": "Using Examples",
  "description": "",
  "id": "using-examples",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "checking Age functionality using examples",
  "description": "",
  "id": "using-examples;checking-age-functionality-using-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter name : \"\u003cname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter age : \"\u003cage\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User see message : \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "using-examples;checking-age-functionality-using-examples;",
  "rows": [
    {
      "cells": [
        "name",
        "age",
        "message"
      ],
      "line": 10,
      "id": "using-examples;checking-age-functionality-using-examples;;1"
    },
    {
      "cells": [
        "Nancy",
        "26",
        "Hello, Nancy, you are an adult"
      ],
      "line": 11,
      "id": "using-examples;checking-age-functionality-using-examples;;2"
    },
    {
      "cells": [
        "Robin",
        "5",
        "Hello, Robin, you are a kid"
      ],
      "line": 12,
      "id": "using-examples;checking-age-functionality-using-examples;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2522724200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "checking Age functionality using examples",
  "description": "",
  "id": "using-examples;checking-age-functionality-using-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter name : \"Nancy\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter age : \"26\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User see message : \"Hello, Nancy, you are an adult\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps2.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1560724800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nancy",
      "offset": 19
    }
  ],
  "location": "SampleSteps2.user_enter_name(String)"
});
formatter.result({
  "duration": 214004800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26",
      "offset": 18
    }
  ],
  "location": "SampleSteps2.userEnterAge(String)"
});
formatter.result({
  "duration": 97293400,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps2.click_on_Submit_button()"
});
formatter.result({
  "duration": 223692800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Nancy, you are an adult",
      "offset": 20
    }
  ],
  "location": "SampleSteps2.user_see_message(String)"
});
formatter.result({
  "duration": 50057600,
  "status": "passed"
});
formatter.after({
  "duration": 3322176500,
  "status": "passed"
});
formatter.before({
  "duration": 1643703300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "checking Age functionality using examples",
  "description": "",
  "id": "using-examples;checking-age-functionality-using-examples;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter name : \"Robin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter age : \"5\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User see message : \"Hello, Robin, you are a kid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps2.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1689485200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Robin",
      "offset": 19
    }
  ],
  "location": "SampleSteps2.user_enter_name(String)"
});
formatter.result({
  "duration": 178576000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 18
    }
  ],
  "location": "SampleSteps2.userEnterAge(String)"
});
formatter.result({
  "duration": 94579800,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps2.click_on_Submit_button()"
});
formatter.result({
  "duration": 220751200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Robin, you are a kid",
      "offset": 20
    }
  ],
  "location": "SampleSteps2.user_see_message(String)"
});
formatter.result({
  "duration": 42346900,
  "status": "passed"
});
formatter.after({
  "duration": 3382227300,
  "status": "passed"
});
});