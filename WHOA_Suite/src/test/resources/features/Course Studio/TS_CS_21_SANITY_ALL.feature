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
    
    When User enters custom UserName as "kiran.snv@gmail.com" and password as "Test@123" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    And User has navigated to the sanity course details page
    
     
    #When user navigates on course outline page, under settings dropdown select Digital Credentials
    And user clicks on add Digital Credentials
    And user enters new digital credentials
    
    
    
    #*******Course Outline page
    When user creates new section each component and adds them one by one for the following "<Component-Type>"
    
    #*******Schedule details page
    When user navigates on course outline page, under settings dropdown select Schedule & Details
    And user updates course start and end date time, enrollment start and end date time on Schedule & Details
    #*******Course Outline page
    When user clicks on course name on the top and navigates to course outline page
    And publishes each section one by one on course outline page
    #$$$$$$$$$$$$$$$$$$$$$$ Admin portal
    When user navigates to admin portal course modes
    And updates the course modes to honor
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
