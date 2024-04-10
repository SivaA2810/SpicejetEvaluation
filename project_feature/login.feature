Feature: testingLogin Functionalities:

Background:
    Given 	open the browser
    And 	goes to landing page

@loginusingemail
Scenario Outline: Successfull login with valid credentials
    Given user click login button
   	When try login with "<email>" "<password>"
    Then click submit button
    And take screen shot and probe the result
    
 Examples:
 |email|password| 
 |sivadot2810@gmail.com|Adse9566@|  
    
@negative
Scenario Outline: Attempt login with invalid credentials
    Given user clicks on the login button
    When user tries to login with invalid credentials "<mobileNo>" "<password>"
    And user clicks the submit button
    Then a screenshot is taken

    Examples:
    | mobileNo       | password    |
    | 8015648363AS   | Adse9566@   |
    | 8015648363@#   | Adse9566@   |
    | 8015648364     | Adse9566@   |
    
@positive
Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the submit button
    Then takes screenshot when is passed
   