$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Task2.feature");
formatter.feature({
  "line": 1,
  "name": "Testing task 2",
  "description": "",
  "id": "testing-task-2",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#https://kristinek.github.io/site/tasks/list_of_people"
    }
  ],
  "line": 5,
  "name": "add, edit, remove and reset",
  "description": "",
  "id": "testing-task-2;add,-edit,-remove-and-reset",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@debugs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Add person",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "fill all fields: \"\u003cname\u003e\", \"\u003csurname\u003e\", \"\u003cjob\u003e\", \"\u003cDataEnter\u003e\", \"\u003cselectedCheck\u003e\", \"\u003cgender\u003e\", \"\u003cstatus\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click button add",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on edit button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "edit something: \"\u003cname1\u003e\", \"\u003csurname1\u003e\", \"\u003cjob1\u003e\", \"\u003cDataEnter1\u003e\", \"\u003cselectedCheck1\u003e\", \"\u003cgender1\u003e\", \"\u003cstatus1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on edit-button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "remove a person",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "reset list",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "testing-task-2;add,-edit,-remove-and-reset;",
  "rows": [
    {
      "cells": [
        "name",
        "surname",
        "job",
        "DataEnter",
        "selectedCheck",
        "gender",
        "status",
        "name1",
        "surname1",
        "job1",
        "DataEnter1",
        "selectedCheck1",
        "gender1",
        "status1"
      ],
      "line": 16,
      "id": "testing-task-2;add,-edit,-remove-and-reset;;1"
    },
    {
      "cells": [
        "Dmitrijs",
        "Lvovs",
        "Quality Engineer",
        "01/05/1999",
        "english",
        "male",
        "Employee",
        "Sergej",
        "Orlov",
        "QA",
        "01/05/1999",
        "french",
        "male",
        "Intern"
      ],
      "line": 17,
      "id": "testing-task-2;add,-edit,-remove-and-reset;;2"
    },
    {
      "cells": [
        "Evgenij",
        "Orlov",
        "Quality Engineer",
        "01/05/1979",
        "english",
        "male",
        "Employee",
        "Evgenij",
        "Orlov",
        "GameDev",
        "01/05/1979",
        "spanish",
        "male",
        "Employee"
      ],
      "line": 18,
      "id": "testing-task-2;add,-edit,-remove-and-reset;;3"
    },
    {
      "cells": [
        "Ekaterina",
        "Velika",
        "Team manager",
        "04/07/2000",
        "french",
        "female",
        "Employee",
        "Ekaterina",
        "Velika",
        "Team manager",
        "04/07/2000",
        "french",
        "female",
        "Employee"
      ],
      "line": 19,
      "id": "testing-task-2;add,-edit,-remove-and-reset;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4420870900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "add, edit, remove and reset",
  "description": "",
  "id": "testing-task-2;add,-edit,-remove-and-reset;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@debugs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Add person",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "fill all fields: \"Dmitrijs\", \"Lvovs\", \"Quality Engineer\", \"01/05/1999\", \"english\", \"male\", \"Employee\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click button add",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on edit button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "edit something: \"Sergej\", \"Orlov\", \"QA\", \"01/05/1999\", \"french\", \"male\", \"Intern\"",
  "matchedColumns": [
    7,
    8,
    9,
    10,
    11,
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on edit-button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "remove a person",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2Steps.i_am_on_Employee_page()"
});
formatter.result({
  "duration": 1285339500,
  "status": "passed"
});
formatter.match({
  "location": "Task2Steps.click_on_Add_person()"
});
formatter.result({
  "duration": 740558400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dmitrijs",
      "offset": 18
    },
    {
      "val": "Lvovs",
      "offset": 30
    },
    {
      "val": "Quality Engineer",
      "offset": 39
    },
    {
      "val": "01/05/1999",
      "offset": 59
    },
    {
      "val": "english",
      "offset": 73
    },
    {
      "val": "male",
      "offset": 84
    },
    {
      "val": "Employee",
      "offset": 92
    }
  ],
  "location": "Task2Steps.fill_all_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1489081700,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput class\u003d\"w3-check\" type\u003d\"checkbox\" id\u003d\"english\" name\u003d\"language\" checked\u003d\"\"\u003e is not clickable at point (209, 629). Other element would receive the click: \u003cspan title\u003d\"...ursday\"\u003eTh\u003c/span\u003e\n  (Session info: chrome\u003d89.0.4389.82)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-PS83VCLO\u0027, ip: \u002710.125.32.121\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.82, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\Anna\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55178}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5d87f9b2bb5ef0a53acb2725629c5101\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepDefinitions.Task2Steps.fill_all_fields(Task2Steps.java:38)\r\n\tat ✽.And fill all fields: \"Dmitrijs\", \"Lvovs\", \"Quality Engineer\", \"01/05/1999\", \"english\", \"male\", \"Employee\"(src/test/resources/features/Task2.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Task2Steps.click_button_add()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sergej",
      "offset": 17
    },
    {
      "val": "Orlov",
      "offset": 27
    },
    {
      "val": "QA",
      "offset": 36
    },
    {
      "val": "01/05/1999",
      "offset": 42
    },
    {
      "val": "french",
      "offset": 56
    },
    {
      "val": "male",
      "offset": 66
    },
    {
      "val": "Intern",
      "offset": 74
    }
  ],
  "location": "Task2Steps.edit_something(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button2()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.remove_a_person()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.reset_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/tasks/enter_a_new_person.html");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3544972900,
  "status": "passed"
});
formatter.before({
  "duration": 1386122600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "add, edit, remove and reset",
  "description": "",
  "id": "testing-task-2;add,-edit,-remove-and-reset;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@debugs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Add person",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "fill all fields: \"Evgenij\", \"Orlov\", \"Quality Engineer\", \"01/05/1979\", \"english\", \"male\", \"Employee\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click button add",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on edit button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "edit something: \"Evgenij\", \"Orlov\", \"GameDev\", \"01/05/1979\", \"spanish\", \"male\", \"Employee\"",
  "matchedColumns": [
    7,
    8,
    9,
    10,
    11,
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on edit-button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "remove a person",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2Steps.i_am_on_Employee_page()"
});
formatter.result({
  "duration": 1305410000,
  "status": "passed"
});
formatter.match({
  "location": "Task2Steps.click_on_Add_person()"
});
formatter.result({
  "duration": 452270600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Evgenij",
      "offset": 18
    },
    {
      "val": "Orlov",
      "offset": 29
    },
    {
      "val": "Quality Engineer",
      "offset": 38
    },
    {
      "val": "01/05/1979",
      "offset": 58
    },
    {
      "val": "english",
      "offset": 72
    },
    {
      "val": "male",
      "offset": 83
    },
    {
      "val": "Employee",
      "offset": 91
    }
  ],
  "location": "Task2Steps.fill_all_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1479704500,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput class\u003d\"w3-check\" type\u003d\"checkbox\" id\u003d\"english\" name\u003d\"language\" checked\u003d\"\"\u003e is not clickable at point (209, 629). Other element would receive the click: \u003cspan title\u003d\"...ursday\"\u003eTh\u003c/span\u003e\n  (Session info: chrome\u003d89.0.4389.82)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-PS83VCLO\u0027, ip: \u002710.125.32.121\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.82, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\Anna\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55217}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9d9451c6d306f08c8eba39e7a9355896\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepDefinitions.Task2Steps.fill_all_fields(Task2Steps.java:38)\r\n\tat ✽.And fill all fields: \"Evgenij\", \"Orlov\", \"Quality Engineer\", \"01/05/1979\", \"english\", \"male\", \"Employee\"(src/test/resources/features/Task2.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Task2Steps.click_button_add()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Evgenij",
      "offset": 17
    },
    {
      "val": "Orlov",
      "offset": 28
    },
    {
      "val": "GameDev",
      "offset": 37
    },
    {
      "val": "01/05/1979",
      "offset": 48
    },
    {
      "val": "spanish",
      "offset": 62
    },
    {
      "val": "male",
      "offset": 73
    },
    {
      "val": "Employee",
      "offset": 81
    }
  ],
  "location": "Task2Steps.edit_something(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button2()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.remove_a_person()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.reset_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/tasks/enter_a_new_person.html");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3540573700,
  "status": "passed"
});
formatter.before({
  "duration": 1591280800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "add, edit, remove and reset",
  "description": "",
  "id": "testing-task-2;add,-edit,-remove-and-reset;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@debugs"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Add person",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "fill all fields: \"Ekaterina\", \"Velika\", \"Team manager\", \"04/07/2000\", \"french\", \"female\", \"Employee\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click button add",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on edit button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "edit something: \"Ekaterina\", \"Velika\", \"Team manager\", \"04/07/2000\", \"french\", \"female\", \"Employee\"",
  "matchedColumns": [
    7,
    8,
    9,
    10,
    11,
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on edit-button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "remove a person",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "reset list",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2Steps.i_am_on_Employee_page()"
});
formatter.result({
  "duration": 1463893100,
  "status": "passed"
});
formatter.match({
  "location": "Task2Steps.click_on_Add_person()"
});
formatter.result({
  "duration": 846073100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ekaterina",
      "offset": 18
    },
    {
      "val": "Velika",
      "offset": 31
    },
    {
      "val": "Team manager",
      "offset": 41
    },
    {
      "val": "04/07/2000",
      "offset": 57
    },
    {
      "val": "french",
      "offset": 71
    },
    {
      "val": "female",
      "offset": 81
    },
    {
      "val": "Employee",
      "offset": 91
    }
  ],
  "location": "Task2Steps.fill_all_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2114438400,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput class\u003d\"w3-check\" type\u003d\"checkbox\" id\u003d\"french\" name\u003d\"language\" required\u003d\"\"\u003e is not clickable at point (292, 629). Other element would receive the click: \u003cth scope\u003d\"col\" class\u003d\"ui-datepicker-week-end\"\u003e...\u003c/th\u003e\n  (Session info: chrome\u003d89.0.4389.82)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LAPTOP-PS83VCLO\u0027, ip: \u002710.125.32.121\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.82, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\Anna\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55256}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: bc7a7872ab966d26bbb347e14045dcf9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepDefinitions.Task2Steps.fill_all_fields(Task2Steps.java:38)\r\n\tat ✽.And fill all fields: \"Ekaterina\", \"Velika\", \"Team manager\", \"04/07/2000\", \"french\", \"female\", \"Employee\"(src/test/resources/features/Task2.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Task2Steps.click_button_add()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ekaterina",
      "offset": 17
    },
    {
      "val": "Velika",
      "offset": 30
    },
    {
      "val": "Team manager",
      "offset": 40
    },
    {
      "val": "04/07/2000",
      "offset": 56
    },
    {
      "val": "french",
      "offset": 70
    },
    {
      "val": "female",
      "offset": 80
    },
    {
      "val": "Employee",
      "offset": 90
    }
  ],
  "location": "Task2Steps.edit_something(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.click_on_edit_button2()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.remove_a_person()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.reset_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/tasks/enter_a_new_person.html");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 3882857300,
  "status": "passed"
});
formatter.before({
  "duration": 3927774100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "check how working clear button",
  "description": "",
  "id": "testing-task-2;check-how-working-clear-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@debugs"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I am on Employee page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "click on Add person",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "fill all fields: \"Ivan\", \"Kotcov\", \"Software developer\", \"02/09/1985\", \"spanish\", \"male\", \"Intern\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click clear-button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "check empty fields",
  "keyword": "Then "
});
formatter.match({
  "location": "Task2Steps.i_am_on_Employee_page()"
});
formatter.result({
  "duration": 1895000500,
  "status": "passed"
});
formatter.match({
  "location": "Task2Steps.click_on_Add_person()"
});
formatter.result({
  "duration": 730380900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ivan",
      "offset": 18
    },
    {
      "val": "Kotcov",
      "offset": 26
    },
    {
      "val": "Software developer",
      "offset": 36
    },
    {
      "val": "02/09/1985",
      "offset": 58
    },
    {
      "val": "spanish",
      "offset": 72
    },
    {
      "val": "male",
      "offset": 83
    },
    {
      "val": "Intern",
      "offset": 91
    }
  ],
  "location": "Task2Steps.fill_all_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1576748700,
  "error_message": "java.lang.UnsupportedOperationException: You may only deselect options of a multi-select\r\n\tat org.openqa.selenium.support.ui.Select.deselectByVisibleText(Select.java:294)\r\n\tat stepDefinitions.Task2Steps.fill_all_fields(Task2Steps.java:42)\r\n\tat ✽.And fill all fields: \"Ivan\", \"Kotcov\", \"Software developer\", \"02/09/1985\", \"spanish\", \"male\", \"Intern\"(src/test/resources/features/Task2.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Task2Steps.click_clear_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Task2Steps.check_empty_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/tasks/enter_a_new_person.html");
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 3571544900,
  "status": "passed"
});
});