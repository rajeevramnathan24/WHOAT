Feature:CS001: Verify Login and logout of Course Studio system
  
  Given As an Admin user
  When trying to login to course Studio with valid credentials
  Then user should be able to successfully login and logout of the system
    
  @StudioLoginLogout @Studioregression
  Scenario Outline: To verify that Registered User is able to successfully login into Course Creator Studio Home page
    Given User has Launched Course Creator Studio
    Then Launch page should be displayed with sign or register link
    When User has clicked on signin link
    Then Login page should be displayed with username, password and login button
    When User enters valid UserName as "<User Name>" and password as "<Password>" and clicks on login button
    Then Course creator Dashboard page is displayed with Studio home text
    When User clicks on logout link
    Then Launch page should be displayed with sign or register link
    And User closes the active Course Creator browser session

    Examples: 
      | User Name        | Password |
      | whoatestautomation@yopmail.com | Demo@123 |
