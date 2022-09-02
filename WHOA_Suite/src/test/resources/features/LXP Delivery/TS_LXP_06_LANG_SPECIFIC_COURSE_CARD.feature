Feature:LXP006: Verify LXP user should be able to search and verify courses created in local languages
     
  Given As a registered LXP user 
  When a new course is created in Studio by Admin user in local language
  Then the LXP user can search for the course by applying language filter
  And appropriate course card should be displayed in local language

  @LanguageSpecificCourseCard @LXPregression 
  Scenario Outline: To verify that Registered LXP User is able to search and verify course card for course created in local language
    
    Given User has Launched LXP portal
    Then Launch page should be displayed with welcome text
    When User has clicked on Login button
    Then LXPLogin page is displayed with username, password and login button
    When User logs into LXP with valid UserName as "<LXP User Name>" and password as "<LXP Password>" and clicks on login button
    Then LXP Dashboard page is displayed with Discover learning link
    
    When user clicks on Discover learning search button
    
  	And user has entered "<Language>" in searchbox and clicked on search button on course discovery page
    	
   #	And user clicks on "<Language>" radio button filter
   
   	Then verify that only those language specific course cards are displayed as selected in the filter
   	
   	When user clicks on the course card under learning programmes on course discovery page
   	Then verify course card details page is displayed in that local "<Language>"
    
   
    #***************************************
    When User has clicked on logout link on LXP page
    Then Launch page should be displayed with welcome text

    Examples: 
      |id| LXP User Name    | LXP Password | Course Name | Language |
      |1 | skiran_cv@yahoo.co.in | abcd1234     | ARAC03Feb184040| Arabic| 
      |2 | skiran_cv@yahoo.co.in | abcd1234     | frcHT08Dec094712| Chinese|
      |3 | skiran_cv@yahoo.co.in | abcd1234     | RUSC13Jan102108| French|
      |4 | skiran_cv@yahoo.co.in | abcd1234     | ESPC10Feb200301| Russian|
      |5 | skiran_cv@yahoo.co.in | abcd1234     | ZHUC13Jan102434| Spanish|
      
      #Stage ids
      
      
