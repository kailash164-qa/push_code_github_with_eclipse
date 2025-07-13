#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario: Login with InValid Credential
    Given user luch the browser 
    And hit the "https://digitalstore:T@pestry194!@development1-vipb2b-ca.coachoutlet.com/" 
    When user enter the inValidEmail address 
    And click on continue button
    And capture the error message
    Then I validate the error messgae
    And quite browser

