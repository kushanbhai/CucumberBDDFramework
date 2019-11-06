Feature: Free CRM login feature
#without examples
#Scenario: Free CRM login test scenario
#
#Given user is already on login page
#When title of login page is FREE CRM
#Then user enters "kushan" and "airtel@123"
#Then user clicks on login button
#Then user is on the home page

#with examples keyword
Scenario Outline: Free CRM login test scenario

Given user is already on login page
When title of login page is FREE CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on the home page
Then user closes the browser

Examples: 
	|username| password  |
	|kushan  | airtel@123|
	|ishan12 | airtel@123|
	 
