$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Scenario/scenario1.feature");
formatter.feature({
  "name": "TestMe app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "url for TestMe app is \"http://10.232.237.143:443/TestMeApp/RegisterUser.htm\"",
  "keyword": "Given "
});
formatter.match({
  "location": "scenario1.url_for_TestMe_app_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Sridevishnu\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "scenario1.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Sridevi\" as Firstname",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_Firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"vishnuga\" as Lastname",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_Lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"sri123\" as Password",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"sri123\" as ConfirmPassword",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_ConfirmPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"Female\" in gender",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_clicks_on_in_gender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"sridevi@email.com\" as Email",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"9876476589\" as MobileNumber",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_MobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"18/3/1997\" as DOB",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_DOB(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"34/A xxxxxyyyyyzz\" as address",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"what is your Birth place?\" as Securityquestion",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_selects_as_Securityquestion(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"coimbatore\" as Answer",
  "keyword": "And "
});
formatter.match({
  "location": "scenario1.user_enters_as_Answer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "scenario1.user_registered_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Scenario/scenario2.feature");
formatter.feature({
  "name": "TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url is given as \"http://10.232.237.143:443/TestMeApp/login.htm\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "user is in homepage",
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
        "sridevishnu",
        "sri123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url is given as \"http://10.232.237.143:443/TestMeApp/login.htm\"",
  "keyword": "Given "
});
formatter.match({
  "location": "scenario2.url_is_given_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"sridevishnu\"",
  "keyword": "When "
});
formatter.match({
  "location": "scenario2.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"sri123\"",
  "keyword": "And "
});
formatter.match({
  "location": "scenario2.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "scenario2.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "scenario2.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
});