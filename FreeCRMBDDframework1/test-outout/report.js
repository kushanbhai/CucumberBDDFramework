$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Kushan/eclipse-workspace/FreeCRMBDDframework1/src/main/java/Features/tagging.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTestTag"
    }
  ]
});
formatter.scenario({
  "line": 50,
  "name": "Application close",
  "description": "",
  "id": "free-crm-application-testing;application-close",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "This is a close browser test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingSteps.this_is_a_close_browser_test()"
});
formatter.result({
  "duration": 208360500,
  "status": "passed"
});
});