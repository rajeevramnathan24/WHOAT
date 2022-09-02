Feature: LXP004: Verify LXP user should be able to change the base language of English to Local Language
  
  As a registered LXP user
  When user logins to LXP delivery system and tries to updates the base language of English to local language
  Then entire page text should be translated to local language

  @MultiLingual @LXPregression
  Scenario Outline: Verify LXP user should be able to change the base language of English to Local Language, then entire page is displayed in local language
    Given User has Launched LXP Learner web application
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<User Name>" and password as "<Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    
    And verify if base language is correctly set to english language
    
    When User navigates to myprofile link and updates the language from "<source>" language to "<target>"
    Then On Dashboard page entire text is translated and user is able to verify texts in "<target>" language
     When User navigates to myprofile link and updates the language from "<target>" language to "<source>"
    Then On Dashboard page entire text is translated and user is able to verify texts in "<source>" language
    
    And verify if base language is correctly set to english language
    
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      |id| User Name             | Password | source  | target  |
      |1| whoatestautomation@yopmail.com | Demo@123 | English | French |
      #|2| whoatestautomation@yopmail.com | Demo@123 | English | Chinese |
      #|3| whoatestautomation@yopmail.com | Demo@123 | English | Russian |
      #|4| whoatestautomation@yopmail.com | Demo@123 | English | Spanish |
      #|5| whoatestautomation@yopmail.com | Demo@123 | English | English |
      #|6| whoatestautomation@yopmail.com | Demo@123 | Spanish | French |
      #|7| whoatestautomation@yopmail.com | Demo@123 | Russian | Russian |
