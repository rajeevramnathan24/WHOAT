package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.AdminPortalPageElements;
import test.PageElements.StudioHomeElements;




public class AdminPortalPage {

	//*****************SAMPLE CODE TO BE DELETED
	public StudioHomeElements  StudioHomePage= null;
	public AdminPortalPageElements adminPortalElements = null;

	public AdminPortalPage() {
		StudioHomePage = new StudioHomeElements(GlobalConstants.getDriver());
		adminPortalElements = new AdminPortalPageElements(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to navigate to Admin portal page
	 * @throws CustomException
	 */
	public void adminPortalLaunch() throws CustomException{

		try {

			Thread.sleep(3000);

			String adminPortalUrl=GlobalConstants.Target_CC_URL;
			
			if (GlobalConstants.Target_CC_URL.contains("dev")) {
				adminPortalUrl = GlobalConstants.Target_CC_URL.replace(adminPortalElements.cms, adminPortalElements.lms);
			} else {
				
				adminPortalUrl = GlobalConstants.Target_CC_URL.replace(adminPortalElements.stageCms, adminPortalElements.stageLms);
			}

			//Thread.sleep(2000);

			//initialise admin portal url
			adminPortalUrl = adminPortalUrl+adminPortalElements.adminPortalCourseModeStringUrl;

			//navigate to admin portal url
			GlobalConstants.getDriver().get(adminPortalUrl);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}


	/**
	 * This method is used to click on Save button on schedule details page
	 * @throws CustomException
	 */
	public void courseModeUpdate() throws CustomException{

		try {

			Thread.sleep(2000);
			
			//create org, number and course run
			StudioHomePage.courseOrg = GlobalConstants.currentDay+StudioHomePage.courseOrg;
			StudioHomePage.courseNumber = GlobalConstants.currentMonth+StudioHomePage.courseNumber;
			StudioHomePage.courseRun = GlobalConstants.currentTime+StudioHomePage.courseRun;

			String courseSearch = StudioHomePage.courseDisplayName
					+StudioHomePage.courseOrg+
					"+"
					+StudioHomePage.courseNumber+
					"+"
					+StudioHomePage.courseRun;
			
			//input course name * concatenated - 
			CommonUtility.eleWaitAndSendValue(adminPortalElements.searchCourseNameInput,courseSearch);
			
			Thread.sleep(1000);

			//select honor value from drop down
			CommonUtility.dropDownValueSelect(adminPortalElements.courseTypeSelect,adminPortalElements.courseTypeValue);
			
			//input display course name 
			CommonUtility.eleWaitAndSendValue(adminPortalElements.courseNameInput,StudioHomePage.getCourseName());
			
			Thread.sleep(2000);

			//save the changes
			CommonUtility.eleWaitAndClick(adminPortalElements.saveBtn)	;
			
			Thread.sleep(3000);
			
			//boolean isExists = "test".indexOf("Android") !=-1? true: false; 
			//boolean envType = GlobalConstants.CC_URL.contains("dev");	
			
			String returnHomeUrl = GlobalConstants.Target_CC_URL;
			
			if (GlobalConstants.Target_CC_URL.contains("dev")) {
				returnHomeUrl = GlobalConstants.Target_CC_URL.replace(adminPortalElements.lms, adminPortalElements.cms);
			} else {
				
				returnHomeUrl = GlobalConstants.Target_CC_URL.replace(adminPortalElements.stageLms, adminPortalElements.stageCms);
			}
			
			//initialise homeportal URL
			returnHomeUrl = returnHomeUrl+adminPortalElements.courseStringUrl

					+StudioHomePage.courseDisplayName

					+StudioHomePage.courseOrg+
					"+"
					+StudioHomePage.courseNumber+
					"+"
					+StudioHomePage.courseRun;

			System.out.println(returnHomeUrl);

			//navigate to Home portal url
			GlobalConstants.getDriver().get(returnHomeUrl);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	
}
