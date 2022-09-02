Feature:CS012: Verify Export feature of a Course Content
  
  Given As an Admin user
  When logged in to course Studio
  Then user should be able to Export the course content and download it
    
  @ExportCourse @Studioregression
  Scenario Outline: To verify that Registered User can Export the course content and download the exported course content
    Given User has Launched Course Creator Studio
    Then Launch page should be displayed with sign or register link
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters valid UserName as "<Studio User Name>" and password as "<Studio Password>" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    #**************************************************************************************
    When user clicks on New course button on Dashboard page
    And user has entered new course details like "<Course Name>", Organization, Course Number, Course Run clicks on create button
    Then course outline page should be displayed      
    
    #*******Course Team
    When user navigates on course outline page, under tools main menu selects export option
    Then Course export page should be displayed
    
    When user clicks on Export Course Content button
    Then verify export status updated as success and user can download the exported course  
        
    #**************************************************************************************
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    

    Examples: 
     |id | Studio User Name | Studio Password | Course Name | 
     |1 | whoatestautomation@yopmail.com  | Demo@123         | Exp       |
     
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
