package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.InstructorTabPageElements;
import test.PageMessages.MessagesInstructor_MembershipPage;




public class InstructorTab_MemberShipPage {

	public InstructorTabPageElements instructorTabLocator = null;
	public MessagesInstructor_MembershipPage instructorPageMsg = null;
	

	public InstructorTab_MemberShipPage() {
		instructorTabLocator = new InstructorTabPageElements(GlobalConstants.getDriver());
		instructorPageMsg = new MessagesInstructor_MembershipPage(GlobalConstants.getDriver());
		
	}


	
	/**
	 * This method is used to click on Membership tab inside Instructor tab page
	 * @throws CustomException
	 */
	public void membershipTabClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			CommonUtility.eleWaitAndClick(instructorTabLocator.membershipTab);

			Thread.sleep(500);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to verify Enrollment success message text
	 * @throws CustomException
	 */
	public void verifyEnrollSuccessText() throws CustomException {
		
		verifyEnrollUnenrollText(instructorPageMsg.enroll);
		
	}
	
	/**
	 * This method is used to verify UnEnrollment success message text
	 * @throws CustomException
	 */
	public void verifyUnEnrollSuccessText() throws CustomException {
		
		verifyEnrollUnenrollText(instructorPageMsg.unEnroll);		
		
	}
	
	/**
	 * This method is used to verify text after successful enroll/ un-enroll of users on instructor page
	 * @throws CustomException
	 */
	private void verifyEnrollUnenrollText(String enrollUnenroll) throws CustomException{

		String actualText = null;
		String expText = null;
		
		try {
			
			Thread.sleep(4000);
			
			actualText = instructorTabLocator.enrollUnenrollResponse.getText().trim();
						
			if(enrollUnenroll.equalsIgnoreCase(instructorPageMsg.enroll)) {
				
				expText = instructorPageMsg.successEnrollMessageRegisteredUsers.trim();		
				
				
			} else if(enrollUnenroll.equalsIgnoreCase(instructorPageMsg.unEnroll)) {
				
				expText = instructorPageMsg.successUnenrollMessage.trim();
				
			}
			
		} catch (Exception e) {


			throw new CustomException(instructorPageMsg.verifyFailed);
		} 
			
			CommonUtility.verifyAndReport(actualText, expText);		
	}
	
	/**
	 * This method is used to click on Enroll Button inside Instructor tab page
	 * @throws CustomException
	 */
	public void enrollBtnClick() throws CustomException{

		try {

			Thread.sleep(500);
			
			CommonUtility.eleWaitAndClick(instructorTabLocator.enrollButton);

			Thread.sleep(500);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to click on UnEnroll Button inside Instructor tab page
	 * @throws CustomException
	 */
	public void unEnrollBtnClick() throws CustomException{

		try {

			Thread.sleep(500);
			
			CommonUtility.eleWaitAndClick(instructorTabLocator.unEnrollButton);

			Thread.sleep(500);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to input email ids to enroll or unenroll from batch membership
	 * @throws CustomException
	 */
	public void inputRegisteredEmailIds() throws CustomException{

		try {
			
			Thread.sleep(2000);			
			//input course start date
			CommonUtility.eleWaitAndSendValue(instructorTabLocator.batchEnrollmentInput,instructorPageMsg.emailIdToEnroll);
			Thread.sleep(1000);
						
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

}
