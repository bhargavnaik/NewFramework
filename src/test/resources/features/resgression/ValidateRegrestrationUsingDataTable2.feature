 Feature: To validate registration functionality
 
 @reg
 Scenario: To validate registration functionality using valid data
 
Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks using xpath "//a[text()='New User Register Here']" 
Then user verifies title to be "Adactin.com - New User Registration"
When user enters details in registration form2
|username|password|confirm password|full name|email|captcha|
|bhagi|bhagi123|bhagi123|bhagi naik|bhagi123@gmail.com|india|
 
 
 
 
 
 
 
 
 
 
 
 
 