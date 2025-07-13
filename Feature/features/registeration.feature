Feature: Aims registration application

  Scenario: Create Registration Application with No option
    Given I enter AIMS url in the browser for registration
    When I enter user name and passsword for registration
    When I click on the login button for registration
    And User clicked on Applicaions
    And User clicked on View Application Forms
    And user click on Registration Application
    When User clicked on Launch or edit Application
    Then User clicked  registration instructions
    When User click on personal information 
    And User enter the details and click on save button 
    And User enter the security questions details and click on save button 
    And User enter the Date_and_place_of_birth details and click on save button 
    And User enter the emails address details and click on save  button
    And user enter the phone numbers and click on save button 
    And user enter the mailing address details  and click on save button 
    When user click on SSN
    And user enter the ssn no and click on checkboxes
    
    
