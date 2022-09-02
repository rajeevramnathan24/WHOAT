Feature:LXP003: Verify LXP user should be able to update his profile on LXP Delivery system
  
  Given As a registered LXP user
  When user logins to LXP delivery system and tries to updates his profile
  Then new profile should be updated and visible to the user

  @ProfileUpdate @LXPregression
  Scenario Outline: To verify that Registered LXP User is able to update his existing profile
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    
    And verify if base language is correctly set to english language
    When User clicks on Settings tab on left menu
    And clicks on edit profile button to update his profile
    Then new profile should get updated and can be verified by the user
    Then user should be able to revert back to old profile
   
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      | LXP User Name    | LXP Password |
      | whoatestautomation@yopmail.com | Demo@123     | 
      
      
      
