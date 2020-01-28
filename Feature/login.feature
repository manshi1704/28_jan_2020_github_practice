Feature: Login action

Scenario: Successful Login with credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then message displayed Login Successfully
	
Scenario: Successful Logout
     When user Logout from the Application
     Then Message displayed Logout Successfully
	
	