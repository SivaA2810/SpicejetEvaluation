Feature: Testing trip planning functionality

Background:
    Given 	open the browser
    And 	goes to landing page

Scenario Outline: User Validates One-Way Trip Functionality

	Given the user clicks the One-Way Trip checkbox
	When the user enters data for the From field
	And the user enters data for the Destination field
	And the user selects a departure date and time
	And the user enters passenger details
	And the user selects the desired currency type
	And the user selects the Discount radio button
	And the user clicks the Search Flights button
	Then the system should display relevant flight options for the given criteria
	When the user clicks the Continue button
	Then the user should be redirected to the passenger details page
	When the user selects the title for the contact person
	And enters the contact details "<firstname>" "<lastname>" "<phonenumber>" "<emailaddress>"
	And selects the country and enters the city
	And adds passenger details for each traveler
	And user enters first passanger details  "<fpfirstname>" "<fplastname>" "<fpphno>" "<fpemail>"
	And user enters second passanger details "<spfirstname>" "<splastname>" "<spphno>" 
	And user enters third passanger details "<tpfirstname>" "<tplastname>" "<tpphno>" 
	And user clicks contine button
	And user handles offers alert 
	And user enters debit card number
	And user enters card holder name 
	And user enters debit card valid month and year
	And user enters ccv number 
	And user clicks proceed to pay button
	
 Examples:
 | firstname |lastname| phonenumber | emailaddress        |fpfirstname|fplastname|   fpphno  |         fpemail        |spfirstname|	splastname|spphno  |tpfirstname|tplastname|tpphno|
 | Sivakumar |   A    | 8015648353  | sivadot07@gmail.com |Sivakumar  |     A    |80157648363|  sivadot2810@gmail.com |Karthick  |     A    |9698769644|  iniyalini |     S   | 80676765 |
 

 


   
     


