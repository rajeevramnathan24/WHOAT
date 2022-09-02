Feature: End to End flow
  Given As an LXP user 
  When a new course is created in Studio by Admin user
  Then As an LXP User the same course can be enrolled and completed in LXP Platform

  @LXPsanity @LXPregression @Ignore
  Scenario Outline: To verify that Registered LXP User is able to enroll for new course and complete it successfully
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    When user clicks on Discover learning search button
    #*******Course Discovery page
    #And user has entered "<Course Name>" in searchbox and clicked on search button on course discovery page
    Then course name should be displayed under the learning programmes search result on course discovery page
    When user clicks on the course card under learning programmes on course discovery page
    #*******Course Details page
    
    
    And user enrolls for course after clicking on enroll button on course details page
    #Then course status should be updated to Enrolled on course details page
    When user clicks on start learning button on course details page
    And user starts assessment for the course
    
    #When user clicks on continue learning button on course details page
    #*******Course Assessment page
    
    
    #And user clicks on submit button by selecting the appropriate answer on assessment page
    Then course status should be updated as completed successfully on course details page
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      | LXP User Name    | LXP Password | Course Name |
      | ta02@yopmail.com | Demo@123     | TAC316Nov155552|
