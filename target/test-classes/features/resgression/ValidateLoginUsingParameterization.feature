Feature: To validate login functionality

@regression
Scenario Outline: To validate login using different combinations of credentials

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks login button using xpath "//input[@name='login']"
Then user verifies title to be '<expected title>'

Examples:
| username   | password       | expected title |
|Bhargavnaik | bhargav@123 | Adactin.com - Search Hotel |
|Bhargavnaik | bhargav@124 | Adactin.com - Hotel Reservation System |
|Bhargavnaik1 | bhargav@123 | Adactin.com - Hotel Reservation System |
|Bhargavnaik1  |bhargav@1233 | Adactin.com - Hotel Reservation System |