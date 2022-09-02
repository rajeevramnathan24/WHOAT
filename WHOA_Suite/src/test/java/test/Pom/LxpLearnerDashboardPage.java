package test.Pom;




import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import core.Utils.TestExecutionManager;
import test.PageElements.LxpHomePageElements;
import test.PageMessages.MessagesLxpLearnerDashboardPage;




public class LxpLearnerDashboardPage {

	public LxpHomePageElements LxpHomePage= null;
	public MessagesLxpLearnerDashboardPage msgsLxpDashboardPage = null;

	public LxpLearnerDashboardPage() {
		LxpHomePage = new LxpHomePageElements(GlobalConstants.getDriver());
		msgsLxpDashboardPage = new MessagesLxpLearnerDashboardPage(GlobalConstants.getDriver());
	}


	/**
	 * This method verifies text in local language
	 * @throws CustomException
	 */

	public void verifyDiscoverLearningLocalLang_NOTUSED() throws CustomException {
		try {

			//			new core.Utils.LangParser.Dashboard().getDiscoverLearning().toString();
			//
			//
			//			System.out.println(CommonUtility.lngParser.getDashboard());
			//			System.out.println(new core.Utils.LangParser.Dashboard().getDiscoverLearning().toString());

			Thread.sleep(3000);

			//			CommonUtility.isElementVisibleNew(CommonUtility.replaceWebelement(LxpHomePage.xpathLxpDiscoverLearningNew, 
			//					CommonUtility.lngParser.getDashboard().getDiscoverLearning()));
			//
			//			CommonUtility.isElementVisible(LxpHomePage.xpathLxpDiscoverLearning);

			//			CommonUtility.highlightElement(CommonUtility.replaceWebelement(LxpHomePage.xpathLxpDiscoverLearning, 
			//					CommonUtility.lngParser.getDashboard().getDiscoverLearning()), 
			//					GlobalConstants.highlighterFlag);

			//			LxpHomePage.xpathLxpDiscoverLearning = (WebElement) CommonUtility.replaceWebelement(LxpHomePage.xpathLxpDiscoverLearning, 
			//					CommonUtility.lngParser.getDashboard().getDiscoverLearning());
			//			System.out.println(LxpHomePage.xpathLxpDiscoverLearning);
			//
			//			GlobalConstants.softAssertion.assertEquals(CommonUtility.replaceWebelement(LxpHomePage.xpathLxpDiscoverLearning, 
			//					CommonUtility.lngParser.getDashboard().getDiscoverLearning()),

			//					CommonUtility.lngParser.getDashboard().getDiscoverLearning());
			GlobalConstants.softAssertion.assertAll();
			GlobalConstants.scGlobal.write("This step is passed");


		} catch (AssertionError e) {

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);

			throw new CustomException("Error in step due to mismatch in actual value' "+LxpHomePage.xpathLxpDiscoverLearning+ "' and expected value' "+"Discover learning" +" '");
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}



