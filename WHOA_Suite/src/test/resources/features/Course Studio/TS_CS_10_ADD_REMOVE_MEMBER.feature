Feature:CS010: Verify Add or Remove team member feature for a course
	
	Given As an Admin user
  When logged in to course Studio
  And while creating a new course and configuring it 
  Then user should be able to add or remove access to another team member as Staff or Admin role
		
  @AddRemoveMember @Studioregression 
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
    
    #*******Course Team
    When user navigates on course outline page, under settings dropdown select Course Team
    And user adds new team member to the course
    Then user is able to successfully add and remove the team member and verify the roles  
    
    #**************************************************************************************
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    

    Examples: 
     |id | Studio User Name | Studio Password | Course Name | Component-Type |
     |1 | whoatestautomation@yopmail.com  | Demo@123         | ARM       | HTML-Text |
     
      
      # sample component type names: HTML-Text, Problem-Dropdown, Video, Zoom-Int, Discussion
