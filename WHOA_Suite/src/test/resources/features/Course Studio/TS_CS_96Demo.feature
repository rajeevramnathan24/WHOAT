Feature: CS096 - As an Admin user 
When a new course is created in Studio 
Then As an LXP User the same course can be enrolled and completed in LXP Platform

  @StudioLXPsanity99 @StudioLXPregression99 @DemoCS
  Scenario Outline: To verify that Registered User is able to create new courses in Course Studio
  Given User has Launched Course Creator Studio
    Then Launch page should be displayed with sign or register link
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters custom UserName as "kiran.snv@gmail.com" and password as "Test@123" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
        
    
    #**************************************************************************************
    When user clicks on New course button on Dashboard page
    And user has entered new course details like "<Course Name>", Organization, Course Number, Course Run clicks on create button
    Then course outline page should be displayed
    
     #*******Schedule details page
    When user navigates on course outline page, under settings dropdown select Schedule & Details
    And user updates course start and end date time, enrollment start and end date time on Schedule & Details
    
    #*******Course Outline page
    When user creates new section each component and adds them one by one for the following "<Component-Type>"
    And user updates grading for all subsections to final exam
   
    
    #******* Update final exam gradings page
    When user navigates on course outline page, under settings dropdown select grading
    And user updates the final exam grading on grading page
    
    #*******Course Outline page publish
    When user clicks on course name on the top and navigates to course outline page
    And publishes each section one by one on course outline page
    
    #*******Advanced settings page
    When user navigates on course outline page, under settings dropdown select advanced settings
    And user updates certificate behaviour and course outline on advanced settings page
    
    
    
    #Logout of current role and login as admin to update course modes
    When User clicks on logout link
    
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters valid UserName as "Admin User" and password as "***" and clicks on login button
    
    #$$$$$$$$$$$$$$$$$$$$$$ Admin portal to update course modes
    When user navigates to admin portal course modes
    And updates the course modes to honor
    #$$$$$$$$$$$$$$$$$$$$$$
    
    When User clicks on logout link
    
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters custom UserName as "kiran.snv@gmail.com" and password as "Test@123" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    And User has navigated to the sanity course details page
    
    
    
    
    
    #$$$$$$$$$$$$$$$$$$$$$$ Admin portal
    #When user navigates to admin portal course modes
    #And updates the course modes to honor
    #$$$$$$$$$$$$$$$$$$$$$$
    #*******Certificates page
    When user navigates on course outline page, under settings dropdown select Certificates
    And user clicks on setup certificates
    When user creates new certificate and clicks on activate button
    Then Course and certificates are activated
    #**************************************************************************************
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    

    Examples: 
     |id | Studio User Name | Studio Password | Course Name | Component-Type |
     |1 | whoatestautomation@yopmail.com  | Demo@123         | PRVDCK       | Problem-Dropdown, Problem-Checkboxes |
     
           
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