	/**
	 * This method is used to verify the language type on course card name
	 * @throws CustomException
	 */
	public void verifyLanguageOnCourseCard() throws CustomException {

		try {

			Thread.sleep(4000);

			WebElement wLang = LxpHomePage.getRadioBtnLangLabel(LxpHomePage.getLanguage());

			CommonUtility.isElementClickable(wLang);

			CommonUtility.scrollTLocator(wLang);

			String expText = msgsLxpDashboardPage.getDynamicLanguage(LxpHomePage.getLanguage());

			String actualText = LxpHomePage.languageOnCard.getText();

			CommonUtility.scrollHighlightElement(LxpHomePage.languageOnCard);

			CommonUtility.verifyAndReport(actualText, expText);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify Discovery Learning text on the page
	 * @throws CustomException
	 */
	public void verifyDiscoverLearning() throws CustomException {

		try {

			CommonUtility.isElementVisible(LxpHomePage.xpathLxpDiscoverLearning);

			String actualTxt = LxpHomePage.BtnDiscoverLearning.getText().trim();

			CommonUtility.verifyAndReport(actualTxt, msgsLxpDashboardPage.Label_DiscoverLearning.trim());

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify recommendation text
	 * @throws CustomException
	 */
	public void verifyRecommendationHeader() throws CustomException {

		String actualTxt,expText=null;
		
		try {

			CommonUtility.isElementVisible(LxpHomePage.recommendationLocator);

			actualTxt = LxpHomePage.recommendationLocator.getText().trim();
			expText = msgsLxpDashboardPage.recommendationText;

		} catch (Exception e) {


			throw new CustomException(msgsLxpDashboardPage.recommendationTextNotFound);
		} 

		CommonUtility.verifyAndReport(actualTxt, expText);

	}
	
	/**
	 * This method is used to verify My programmes text
	 * @throws CustomException
	 */
	public void verifyMyProgrammeHeader() throws CustomException {

		String actualTxt,expText=null;
		
		try {

			CommonUtility.isElementVisible(LxpHomePage.myProgramme);

			actualTxt = LxpHomePage.myProgramme.getText().trim();
			expText = msgsLxpDashboardPage.myProg;
			CommonUtility.highlightElement(LxpHomePage.myProgramme, GlobalConstants.highlighterFlag);
			CommonUtility.threadWait(3000);

		} catch (Exception e) {


			throw new CustomException(msgsLxpDashboardPage.recommendationTextNotFound);
		} 

		CommonUtility.verifyAndReport(actualTxt, expText);

	}
	
	

	public void clickLogOut() throws CustomException{

		try {


			//			CommonUtility.highlightClick(LxpHomePage.xpathLxpLogoutUser, 
			//					GlobalConstants.highlighterFlag);
			CommonUtility.isElementVisibleNew(LxpHomePage.xpathLxpLogoutUser);
			CommonUtility.isElementClickable(LxpHomePage.xpathLxpLogoutUser);
			LxpHomePage.xpathLxpLogoutUser.click();		

			//			CommonUtility.jQueryClickByClassName(LxpHomePage.logoutString);

			CommonUtility.isElementVisible(LxpHomePage.xpathLxpLogOutBtn);

			CommonUtility.highlightClick(LxpHomePage.xpathLxpLogOutBtn, 
					GlobalConstants.highlighterFlag);		
			LxpHomePage.xpathLxpLogOutBtn.click();
			
			CommonUtility.isElementVisible(LxpHomePage.logoutModalPopUp);
			CommonUtility.eleWaitAndClick(LxpHomePage.logoutModalPopUp);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}

	}

	public void clickLogOutLocalLang() throws CustomException{

		try {


			CommonUtility.highlightClick(LxpHomePage.xpathLxpLogoutUser, 
					GlobalConstants.highlighterFlag);
			LxpHomePage.xpathLxpLogoutUser.click();			

			CommonUtility.isElementVisible(LxpHomePage.xpathLxpLogOutBtn);

			CommonUtility.highlightClick(LxpHomePage.xpathLxpLogOutBtn, 
					GlobalConstants.highlighterFlag);		
			LxpHomePage.xpathLxpLogOutBtn.click();

			//Thread.sleep(3000);
			GlobalConstants.scGlobal.write("This step has been passed & no screen shot has been taken");

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}
	}

	/**
	 * This method is used to click on user Label on top left menu
	 */
	public void userImageLabelClick() throws CustomException {

		try {
			Thread.sleep(1000);

			CommonUtility.eleWaitAndClick(LxpHomePage.userLabelLeftMenu);

		} catch (InterruptedException e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}


	}

	/**
	 * This method is used to click on Settings tab to the left menu
	 */
	public void settingsTabClick() throws CustomException {

		try {
			Thread.sleep(1000);

			CommonUtility.eleWaitAndClick(LxpHomePage.settingsTab);

		} catch (InterruptedException e) {


			throw new CustomException(msgsLxpDashboardPage.locatorNotFound(msgsLxpDashboardPage.settings));
		}


	}

	/**
	 * This method is used to user click on Goal edit button
	 */
	public void editGoalButtonClick() throws CustomException {

		try {
			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(LxpHomePage.editSettings(msgsLxpDashboardPage.learning));

			//			CommonUtility.jSclickByClassName(LxpHomePage.editButton);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException(msgsLxpDashboardPage.locatorNotFound(msgsLxpDashboardPage.editGoalLang));
		}


	}

	/**
	 * This method is used to user click on edit profile button
	 */
	public void editProfileButtonClick() throws CustomException {

		try {
			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(LxpHomePage.editProfileBtn);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}


	}	
	
	/**
	 * This method is used to update the goal and verify
	 * @throws CustomException
	 */
	public void updateGoal_Verify() throws CustomException {
		
		inputGoalText_Save_Verify(msgsLxpDashboardPage.update);
		
	}
	
	/**
	 * This method is used to revert back the goal and verify
	 * @throws CustomException
	 */
	public void revertGoal_Verify() throws CustomException {
		
		inputGoalText_Save_Verify(msgsLxpDashboardPage.revertMode);
		
	}

	/**
	 * This method is used to input goal text on the goals screen
	 * @param mode
	 * @throws CustomException
	 */
	private void inputGoalText_Save_Verify(String mode) throws CustomException{

		String expText, actualTxt = null;
		
		try {

			Thread.sleep(2000);

			

			WebElement wg = LxpHomePage.inputGoalTextArea;
			wg.click();			

			if (mode.contentEquals(msgsLxpDashboardPage.update)) {

				LxpHomePageElements.oldText.add(0, CommonUtility.javaScriptExtractText(LxpHomePage.inputGoalTextArea));

				expText = LxpHomePageElements.oldText.get(0) + msgsLxpDashboardPage.updatedText;				

			} else {

				expText = LxpHomePageElements.oldText.get(0).toString();

				//enter course name to search
				//CommonUtility.sendTextRB(LxpHomePage.inputGoalTextArea,expText);

			}

			//enter course name to search
			CommonUtility.sendTextRB(LxpHomePage.inputGoalTextArea,expText);

			Thread.sleep(500);
			CommonUtility.eleWaitAndClick(LxpHomePage.saveBtn);

			Thread.sleep(1000);

			CommonUtility.eleWaitAndClick(LxpHomePage.closeBtn);

			Thread.sleep(1000);

			editGoalButtonClick();

			actualTxt = CommonUtility.javaScriptExtractText(LxpHomePage.inputGoalTextArea);

		} catch (Exception e) {


			throw new CustomException(msgsLxpDashboardPage.methodGoalProblem);
		} 
		
		CommonUtility.verifyAndReport(actualTxt.trim(), expText.trim());

		CommonUtility.eleWaitAndClick(LxpHomePage.closeBtn);

	}

	/**
	 * This method is used to update and verify profile
	 * @throws CustomException
	 */
	public void updateVerifyProfile() throws CustomException {
		
		inputProfile_Save_Verify(msgsLxpDashboardPage.update);
	}
	
	
	public void revertVerifyProfile() throws CustomException {
		
		inputProfile_Save_Verify(msgsLxpDashboardPage.revertMode);
	}
	
	/**
	 * This method is used to update profile details and verify
	 * @param mode
	 * @throws CustomException
	 */
	private void inputProfile_Save_Verify(String mode) throws CustomException{

		//String expTextFirstName, actualTxtFirstName = null;
		ArrayList<Object> expectedText = new ArrayList<Object>();
		ArrayList<Object> actualText = new ArrayList<Object>();
		
		try {

			Thread.sleep(2000);

			if (mode.contentEquals(msgsLxpDashboardPage.update)) {

				LxpHomePageElements.oldText.add(0, CommonUtility.javaScriptExtractText(LxpHomePage.firstNameInput));
				LxpHomePageElements.oldText.add(1, CommonUtility.javaScriptExtractText(LxpHomePage.lastNameInput));
				LxpHomePageElements.oldText.add(2, LxpHomePage.genderDropDownClick.getText());
				LxpHomePageElements.oldText.add(3, LxpHomePage.ageDropDownClick.getText());
				LxpHomePageElements.oldText.add(4, LxpHomePage.roleDropDownClick.getText());
				LxpHomePageElements.oldText.add(5, LxpHomePage.yearsDropDownClick.getText());

				//expTextFirstName = LxpHomePageElements.oldText.get(0) + msgsLxpDashboardPage.updatedText;	

				expectedText.add(LxpHomePageElements.oldText.get(0) + msgsLxpDashboardPage.updatedText);
				expectedText.add(LxpHomePageElements.oldText.get(1) + msgsLxpDashboardPage.updatedText);
				expectedText.add(msgsLxpDashboardPage.genderFemale);
				expectedText.add(msgsLxpDashboardPage.ageGroup);
				expectedText.add(msgsLxpDashboardPage.role);
				expectedText.add(msgsLxpDashboardPage.years);

			} else {

				//				expTextFirstName = LxpHomePageElements.oldText.get(0).toString();	
				expectedText.add(LxpHomePageElements.oldText.get(0).toString());
				expectedText.add(LxpHomePageElements.oldText.get(1).toString());

				//				for (int i = 0; i < 3; i++) {
				//					expectedText.add(LxpHomePageElements.oldText.get(0).toString());
				//				}
				//				expectedText.add(LxpHomePageElements.oldText.get(1).toString());
				//				expectedText.add(LxpHomePageElements.oldText.get(2).toString());
				//				expectedText.add(LxpHomePageElements.oldText.get(3).toString());
				//				expectedText.add(LxpHomePageElements.oldText.get(4).toString());
				//				expectedText.add(LxpHomePageElements.oldText.get(5).toString());
			}

			//enter course name to search
			//CommonUtility.sendTextRB(LxpHomePage.firstNameInput,expTextFirstName);

			CommonUtility.sendTextRB(LxpHomePage.firstNameInput,expectedText.get(0));
			CommonUtility.sendTextRB(LxpHomePage.lastNameInput,expectedText.get(1));

			//			CommonUtility.eleWaitAndClick(LxpHomePage.genderDropDownClick);
			//			CommonUtility.eleWaitAndClick(LxpHomePage.selectFemaleGender);

			//			CommonUtility.eleWaitAndClick(LxpHomePage.ageDropDownClick);
			//			CommonUtility.eleWaitAndClick(LxpHomePage.selectAgeGroup);
			//			
			//			CommonUtility.eleWaitAndClick(LxpHomePage.roleDropDownClick);
			//			CommonUtility.eleWaitAndClick(LxpHomePage.selectRoleType);
			//			
			//			CommonUtility.eleWaitAndClick(LxpHomePage.yearsDropDownClick);
			//			CommonUtility.eleWaitAndClick(LxpHomePage.selectYears);
			//			
			//			CommonUtility.dropDownValueSelect(LxpHomePage.ageDropDownClick, expectedText.get(3));
			//			CommonUtility.dropDownValueSelect(LxpHomePage.roleTypeInput, expectedText.get(4));
			//			CommonUtility.dropDownValueSelect(LxpHomePage.yearsInput, expectedText.get(5));
			//			
			//			CommonUtility.sendTextRB(LxpHomePage.genderInput,expectedText.get(2));
			//			CommonUtility.sendTextRB(LxpHomePage.ageCatInput,expectedText.get(3));
			//			CommonUtility.sendTextRB(LxpHomePage.roleTypeInput,expectedText.get(4));
			//			CommonUtility.sendTextRB(LxpHomePage.yearsInput,expectedText.get(5));

			Thread.sleep(1000);
			CommonUtility.eleWaitAndClick(LxpHomePage.saveBtn);

			Thread.sleep(2000);

			editProfileButtonClick();

			Thread.sleep(2000);

			//actualTxtFirstName = CommonUtility.javaScriptExtractText(LxpHomePage.firstNameInput);
			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.firstNameInput));
			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.lastNameInput));
			//			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.genderDropDownClick));
			//			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.ageDropDownClick));
			//			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.roleDropDownClick));
			//			actualText.add(CommonUtility.javaScriptExtractText(LxpHomePage.yearsDropDownClick));
			//			
			//CommonUtility.scrollHighlightElement(LxpHomePage.firstNameInput);

			//CommonUtility.verifyAndReport(actualTxtFirstName, expTextFirstName);

			

			//			for (int i = 0; i < 3; i++) {
			//				CommonUtility.verifyAndReport(actualText.get(0), expectedText.get(0));
			//			}



		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException(msgsLxpDashboardPage.methodGoalProblem);
		} 
		
		CommonUtility.verifyAndReport(actualText.get(0).toString().trim(), expectedText.get(0).toString().trim());
		CommonUtility.verifyAndReport(actualText.get(1).toString().trim(), expectedText.get(1).toString().trim());

	}

