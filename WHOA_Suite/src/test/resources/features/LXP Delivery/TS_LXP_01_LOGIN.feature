Feature:LXP001: Verify Login and logout feature in LXP Delivery system by registered user

Given As a registered LXP user
  When logged in to LXP system with valid credentials
  And while creating a new course and configuring it 
  Then user should be able to succefully login and home page should be displayed to the user

   @LXPLoginLogout @LXPregression
  Scenario Outline: To verify that Registered User is able to successfully login into LXP Learner web page
    Given User has Launched LXP Learner web application
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<User Name>" and password as "<Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: #Below is test data that will be used
      | User Name        | Password |
      | whoatestautomation@yopmail.com | Demo@123 |
