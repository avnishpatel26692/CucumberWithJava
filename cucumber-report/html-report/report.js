$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample2.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 2",
  "description": "Test of writing and executing a scenario",
  "id": "introduction-to-cucumber-part-2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1340494900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Simple scenario 4 - Check Age page functionality2",
  "description": "",
  "id": "introduction-to-cucumber-part-2;simple-scenario-4---check-age-page-functionality2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@AgeScenario2"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User2 navigates to Age page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User2 enters name : \"Emils\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User2 enters age : \"7\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User2 clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User2 receives Hello message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 4
    }
  ],
  "location": "SampleSteps.user2_navigates_to_Age_page(int)"
});
formatter.result({
  "duration": 894823300,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinitions.SampleSteps.user2_navigates_to_Age_page(SampleSteps.java:97)\r\n\tat ✽.Given User2 navigates to Age page(src/test/resources/features/Sample2.feature:19)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Emils",
      "offset": 21
    }
  ],
  "location": "SampleSteps.user2_enters_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user2_enters_age(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.user2_clicks_on_Submit_button(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SampleSteps.user2_receives_Hello_message(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3104557900,
  "status": "passed"
});
});