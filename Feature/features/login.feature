
Feature: Login Action
    Description: This feature will test a LogIn and LogOut functionality
    
  Background: User is Logged In
	Given I navigate to the login page
	When I submit username and password
	Then I should be logged in 

  Scenario: Successful login 
    Given user launch the browser 
    And   user enter the url "" hit the enter button 
    When user  enters valid credentials like "" as username  "" as password
    And user click on Login button
    Then user is navigated to Home Page
    
    
    
    
    Scenario Outline: Title of your scenario outline 
     Given user launch the browser 
    And   user enter the url "" hit the enter button 
    When user  enters valid credentials like "<username>" as username  "<password>" as password
    And user click on login button 
    Then user is navigating to  home page 
    
    
    
     Examples:
    |username|password|
    |"someshbangad6@gmail.com"|"Test12345"|
    |"Admin"|"admin12"|

    
   