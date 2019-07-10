Feature: TestMe app4
Scenario: The one where the user moves to cart without adding any item in it
Given Alex has registered into testme app
When Alex search a particular product like headphones
And try to procced to payment without adding item in cart
Then Testme app doesn't display the cart icon