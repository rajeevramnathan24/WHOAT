package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import core.Utils.TestExecutionManager;
import test.PageElements.DigitalCredentialsPageElements;
import test.PageMessages.MessagesDigitalCredentialsPage;




public class DigitalCredentialsPage {

	public DigitalCredentialsPageElements digitalCredElements = null;
	public MessagesDigitalCredentialsPage messageDigitalCred = null;

	public DigitalCredentialsPage() {
		digitalCredElements = new DigitalCredentialsPageElements(GlobalConstants.getDriver());
		messageDigitalCred = new MessagesDigitalCredentialsPage(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to click on add digital credentials button on certificates page
	 * @throws CustomException
	 */
	public void addDigitalCredentialsButtonClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(digitalCredElements.addDigitalCredentialsBtn);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	

	/**
	 * This method is used to click on radio button of New digital credentials pop button on certificates page
	 * @throws CustomException
	 */
	public void radioBtnClickCompleteActivities() throws CustomException{

		try {

			Thread.sleep(1000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(digitalCredElements.digCredAwardedRdoBtn(messageDigitalCred.completingActivities));
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to click on passing assessments radio button of New digital credentials pop button on certificates page
	 * @throws CustomException
	 */
	public void radioBtnClickPassingAssessment() throws CustomException{

		try {

			Thread.sleep(1000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(digitalCredElements.digCredAwardedRdoBtn(messageDigitalCred.passingAssessment));
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to update slider percentage values
	 * @throws CustomException
	 */
	public void updateSliderValues() throws CustomException {
		
		try {
			CommonUtility.dragAndDrop(digitalCredElements.sliderElement,messageDigitalCred.sliderPosition_90_passing);
		} catch (Exception e) {
			throw new CustomException("Slider webelement not found");
		}
				
	}
	
	/**
	 * This method is used to click on Next button of New digital credentials pop button on certificates page
	 * @throws CustomException
	 */
	public void nextButtonClick() throws CustomException{

		try {

			Thread.sleep(1000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(digitalCredElements.nextBtn);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to activate or deactivate New digital credentials on digital credentials page
	 * @throws CustomException
	 */
	public void activateDeactivateClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//activate dig credentials
			CommonUtility.eleWaitAndClick(digitalCredElements.digCredentialsOptionBtn);
			
			Thread.sleep(1000);
			
			CommonUtility.eleWaitAndClick(digitalCredElements.activateDeactivateBtn);
			
			Thread.sleep(1000);
			
			CommonUtility.eleWaitAndClick(digitalCredElements.activatePopUp);
			
			Thread.sleep(2000);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to verify successful generation on digital credentials page
	 * @throws CustomException
	 */
	public void verifyDigitalCredentialsActivated_Deactivated(String credStatus) throws CustomException{

		CommonUtility.threadWait(4000);
		
		CommonUtility.verifyAndReport(digitalCredElements.digitalCredentialsActivatedTextXpath.getText(),
				messageDigitalCred.digitalCredentialsActivatedMessage);		
	}
	
	/**
	 * This method is used to verify successful generation on digital credentials page
	 * @throws CustomException
	 */
	public void verifyDigitalCredentialsActivated_DeactivatedOld(String credStatus) throws CustomException{

		try {
			
			Thread.sleep(4000);
			
			GlobalConstants.softAssertion.assertEquals(digitalCredElements.digitalCredentialsActivatedTextXpath.getText(),
					messageDigitalCred.digitalCredentialsActivatedMessage);
			
			GlobalConstants.softAssertion.assertAll();		
			
			GlobalConstants.scGlobal.write("Status --- " + digitalCredElements.digitalCredentialsActivatedTextXpath.getText());
			
			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);


		} catch (AssertionError e) {

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);

			throw new CustomException("Error in step due to mismatch in actual value' "+
					digitalCredElements.digitalCredentialsActivatedTextXpath.getText()+ "' and expected value' "+
					messageDigitalCred.digitalCredentialsActivatedMessage +" '");

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to input data on all text areas on New digital credentials popup page
	 * @throws CustomException
	 */
	public void inputAllTextAreasDigCredPopUp() throws CustomException{

		try {

			inputTitleOverRide();

			selectValidity();

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.admissionCriteria);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.moduleRequirements);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.moduleDesc);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.moduleActivities);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.moduleOutcomes);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.moduleAssessment);

			inputTextAreaDigitalCredentialsPopUp(messageDigitalCred.evidenceOfAssessment);

			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to click on Save button of New digital credentials pop button on certificates page
	 * @throws CustomException
	 */
	public void saveButtonClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(digitalCredElements.clickSaveBtn);
			
			Thread.sleep(4000);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to input Title override Digital credential details
	 * @throws CustomException
	 */
	public void inputTitleOverRide() throws CustomException{

		try {
			
			Thread.sleep(1000);			
			//input course start date
			CommonUtility.eleWaitAndSendValue(digitalCredElements.inputTitleOverRide,messageDigitalCred.demoText );
					
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to select validaty value on Digital credential details
	 * @throws CustomException
	 */
	public void selectValidity() throws CustomException{

		try {
			
			Thread.sleep(1000);			
			//input course start date
			CommonUtility.dropDownValueSelect(digitalCredElements.selectValidityPeriod, messageDigitalCred.validtyYears);
			
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to input various text area details on Digital credential details popup
	 * @throws CustomException
	 */
	public void inputTextAreaDigitalCredentialsPopUp(String credentialsType) throws CustomException{

		try {
			
			
			CommonUtility.eleWaitAndSendValue(digitalCredElements.getDynamicLocatorTextArea(credentialsType),messageDigitalCred.demoText );
					
			
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	


	
}
