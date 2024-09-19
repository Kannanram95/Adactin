Feature: Login functionality of the Adactin Login Page

  #This feature file covers the scenario for logging into Adactin Application

  Scenario: Login with valid Username and Password in Login Page
    Given User launch the Adactin Login Page "https://adactinhotelapp.com"
    When User enter valid username "kannanram" and password "1447A7"
    And User click the login button
    Then User should be redirected to SearchHotel Page


  Scenario: To verify checkout date field accepts later date than checkin page
    Given User launch the Adactin Login Page "https://adactinhotelapp.com"
    When User enter valid username "kannanram" and password "1447A7"
    And User click the login button
    Then User should be redirected to SearchHotel Page
    And User select the location "Sydney"
    And User select the hotel "Hotel Creek"
    And User select the room type "Standard"
    And User select the no of rooms "1"
    And User enter the checkkin date seven days after today
    And User enter the checkout date seven days after today
    Then User should get the error message



