Feature: TestMeApp
Scenario Outline: Login scenario
Given url is given as "http://10.232.237.143:443/TestMeApp/login.htm"
When user enters username as "<username>"
And user enters password as "<password>"
And user clicks on login
Then user is in homepage

Examples:
|username|password|
|sridevishnu|sri123|