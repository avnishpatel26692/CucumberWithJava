$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/5.feature");
formatter.feature({
  "line": 1,
  "name": "Two Column Data Table",
  "description": "",
  "id": "two-column-data-table",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2888628600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sample5"
    },
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter details",
  "rows": [
    {
      "cells": [
        "name",
        "Ann"
      ],
      "line": 7
    },
    {
      "cells": [
        "age",
        "5"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see message : \"Hello, Ann, you are a kid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps5.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 986529900,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps5.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 396951800,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.click_on_Submit_button()"
});
formatter.result({
  "duration": 219954700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Ann, you are a kid",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_see_message(String)"
});
formatter.result({
  "duration": 57136000,
  "status": "passed"
});
formatter.after({
  "duration": 3260437100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sample5"
    },
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter details",
  "rows": [
    {
      "cells": [
        "name",
        "\u003cname\u003e"
      ],
      "line": 15
    },
    {
      "cells": [
        "age",
        "\u003cage\u003e"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see message : \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid;",
  "rows": [
    {
      "cells": [
        "name",
        "age",
        "message"
      ],
      "line": 20,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;1"
    },
    {
      "cells": [
        "ABC",
        "29",
        "Hello, ABC, you are an adult"
      ],
      "line": 21,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;2"
    },
    {
      "cells": [
        "Ann",
        "5",
        "Hello, Ann, you are a kid"
      ],
      "line": 22,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;3"
    },
    {
      "cells": [
        "Robin",
        "15",
        "Hello, Robin, you are a teenager"
      ],
      "line": 23,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;4"
    },
    {
      "cells": [
        "Sam",
        "15",
        "Hello, Robin, you are a Kid"
      ],
      "line": 24,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1457966200,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sample5"
    },
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter details",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "name",
        "ABC"
      ],
      "line": 15
    },
    {
      "cells": [
        "age",
        "29"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see message : \"Hello, ABC, you are an adult\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps5.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1044583000,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps5.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 333339800,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.click_on_Submit_button()"
});
formatter.result({
  "duration": 185857000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, ABC, you are an adult",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_see_message(String)"
});
formatter.result({
  "duration": 48977800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cHello, A[nn, you are a kid]\u003e but was:\u003cHello, A[BC, you are an adult]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.SampleSteps.user_see_message(SampleSteps.java:90)\r\n\tat ✽.Then User see message : \"Hello, ABC, you are an adult\"(src/test/resources/features/5.feature:18)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/examples/age_2.html?name\u003dABC\u0026age\u003d29");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3652838500,
  "status": "passed"
});
formatter.before({
  "duration": 1470330100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sample5"
    },
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter details",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "name",
        "Ann"
      ],
      "line": 15
    },
    {
      "cells": [
        "age",
        "5"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see message : \"Hello, Ann, you are a kid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps5.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 965504200,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps5.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 403083100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.click_on_Submit_button()"
});
formatter.result({
  "duration": 230264600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Ann, you are a kid",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_see_message(String)"
});
formatter.result({
  "duration": 59123000,
  "status": "passed"
});
formatter.after({
  "duration": 3289507500,
  "status": "passed"
});
formatter.before({
  "duration": 1538422200,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sample5"
    },
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter details",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "name",
        "Robin"
      ],
      "line": 15
    },
    {
      "cells": [
        "age",
        "15"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see message : \"Hello, Robin, you are a teenager\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps5.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1074523300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps5.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 377640100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.click_on_Submit_button()"
});
formatter.result({
  "duration": 203563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Robin, you are a teenager",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_see_message(String)"
});
formatter.result({
  "duration": 57576500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cHello, [Ann, you are a kid]\u003e but was:\u003cHello, [Robin, you are a teenager]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.SampleSteps.user_see_message(SampleSteps.java:90)\r\n\tat ✽.Then User see message : \"Hello, Robin, you are a teenager\"(src/test/resources/features/5.feature:18)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/examples/age_2.html?name\u003dRobin\u0026age\u003d15");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3603013100,
  "status": "passed"
});
formatter.before({
  "duration": 1485876800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Check Age page functionality for Kid",
  "description": "",
  "id": "two-column-data-table;check-age-page-functionality-for-kid;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@Sample5"
    },
    {
      "line": 11,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User navigates to Age Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User enter details",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "name",
        "Sam"
      ],
      "line": 15
    },
    {
      "cells": [
        "age",
        "15"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see message : \"Hello, Robin, you are a Kid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleSteps5.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 1095073700,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps5.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 311252300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.click_on_Submit_button()"
});
formatter.result({
  "duration": 190022100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Robin, you are a Kid",
      "offset": 20
    }
  ],
  "location": "SampleSteps.user_see_message(String)"
});
formatter.result({
  "duration": 46043000,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cHello, [Ann, you are a kid]\u003e but was:\u003cHello, [Sam, you are a teenager]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.SampleSteps.user_see_message(SampleSteps.java:90)\r\n\tat ✽.Then User see message : \"Hello, Robin, you are a Kid\"(src/test/resources/features/5.feature:18)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/examples/age_2.html?name\u003dSam\u0026age\u003d15");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 3646245300,
  "status": "passed"
});
});