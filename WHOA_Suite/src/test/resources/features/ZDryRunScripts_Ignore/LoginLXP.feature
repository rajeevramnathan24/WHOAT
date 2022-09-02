Feature:CS021: Verify new Course creation in Studio for different sections containing different components
  
  Given As an Admin user
  When logged in to course Studio
  And user has imported an existing course
  Then user should be able to configure them and set the microcredentials for them
 
  @CourseCreation @Studioregression @Sanity
  
  Scenario Outline: To verify that Registered User is able to create new courses in Course Studio
    Given User has Launched Course Creator Studio
    Then Launch page should be displayed with sign or register link
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    #When User enters custom UserName as "ta01@yopmail.com" and password as "Demo@123" and clicks on login button
    When User enters custom UserName as "kiran.snv@gmail.com" and password as "Test@123" and clicks on login button
    #When User enters valid UserName as "Admin User" and password as "***" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    #And User has navigated to the sanity course details page
    
    
    #**************************************************************************************
    When user clicks on New course button on Dashboard page
    And user has entered new course details like "<Course Name>", Organization, Course Number, Course Run clicks on create button
    Then course outline page should be displayed
    
    #Import existing course starts here
    When user navigates on course outline page, under tools main menu selects import option
    Then Course import page should be displayed
    
    When user imports Sanity course content into current course
    And user also clicks on replace course with selected file button
    #Optional
    Then verify course content is imported successfully
    
    #Updating the name first
    When user navigates on course outline page, under settings dropdown select advanced settings
    And user updates Course Display Name on advanced settings page for Sanity pack course
    
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
    
    #*******Advanced settings page
    #When user navigates on course outline page, under settings dropdown select advanced settings
    #And user updates Course Display Name on advanced settings page for Sanity pack course
    
    When user clicks on course name on the top and navigates to course outline page
    And user configures chapter 1, chapter 2 and chapter 3 for sequential logic
    
    #When user navigates on course outline page, under settings dropdown select Certificates
    #And user reactivates the certificates for the course
    #Then Course and certificates are activated
    
    When user navigates on course outline page, under settings dropdown select Digital Credentials
    And user clicks on add Digital Credentials
    
    
   
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
     |1 | whoatestautomation@yopmail.com  | Demo@123         | SAN       | HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion |
     #|2 | whoatestautomation@yopmail.com  | Demo@123         | HTML_QA       | HTML-Text, Problem-Dropdown |
    
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