	/**
	 * This method is used to click on discover learning button on the top to search for courses
	 */
	public void searchDiscoverLearningButtonClick() throws CustomException {

		try {
			Thread.sleep(1000);

			CommonUtility.eleWaitAndClick(LxpHomePage.BtnDiscoverLearning);

		} catch (InterruptedException e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}


	}

	/**
	 * This method is used to check if both source and target language are same
	 * @param srcLang
	 * @param tgtLang
	 * @throws CustomException
	 */
	public void sameLanguageCheck(String srcLang, String tgtLang) throws CustomException {

		try {
			if (srcLang.equals(tgtLang)) {

				GlobalConstants.scGlobal.write("Both source and target language are same as mentioned in feature file");

				CommonUtility.getLanguageDataFromJson(tgtLang);
			}
		} catch (Exception e) {

			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used only when non english language is selected for both source and target
	 * @param localSourceTargetLang
	 * @throws CustomException
	 */
	private void nonEnglishSourceTargetLanguage(String localSourceTargetLang) throws CustomException {

		try {
			GlobalConstants.scGlobal.write("Identical Source and Target language detected. Currently it supports only when both Source and Target language set to English.");
			CommonUtility.verifyAndReport("Non-English Source", localSourceTargetLang);			

		} catch (Exception e) {
			throw new CustomException("Identical Source and Target language detected. Currently it supports only when both Source and Target language set to English.");
		}
	}

	/**
	 * Used to update the language on my profile page using the edit button
	 * @param baseLanguage
	 * @param targetLanguage
	 * @throws CustomException
	 */
	public void updateLanguage(String baseLanguage, String targetLanguage) throws CustomException {

		if (baseLanguage.equals(targetLanguage)) {

			//CommonUtility.getLanguageDataFromJson(targetLanguage);

			if(!baseLanguage.equals("English")) {

				try {
					nonEnglishSourceTargetLanguage(baseLanguage);

				} catch (Exception e) {
					throw new CustomException("Identical Source and Target language detected. Currently it supports only when both Source and Target language set to English.");
				}

			} else {

				GlobalConstants.scGlobal.write("Both source and target language are identical and set to English");

				CommonUtility.getLanguageDataFromJsonNew(targetLanguage);

			}

		} else { 

			try {
				Thread.sleep(3000);

				//update language
				CommonUtility.isElementVisible(LxpHomePage.settingsTab);

				//Click on profile image on left panel
				LxpHomePage.settingsTab.click();
				Thread.sleep(2000);

				String langName = CommonUtility.lngParserNew.getMyProfile().getLanguage().getHeading();

				WebElement editLang = LxpHomePage.editSettings(langName);

				CommonUtility.isElementVisible(editLang);


				//Click on language edit button
				editLang.click();
				Thread.sleep(2000);

				CommonUtility.isElementVisibleNew(LxpHomePage.selectedLanguage);

				LxpHomePage.selectedLanguage.click();

				CommonUtility.isElementVisibleNew(LxpHomePage.selectTargetLangFromDropDownLocator(targetLanguage));

				LxpHomePage.selectTargetLangFromDropDownLocator(targetLanguage).click();


				CommonUtility.getLanguageDataFromJsonNew(targetLanguage);

				//page refresh after language update
				//GlobalConstants.getDriver().navigate().refresh();
				CommonUtility.isElementVisible(LxpHomePage.langTypeId);

				CommonUtility.isElementVisibleNew(LxpHomePage.settingsTab);

				//click on home link
				LxpHomePage.settingsTab.click();
			} catch (Exception e) {
				throw new CustomException("Unexpected error occured due to element not found or invalid locator");
			}

		}



	}

	/**
	 * This method is used to verify home text on LXP landing page
	 * @throws CustomException
	 */
	public void verifyhomeTextLocalLanguage() throws CustomException {

		try {

			Thread.sleep(3000);
			CommonUtility.isElementVisibleNew(LxpHomePage.homeLinkLeftMenu);
			verifyLanguageContentNew(LxpHomePage.homeLinkLeftMenu.getText(),CommonUtility.lngParser.getGeneral().getMenu().getHome().toUpperCase());

		} catch (Exception e) {
			throw new CustomException("Text to be verified was not present on screen or actual and expected text was different");
		}
	}

	/**
	 * This method is used to verify my Learning text on LXP landing page
	 * @throws CustomException
	 */
	public void verifyMyLearningTextLocalLanguage() throws CustomException {

		try {

			CommonUtility.isElementVisibleNew(LxpHomePage.myLearningLinkLeftMenu);
			verifyLanguageContentNew(LxpHomePage.myLearningLinkLeftMenu.getText(),CommonUtility.lngParser.getGeneral().getMenu().getMyLearning().toLowerCase());

		} catch (Exception e) {
			throw new CustomException("Text to be verified was not present on screen or actual and expected text was different");
		}
	}

	/**
	 * This method is used to verify feedback text on LXP landing page
	 * @throws CustomException
	 */
	public void verifyFeedbackTextLocalLanguage() throws CustomException {

		try {

			String feedbackText = CommonUtility.lngParserNew.getMyProfile().getFeedback();
			Thread.sleep(3000);
			verifyLanguageContentNew(LxpHomePage.feedbackLeftMenuNew(feedbackText).getText(), feedbackText);

		} catch (Exception e) {
			throw new CustomException("Text to be verified was not present on screen or actual and expected text was different");
		}
	}

	/**
	 * This method is generic private method to verify all local language fields on the screens
	 * @param actText
	 * @param expText
	 * @throws CustomException
	 */
	private void verifyLanguageContentNew(String actText, String expText) throws CustomException {

		try {

			Thread.sleep(2000);

			CommonUtility.verifyAndReport(actText, expText);			

			GlobalConstants.scGlobal.write("Following text(s) verified for "+ "\n"+ "\n"+
					"Expected Text "+expText+" --- "+"Actual Text "+actText);

		}  catch (Exception e) {


			throw new CustomException("Either the source language was not set to English in feature file or the actual and expected language contents did not match");
		} 

	}

	public void  verifyLanguageContentsNOTUSED(String langSelected) throws CustomException {

		try {

			String actualText = CommonUtility.lngParser.getGeneral().getMenu().getHome().toUpperCase();

			//verify my home text on left menu
			Thread.sleep(2000);
			GlobalConstants.softAssertion.assertEquals(LxpHomePage.homeLinkLeftMenu.getText(), 
					CommonUtility.lngParser.getGeneral().getMenu().getHome().toUpperCase());

			//verify my learning text on left menu
			GlobalConstants.softAssertion.assertEquals(LxpHomePage.myLearningLinkLeftMenu.getText(), 
					CommonUtility.lngParser.getGeneral().getMenu().getMyLearning().toUpperCase());

			//specific field verify for languages
			switch (langSelected) {

			case "Chinese":

				//verify feedback link in local lang

				actualText = CommonUtility.replaceWebElementString(LxpHomePage.lang_FeedbackLeftMenu, CommonUtility.lngParser.getMyProfile().getFeedback()).getText();
				Thread.sleep(2000);
				GlobalConstants.softAssertion.assertEquals(actualText, 
						CommonUtility.lngParser.getMyProfile().getFeedback());

				break;

			case "English":

				actualText= LxpHomePage.feedbackLeftMenu.getText();
				GlobalConstants.softAssertion.assertEquals(actualText, 
						CommonUtility.lngParser.getMyProfile().getFeedback().toUpperCase());				

				break;

			default:
				break;
			}

			GlobalConstants.softAssertion.assertAll();

			GlobalConstants.scGlobal.write("Following text(s) verified for "+ langSelected + "\n"+ "\n"+
					"Home Text --- "+LxpHomePage.homeLinkLeftMenu.getText() +"\n"+
					"My Learning --- "+LxpHomePage.myLearningLinkLeftMenu.getText() +"\n"+
					"Feedback ---"+actualText);

		}  catch (AssertionError e) {

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);

			throw new CustomException("Either the source language was not set to English in feature file or the actual and expected language contents did not match");

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}

	public void verifySetBaseLangIsEnglish() throws CustomException {

		CommonUtility.isElementVisible(LxpHomePage.langTypeId);

		try {
			String langClass = LxpHomePage.langTypeId.getAttribute("class").toString();

			String fetchLang = LxpHomePage.langCheck(langClass);

			if (langClass.contentEquals("app-en")) {

				System.out.println("English is correctly set as source language");

				CommonUtility.getLanguageDataFromJsonNew(fetchLang);


			} else {

				CommonUtility.getLanguageDataFromJsonNew(fetchLang);

				Thread.sleep(3000);

				CommonUtility.isElementVisibleNew(LxpHomePage.settingsTab);

				LxpHomePage.settingsTab.click();

				Thread.sleep(2000);

				String langName = CommonUtility.lngParserNew.getMyProfile().getLanguage().getHeading();

				WebElement editLang = LxpHomePage.editSettings(langName);

				//Click on language edit button
				editLang.click();

				Thread.sleep(500);
				//select the chinese value from drop down
				LxpHomePage.selectedLanguage.click();

				Thread.sleep(500);

				LxpHomePage.selectEnglishLanguage.click();

				Thread.sleep(3000);
				
				CommonUtility.getLanguageDataFromJsonNew(LxpHomePage.langCheck(LxpHomePage.langTypeId.getAttribute("class").toString()));

			}			

			//			CommonUtility.getLanguageDataFromJson(targetLanguage);

			GlobalConstants.getDriver().navigate().refresh();

		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
			throw new CustomException("Could not set base language to English");
		} 

	}




	/**
	 * This method is used to click on Language Radio button filter on the top of the page
	 * @param langToClick
	 * @throws CustomException
	 */
	public void langRadioBtnClick(String langToClick) throws CustomException {

		LxpHomePage.setLanguage(langToClick);

		try {
			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(LxpHomePage.getDynamicRadioBtnXpath(langToClick));

		} catch (InterruptedException e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}


	}

}
