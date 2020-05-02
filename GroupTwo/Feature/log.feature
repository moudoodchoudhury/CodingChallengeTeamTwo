@LOgin
Feature: Log in to automationpractice application

Scenario: automationpractice log in
Given user can open browser
When user can launch the url "http://automationpractice.com/"
When user clicks on Signin button
And user enters email as "choudhury1507@gmail.com" and password as "md1979@#"
And user submit signin
And user varify the homepage title 

