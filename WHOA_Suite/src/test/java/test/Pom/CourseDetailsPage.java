package test.Pom;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import core.Utils.TestExecutionManager;
import test.PageElements.CourseDetailsPageElements;
import test.PageElements.CourseDiscoveryPageElements;
import test.PageElements.StudioHomeElements;
import test.PageMessages.MessagesCourseDetailsPage;




public class CourseDetailsPage {

	public CourseDetailsPageElements courseDetailElements = null;
	public MessagesCourseDetailsPage messageCourseDetailsPage = null;
	public StudioHomeElements studioHomepageElements = null;


	public CourseDetailsPage() {
		courseDetailElements = new CourseDetailsPageElements(GlobalConstants.getDriver());
		messageCourseDetailsPage = new MessagesCourseDetailsPage(GlobalConstants.getDriver());
		studioHomepageElements = new StudioHomeElements(GlobalConstants.getDriver());

	}


	/**
	 * This method is used to click on enroll button on course details page
	 * @throws CustomException
	 * @throws InterruptedException 
	 */
	public void enrollBtnClick() throws CustomException{

		String actText = null;
		try {

			Thread.sleep(2000);

			CommonUtility.isElementVisible(courseDetailElements.enrollButton);
			CommonUtility.isElementClickable(courseDetailElements.enrollButton);

			CommonUtility.eleWaitAndClick(courseDetailElements.enrollButton);

			Thread.sleep(1000);

			//wait for continue enroll button and success text
			CommonUtility.isElementVisible(courseDetailElements.continueBtnPopUp);
			CommonUtility.isElementClickable(courseDetailElements.continueBtnPopUp);

			actText = courseDetailElements.enrollSuccessLabel.getText();

			CommonUtility.highlightElement(courseDetailElements.enrollSuccessLabel,GlobalConstants.highlighterFlag);

		} catch (Exception e) {

			throw new CustomException(messageCourseDetailsPage.enrollBtnError);
		} 

		//Verify Statement
		CommonUtility.verifyAndReport(actText, messageCourseDetailsPage.enrollSuccessful);

		try {
			CommonUtility.eleWaitAndClick(courseDetailElements.continueBtnPopUp);

			Thread.sleep(2000);
		} catch (Exception e) {

			throw new CustomException(messageCourseDetailsPage.enrollBtnError);
		}

	}

	/**
	 * This method is used to click on Unenroll button on course details page
	 * @throws CustomException
	 */
	public void unEnrollBtnClick() throws CustomException{

		try {

			Thread.sleep(5000);

			CommonUtility.scrollTLocator(courseDetailElements.courseOptionButton);

			CommonUtility.eleWaitAndClick(courseDetailElements.courseOptionButton);

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseDetailElements.unEnrollButton);

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseDetailElements.confirmUnenrollButton);

