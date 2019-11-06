@FunctionalTestTag
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test
@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test
@SmokeTest
Scenario: Create a contact
Given This is a contact test case
@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case
@RegressionTest
Scenario: Create a contact
Given This is a contact test case
@SmokeTest
Scenario: Create a task
Given This is a task test case
@SmokeTest
Scenario: Verify left panel links
Given Clicking on left panel links
@SmokeTest
Scenario: search a deal
Given This is a search deal test
@SmokeTest @RegressionTest
Scenario: search a task
Given This is a search task test
@SmokeTest @End2Endtest
Scenario: search a call
Given This is a search call test
@SmokeTest @End2Endtest
Scenario: search an email
Given This is a search email test
@SmokeTest @End2Endtest
Scenario: search a docs
Given This is a search docs test
@SmokeTest @End2Endtest
Scenario: search a forms
Given This is a search forms test
@End2Endtest
Scenario: validate a report
Given This is a report test
@End2Endtest
Scenario: Application logout
Given This is a logout test

Scenario: Application close
Given This is a close browser test