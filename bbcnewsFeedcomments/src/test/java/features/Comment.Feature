Feature: Login


  Scenario : Successful login with valid credentials

    Given user launch Chrome Browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard"
    When User Clicks on Logout link
    Then page title should be "Admin area demo"
    And Close the browser
