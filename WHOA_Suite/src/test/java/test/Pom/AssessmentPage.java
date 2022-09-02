package test.Pom;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.AssessmentPageElements;
import test.PageMessages.MessagesLxpAssessmentPage;




public class AssessmentPage {

	//*****************SAMPLE CODE TO BE DELETED
	public AssessmentPageElements assessmentElements = null;
	public MessagesLxpAssessmentPage msgAssessmentPage = null;

	public AssessmentPage() {
		assessmentElements = new AssessmentPageElements(GlobalConstants.getDriver());
		msgAssessmentPage = new MessagesLxpAssessmentPage(GlobalConstants.getDriver());
	}

	/**
	 * This method is used to click on close button on assessment page
	 * @throws CustomException
	 */
	public void closeAssessmentBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			//			WebElement wFrame = GlobalConstants.getDriver().findElement(By
			//					.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]"));
			//			
			//			GlobalConstants.getDriver().switchTo().frame(wFrame);

			//GlobalConstants.getDriver().switchTo().defaultContent();

			CommonUtility.eleWaitAndClick(assessmentElements.oldCloseBtn);

			Thread.sleep(8000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	public void waitForFrameLoad() {

		WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 30,10);

		//		WebElement frameElement = GlobalConstants.getDriver()
		//				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]"));
		//		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));//.frameToBeAvailableAndSwitchToIt(frameElement));

		//		
		//		wait.until(ExpectedConditions.presenceOfElementLocated(By
		//				.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/iframe[1]")));



	}


	/**
	 * This method is used to switch between frames and complete the assessments dynamically
	 * @throws CustomException
	 */
	public void completeAssessment() throws CustomException {

		String getSectionUnitName = null;
		int assessmentCounter = countNumberOfSections();

		try {	

			for (int i = 1; i <= assessmentCounter; i++) {

				//waitForFrameLoad();
				Thread.sleep(6000);

				GlobalConstants.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebElement aFrame = assessmentElements.assessmentFrame;
				
				CommonUtility.isElementVisible(aFrame);

				//				String getTopSectionUnitName = assessmentElements.topSectionHeader.getText().toString();
				//
				//				System.out.println(getTopSectionUnitName);

				//				CommonUtility.eleWaitAndClick(assessmentElements.topSectionHeader);

				GlobalConstants.getDriver().switchTo().frame(aFrame);

				GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				CommonUtility.isElementVisible(assessmentElements.headerInsideFrame);

				getSectionUnitName = assessmentElements.headerInsideFrame.getText().toString();
				
				System.out.println(getSectionUnitName);

//				CommonUtility.eleWaitAndClick(assessmentElements.headerInsideFrame);

				switch (getSectionUnitName) {

				case "Unit-HTML-Text":	
				case "Unit-Discussion":

					Thread.sleep(4000);

					CommonUtility.jsWaitTillPageLoadingComplete();

					GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					break;

				case "Unit-Zoom-Int": 

					Thread.sleep(4000);

					CommonUtility.jsWaitTillPageLoadingComplete();

					GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					break;

				case "Unit-Video":			

					Thread.sleep(2000);

					WebElement playButton = assessmentElements.videoPlayButton;

					CommonUtility.eleWaitAndClick(playButton);

					Thread.sleep(36000); //video length is 30 secs

					break;

				case "Unit-Problem-Dropdown":	

					completeDropDownAnswer();

					break;					

				case "Unit-Problem-Dropdown-TOP":	

					Thread.sleep(2000);

					//add verify method here separate			

					CommonUtility.eleWaitAndClick(assessmentElements.startTimeBasedAssessmentBtn);

					completeDropDownAnswer();

					break;

				case "Unit-Scorm":					

					completeScormAssessment();

					break;

				case "Unit-RandomA":

					verifySectionCount();
					multipleSectionHeaderNames(0);
					multipleSectionHeaderNames(1);

					break;
					
				case "Unit-Problem-Checkboxes":
					
					singleSectionHeaderName();

				default:
					break;
				}

				GlobalConstants.getDriver().switchTo().defaultContent();
				//
				//				if(getSectionUnitName.contains("TOP")) {
				//
				//					System.out.println("This is time based...");
				//				}

				if(assessmentElements.countButtons.size() > 1) {

					CommonUtility.eleWaitAndClick(assessmentElements.prevNextButton(msgAssessmentPage.nextBtn));

				} else {

					CommonUtility.eleWaitAndClick(assessmentElements.submitAssessmentBtn);

					Thread.sleep(1000);

					CommonUtility.eleWaitAndClick(assessmentElements.confirmSubmitAssessment);

					Thread.sleep(1000);

					CommonUtility.eleWaitAndClick(assessmentElements.finishAssessmentBtn);
				}
				
				Thread.sleep(3000);

			}

			Thread.sleep(2000);

			CommonUtility.isElementVisible(assessmentElements.congratsLocator);

			CommonUtility.isElementVisible(assessmentElements.learningProgCompletedLocator);
			

			WebElement wcong = assessmentElements.congratsLocator;
			CommonUtility.highlightElement(assessmentElements.congratsLocator, GlobalConstants.highlighterFlag);
			CommonUtility.verifyAndReport(wcong.getText(),"Congratulations!!");

			WebElement wcomp = assessmentElements.learningProgCompletedLocator;
			CommonUtility.highlightElement(assessmentElements.learningProgCompletedLocator, GlobalConstants.highlighterFlag);
			CommonUtility.verifyAndReport(wcomp.getText(),"Learning Programme Completed");

			dismissBtnClick();
			//html/body/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/button[2] - dismiss
			//html/body/div[2]/div[1]/div/div/footer/button - back

			GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


			backHomeBtnClick();


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured while completing the assessment for "+getSectionUnitName);
		} 
	}

