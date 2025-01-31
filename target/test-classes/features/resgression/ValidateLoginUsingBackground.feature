Feature: To validate login functionality


Background: to start the browser and launch app
Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"

Scenario: To validate using login credentials

When user enters text "Bhargavnaik" in textbox using xpath "//input[@name='username']"
And user enters text "bhargav@123" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Search Hotel"

Scenario: To validate using valid and invalid login credentials

When user enters text "Bhargavnaik" in textbox using xpath "//input[@name='username']"
And user enters text "bhargav@1233" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"


Scenario: To validate using invalid and valid login credentials

When user enters text "Bhargavnaik1" in textbox using xpath "//input[@name='username']"
And user enters text "bhargav@123" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"


Scenario: To validate using invalid and invalid login credentials

When user enters text "Bhargavnaik1" in textbox using xpath "//input[@name='username']"
And user enters text "bhargav@1233" in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be "Adactin.com - Hotel Reservation System"



































