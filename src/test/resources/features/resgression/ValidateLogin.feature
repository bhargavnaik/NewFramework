Feature: To validate login functionality

@smoke
Scenario: To validate using login credentials

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "Bhargavnaik" in textbox using xpath "//input[@name='username']"
And user enters text "bhargav@123" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Search Hotel"




