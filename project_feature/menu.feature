Feature: to validate checkin and flightstatus and manange booking fields 

Background:
    Given 	open the browser
    And 	goes to landing page

Scenario: to check checkin and flightstatus and manange booking fields and get appropriate attributes
    Given user in the home page
    When user clicks checkin button and get status
    Then user clicks flightstatus button and get status
    And user clicks manangebooking button and get status
    Then user clicks flights button and get the response
    