Feature: Login


  Scenario : Successful login with valid credentials

    Given user launch Chrome Browser
    When user opens URL "https://www.bbc.co.uk"
    And user clicks Sign in button
    And User enters email as "himalayameenaqa@gmail.com" and Password as "Test123!"
    And click on Sign in
    Then page title should be "Welcome to the BBC"


   Scenario: Verify comment section is not available in the news feed

    Given User on Home page
     And user is able to view news headlines
     When user open a news feed
    Then verify Comment box is disabled


     Scenario: Verify comment section is available in the news feed

       Given User on Home page
       And user is able to view news headlines
       When user open a news feed
       Then verify Comment box is enabled