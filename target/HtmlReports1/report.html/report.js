$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Action",
  "description": "    Description: This feature will test a LogIn and LogOut functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User  enters valid credentials \u003cusername\u003e as username \u003cpassword\u003e as password",
  "keyword": "When "
});
formatter.step({
  "name": "user in on dashboard page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "\"Admin\"",
        "\"admin1234\""
      ]
    },
    {
      "cells": [
        "\"Admin\"",
        "\"admin12\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinination.LoginStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  enters valid credentials \"Admin\" as username \"admin1234\" as password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user in on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinination.LoginStepDefination.user_in_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Successful login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinination.LoginStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  enters valid credentials \"Admin\" as username \"admin12\" as password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user in on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinination.LoginStepDefination.user_in_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
});