			Thread.sleep(6000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException(messageCourseDetailsPage.unEnrollBtnError);
		} 

	}

	/**
	 * This method is used to click on My Learning on course details page
	 * @throws CustomException
	 */
	public void myLearningClick() throws CustomException{

		try {

			//Thread.sleep(5000);

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseDetailElements.leftMenuXpath(messageCourseDetailsPage.myLearning));


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException(messageCourseDetailsPage.myLearnBtnError);
		} 

	}

	/**
	 * This method is used to click on Start learning button on course details page
	 * @throws CustomException
	 */
	public void startLearningBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);

			String buttonType = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='cd__actions-wrapper']//div[@class='col']")).getText();

			if (buttonType.contains("Start")) {
				CommonUtility.eleWaitAndClick(courseDetailElements.startLearningButton);
			} else {

				CommonUtility.eleWaitAndClick(courseDetailElements.continueEnrollButton);
			}
			Thread.sleep(4000);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Continue learning button on course details page
	 * @throws CustomException
	 */
	public void continueLearningBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(courseDetailElements.continueEnrollButton);


			Thread.sleep(4000);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}


	/**
	 * This method is used to click on review program button on course details page
	 * @throws CustomException
	 */
	public void reviewProgrmBtnClick() throws CustomException{

		try {

			Thread.sleep(3000);


			CommonUtility.eleWaitAndClick(courseDetailElements.reviewProgrammeButton);

			Thread.sleep(6000);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	//	
	//	private String returnCardName(String matchCardName) throws CustomException {
	//		
	//		String cardName = null;
	//		
	//		int cardCount = courseDetailElements.courseCardList.size();
	//		
	//		for (int i = 0; i < cardCount; i++) {
	//			
	//			if(courseDetailElements.getSpecificCard(i).getText().equals(matchCardName) ) {
	//				
	//				cardName = courseDetailElements.getSpecificCard(i).getText();
	//				
	//				CourseDetailsPageElements.courseCardName = courseDetailElements.getSpecificCard(i);
	//				
	//				break;
	//			}
	//			
	//		}
	//		
	//		return cardName;
	//		
	//	}

	/**
	 * This method is used to verify whether course card is present in continue learning tab
	 * @throws CustomException
	 */
	public void verifyCourseCardPresent() throws CustomException{

		//		String courseCard = studioCourseName.getCourseName();
		String expCourseCard = CourseDiscoveryPageElements.runtimeCourseName;

		String actualText = null;

		try {

			CommonUtility.threadWait(33000);
			
//			List<WebElement> initialValue = GlobalConstants.getDriver().findElements(By.xpath("*//div[@class='d-flex']/div"));
//			
//			WebElement newValue = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='d-block']/div[@class='d-block']"));
//			
//			if(initialValue.size()>0) {
//				
//				CommonUtility.elementDisplayed(courseDetailElements.courseCardList, 30);
//			}
//			
//			System.out.println("Wait complete");
			
//			WebElement dblock = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='d-block']/div[@class='d-block']"));

			CommonUtility.isElementVisible(GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='d-block']/div[@class='d-block']")));		

//			int cardCount = courseDetailElements.courseCardList.size();
			
			CourseDetailsPageElements.courseCardLocator = iterateReturnCardLocator(expCourseCard);

			actualText = CourseDetailsPageElements.courseCardLocator.getText();

			

		} catch (Exception e) {
			throw new CustomException(messageCourseDetailsPage.cardNotPresent);
		}


		CommonUtility.verifyAndReport(actualText, expCourseCard);

		CourseDetailsPageElements.courseCardLocator.click();

		//		try {
		//
		//			Thread.sleep(6000);
		//
		//			CommonUtility.isElementVisible(courseDetailElements.firstCardInMylearningResults);
		//			CommonUtility.isElementClickable(courseDetailElements.firstCardInMylearningResults);
		//
		//			String actualValue = courseDetailElements.cardPresent(courseCard);
		//
		//			CommonUtility.verifyAndReport(actualValue, courseCard);
		//
		//		} catch (Exception e) {
		//
		//			throw new CustomException(messageCourseDetailsPage.cardNotPresent);
		//		} 
	}

	/**
	 * This method is used to click on course card when card name entered by the user 
	 * @throws CustomException
	 */
	public void courseCardClick() throws CustomException{

		try {

			//			String cardName = studioCourseName.getCourseName();
			String cardName = CourseDiscoveryPageElements.runtimeCourseName;

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseDetailElements.dynamicCourseCardLocator(cardName));

			Thread.sleep(6000);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}

	/**
	 * This method is used to click on course card under My learnings
	 * @throws CustomException
	 */
	public void myLearningsClickCourseCard() throws CustomException{
		
		
		try {

			Thread.sleep(3000);
			
			WebElement courseClick = CourseDetailsPageElements.courseCardLocator;
			
			courseClick.click();
			
//			WebElement clickCard = iterateReturnCardLocator(expCourseCard);
//			
//			System.out.println(clickCard.getText());
//			
//			clickCard.click();
//
//			int cardCount = courseDetailElements.courseCardList.size();
//
//			//			returnCardName(expCourseCard);
//
//			for (int i = 0; i < cardCount; i++) {
//
//				if(courseDetailElements.getSpecificCard(i).getText().equals(expCourseCard) ) {
//					
//					CommonUtility.scrollTLocator(courseDetailElements.getSpecificCard(i));
//
//					courseDetailElements.getSpecificCard(i).click();;
//					
//					break;
//				}
//
//			}
			Thread.sleep(6000);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}
	
	/**
	 * This method returns the webelement of the locator if match is found in the text
	 * @param matchText
	 * @return WebElement
	 * @throws CustomException
	 */
	private WebElement iterateReturnCardLocator(String matchText) throws CustomException {
		
		WebElement cardLocator = null;
		
		int cardCount = courseDetailElements.courseCardList.size();

		//			returnCardName(expCourseCard);

		for (int i = 0; i < cardCount; i++) {

			if(courseDetailElements.getSpecificCard(i).getText().equals(matchText) ) {
				
				CommonUtility.scrollTLocator(courseDetailElements.getSpecificCard(i));

				cardLocator = courseDetailElements.getSpecificCard(i);
				
				break;
			}

		}
		
		return cardLocator;
		
	}

	/**
	 * This method is used to verify course status is updated as enrolled
	 * @param statusType
	 * @throws CustomException
	 */
	public void courseStatusVerify_Enroll_Unenroll(String statusType) throws CustomException{

		try {

			Thread.sleep(6000);


			if (statusType.contentEquals(messageCourseDetailsPage.enroll)) {

				CommonUtility.scrollTLocator(courseDetailElements.enrolledStatusLabel);
				
				CommonUtility.highlightElement(courseDetailElements.enrolledStatusLabel, GlobalConstants.highlighterFlag);

				CommonUtility.verifyAndReport(courseDetailElements.enrolledStatusLabel.getText().trim(), messageCourseDetailsPage.enrolled);

			} else if (statusType.contentEquals(messageCourseDetailsPage.unEnroll)) {

				CommonUtility.scrollTLocator(courseDetailElements.enrollButton);

				CommonUtility.verifyAndReport(courseDetailElements.enrollButton.getText().trim(), messageCourseDetailsPage.enroll);

			}
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	//	/**
	//	 * This method is used to verify course status is updated as Unenrolled
	//	 * @throws CustomException
	//	 */
	//	public void courseStatusVerifyUnenrolled() throws CustomException{
	//
	//		try {
	//
	//			Thread.sleep(5000);
	//
	//			CommonUtility.scrollTLocator(courseDetailElements.enrolledStatusLabel);
	//
	//			GlobalConstants.softAssertion.assertEquals(courseDetailElements.enrolledStatusLabel.getText().trim(),
	//					messageCourseDetailsPage.enrolled);
	//			GlobalConstants.softAssertion.assertAll();		
	//
	//			GlobalConstants.scGlobal.write(messageCourseDetailsPage.courseStatusEnrolled);
	//
	//			CommonUtility.captureScreenshot();
	//			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);
	//
	//
	//		} catch (AssertionError e) {
	//
	//			CommonUtility.captureScreenshot();
	//			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);
	//
	//			throw new CustomException("Error in step due to mismatch in actual value' "+
	//					courseDetailElements.enrolledStatusLabel.getText().trim()
	//					+ "' and expected value' "+
	//					messageCourseDetailsPage.enrolled +" '");
	//
	//		} catch (Exception e) {
	//
	//
	//			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
	//		} 
	//
	//	}

	/**
	 * This method is used to verify course completion status
	 * @throws CustomException
	 */
	public void courseCompletionVerifyOld() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.scrollTLocator(courseDetailElements.courseCompletedLabel);

			GlobalConstants.softAssertion.assertEquals(courseDetailElements.courseCompletedLabel.getText().trim(),
					messageCourseDetailsPage.completedSuccessfully);

			GlobalConstants.softAssertion.assertEquals(courseDetailElements.reviewProgrammeButton.getText().trim(),
					messageCourseDetailsPage.reviewProgramme);

			GlobalConstants.softAssertion.assertAll();		

			GlobalConstants.scGlobal.write(messageCourseDetailsPage.courseCompletedSuccessfully);

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);


		} catch (AssertionError e) {

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);

			throw new CustomException("Error in step due to mismatch in actual value' "+
					courseDetailElements.courseCompletedLabel.getText().trim()+ "' and expected value' "+
					messageCourseDetailsPage.completedSuccessfully +" '");

		} catch (Exception e) {

			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify course completion status
	 * @throws CustomException
	 */
	public void courseCompletionVerify() throws CustomException{

		CommonUtility.threadWait(2000);

		CommonUtility.verifyAndReport(courseDetailElements.courseCompletedLabel.getText().trim(), messageCourseDetailsPage.completedSuccessfully);

		CommonUtility.verifyAndReport(courseDetailElements.reviewProgrammeButton.getText().trim(),messageCourseDetailsPage.reviewProgramme);

	}

	/**
	 * This method is used to verify course name navigated via Studio page
	 * @throws CustomException
	 */
	public void verifyCourseName() throws CustomException{

		String courseNameExpText = studioHomepageElements.getCourseName();
		String actualText = null;

		try {

			GlobalConstants.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Thread.sleep(7000);

			CommonUtility.switchToTab(1);

			CommonUtility.isElementVisible(courseDetailElements.courseNameOnMainBoard);
			Thread.sleep(1000);

			actualText = courseDetailElements.courseNameOnMainBoard.getAttribute("title").trim();

		} catch (Exception e) {

			e.printStackTrace();

			throw new CustomException("Course could not be found in LXP");
		} 

		CommonUtility.verifyAndReport(actualText, courseNameExpText);

		CommonUtility.switchToTab(0);

	}

	/**
	 * 
	 * @throws CustomException
	 */
	public void verifyCourseNameinLocalLang(String langSelected) throws CustomException {

		try {

			String langLabelExpText = courseDetailElements.returnLanglocator(langSelected);

			CommonUtility.isElementVisible(courseDetailElements.courseWrapperTable);

			Thread.sleep(1000);

			WebElement wlangLabel = courseDetailElements.getLangLabel(langSelected);

			String langLabelActualText = wlangLabel.getText();

			CommonUtility.verifyAndReport(langLabelActualText, langLabelExpText);

		} catch (Exception e) {

			e.printStackTrace();

			throw new CustomException("Course could not be found in LXP");
		} 
	}

}
