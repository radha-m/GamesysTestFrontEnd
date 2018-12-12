@Login
Feature: Virgin Games Login

  @InValidLogin
  Scenario: Verify Virgin Games login with in valid credentials

    Given I have opened Virgin Games URL in browser
    And I navigates the user login
    When I enter invalid user credentials
    Then I should be presented with login failed error message

  @ValidLogin
  Scenario: Verify Virgin Games login with valid credentials

    Given I have opened Virgin Games URL in browser
    And I navigates the user login
    When I enter valid user credentials
    Then I should be successfully log in