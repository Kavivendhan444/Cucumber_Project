Feature: To book a room in adactin webpage
@smoketest
Scenario: To login into the adactin webpage 
    Given User launch the adactin webpage
    When User enter the username in username field
    And User enter the password in password field
    Then User clicks the login button and User logged into the adactin webpage
    
#Scenario: Search a hotel using below options
    #When User Select the required location in the Location dropdown field
    #	And User Select the required hotels in the Hotel dropdown field
#		And User Select the required roomtype in the RoomType dropdown field
#		And User Select the required Number of rooms in the Number of Rooms dropdown field
#		And User Enter the required date to check-in in the Check In Date field
#		And User Enter the requird date to check-out in the Check Out Date field
#		And User Select the requird number of adults in the Adults per Room dropdown field
#		And User Select the requird number of children in the Children per Room dropdown     
    #Then User Click the search button and user moved to the next page
    #
#Scenario: Verify and select the entered data with room price
    #When User verify the given data
    #	And User select the radio button to proceed
    #Then User click the continue button and moved to the next page
    #
#Scenario: To enter the personal details of the user
    #When User enter the first name in the First Name field
    #	And User 
    #	And
    #	And
    #	And
    #	And
    #	And
    #	And
    #	And
    #	
    #Then something should be asserted
