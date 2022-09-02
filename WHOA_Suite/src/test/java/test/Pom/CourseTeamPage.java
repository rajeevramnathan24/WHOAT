package test.Pom;




import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CourseTeamElements;
import test.PageMessages.MessagesCourseTeamPage;




public class CourseTeamPage {

	public CourseTeamElements courseTeamLocators = null;
	public MessagesCourseTeamPage courseTeamMessages = null;

	public CourseTeamPage() {

		courseTeamLocators = new CourseTeamElements(GlobalConstants.getDriver());
		courseTeamMessages = new MessagesCourseTeamPage(GlobalConstants.getDriver());
		
	}



	/**
	 * This method is used to click on Add new team member button on course team page
	 * @throws CustomException
	 */
	public void addNewTeamMemberBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndClick(courseTeamLocators.addNewTeamMemberBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Add User button on course team page
	 * @throws CustomException
	 */
	public void addUserBtnClick() throws CustomException{

		try {

			//Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndClick(courseTeamLocators.addUserBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on grant admin access button on course team page
	 * @throws CustomException
	 */
	public void adminAccessBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndClick(courseTeamLocators.adminAccessBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to remove admin access on course team page
	 * @throws CustomException
	 */
	public void removeAdminAccessBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndClick(courseTeamLocators.removeAdminAccessBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to delete user on course team page
	 * @throws CustomException
	 */
	public void deleteUserBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndClick(courseTeamLocators.deleteUserBtn);

			CommonUtility.isElementVisible(courseTeamLocators.deleteUserPopUpBtn);
			CommonUtility.isElementVisible(courseTeamLocators.deleteUserPopUpBtn);
			
			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(courseTeamLocators.deleteUserPopUpBtn);

			Thread.sleep(2000);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify user role label on course team page
	 * @throws CustomException
	 */
	public void verifyUserLabel(String staffAdmin) throws CustomException{

		String expectedLabel, actualLabel = null;
		WebElement roleLabel;

		try {

			Thread.sleep(2000);

			expectedLabel = courseTeamLocators.LabelTextStaff.getText();
			roleLabel = courseTeamLocators.LabelTextStaff;
			

			switch (staffAdmin) {

			case "STAFF":

				actualLabel = courseTeamMessages.staff;

				break;

			case "ADMIN":

				actualLabel = courseTeamMessages.admin;

				break;

			default:
				break;
			}

			CommonUtility.scrollHighlightElement(roleLabel);
			CommonUtility.verifyAndReport(actualLabel, expectedLabel);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to input user Email id on course team page
	 * @throws CustomException
	 */
	public void inputEmailId() throws CustomException{

		try {

			//Thread.sleep(3000);

			//create new certificate
			CommonUtility.eleWaitAndSendValue(courseTeamLocators.userEmailInput, courseTeamMessages.userEmailId);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}


}
