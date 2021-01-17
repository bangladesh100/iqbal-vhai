Feature: MEN Menu Option 

@Regression @smoke
Scenario: User will be able to browse and select product of his choice 

	Given Myntra site is launched 
	When  Customer explore the MEN menu option 
	And   Customer should be able to choose T-Shirt 
	And   Choose the brand of his choice 
	And user able tp click price 
	And user select L size t shirt 
	And   User able add the item in the wishlist
	
	Then  Product will be added to Bag 
	
 