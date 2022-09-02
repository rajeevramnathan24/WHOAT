Feature:LXP002: Verify LXP user should be able to update his goals on LXP Delivery system
  
  Given As a registered LXP user
  When user tries to login into LXP system with valid credentials
  Then user should be able to set new goals and these goals should visible to the user after saving them

  @GoalUpdate @LXPregression
  Scenario Outline: To verify that Registered LXP User is able to update his goals
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    
    And verify if base language is correctly set to english language
    When User clicks on Settings tab on left menu
    And clicks on edit goals button to update the goals
    Then new goals should get updated and can be verified by the user
    When clicks on edit goals button to revert back the goals
    Then old goals should be reverted back and visible to the user
   
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      | LXP User Name    | LXP Password |
      | whoatestautomation@yopmail.com | Demo@123     | 
      
      
      
