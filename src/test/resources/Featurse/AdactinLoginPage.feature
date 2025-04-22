Feature: Validate The Login Page

Background:
Given Login Application

Scenario: Validation of LogIn Page With Valid Credentials
When User Enter Valid Login And Password
And User Click On Login Button 
Then User Navigate To Next Page

Scenario: Validation of login page with invalid credentials
When User Enter Invalid Login UserName and Password
And User Click On Login Button
Then Invalid Login Error Message Should Display