package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CourseExportPageElements;
import test.PageMessages.MessagesCourseExportPage;




public class CourseExportPage {

	public CourseExportPageElements exportPageElements = null;
	public MessagesCourseExportPage messageExportCourse = null;

	public CourseExportPage() {
		exportPageElements = new CourseExportPageElements(GlobalConstants.getDriver());
		messageExportCourse = new MessagesCourseExportPage(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to click on create certificate button on certificates page
	 * @throws CustomException
	 */
	public void exportCourseContentBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(exportPageElements.exportCourseContentBtn);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to click on download exported course content button on export page
	 * @throws CustomException
	 */
	public void downloadExportedCourseBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(exportPageElements.downloadExportContentBtn);
			
			Thread.sleep(2000);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify tools text on top of course export page
	 * @throws CustomException
	 */
	public void verifyCourseExportPageText() throws CustomException{

		try {
			
			Thread.sleep(3000);
			
//			CommonUtility.scrollHighlightElement(exportPageElements.toolsTextOnTop);
			
			String actualText = exportPageElements.toolsTextOnTop.getText().trim();
			
			CommonUtility.verifyAndReport(actualText, messageExportCourse.toolsText);

		} catch (Exception e) {
			
			e.printStackTrace();

			throw new CustomException("Could not verify tools text after launching export page");
		} 

	}
	
	/**
	 * This method is used to verify success message after course is exported on course export page
	 * @throws CustomException
	 */
	public void verifyExportSuccessText() throws CustomException{

		try {
			
			String actualText = messageExportCourse.failureText;
			String expText = messageExportCourse.successText;
			
			if (exportPageElements.successText.getText().contains(messageExportCourse.successText)) {
				actualText = messageExportCourse.successText;
				
				CommonUtility.scrollHighlightElement(exportPageElements.successText);
			}		
			
			CommonUtility.verifyAndReport(actualText,expText);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}
	
	/**
	 * This method is used to verify Text message after course is exported on course export page
	 * @throws CustomException
	 */
	public void verifyCourseCanBeDownloadedText() throws CustomException{

		try {
			
			String actualText = exportPageElements.courseCanBeDownloadedText.getText();
			
			CommonUtility.scrollHighlightElement(exportPageElements.courseCanBeDownloadedText);
			
			CommonUtility.verifyAndReport(actualText, messageExportCourse.courseCanBeDownloadedText);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}
	
	/**
	 * This method is used to verify Download course button is dispayed after course is exported on course export page
	 * @throws CustomException
	 */
	public void verifyDownloadExportCourseBtn() throws CustomException{

		try {
			
			CommonUtility.isElementVisible(exportPageElements.downloadExportContentBtn);
			CommonUtility.isElementClickable(exportPageElements.downloadExportContentBtn);
			
			String actualText = exportPageElements.downloadExportContentBtn.getText();
			
			CommonUtility.scrollHighlightElement(exportPageElements.downloadExportContentBtn);
			CommonUtility.verifyAndReport(actualText, messageExportCourse.downloadExportedCourse);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}
	
}
