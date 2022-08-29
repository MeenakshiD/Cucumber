Feature: Test login functionality

@Verify
  Scenario: Verify user is able to view comment section
    Given browser is open
    And user is on Home page
    When user clicks on news feed
    And user clicks on comment button on top
    And user is navigated to the bottom of news
    And user clicks on view Comments button
    Then user is able to view comments

  @Sorting
  Scenario: Verify that user is able to sort comments

    Given user is on comment section
    When user can sort comments using show filter dropdown
    Then comments are fitered by selected option

