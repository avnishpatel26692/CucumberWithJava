$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample2.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 2",
  "description": "Test of writing and executing a scenario",
  "id": "introduction-to-cucumber-part-2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1346115900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Simple scenario 3 - Check Age page functionality",
  "description": "",
  "id": "introduction-to-cucumber-part-2;simple-scenario-3---check-age-page-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@AgeScenario"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enters name : \"Egils\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enters age : \"27\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User receives Hello message",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps.user_navigates_to_Age_page()"
});
formatter.result({
  "duration": 871226100,
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
  "duration": 69597800,
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
  "duration": 33923600,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 79723900,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.user_receives_Hello_message()"
});
formatter.result({
  "duration": 17457100,
  "status": "passed"
});
formatter.after({
  "duration": 3081919900,
  "status": "passed"
});
});