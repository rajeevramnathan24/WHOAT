Feature:CS011: Verify user can Preview/ View live version of the course
  Given As an Admin user
  When logged in to course Studio
  And while creating a new course and configuring it 
  Then preview or view live version of the course is displayed

  @StudioPreviewLiveVersion @Studioregression
  Scenario Outline: To verify that Registered User is able to create new courses in Course Studio
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
    And user updates only course outline on advanced settings page
    #*******Course Outline page
    When user creates new section each component and adds them one by one for the following "<Component-Type>"
    And publishes each section one by one on course outline page
    And User clicks on View Live button on course outline page
    Then LXP page is displayed with the corresponding course
    
    When user clicks on Subsection and Unit level of the component
    Then Add new Component page is diplayed with Preview and View Live version buttons
    #*******Preview/ View page goes here
    When User clicks on Preview button
    Then Preview details page is displayed where user can verify the details of the component
    When User clicks on View Live Version button
    Then View Live Version page is displayed where user can verify the details of the component
    #**************************************************************************************
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    

    Examples: 
     |id | Studio User Name | Studio Password | Course Name | Component-Type |
     |1 | whoatestautomation@yopmail.com  | Demo@123         | PRW       | HTML-Text |
     
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
