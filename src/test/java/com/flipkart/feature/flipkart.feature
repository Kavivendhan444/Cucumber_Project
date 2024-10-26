Feature: To check the elements of Flipkart webpage
Scenario: To enter the flipkart e-commerce webpage
    Given Enter the url of flipkart webpage
    When User enter the flipkart webpage using url
    Then User entered the flipkart webpage
    
Scenario: To check the login button
    When User clicks the login button in home page
    Then User enter the login webpage
    
Scenario: To check the create new account link and phone number field
    When User clicks the create new account url
    	And User enters the phone number in the phone number field
    Then The number entered in the given count

Scenario: To check the dropdown elements in the top bar
    When User move to the element electronics
    	And User clicks the mobiles link
    	And User enters the Mobiles webpage
    	And User navigate back to the Create new account page
    Then something should be asserted