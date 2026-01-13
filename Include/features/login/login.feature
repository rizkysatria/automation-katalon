Feature: Login

Scenario: User login success with valid credentials
  When user see onboarding screen
  And user login with valid account
  Then user should be redirected to home screen
 