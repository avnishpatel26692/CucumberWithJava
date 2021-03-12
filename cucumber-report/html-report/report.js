$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample4.feature");
formatter.feature({
  "line": 1,
  "name": "Data Table Examples",
  "description": "",
  "id": "data-table-examples",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1330951799,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "a new scenario with 1-row table",
  "description": "",
  "id": "data-table-examples;a-new-scenario-with-1-row-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on action page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I clicked on checkboxes:",
  "rows": [
    {
      "cells": [
        "Option 1"
      ],
      "line": 6
    },
    {
      "cells": [
        "Option 3"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click the result checkbox button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "message for checkboxes \"You selected value(s): Option 1, Option 3\" is seen",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample4Steps.i_am_on_action_page()"
});
formatter.result({
  "duration": 866885600,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_clicked_on_checkboxes(String\u003e)"
});
formatter.result({
  "duration": 83586500,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_click_the_result_checkbox_button()"
});
formatter.result({
  "duration": 30952701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You selected value(s): Option 1, Option 3",
      "offset": 24
    }
  ],
  "location": "Sample4Steps.message_for_checkboxes_is_seen(String)"
});
formatter.result({
  "duration": 21212699,
  "status": "passed"
});
formatter.after({
  "duration": 3118358501,
  "status": "passed"
});
formatter.before({
  "duration": 1017392701,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "a new scenario with 1-row table",
  "description": "",
  "id": "data-table-examples;a-new-scenario-with-1-row-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on action page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I clicked on checkboxes:",
  "rows": [
    {
      "cells": [
        "Option 2"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click the result checkbox button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "message for checkboxes \"You selected value(s): Option 2\" is seen",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample4Steps.i_am_on_action_page()"
});
formatter.result({
  "duration": 875542099,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_clicked_on_checkboxes(String\u003e)"
});
formatter.result({
  "duration": 45253200,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_click_the_result_checkbox_button()"
});
formatter.result({
  "duration": 37697400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You selected value(s): Option 2",
      "offset": 24
    }
  ],
  "location": "Sample4Steps.message_for_checkboxes_is_seen(String)"
});
formatter.result({
  "duration": 19676300,
  "status": "passed"
});
formatter.after({
  "duration": 3089347801,
  "status": "passed"
});
formatter.before({
  "duration": 989110900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "a new scenario with 1-row table",
  "description": "",
  "id": "data-table-examples;a-new-scenario-with-1-row-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on action page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I clicked on checkboxes:",
  "rows": [
    {
      "cells": [
        "Option 1"
      ],
      "line": 22
    },
    {
      "cells": [
        "Option 2"
      ],
      "line": 23
    },
    {
      "cells": [
        "Option 3"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I click the result checkbox button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "message for checkboxes \"You selected value(s): Option 1, Option 2, Option 3\" is seen",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample4Steps.i_am_on_action_page()"
});
formatter.result({
  "duration": 879823600,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_clicked_on_checkboxes(String\u003e)"
});
formatter.result({
  "duration": 113780599,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.i_click_the_result_checkbox_button()"
});
formatter.result({
  "duration": 27933000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You selected value(s): Option 1, Option 2, Option 3",
      "offset": 24
    }
  ],
  "location": "Sample4Steps.message_for_checkboxes_is_seen(String)"
});
formatter.result({
  "duration": 18263199,
  "status": "passed"
});
formatter.after({
  "duration": 3092085800,
  "status": "passed"
});
});