Feature:Login Feature
Scenario: Verify user is able to login with valid credentials
		Given A user is on ToolsQA login page
		When User clicks on MyAccount link
		Then User is taken to the Login Page
		When User enters valid username and password
		Then User is able to login successfully   