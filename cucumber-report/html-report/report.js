$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample2.feature");
formatter.feature({
  "line": 1,
  "name": "As a Test Engineer I want to be able to create simple scenarios.",
  "description": "",
  "id": "as-a-test-engineer-i-want-to-be-able-to-create-simple-scenarios.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2807552500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to the Link Page",
  "description": "",
  "id": "as-a-test-engineer-i-want-to-be-able-to-create-simple-scenarios.;navigate-to-the-link-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LinkScenario"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to Link Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should verify the page is opened correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps2.user_navigates_to_Link_Page()"
});
formatter.result({
  "duration": 872592000,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps2.user_should_verify_the_page_is_opened_correctly()"
});
formatter.result({
  "duration": 11423999,
  "status": "passed"
});
formatter.after({
  "duration": 3380697001,
  "status": "passed"
});
formatter.before({
  "duration": 1565165600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check Age page functionality",
  "description": "",
  "id": "as-a-test-engineer-i-want-to-be-able-to-create-simple-scenarios.;check-age-page-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@AgePageScenario"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter name : \"Nancy\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter age : 29",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User see message : \"Hello, Nancy, you are an adult\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps2.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1893273700,
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
  "duration": 206716500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29",
      "offset": 17
    }
  ],
  "location": "SampleSteps2.userEnterAge(int)"
});
formatter.result({
  "duration": 112183400,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps2.click_on_Submit_button()"
});
formatter.result({
  "duration": 228653300,
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
  "duration": 59529300,
  "status": "passed"
});
formatter.after({
  "duration": 3296478400,
  "status": "passed"
});
});