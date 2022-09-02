Feature:LXP014: Verify LXP user should not be able to complete a Time Based Assessment after the time has elapsed
     
  Given As a registered LXP user 
  When a new course is created in Studio by Admin
  And as a LXP user, the course can be enrolled
  Then the course should not be completed since the time limit has elapsed
  
  @LXPTOPIncomplete @LXPregression
  Scenario Outline: To verify that Registered LXP User is not able to complete the course since the time limit has elapsed
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    When user clicks on Discover learning search button
    #*******Course Discovery page
    #And user has entered "<Course Name>" in searchbox and clicked on search button on course discovery page
    And user has entered Time Based Assessment course name in searchbox and clicked on search button on course discovery page to verify time out
    Then course name should be displayed under the learning programmes search result on course discovery page
    When user clicks on the course card under learning programmes on course discovery page
    #*******Course Details page
    
    
    And user enrolls for course after clicking on enroll button on course details page
    #Then course status should be updated to Enrolled on course details page
    When user clicks on start learning button on course details page
    Then System displays note on Time based Assessment and user verifies the text and continues by clicking on start button
    
    When user does not complete the course during the specified time
    Then verify time elapse message is displayed for the course
   
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      | LXP User Name    | LXP Password | Course Name |
      | skiran_cv@yahoo.co.in | abcd1234     |TOP18Mar170611|
