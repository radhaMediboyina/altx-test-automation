Feature: This feature is to create login to ICapture Portal

  @LoginPage
  Scenario Outline:
    Given I visit the iCapture login screen
    When I enter username "<UserName>" on ICapture portal
    When I enter password "<Password>" on ICapture portal
    Then I click on login button

    Examples:
      | UserName | Password   |
      | 10039    | 9579360696 |