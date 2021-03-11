$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample3.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 3",
  "description": "Test of writing and executing a several scenarios",
  "id": "introduction-to-cucumber-part-3",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Check Age page functionality with multiple examples",
  "description": "",
  "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters name : \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters age : \u003cage\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User receives Hello message : \u003cmessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;",
  "rows": [
    {
      "cells": [
        "name",
        "age",
        "message"
      ],
      "line": 12,
      "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;1"
    },
    {
      "cells": [
        "\"Egils\"",
        "\"27\"",
        "\"Hello, Egils, you are a adult\""
      ],
      "line": 13,
      "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;2"
    },
    {
      "cells": [
        "\"Egils\"",
        "\"7\"",
        "\"Hello, Egils, you are a kid\""
      ],
      "line": 14,
      "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;3"
    },
    {
      "cells": [
        "\"Egils\"",
        "\"17\"",
        "\"Hello, Egils, you are a teenager\""
      ],
      "line": 15,
      "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1344382800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check Age page functionality with multiple examples",
  "description": "",
  "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters name : \"Egils\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters age : \"27\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User receives Hello message : \"Hello, Egils, you are a adult\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.user_navigates_to_Age_page()"
});
formatter.result({
  "duration": 886720800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Egils",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_enters_name(String)"
});
formatter.result({
  "duration": 76245900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "27",
      "offset": 19
    }
  ],
  "location": "SampleSteps.user_enters_age(String)"
});
formatter.result({
  "duration": 37104300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 84016300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Egils, you are a adult",
      "offset": 31
    }
  ],
  "location": "SampleSteps.user_receives_Hello_message(String)"
});
formatter.result({
  "duration": 19745800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...lo, Egils, you are a[] adult\u003e but was:\u003c...lo, Egils, you are a[n] adult\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.SampleSteps.user_receives_Hello_message(SampleSteps.java:125)\r\n\tat ✽.Then User receives Hello message : \"Hello, Egils, you are a adult\"(src/test/resources/features/Sample3.feature:10)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/examples/age_2.html?name\u003dEgils\u0026age\u003d27");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3384169000,
  "status": "passed"
});
formatter.before({
  "duration": 1013670800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check Age page functionality with multiple examples",
  "description": "",
  "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters name : \"Egils\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters age : \"7\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User receives Hello message : \"Hello, Egils, you are a kid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.user_navigates_to_Age_page()"
});
formatter.result({
  "duration": 910210100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Egils",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_enters_name(String)"
});
formatter.result({
  "duration": 73290500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 19
    }
  ],
  "location": "SampleSteps.user_enters_age(String)"
});
formatter.result({
  "duration": 34495000,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 84127400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Egils, you are a kid",
      "offset": 31
    }
  ],
  "location": "SampleSteps.user_receives_Hello_message(String)"
});
formatter.result({
  "duration": 16863600,
  "status": "passed"
});
formatter.after({
  "duration": 3102959500,
  "status": "passed"
});
formatter.before({
  "duration": 994175200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Check Age page functionality with multiple examples",
  "description": "",
  "id": "introduction-to-cucumber-part-3;check-age-page-functionality-with-multiple-examples;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters name : \"Egils\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters age : \"17\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User receives Hello message : \"Hello, Egils, you are a teenager\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.user_navigates_to_Age_page()"
});
formatter.result({
  "duration": 897105400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Egils",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_enters_name(String)"
});
formatter.result({
  "duration": 69420700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "17",
      "offset": 19
    }
  ],
  "location": "SampleSteps.user_enters_age(String)"
});
formatter.result({
  "duration": 35442900,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 87352800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Egils, you are a teenager",
      "offset": 31
    }
  ],
  "location": "SampleSteps.user_receives_Hello_message(String)"
});
formatter.result({
  "duration": 17166800,
  "status": "passed"
});
formatter.after({
  "duration": 3090387900,
  "status": "passed"
});
});