Feature: testing signup functionalaties

Background:
    Given 	open the browser
    And 	goes to landing page
    
@positive 
Scenario: User validates positive signup
    Given the user clicks the signup button
    When the user selects title
    And the user enters a valid first name
    And the user enters a valid last name
    And the user selects their country
    And the user enters their date of birth
    And the user enters their phone number
    And the user enters their email address
    And the user enters a valid password
    And the user confirms the password
    And the user agrees to terms and conditions
    And the user clicks the submit button
   
  
 @negative 	 
 Scenario Outline: user validate negative signup
 	Given the user clicks the signup button
    When the user selects title
    And the user enters a valid first name
    And the user enters a valid last name
    And the user selects their country
    And the user enters their date of birth
    And the user enters their phone number
    Then the user enters invalid "<email>"
 	And user enters invalid "<password>"
 	And the user confirms the password
    And the user agrees to terms and conditions
    And the user clicks the submit button
 	
 	
 	
 	Examples:
 	|email|password|
 	|sivadotgmail@com|Adse9566@|
 	|sivadot2810gmail.com|Adse9566@|
 	|sivadot @gmail.com|Adse9566@|
 	|sivadot2810@gmail.com|Adse9566@|