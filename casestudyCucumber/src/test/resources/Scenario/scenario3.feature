Feature: Testme casestudy
Scenario: search engine
Given Alex enters url as "http://10.232.237.143:443/TestMeApp/login.htm"
When Alex enters username in userfield as "lalitha"
And Alex enters Password in password field as "password123"
And Alex clicks on Login button
And Alex enters "head" in search field
And Alex clicks on find details button
And Alex clicks on addcart button 
And Alex clicks on cart 
And Alex clicks on checkout button
And Alex clicks on proceed to pay button
And Alex enters into payment gateway clicks on Andhra bank
And Alex enters username as "123456"
And Alex enters password as "Pass@456"
And Alex clicks on paymentLogin button
And Alex enters Transaction password as "Trans@456"
And Alex clicks on paynow button
Then Alex enters into order details page
