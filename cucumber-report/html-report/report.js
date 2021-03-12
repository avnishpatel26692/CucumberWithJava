$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample5.feature");
formatter.feature({
  "line": 1,
  "name": "Two Column Data Table",
  "description": "",
  "id": "two-column-data-table",
  "keyword": "Feature"
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
        "16",
        "Hello, Robin, you are a teenager"
      ],
      "line": 23,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;4"
    },
    {
      "cells": [
        "Sam",
        "7",
        "Hello, Sam, you are a kid"
      ],
      "line": 24,
      "id": "two-column-data-table;check-age-page-functionality-for-kid;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1340204500,
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
  "location": "Sample5Steps.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 851150900,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 119302500,
  "status": "passed"
});
formatter.match({
  "location": "Sample5Steps.click_on_Submit_button()"
});
formatter.result({
  "duration": 75791600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, ABC, you are an adult",
      "offset": 20
    }
  ],
  "location": "Sample5Steps.user_see_message(String)"
});
formatter.result({
  "duration": 17200300,
  "status": "passed"
});
formatter.after({
  "duration": 3274768300,
  "status": "passed"
});
formatter.before({
  "duration": 1010145500,
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
  "location": "Sample5Steps.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 887826500,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 122005400,
  "status": "passed"
});
formatter.match({
  "location": "Sample5Steps.click_on_Submit_button()"
});
formatter.result({
  "duration": 79867300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Ann, you are a kid",
      "offset": 20
    }
  ],
  "location": "Sample5Steps.user_see_message(String)"
});
formatter.result({
  "duration": 16160300,
  "status": "passed"
});
formatter.after({
  "duration": 3090140200,
  "status": "passed"
});
formatter.before({
  "duration": 994526200,
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
        "16"
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
  "location": "Sample5Steps.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 867951100,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 116709800,
  "status": "passed"
});
formatter.match({
  "location": "Sample5Steps.click_on_Submit_button()"
});
formatter.result({
  "duration": 72280600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Robin, you are a teenager",
      "offset": 20
    }
  ],
  "location": "Sample5Steps.user_see_message(String)"
});
formatter.result({
  "duration": 16350700,
  "status": "passed"
});
formatter.after({
  "duration": 3093330700,
  "status": "passed"
});
formatter.before({
  "duration": 991929100,
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
        "7"
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
  "name": "User see message : \"Hello, Sam, you are a kid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Sample5Steps.user_navigates_to_Age_Page()"
});
formatter.result({
  "duration": 863179100,
  "status": "passed"
});
formatter.match({
  "location": "Sample4Steps.user_enter_details(String,String\u003e)"
});
formatter.result({
  "duration": 113610600,
  "status": "passed"
});
formatter.match({
  "location": "Sample5Steps.click_on_Submit_button()"
});
formatter.result({
  "duration": 75679500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Sam, you are a kid",
      "offset": 20
    }
  ],
  "location": "Sample5Steps.user_see_message(String)"
});
formatter.result({
  "duration": 15079500,
  "status": "passed"
});
formatter.after({
  "duration": 3081198200,
  "status": "passed"
});
});