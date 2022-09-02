package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.GradingPageElements;




public class GradingPage {

	public GradingPageElements gradingElements = null;
	

	public GradingPage() {
		gradingElements = new GradingPageElements(GlobalConstants.getDriver());
		
	}



	/**
	 * This method is used to input final exam grade page
	 * @throws CustomException
	 */
	public void inputFinalExamGrade() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.sendTextRB(gradingElements.finalExamGrade, "100");
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	
	
	
	/**
	 * This method is used to click on Save button on grading page
	 * @throws CustomException
	 */
	public void saveButtonClick() throws CustomException{

		try {
			
			CommonUtility.eleWaitAndClick(gradingElements.saveButtonClick);
			
			//wait after save
			Thread.sleep(2000);

			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
}
