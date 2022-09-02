package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CourseImportPageElements;
import test.PageMessages.MessagesCourseImportPage;




public class CourseImportPage {

	public CourseImportPageElements importPageElements = null;
	public MessagesCourseImportPage messagesImportCourse = null;

	public CourseImportPage() {
		importPageElements = new CourseImportPageElements(GlobalConstants.getDriver());
		messagesImportCourse = new MessagesCourseImportPage(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to click on import course content button on import page
	 * @throws CustomException
	 */
	public void importCourseContentBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//click on import course button
			CommonUtility.eleWaitAndClick(importPageElements.importCourseContentBtn);
			
			Thread.sleep(3000);
			
			//Run executable file to import external file
			CommonUtility.runUploadProcess(GlobalConstants.libFolderPath, importPageElements.courseNamToImport);
			
		} catch (Exception e) {


			throw new CustomException("Import course content button locator had an issue");
		} 

	}
	
	
	/**
	 * This method is used to import sanity pack course contents
	 * @throws CustomException
	 */
	public void importSanityCourse() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//click on import course button
			CommonUtility.eleWaitAndClick(importPageElements.importCourseContentBtn);
			
			Thread.sleep(3000);
			
			//Run executable file to import external file
			CommonUtility.runUploadProcess(GlobalConstants.libFolderPath, importPageElements.sanityCourseName);
			
		} catch (Exception e) {


			throw new CustomException("Import course content button locator had an issue");
		} 

	}
	
	
	/**
	 * This method is used to click on replace course content button on import page
	 * @throws CustomException
	 */
	public void replaceCourseContentBtnClick() throws CustomException{

		try {

			Thread.sleep(5000);
			
			//click on import course button
			CommonUtility.eleWaitAndClick(importPageElements.replaceCourseContentBtn);
			
			
		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Replace course content button locator had an issue");
		} 

	}
	
	/**
	 * This method is used to click on view updated course content button on export page
	 * @throws CustomException
	 */
	public void viewUpdatedCourseBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(importPageElements.viewUpdatedCourseContentBtn);
			
			Thread.sleep(2000);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	
	
	/**
	 * This method is used to verify Text message after course is imported
	 * @throws CustomException
	 */
	public void verifyCourseImportedText() throws CustomException{

		try {
			
			Thread.sleep(3000);
			
			CommonUtility.isElementVisibleNew(importPageElements.importSuccessTextPath);
			CommonUtility.isElementVisibleNew(importPageElements.viewUpdatedCourseContentBtn);
			
			String actualText = importPageElements.importSuccessTextPath.getText();
			
			CommonUtility.scrollHighlightElement(importPageElements.importSuccessTextPath);
			
			CommonUtility.verifyAndReport(actualText, messagesImportCourse.importCourseSuccessText);

		} catch (Exception e) {


			throw new CustomException("Success message after import could not be verified");
		} 
	}
	
	/**
	 * This method is used to view updated outline after course import is successfull on import page
	 * @throws CustomException
	 */
	public void verifyViewUpdatedOutlineBtnText() throws CustomException{

		try {
			
			CommonUtility.isElementVisibleNew(importPageElements.viewUpdatedCourseContentBtn);
			CommonUtility.isElementClickable(importPageElements.viewUpdatedCourseContentBtn);
			
			String actualText = importPageElements.viewUpdatedCourseContentBtn.getText();
			
			CommonUtility.scrollHighlightElement(importPageElements.viewUpdatedCourseContentBtn);
			CommonUtility.verifyAndReport(actualText, messagesImportCourse.viewUpdatedOutlineBtnText);

		} catch (Exception e) {


			throw new CustomException("View Updated Outline button could not be located");
		} 
	}
	
}
