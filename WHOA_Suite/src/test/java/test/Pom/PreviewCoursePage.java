package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.Preview_LivePageElements;




public class PreviewCoursePage {

	public Preview_LivePageElements previewElements = null;
	

	public PreviewCoursePage() {
		previewElements = new Preview_LivePageElements(GlobalConstants.getDriver());
		
	}


	/**
	 * This method is used to verify successful generation on certificates page
	 * @throws CustomException
	 */
	public void verifyPreviewText() throws CustomException{

		try {
			
			Thread.sleep(2000);
			
			String actualText = previewElements.previewLiveText.getText().trim();
			
			CommonUtility.switchToTab(0);
			
			CommonUtility.verifyAndReport(actualText, "This is demo text entered during Test Automation");
			
			} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
		
	}
	
	/**
	 * This method is used to click on Instructor tab button on Preview/ view live page
	 * @throws CustomException
	 */
	public void instructorTabClick() throws CustomException{

		try {

			Thread.sleep(500);
			
			CommonUtility.eleWaitAndClick(previewElements.instructorTabClick);

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	


}
