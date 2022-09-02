Feature:CS099: Refresh courses created
  
  Given As an Admin user
  When new courses are created in course studio
  Then user should be able to refresh the courses in LXP by hitting the temporary refresh index URL
    
  @RefreshIndex
  
  Scenario: To verify refresh index url is launched in new browser
    Given User has Launched Refresh Index page