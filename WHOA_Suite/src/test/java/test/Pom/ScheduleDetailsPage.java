package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.ScheduleDetailsPageElements;
import test.PageMessages.MessagesScheduleDetailsPage;




public class ScheduleDetailsPage {

	public ScheduleDetailsPageElements scheduleDetailsPageElements = null;
	public MessagesScheduleDetailsPage msgSchDetailPage = null;

	public ScheduleDetailsPage() {
		scheduleDetailsPageElements = new ScheduleDetailsPageElements(GlobalConstants.getDriver());
		msgSchDetailPage = new MessagesScheduleDetailsPage(GlobalConstants.getDriver());
	}
	
	

	/**
	 * This method is used to input course schedule details
	 * @throws CustomException
	 */
	public void courseScheduleUpdate() throws CustomException{

		try {
			
			Thread.sleep(3000);			
			//input course start date
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseStartDate,scheduleDetailsPageElements.courseStartDateInput );
			Thread.sleep(1000);
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseStartTime,scheduleDetailsPageElements.zeroHours );
			
			//input course end date
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseEndDate, scheduleDetailsPageElements.courseEndDateInput);
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseEndTime,scheduleDetailsPageElements.zeroHours );
			
			//Input enrollment start date
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.enrollmentStartDate,scheduleDetailsPageElements.enrollmentStartDateInput );
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.enrollmentStartTime,scheduleDetailsPageElements.zeroHours );
			
			//Input enrollment end date
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseEnrollmentEndDate, scheduleDetailsPageElements.courseEndDateInput);
			CommonUtility.eleWaitAndSendValue(scheduleDetailsPageElements.courseEndTime,scheduleDetailsPageElements.zeroHours );
			
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	public void coursePacingSelf() throws CustomException {
		
		CommonUtility.threadWait(2000);
		
		pacingType(msgSchDetailPage.selfPaced);
		
		CommonUtility.threadWait(1000);
	}
	
	/**
	 * This method is used to click on either self or instructor based learning
	 * @param typeName
	 * @throws CustomException
	 */
	private void pacingType(String typeName) throws CustomException {
		
		try {
			CommonUtility.eleWaitAndClick(scheduleDetailsPageElements.paceTypeLocator(typeName));
		} catch (CustomException e) {
			throw new CustomException("Invalid locator for self or instructor paced learning");
		}
	}

	/**
	 * This method is used to select course language from feature file
	 * @throws CustomException
	 */
	public void selectCourseLanguage(String languageToSelect) throws CustomException{

		try {
			
			Thread.sleep(3000);			
			//input course start date
			CommonUtility.dropDownValueSelect(scheduleDetailsPageElements.courseLanguage, languageToSelect);
			Thread.sleep(1000);
			
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	
	/**
	 * This method is used to click on Save button on schedule details page
	 * @throws CustomException
	 */
	public void saveButtonClick() throws CustomException{

		try {

			CommonUtility.eleWaitAndClick(scheduleDetailsPageElements.saveChangesBtn);
			

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
}
