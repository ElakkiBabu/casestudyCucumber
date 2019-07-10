Feature: TestMe app 
Scenario: Registration
Given url for TestMe app is "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When user enters "Sridevishnu" as username
And user enters "Sridevi" as Firstname
And user enters "vishnuga" as Lastname
And user enters "sri123" as Password
And user enters "sri123" as ConfirmPassword
And user clicks on "Female" in gender
And user enters "sridevi@email.com" as Email
And user enters "9876476589" as MobileNumber
And user enters "18/3/1997" as DOB
And user enters "34/A xxxxxyyyyyzz" as address
And user selects "what is your Birth place?" as Securityquestion
And user enters "coimbatore" as Answer
Then user registered successfully