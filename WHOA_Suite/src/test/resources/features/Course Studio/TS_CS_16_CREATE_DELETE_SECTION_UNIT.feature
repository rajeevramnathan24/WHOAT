Feature: CS016: Verify Section, Sub-section and Unit can be created and deleted
  
  Given As an Admin user
  When logged in to course Studio
  Then user should be able to create Section, Sub-section and Unit and also delete them

  @sectionDelete @StudioLXPregression99 
  Scenario Outline: To verify that Registered User is able to create Section, Sub-section and Unit and these can also be deleted
  
  #When user creates new section each component and adds them one by one for the following "<Component-Type>"
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
    #*******Course Outline page
    When user clicks on new section button followed by new subsection button and new unit button
    And further user clicks on delete buttons of section or subsection or unit
    Then course outline page should be displayed without any section or subsection or unit
    
    
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    
    Examples: 
     | Studio User Name | Studio Password | Course Name |
     | whoatestautomation@yopmail.com  | Demo@123         | HTM       |