	public void completeScormAssessment() throws CustomException{

		try {

			//CommonUtility.isElementVisible(assessmentElements.scormObjectIframe);
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(),30,10);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(assessmentElements.scormObjectIframe)); //).frameToBeAvailableAndSwitchToIt(frameName);

			//GlobalConstants.getDriver().switchTo().frame(assessmentElements.scormObjectIframe);			

			//			CommonUtility.isElementVisible(assessmentElements.lasVisitPopupBlock);

			Thread.sleep(2000);

			//			if(assessmentElements.lasVisitPopupBlock.size() >0) {
			//				
			//				assessmentElements.closeLastVistedPopup.click();
			//			}

			//Scroll to element and click
			scrollAndClick(assessmentElements.startScormAssessment);
			Thread.sleep(2000);			

			CommonUtility.isElementVisible(assessmentElements.sect1QnAblock);
			CommonUtility.scrollTLocator(assessmentElements.sect1QnAblock);

			//clicking on section1 answers
			if(assessmentElements.section1ScormAnswerLabelisPresent.size()>0) {

				//Scroll to element and click
				scrollAndClick(assessmentElements.section1ScormAnswerLabel);

			} else {

				//Scroll to element and click
				scrollAndClick(assessmentElements.section1ScormAnswerOption);				
			}


			//Scroll to element and click
			scrollAndClick(assessmentElements.section1ConfirmBtn);
			Thread.sleep(2000);	

			//Scroll to element and click
			scrollAndClick(assessmentElements.section1ClosePopup);
			Thread.sleep(1000);	

			if(assessmentElements.inputLabelLocator.size()>0) {				

				//Scroll to element and click
				scrollAndClick(assessmentElements.section2ScormAnswerLabel(1));
				scrollAndClick(assessmentElements.section2ScormAnswerLabel(2));
				scrollAndClick(assessmentElements.section2ScormAnswerLabel(3));
				scrollAndClick(assessmentElements.section2ScormAnswerLabel(5));
				scrollAndClick(assessmentElements.section2ScormAnswerLabel(7));				

			} else {

				scrollAndClick(assessmentElements.section2ScormAnswerOption(1));
				scrollAndClick(assessmentElements.section2ScormAnswerOption(2));
				scrollAndClick(assessmentElements.section2ScormAnswerOption(3));
				scrollAndClick(assessmentElements.section2ScormAnswerOption(5));
				scrollAndClick(assessmentElements.section2ScormAnswerOption(7));
			}

			//Scroll to element and click
			scrollAndClick(assessmentElements.section2ConfirmBtn);
			Thread.sleep(2000);	

