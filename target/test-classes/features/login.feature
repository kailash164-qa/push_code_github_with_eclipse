
Feature: Login Action
    Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Successful login 
    Given User is on Home Page
    When User  enters valid credentials <username> as username <password> as password
    Then user in on dashboard page
    
     Examples:
    |username|password|
    |"Admin"|"admin1234"|
     |"Admin"|"admin12"|

    
   