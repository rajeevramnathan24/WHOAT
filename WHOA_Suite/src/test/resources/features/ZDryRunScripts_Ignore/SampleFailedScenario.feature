Feature: Demonstrate a representation of failed feature in LXP

   @LXPregression @Failed @Demofail
  Scenario Outline: To verify that Registered LXP User is able to enroll for new course and complete it successfully
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with My Programme link

    #And User closes the active Course Creator browser session
    Examples: 
      | User Name        | Password |
      | ta01@yopmail.com | Demo@123 |
