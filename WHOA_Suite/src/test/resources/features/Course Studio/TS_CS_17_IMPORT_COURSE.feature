Feature:CS017: Verify Import feature of a Course Content
  
  Given As an Admin user
  When logged in to course Studio
  Then user should be able to Import the course content and replace existing course content
    
  @ImportCourse @Studioregression
  Scenario Outline: To verify that Registered User can Import the course content and replace existing course content
    Given User has Launched Course Creator Studio in Windows OS
    Then Launch page should be displayed with sign or register link
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters valid UserName as "<Studio User Name>" and password as "<Studio Password>" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    #**************************************************************************************
    When user clicks on New course button on Dashboard page
    And user has entered new course details like "<Course Name>", Organization, Course Number, Course Run clicks on create button
    Then course outline page should be displayed      
           
    #******Import course starts here
    When user navigates on course outline page, under tools main menu selects import option
    Then Course import page should be displayed
    
    When user clicks on choose file to import or replace Course Content button
    And user also clicks on replace course with selected file button
    Then verify course content is imported successfully
    
    
    
    #**************************************************************************************
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    

    Examples: 
     |id | Studio User Name | Studio Password | Course Name | 
     |1 | whoatestautomation@yopmail.com  | Demo@123         | Imp       |
     
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
