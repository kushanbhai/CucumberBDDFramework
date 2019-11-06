Feature: FREE CRM create contacts

Scenario Outline: Free CRM create a new contact scenario

Given user is already on login page
When title of login page is Free CRM
Then user enter "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contacts page
Then user enters contactdetails "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
	| username | password | firstname | lastname | position|
	|kushan  | airtel@123 | ravi	  | verma    | manager | 	
	|ishan12 | airtel@123 | suraj     | kumar    | engineer|