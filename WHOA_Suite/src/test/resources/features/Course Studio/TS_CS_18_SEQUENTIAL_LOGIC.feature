Feature:CS018: Verify new Courses with multiple Sections can be created such as to verify Sequential logic
  
	Given As an Admin user
  When logged in to course Studio
  Then user should be able to create new courses with multiple sections and subsections and one of the subsections can be made dependant on another
    
  @SeqLogic @Studioregression
  Scenario Outline: To verify that Registered User is able to create new courses with multiple sections and subsections and one of the subsections can be made dependant on another
    
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
    #*******Advanced settings page
    When user navigates on course outline page, under settings dropdown select advanced settings
    And user updates Course Visibility on advanced settings page
    #*******Course Outline page
    
    When user creates new section each component and adds them one by one for the following "<Component-Type>"
    And user configures Subsection dependency using sequential logic
    Then verify the dependant Subsection is displayed with lock icon
    
    
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
     |1 | whoatestautomation@yopmail.com  | Demo@123         | SEQL       | Problem-Dropdown, Problem-Checkboxes |
     # Note: Do not change the sequence of component types     
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
