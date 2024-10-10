Feature: login functionality
I want to use this for my feature file

Scenario: check login is successful with valid credentials
Given user is on login page
When user enter username and password
And click login button
Then user is navigated to the home page