			//Scroll to element and click
			scrollAndClick(assessmentElements.section2ClosePopup);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Problem encountered while completing Scorm Assessment");
		}

	}

	/**
	 * This method is used to scroll to the WebElement and click on it
	 */
	private void scrollAndClick(WebElement locator) throws CustomException {
		CommonUtility.isElementVisible(locator);
		CommonUtility.scrollTLocator(locator);
		CommonUtility.eleWaitAndClick(locator);

	}

	/**
	 * This method waits for time out of course
	 * @throws CustomException
	 */
	public void userDoesnotCompleteCourse() throws CustomException {

		try {
			Thread.sleep(70000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	/**
	 * This method is used to select correct option and submit the answer
	 * @throws CustomException
	 */
	public void completeDropDownAnswer() throws CustomException {		

		try {
			Thread.sleep(2000);

			WebElement dropDownClick = assessmentElements.selectOption;

			CommonUtility.eleWaitAndClick(dropDownClick);

			WebElement correctAnswer = assessmentElements.correctAnswerValue;

			CommonUtility.eleWaitAndClick(correctAnswer);

			//Thread.sleep(3000);

			WebElement submitBtn = assessmentElements.submitButton;

			//submit button
			CommonUtility.eleWaitAndClick(submitBtn);
			
			Thread.sleep(3000);

		} catch (Exception  e) {
			throw new CustomException("Problem occured while selecting correct answer");
		} 
	}

	public void verifySectionCount() throws CustomException {
		
		int actualCount, expCount = 0;
		
		try {
			
			actualCount = assessmentElements.sectionCount.size();	
			expCount = msgAssessmentPage.randomAssessmentSectionCount;
			
		} catch (Exception e) {
			throw new CustomException("Error in displaying required section count");
		}
		
		CommonUtility.verifyAndReport(actualCount, expCount);
	}
	
	public void multipleSectionHeaderNames(int sectionNumber) throws CustomException {

		String sectionName = assessmentElements.section1RDMA(sectionNumber).getText().trim();

		selectAnswer(sectionName);

	}
	
	/**
	 * This method is used to retrieve answer when only 1 section is used
	 * @throws CustomException
	 */
	public void singleSectionHeaderName() throws CustomException {
		
		String sectionName = assessmentElements.oneSectionName.getText().trim();

		selectAnswer(sectionName);
	}

	private void selectAnswer(String sectionName) throws CustomException {

		try {
			switch (sectionName) {

			case "Checkboxes":

				scrollAndClick(assessmentElements.selectProblemAnswer(sectionName,1));

				scrollAndClick(assessmentElements.selectProblemAnswer(sectionName,4));

				break;


			case "Multiple Choice":

				scrollAndClick(assessmentElements.selectProblemAnswer(sectionName,2));	

				break;


			case "Dropdown":

				CommonUtility.eleWaitAndClick(assessmentElements.dropDownClickLocator);

				CommonUtility.eleWaitAndClick(assessmentElements.selectProblemAnswer(sectionName,3));

				break;

			default:
				break;
			}

			Thread.sleep(2000);
			
			//submit button
			CommonUtility.eleWaitAndClick(assessmentElements.submitButtonSection(sectionName));
			
		} catch (CustomException e) {
			throw new CustomException("Problem occured while selecting correct answer");
			
		} catch (InterruptedException e) {
			throw new CustomException("Problem occured while selecting correct answer");
		}
	}

	/**
	 * This method is used to click on dismiss button after course completion
	 * @throws CustomException
	 */
	public void dismissBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(assessmentElements.dismissButton);

		} catch (Exception e) {


			throw new CustomException("Dismiss button not displayed or all courses have not been completed");
		} 

	}

	/**
	 * This method is used to click on back to home button course completion
	 * @throws CustomException
	 */
	public void backHomeBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(assessmentElements.backHomeButton);

		} catch (Exception e) {


			throw new CustomException("Back home button either not displayed or not clickable");
		} 

	}
	
	/**
	 * This method is used to click on close Program pop up button on course completion
	 * @throws CustomException
	 */
	public void closeProgramBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);
			
			String btnTxt = assessmentElements.popBtnTxt.getText();

			CommonUtility.eleWaitAndClick(assessmentElements.popUpBtnClick(btnTxt));

		} catch (Exception e) {


			throw new CustomException("Close Program button either not displayed or not clickable");
		} 

	}
	
	/**
	 * This method is used to click on Ok pop up button on course pause
	 * @throws CustomException
	 */
	public void okPopUpBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(assessmentElements.popUpBtnClick(msgAssessmentPage.ok));

		} catch (Exception e) {


			throw new CustomException("Close Program button either not displayed or not clickable");
		} 

	}

	/**
	 * This method is used to start time based assessments
	 * @throws CustomException
	 */
	public void startTimeAssessmentCourse() throws CustomException{

		try {
			Thread.sleep(2000);

			//add verify method here separate			

			CommonUtility.eleWaitAndClick(assessmentElements.startTimeBasedAssessmentBtn);

		} catch (Exception e) {

			throw new CustomException("Could not click or locate start button");
		} 
	}

	/**
	 * This method verifies the TBA main text
	 * @throws CustomException
	 */
	public void verifyTimeBasedAssessmentText() throws CustomException {

		String act,exp = null;

		try {
			act = assessmentElements.timeBasedAssessmentTextLocator.getText();
			exp = msgAssessmentPage.thisIsTBAText;
		} catch (Exception e) {

			throw new CustomException("Static text for TBA could not be located");
		} 

		CommonUtility.verifyAndReport(act, exp);		

	}

	/**
	 * This method verifies the TBA Description text
	 * @throws CustomException
	 */
	public void verifyTimeBasedAssessmentDescriptionText() throws CustomException {

		String act,exp = null;

		try {
			act = assessmentElements.tbaDescTextLocator.getText();
			exp = msgAssessmentPage.thisIsTBADescText;
		} catch (Exception e) {

			throw new CustomException("Static text for TBA Description could not be located");
		} 

		CommonUtility.verifyAndReport(act, exp);		

	}

	/**
	 * This method verifies the oops message text
	 * @throws CustomException
	 */
	public void verifyOopsMessageText() throws CustomException {

		verifyMessage(assessmentElements.tba_OopMessageText, msgAssessmentPage.oopsText);		

	}

	/**
	 * This method verifies the Course Missed message text
	 * @throws CustomException
	 */
	public void verifyCourseMissedMessageText() throws CustomException {

		verifyMessage(assessmentElements.tba_MissedMessageText, msgAssessmentPage.missedTurnMessage);		

	}

	/**
	 * This method verifies the second Course Missed message text
	 * @throws CustomException
	 */
	public void verifySecondCourseMissedMessageText() throws CustomException {

		verifyMessage(assessmentElements.tba_MissedMessageText2, msgAssessmentPage.incompleteAssessmentMsg);		

	}


	/**
	 * This is private method to verify texts across the page
	 * @param getActualText
	 * @param expectedText
	 * @throws CustomException
	 */
	private void verifyMessage(WebElement getActualText, String expectedText) throws CustomException {

		CommonUtility.verifyAndReport(getActualText.getText(), expectedText);

	}

	/**
	 * This method is used to click on Finish button after time elapsed
	 * @throws CustomException
	 */
	public void finishBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(assessmentElements.tba_FinishBtn1);

		} catch (Exception e) {


			throw new CustomException("Finish button locator not found");
		} 

	}

	/**
	 * This method is used to click on Back button after time elapsed
	 * @throws CustomException
	 */
	public void backBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(assessmentElements.unFinishedModulesBackBtn);

		} catch (Exception e) {


			throw new CustomException("Back button locator not found");
		} 

	}

	private int countNumberOfSections() throws CustomException {

		int sectionCount=0;

		try {

			//Comment below temp
			CommonUtility.isElementVisible(assessmentElements.assessmentFrame);
			
			if (assessmentElements.timerClock.size() > 0) {
				
				sectionCount = 1;
//				System.out.println("Timer clock present");
				
			} else {
				
			//expand left menu
			CommonUtility.eleWaitAndClick(assessmentElements.expandLeftMenu);

			sectionCount = assessmentElements.leftSectionTab.size();

			//collapse left menu
			CommonUtility.eleWaitAndClick(assessmentElements.collapseLeftMenu);
			
			}

		} catch (Exception e) {
			throw new CustomException("Could not expand/ collapse sections and hence did not return the count of sections.");
		}

		return sectionCount;
	}

	/**
	 * This method is used for Sequential logic where direct next module is clicked without completing current module
	 * @throws CustomException
	 */
	public void clickNextModuleWithoutCompleting() throws CustomException {

		try {
			GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			CommonUtility.isElementVisible(assessmentElements.assessmentFrame);

			if(assessmentElements.countButtons.size() > 1) {

				CommonUtility.eleWaitAndClick(assessmentElements.prevNextButton(msgAssessmentPage.nextBtn));

			} else {

				CommonUtility.eleWaitAndClick(assessmentElements.submitAssessmentBtn);

				Thread.sleep(1000);

				CommonUtility.eleWaitAndClick(assessmentElements.confirmSubmitAssessment);

				Thread.sleep(1000);

				CommonUtility.eleWaitAndClick(assessmentElements.finishAssessmentBtn);
			}
			
		} catch (CustomException e) {
			
			throw new CustomException("Next button locator not found");
			
		} catch (InterruptedException e) {
			
			throw new CustomException("Unexpected Error encountered in Sequential logic");
		}
	}
	
	/**
	 * This method is used to verify toast message during Sequential logic assessment for mandatory message
	 * @throws CustomException
	 */
	public void verifyToastSequentialLogic() throws CustomException {
		
		try {
			CommonUtility.isElementVisible(assessmentElements.toastWindow);
			
			verifyMessage(assessmentElements.toastMessage, "Please complete the current module");
			
			//CommonUtility.eleWaitAndClick(assessmentElements.closeToastWindow);
			System.out.println("verify toast done");
			
			//close toast window
			CommonUtility.eleWaitAndClick(assessmentElements.closeToastWindow);
			
		} catch (CustomException e) {
			throw new CustomException("Toast message not found");
		}
				
	}
	
	/**
	 * This method is used to click on close button on assessment page
	 * @throws CustomException
	 */
	public void closeAssessmentPage() throws CustomException{
		
		try {
			
			CommonUtility.eleWaitAndClick(assessmentElements.backHomeButton);			
			
		} catch (CustomException e) {
			throw new CustomException("Back home button locator was not found");
		}
	}

}
