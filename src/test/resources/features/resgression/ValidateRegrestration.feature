 Feature: To validate registration functionality
 
 @reg
 Scenario: To validate registration functionality using valid data
 
Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks using xpath "//a[text()='New User Register Here']" 
Then user verifies title to be "Adactin.com - New User Registration"
When user enters text "bhagi12" in textbox using xpath "//input[@name='username']"
And user enters text "bhagi123" in textbox using xpath "//input[@name='password']"
And user enters text "bhagi123" in textbox using xpath "//input[@name='re_password']"
And user enters text "bhagi naik" in textbox using xpath "//input[@name='full_name']"
And user enters text "bhagi123@gamil.com" in textbox using xpath "//input[@name='email_add']" 
And user enters text "india" in textbox using xpath "//input[@name='captcha']"
 
 
 
 
 
 
 
 
 
 
 
 
 