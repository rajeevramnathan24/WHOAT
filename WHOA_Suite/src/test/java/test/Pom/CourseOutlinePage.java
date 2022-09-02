package test.Pom;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.AddComponentPageElements;
import test.PageElements.AdminPortalPageElements;
import test.PageElements.CourseOutlinePageElements;
import test.PageMessages.MessagesCourseOutlinePage;




public class CourseOutlinePage {

	public CourseOutlinePageElements courseOutlineElements = null;
	public AddComponentPageElements addComponentPageList = null;
	public MessagesCourseOutlinePage courseOutlineMessages = null;
	public AdminPortalPageElements adminPortalLocators = null;

	public CourseOutlinePage() {
		courseOutlineElements = new CourseOutlinePageElements(GlobalConstants.getDriver());
		addComponentPageList = new AddComponentPageElements(GlobalConstants.getDriver());
		courseOutlineMessages = new MessagesCourseOutlinePage(GlobalConstants.getDriver());
		adminPortalLocators = new AdminPortalPageElements(GlobalConstants.getDriver());
	}

	/**
	 * This method is used to click on New section button
	 * @throws CustomException
	 */
	public void newSectionButton() throws CustomException{

		try {

			Thread.sleep(7000);

			CommonUtility.isElementVisibleNew(courseOutlineElements.centralNewSection);

			//click on new section and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.newSectionBtn);

			Thread.sleep(6000);

			//Calling input name method
			inputSectionSubUnitName(courseOutlineMessages.sectionName, courseOutlineMessages.section);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to delete section
	 * @throws CustomException
	 */
	public void deleteSection() throws CustomException {

		try {
			deleteSectionSubSectionUnitDelete(courseOutlineMessages.sectionName, courseOutlineMessages.section);
		} catch (CustomException e) {
			throw new CustomException(courseOutlineMessages.deleteSectionMethodProblem);
		}
	}

	/**
	 * This method is used to delete Subsection
	 * @throws CustomException
	 */
	public void deleteSubSection() throws CustomException {

		try {
			deleteSectionSubSectionUnitDelete(courseOutlineMessages.subSectionName, courseOutlineMessages.subSection);
		} catch (CustomException e) {
			throw new CustomException(courseOutlineMessages.deleteSubSectionMethodProblem);
		}
	}

	public void subSectionExpand() throws CustomException {


		try {

			Thread.sleep(3000);
			CommonUtility.eleWaitAndClick(courseOutlineElements.subSectionExpand(courseOutlineMessages.subSectionName));
		} catch (CustomException e) {
			throw new CustomException(courseOutlineMessages.expandSubSectionProblem);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/**
	 * This method is used to delete Unit
	 * @throws CustomException
	 */
	public void deleteUnit() throws CustomException {

		try {

			deleteSectionSubSectionUnitDelete(courseOutlineMessages.unitName, courseOutlineMessages.unit);
		} catch (CustomException e) {
			throw new CustomException(courseOutlineMessages.deleteUnitMethodProblem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This is dynamic method to delete any section, subsection or unit name
	 * @param headerName
	 * @param catType
	 * @throws CustomException
	 */
	private void deleteSectionSubSectionUnitDelete(String headerName, String catType) throws CustomException {

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.deleteUnitBtn(headerName, catType));

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.deletePopUpConfirm(catType));

			Thread.sleep(3000);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Either the section/ subsection/ unit locator was not found or incorrect locator constructed");
		} 


	}

	/**
	 * This method is used to input section or subsection or unit name
	 * @param categoryName
	 * @param creationType TODO
	 * @throws CustomException
	 */
	private void inputSectionSubUnitName(String categoryName, String creationType) throws CustomException {

		try {

			Thread.sleep(1000);

			switch (creationType) {

			case "section":

				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSectionNameInput), Keys.DELETE);			
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSectionNameInput), categoryName);
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSectionNameInput), Keys.ENTER);

				break;


			case "subsection":

				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSubSectionNameInput), Keys.DELETE);			
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSubSectionNameInput), categoryName);
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.addNewSubSectionNameInput), Keys.ENTER);

				break;


			case "unit":

				CommonUtility.eleWaitAndSendValue((courseOutlineElements.unitNameInput), Keys.DELETE);			
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.unitNameInput), categoryName);
				CommonUtility.eleWaitAndSendValue((courseOutlineElements.unitNameInput), Keys.ENTER);

				break;

			default:
				break;
			}



		}catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Section/ Subsection or unit locator was either incorrect or not loaded");
		} 
	}

	/**
	 * This method is used to verify top section message after sections, subsections and unit are deleted
	 * @throws CustomException
	 */
	public void verifyNoContentAdded() throws CustomException{

		String actualText, ExpText = null;
		try {

			GlobalConstants.getDriver().navigate().refresh();

			Thread.sleep(3000);

			CommonUtility.isElementVisible(courseOutlineElements.noContentLocator);						
			actualText = courseOutlineElements.noContentLocator.getText();
			ExpText = courseOutlineMessages.noContentAddedMsg;
			CommonUtility.highlightElement(courseOutlineElements.noContentLocator, GlobalConstants.highlighterFlag);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

		CommonUtility.verifyAndReport(actualText, ExpText);
	}

	/**
	 * This method is used to click on View Live button
	 * @throws CustomException
	 */
	public void viewLiveButton() throws CustomException{

		try {

			Thread.sleep(3000);

			//click on new section and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.viewliveButton);

			Thread.sleep(3000);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on New Sub section button
	 * @throws CustomException
	 */
	public void newSubSectionButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click on new sub section and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.newSubSectionBtn);

			Thread.sleep(2000);

			//Calling input name method
			inputSectionSubUnitName(courseOutlineMessages.subSectionName, courseOutlineMessages.subSection);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on New Unit button
	 * @throws CustomException
	 */
	public void newUnitButton() throws CustomException{

		try {

			Thread.sleep(6000);

			//click on new Unit and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.newUnitBtn);

			//Calling input name method
			inputSectionSubUnitName(courseOutlineMessages.unitName, courseOutlineMessages.unit);

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on any particular subsection
	 * @throws CustomException
	 */
	public void clickSubSection() throws CustomException{

		try {

			Thread.sleep(4000);

			//click on new Unit and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.clickOnSubSectionName(addComponentPageList.getComponentList().get(0).toString().trim()));


			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on any particular Unit Name
	 * @throws CustomException
	 */
	public void clickUnitName() throws CustomException{

		try {

			Thread.sleep(4000);

			//click on new Unit and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.clickOnUnitName(addComponentPageList.getComponentList().get(0).toString().trim()));


			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Publish button on first section
	 * @throws CustomException
	 */
	public void publishSectionButton() throws CustomException{

		try {

			Thread.sleep(3000);

			//click on publish button on first section
			CommonUtility.eleWaitAndClick(courseOutlineElements.publishFirstSectionBtn);

			Thread.sleep(2000);

			//click on publish popup button on first section
			CommonUtility.eleWaitAndClick(courseOutlineElements.publishPopupBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Publish button one by one
	 * @throws CustomException
	 */
	public void dynamicPublishSectionButton() throws CustomException{

		try {

			Thread.sleep(4000);


			for (int i = 0; i < addComponentPageList.getComponentList().size(); i++) {

				//int sectionId = i+2;
				//click on publish button on first section
				//CommonUtility.eleWaitAndClick(courseOutlineElements.getPublishButtonXpath(sectionId));
				
				CommonUtility.eleWaitAndClick(courseOutlineElements.getNewPublishButton(addComponentPageList.getComponentList().get(i).toString().trim()));
				
				Thread.sleep(2000);
				//click on publish popup button on first section
				CommonUtility.eleWaitAndClick(courseOutlineElements.publishPopupBtn);
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to update the grading as final exam for each section
	 * @throws CustomException
	 */
	public void updateAllSectionForGrading() throws CustomException{

		try {

			Thread.sleep(4000);
		

			for (int i = 0; i < courseOutlineElements.sectionCount.size()-1; i++) {

				//click on subsection configure
				CommonUtility.eleWaitAndClick(courseOutlineElements.configureSubSectionBtn(addComponentPageList.getComponentList().get(i).toString().trim()));
				
				Thread.sleep(1000);
				//click on publish popup button on first section
				CommonUtility.dropDownValueSelect(courseOutlineElements.gradingDropDownValue, "Final Exam");
				
				saveButtonClick();
								
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on particular subsection configure button
	 * @throws CustomException
	 */
	public void clickConfigureFirstSubSection() throws CustomException {

		try {

			Thread.sleep(2000);

			//click on subsection configure
			CommonUtility.eleWaitAndClick(courseOutlineElements.configureSubSectionBtn(addComponentPageList.getComponentList().get(0).toString().trim()));

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on configure subsection locator");
		} 

	}
	
	/**
	 * This method is used to configure chapter1
	 * @throws CustomException
	 */
	public void configureSubSecChapter1() throws CustomException {
		
		//clicking on 2nd chapter
		clickConfigureSubSection(courseOutlineMessages.chapter1);
	}
	
	/**
	 * This method is used to configure chapter2
	 * @throws CustomException
	 */
	public void configureSubSecChapter2() throws CustomException {
		
		//clicking on 2nd chapter
		clickConfigureSubSection(courseOutlineMessages.chapter2);
	}
	
	/**
	 * This method is used to configure chapter3
	 * @throws CustomException
	 */
	public void configureSubSecChapter3() throws CustomException {
		
		//clicking on 2nd chapter
		clickConfigureSubSection(courseOutlineMessages.chapter3);
	}
	
	/**
	 * This method is used to click on configure button of any subsection
	 * @param subSecName
	 * @throws CustomException
	 */
	private void clickConfigureSubSection(String subSecName) throws CustomException {
		
		try {

			Thread.sleep(2000);

			//click on subsection configure
			CommonUtility.eleWaitAndClick(courseOutlineElements.configureSubSectionBtn(subSecName));

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on configure subsection locator");
		} 
		
	}
	
	private void configBtnClick(String sectionSubName) throws CustomException {
		
		try {
			//click on subsection configure
			CommonUtility.eleWaitAndClick(courseOutlineElements.configureSubSectionBtn(sectionSubName));
		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on configure button locator");
		} 
	}

	/**
	 * This method is used to click on advanced tab after configure section/ sub section or unit
	 * @throws CustomException
	 */
	public void advancedTabClick() throws CustomException {

		try {

			Thread.sleep(1000);

			//click on advanced tab
			CommonUtility.eleWaitAndClick(courseOutlineElements.advancedTabBtn);

			Thread.sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on advanced tab locator");
		} 

	}
	
	/**
	 * This method is used to click on time based assessment radio button
	 * @throws CustomException
	 */
	public void timeBasedRadioBtnClick() throws CustomException {

		try {

			Thread.sleep(1000);

			//click on advanced tab
			CommonUtility.eleWaitAndClick(courseOutlineElements.radioBtnTimed);

			Thread.sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on Time based Radio button");
		} 

	}
	
	/**
	 * This method is used to input time on time based assessment contents
	 * @throws CustomException
	 */
	public void inputTimeValue() throws CustomException {

		try {

			Thread.sleep(1000);

			//click on advanced tab
			CommonUtility.removePrevTextInputNew(courseOutlineElements.inputAllotedTime,courseOutlineMessages.timeValue);
			CommonUtility.tabFromElement(courseOutlineElements.inputAllotedTime);

			Thread.sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on Time based Radio button");
		} 

	}
	
	/**
	 * This method is used to click on label to enable advanced settings
	 * @throws CustomException
	 */
	public void enableSectionPreqLabelClick() throws CustomException {

		try {

			Thread.sleep(1000);

			//click on enable section pre-req label
			CommonUtility.eleWaitAndClick(courseOutlineElements.makeSectionPreqCheckbox);

			Thread.sleep(1000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on pre-req label locator");
		} 

	}
	
	/**
	 * This method is used to click on save button after changes are updated
	 * @throws CustomException
	 */
	public void saveButtonClick() throws CustomException {

		try {

			Thread.sleep(2000);

			//click on save button
			CommonUtility.eleWaitAndClick(courseOutlineElements.saveBtn);

			Thread.sleep(2000);
			
			//page refresh required to view changes
			GlobalConstants.getDriver().navigate().refresh();
			
			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on save button locator");
		} 

	}
	
	/**
	 * This method is used to configure 2nd subsection
	 * @throws CustomException
	 */
	public void clickConfigureSecondSubSection() throws CustomException {

		try {

			Thread.sleep(2000);

			//click on subsection configure
			configBtnClick(addComponentPageList.getComponentList().get(1).toString().trim());
			//CommonUtility.eleWaitAndClick(courseOutlineElements.configureSubSectionBtn(addComponentPageList.getComponentList().get(1).toString().trim()));

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on configure subsection locator");
		} 

	}
	
	public void selectSubSectionDropDown() throws CustomException {

		try {

			Thread.sleep(2000);
			
			String selectValue = courseOutlineMessages.subSecHeaderName + addComponentPageList.getComponentList().get(0).toString().trim();

			//click on subsection configure
			CommonUtility.dropDownValueSelect(courseOutlineElements.preReqDropDown, selectValue);

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on pre-req drop down locator");
		} 

	}
	
	/**
	 * This method is used to set dependency of chp2 on chp1
	 * @throws CustomException
	 */
	public void selectChapt2DependantChp1() throws CustomException {
		
		selectDependantSection(courseOutlineMessages.chapter1);
	}
	
	/**
	 * This method is used to set dependency of chp3 on chp2
	 * @throws CustomException
	 */
	public void selectChapt3DependantChp2() throws CustomException {
		
		selectDependantSection(courseOutlineMessages.chapter2);
	}
	
	/**
	 * Below is private method to select dependant section from dropdown
	 * @param subSecName
	 * @throws CustomException
	 */
	private void selectDependantSection(String subSecName) throws CustomException {
		
		try {

			Thread.sleep(2000);
			
			String selectValue = subSecName;

			//click on subsection configure
			CommonUtility.dropDownValueSelect(courseOutlineElements.preReqDropDown, selectValue);

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on pre-req drop down locator");
		} 
	}

	/**
	 * This method is used to verify dependant section lock icon
	 * @throws CustomException
	 */
	public void verifyDependantSubsectionLockIcon() throws CustomException{

		String actualText,ExpText = null;
		
		try {

			Thread.sleep(2000);

			CommonUtility.isElementVisible(courseOutlineElements.preReqTextDisplayed);
			CommonUtility.scrollHighlightElement(courseOutlineElements.preReqTextDisplayed);
			actualText = courseOutlineElements.preReqTextDisplayed.getText();
			ExpText = "Prerequisite: "+courseOutlineMessages.subSecHeaderName + addComponentPageList.getComponentList().get(0).toString().trim();
			
			CommonUtility.highlightElement(courseOutlineElements.noContentLocator, GlobalConstants.highlighterFlag);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

		CommonUtility.verifyAndReport(actualText, ExpText);

	}
	
	/**
	 * This method is used to verify Timed exam text after the content is timed
	 * @throws CustomException
	 */
	public void verifyTimedExamText() throws CustomException{

		String actualText, ExpText = null;
		try {

			Thread.sleep(3000);

			CommonUtility.isElementVisible(courseOutlineElements.timedExamText);
			CommonUtility.scrollHighlightElement(courseOutlineElements.timedExamText);
			actualText = courseOutlineElements.timedExamText.getText();
			ExpText = courseOutlineMessages.timedExamTxt;
			
			CommonUtility.highlightElement(courseOutlineElements.timedExamText, GlobalConstants.highlighterFlag);

			


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

		CommonUtility.verifyAndReport(actualText, ExpText);
	}

	/**
	 * This method is used to click on course display name on course outline page
	 * @throws CustomException
	 */
	public void displayCourseNameTopClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.headerCourseName);
			
			Thread.sleep(2000);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to launch sanity pack course details page
	 * @throws CustomException
	 */
	public void navigateToSanityCourseDetails() throws CustomException {
		
//		String courseOutlineUrl = "https://openedx-extension-labs-staging.apps.dev.lxp.academy.who.int/digital-credentials/course-v1:Tcourse+Tcourse+Tcourse";
//		
//		GlobalConstants.getDriver().get(courseOutlineUrl);
		GlobalConstants.getDriver().get(courseOutlineElements.getCourseName_OutlinePageUrl());
		
	}
	
	public void setCourseOutlineURL() {
			
		
		CommonUtility.threadWait(3000);
		
		System.out.println(GlobalConstants.getDriver().getCurrentUrl());
		courseOutlineElements.setCourseName_OutlinePageUrl(GlobalConstants.getDriver().getCurrentUrl());
		System.out.println(courseOutlineElements.getCourseName_OutlinePageUrl());
	}

//	/**
//	 * This method is used to return current Course Studio URL
//	 * @return
//	 */
//	private String getCurrentStudioURL() {
//		
//		if (GlobalConstants.Target_CC_URL.contains("dev")) {
//			GlobalConstants.Target_CC_URL = GlobalConstants.Target_CC_URL.replace(adminPortalLocators.cms, adminPortalLocators.lms);
//		} else {
//			
//			GlobalConstants.Target_CC_URL = GlobalConstants.Target_CC_URL.replace(adminPortalLocators.stageCms, adminPortalLocators.stageLms);
//		}
//		
//		return GlobalConstants.Target_CC_URL;
//		
//	}
//	
//	/**
//	 * Private method to generate course outline url string by concatenating course id and course/
//	 * @return
//	 */
//	private String generateCourseDetailString() {
//		
//		return courseOutlineMessages.courseText+courseOutlineElements.getCourseName_OutlinePageUrl();
//	}
	
	/**
	 * This method is used to click on Tools drop down on course outline page
	 * @throws CustomException
	 */
	public void toolsMainMenuClick() throws CustomException{

		try {

			Thread.sleep(6000);

			CommonUtility.isElementVisible(courseOutlineElements.toolsMainMenu);
			CommonUtility.isElementClickable(courseOutlineElements.toolsMainMenu);		

			CommonUtility.eleWaitAndClick(courseOutlineElements.toolsMainMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Export sub menu under Tools on course outline page
	 * @throws CustomException
	 */
	public void exportSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.exportSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Import sub menu under Tools on course outline page
	 * @throws CustomException
	 */
	public void importSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.importSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Settings drop down on course outline page
	 * @throws CustomException
	 */
	public void settingsMainMenuClick() throws CustomException{

		try {

			Thread.sleep(4000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.settingsMainMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Content Main menu on course outline page
	 * @throws CustomException
	 */
	public void contentMainMenuClick() throws CustomException{

		try {

			Thread.sleep(4000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.contentMainMenu);

		} catch (Exception e) {


			throw new CustomException("Could not click or locate content main menu button");
		} 

	}

	/**
	 * This method is used to click on Files and uploads sub menu under Content on course outline page
	 * @throws CustomException
	 */
	public void fileUploadsSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.fileUploadsSubMenu);

		} catch (Exception e) {


			throw new CustomException(courseOutlineMessages.FileUploadFailed);
		} 

	}

	/**
	 * This method is used to click on Schedule and details sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void scheduleDetailSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.scheduleDetailSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on course team sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void courseTeamSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.courseTeamSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on Digital credentials sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void digitalCredentialsSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.digitalCredentialsSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on advanced settings sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void advancedSettingSubMenuClick() throws CustomException{

		try {

			Thread.sleep(4000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.advancedSettingsSubMenu);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to click on grading sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void gradingSubMenuClick() throws CustomException{

		try {

			Thread.sleep(4000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.gradingSubMenu);


		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on advanced settings sub menu under settings on course outline page
	 * @throws CustomException
	 */
	public void certificateSubMenuClick() throws CustomException{

		try {

			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(courseOutlineElements.certificateSubMenu);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	//*****************************************************

	/**
	 * This method is used to click on New section button to be created dynamically
	 * @param sectionName TODO
	 * @throws CustomException
	 */
	public void newDynamicSectionButton(int sectionPosition, String sectionName) throws CustomException{

		try {

			Thread.sleep(9000);


			//click on new section and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.newSectionBtn);

			Thread.sleep(5000);
			//			CommonUtility.tabFromElement(GlobalConstants.getDriver().findElement(By
			//					.xpath("/html/body/div[1]/main/div/div[1]/header/nav/ul/li[1]")));
			
			CommonUtility.isElementVisibleNew(courseOutlineElements.getSectionNameInputXpath(sectionPosition));

			addNameDynamicSecSubSecUnit(courseOutlineElements.getSectionNameInputXpath(sectionPosition),courseOutlineMessages.secHeaderName+sectionName);

			//			CommonUtility.eleWaitAndSendValue((courseOutlineElements.getSectionNameInputXpath(sectionPosition)), Keys.DELETE);
			//			CommonUtility.eleWaitAndClick((courseOutlineElements.getSectionNameInputXpath(sectionPosition)));
			//			CommonUtility.eleWaitAndSendValue((courseOutlineElements.getSectionNameInputXpath(sectionPosition)), sectionName);
			//			CommonUtility.tabFromElement((courseOutlineElements.getSectionNameInputXpath(sectionPosition)));


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on New Sub section button to be created dynamically
	 * @param subSecName TODO
	 * @throws CustomException
	 */
	public void newDynamicSubSectionButton(int subSectionPosition, String subSecName) throws CustomException{

		try {

			Thread.sleep(4000);
			
			CommonUtility.isElementVisibleNew(courseOutlineElements.getSubSectionButtonXpath(subSectionPosition));

			//click on new sub section and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.getSubSectionButtonXpath(subSectionPosition));

			Thread.sleep(3000);

			addNameDynamicSecSubSecUnit(courseOutlineElements.getSubSectionInputXpath(subSectionPosition),courseOutlineMessages.subSecHeaderName+subSecName);

			//			CommonUtility.eleWaitAndSendValue(courseOutlineElements.getSubSectionInputXpath(subSectionPosition), Keys.ENTER);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to click on New Unit button
	 * @param unitName TODO
	 * @throws CustomException
	 */
	public void newDynamicUnitButton(int unitPosition, String unitName) throws CustomException{

		try {

			Thread.sleep(4000);
			CommonUtility.isElementVisibleNew(courseOutlineElements.getNewUnitButtonXpath(unitPosition));

			//click on new Unit and change focus
			CommonUtility.eleWaitAndClick(courseOutlineElements.getNewUnitButtonXpath(unitPosition));

			Thread.sleep(3000);

			addNameDynamicSecSubSecUnit(courseOutlineElements.unitNameInput,courseOutlineMessages.unitHeaderName+unitName);

			//			CommonUtility.eleWaitAndSendValue(courseOutlineElements.unitNameInput, Keys.DELETE);
			//			CommonUtility.eleWaitAndClick(courseOutlineElements.unitNameInput);
			//			CommonUtility.eleWaitAndSendValue(courseOutlineElements.unitNameInput, unitName);
			//			CommonUtility.tabFromElement(courseOutlineElements.unitNameInput);

//			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to input section, sub section name or unit name at all times
	 * @param locatorInput
	 * @param nameValue
	 * @throws CustomException
	 * @throws Exception 
	 */
	private void addNameDynamicSecSubSecUnit(WebElement locatorInput, String nameValue) throws CustomException, Exception {

		try {
			
			CommonUtility.isElementVisibleNew(locatorInput);
			CommonUtility.isElementClickable(locatorInput);
			CommonUtility.eleWaitAndSendValue(locatorInput, Keys.DELETE);			
			CommonUtility.eleWaitAndSendValue(locatorInput, nameValue);Thread.sleep(2000);
			CommonUtility.eleWaitAndSendValue(locatorInput, Keys.ENTER);
			Thread.sleep(2000);

		} catch (CustomException e) {
			e.printStackTrace();
			throw new CustomException("Could not add Section/ sub-section or unit name");

		}

	}

	/**
	 * This method is used to click on Publish button to be clicked dynamically
	 * @throws CustomException
	 */
	public void publishSectionDynamicButton(int publishPosition) throws CustomException{

		try {

			Thread.sleep(3000);

			//click on publish button on first section
			CommonUtility.eleWaitAndClick(courseOutlineElements.getPublishButtonXpath(publishPosition));

			Thread.sleep(2000);

			//click on publish popup button on first section
			CommonUtility.eleWaitAndClick(courseOutlineElements.publishPopupBtn);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}




}
