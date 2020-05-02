Feature: MEN Menu Option 

@Regression
Scenario: User will be ble to browse and select product of his choice 

	Given Myntra site is launched 
	When  Customer explore the MEN menu option 
	And   Customer should be able to choose T-Shirt 
	And   Choose the brand of his choice 
	And user able tp click price 
	And user select L size t shirt 
	#And   User able add the item in the wishlist
	And   Customer will be bale to choose the size
	Then  Product will be added to Bag 
	
 