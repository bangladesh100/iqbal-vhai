Feature: Myntra Login 


@smoke @regression 
Scenario: User will log in with correct email and password 

	Given  Browse to Myntra home page 
	When   enter current email address and password 
	#When enter the user phone number
	And    click Login button 
	Then   successfully login 
	
	#When  User able to click Men section 
	#And  User able to click T-Shirt
	
