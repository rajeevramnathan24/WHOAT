Feature:LXP005: Verify LXP User enrolls and unenrolls for course and enrolled course can be viewed in My Learnings section
  Given As an LXP user 
  When a new course is created in Studio by Admin user
  Then As an LXP User the same course can be enrolled and viewed in My Learnings section in LXP Platform

  @EnrollUnEnrollMyLearnings @LXPregression
  Scenario Outline: To verify that Registered LXP User is able to enroll for a course and view it in My Learnings section
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    
    When user clicks on Discover learning search button
    #*******Course Discovery page
    And user has entered course name containing html text based assessment in searchbox and clicked on search button on course discovery page
    Then course name should be displayed under the learning programmes search result on course discovery page
    When user clicks on the course card under learning programmes on course discovery page
    #*******Course Details page
    
    And user enrolls for course after clicking on enroll button on course details page
    #Then course status should be updated to Enrolled on course details page
    
    
   When user clicks on My Learnings tab on left menu
   Then verify course card should be displayed under continue learning tab
   
   When user clicks on course card
   Then course details page should be displayed
   
   And user unenrolls for course after clicking on unenroll button on course details page
   Then course status should be updated to Unenrolled on course details page
   
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      | LXP User Name    | LXP Password | Course Name |
      | skiran_cv@yahoo.co.in | abcd1234     | HTM06Dec205631|
