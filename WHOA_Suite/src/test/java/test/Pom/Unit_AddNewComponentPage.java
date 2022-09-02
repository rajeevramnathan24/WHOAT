package test.Pom;




import java.util.Arrays;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.AddComponentPageElements;
import test.PageMessages.MessagesAddNewComponentPage;




public class Unit_AddNewComponentPage {

	public AddComponentPageElements addComponentPageElements = null;
	public MessagesAddNewComponentPage messageAddNewComponent = null;
	

	public Unit_AddNewComponentPage() {
		addComponentPageElements = new AddComponentPageElements(GlobalConstants.getDriver());
		messageAddNewComponent = new MessagesAddNewComponentPage(GlobalConstants.getDriver());		
	}



	/**
	 * This method is used to click on HTML button to create new component
	 * @throws CustomException
	 */
	public void htmlComponentButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click HtmlComponent button
			CommonUtility.eleWaitAndClick(addComponentPageElements.componentButton(messageAddNewComponent.HTML));


		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.htmlButtonLocatorIssue);
		} 

	}

	/**
	 * This method is used select text option inside the htmlText component
	 * @throws CustomException
	 */
	public void selectTextOption() throws CustomException{

		try {

			Thread.sleep(3000);

			//select text option from the dropdown
			CommonUtility.eleWaitAndClick(addComponentPageElements.texthtmlComponentOption);


		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.textComponentLocatorIssue);
		} 

	}

	/**
	 * This method is used select lti consumer option inside advanced component
	 * @param subCompType
	 * @throws CustomException
	 */
	public void subComponentSelect(String subCompType) throws CustomException{

		try {

			Thread.sleep(3000);
			
			switch (subCompType) {
			
			case "Zoom-Int":
				
				//select text option from the dropdown
				CommonUtility.eleWaitAndClick(addComponentPageElements.ltiConsumerOption);
				
				break;				

			case "Scorm":
				
				//select text option from the dropdown
				CommonUtility.eleWaitAndClick(addComponentPageElements.scormOnlyComponentOption);
				
				break;
				
			case "ScormV2":
				
				//select text option from the dropdown
				CommonUtility.eleWaitAndClick(addComponentPageElements.scormV2ComponentOption);
				
				break;
				

			case "RandomA":
				
				//select text option from the dropdown
				CommonUtility.eleWaitAndClick(addComponentPageElements.randomContentBlockOption);
				
				break;

			default:
				break;
			}

			


		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.compNotAvailable);
		} 

	}

	/**
	 * This method is used to add/edit new Text inside the htmlText component
	 * @param editFlag This flag will determine if edit or ignore update
	 * @throws CustomException
	 */
	public void editContent_TextComponent(String contentText, Boolean editFlag) throws CustomException{

		try {
			
			if (editFlag) {

				Thread.sleep(3000);

				//click on edit button above text section
				CommonUtility.eleWaitAndClick(addComponentPageElements.editTextContent);

				Thread.sleep(3000);

				GlobalConstants.getDriver().switchTo().frame(addComponentPageElements.textFramePath);
				CommonUtility.eleWaitAndSendValue(addComponentPageElements.frameId, contentText);
				GlobalConstants.getDriver().switchTo().defaultContent();

				//click on save button
				CommonUtility.eleWaitAndClick(addComponentPageElements.saveTextContent);
			}


		} catch (Exception e) {

			GlobalConstants.getDriver().switchTo().defaultContent();
			e.printStackTrace();
			throw new CustomException(messageAddNewComponent.frameNotAvailable);
		} 

	}

	/**
	 * This method is used to add/edit lti consumer option for Zoom component
	 * @throws CustomException
	 */
	public void editLtiConsumerZoomComponent() throws CustomException{

		try {

			Thread.sleep(3000);

			//click on edit button above text section
			CommonUtility.eleWaitAndClick(addComponentPageElements.editTextContent);
			
			Thread.sleep(3000);

			String myWindowHandle = GlobalConstants.getDriver().getWindowHandle();
			GlobalConstants.getDriver().switchTo().window(myWindowHandle );

			CommonUtility.removePrevTextInputNew(addComponentPageElements.ltiNameInput,messageAddNewComponent.ltiNameText);Thread.sleep(500);
			CommonUtility.removePrevTextInputNew(addComponentPageElements.ltiIdInput, messageAddNewComponent.ltiIdText);Thread.sleep(500);
			CommonUtility.removePrevTextInputNew(addComponentPageElements.ltiUrlInput, messageAddNewComponent.ltiURL);Thread.sleep(500);
			CommonUtility.removePrevTextInputNew(addComponentPageElements.ltiCustomParamInput, messageAddNewComponent.ltiCustomParamInputText);Thread.sleep(500);
			CommonUtility.dropDownValueSelect(addComponentPageElements.ltiLaunchWindowInput, messageAddNewComponent.ltiLaunchWindow);Thread.sleep(500);		

			GlobalConstants.getDriver().switchTo().defaultContent();

			//click on save button
			CommonUtility.eleWaitAndClick(addComponentPageElements.saveTextContent);

		} catch (Exception e) {
			
			GlobalConstants.getDriver().switchTo().defaultContent();
			e.printStackTrace();
			throw new CustomException(messageAddNewComponent.ltiZoomErrorWhileEditingZoom);
		} 

	}
	
	/**
	 * This method is used to edit scormV2 option for Zoom component
	 * @throws CustomException
	 */
	public void editScormV2Component(String scormType) throws CustomException{

		try {

			Thread.sleep(3000);

			//click on edit button above text section
			CommonUtility.eleWaitAndClick(addComponentPageElements.editTextContent);
			
			Thread.sleep(3000);

			String myWindowHandle = GlobalConstants.getDriver().getWindowHandle();
			GlobalConstants.getDriver().switchTo().window(myWindowHandle );
			
			switch (scormType) {
			
			case "ScormV2":
				
				CommonUtility.eleWaitAndSendValue(addComponentPageElements.scormV2FileNameInput, messageAddNewComponent.v2ScormPackName);Thread.sleep(500);
				
				break;


			case "Scorm":
				
				CommonUtility.eleWaitAndClick(addComponentPageElements.scormFileUploadLabel);Thread.sleep(500);
				
				CommonUtility.runUploadProcess(GlobalConstants.libFolderPath, messageAddNewComponent.v2ScormPackName);
				Thread.sleep(500);
				
				break;

			case "RandomA":
				
				CommonUtility.removePrevTextInputNew(addComponentPageElements.randContentBlockGenericLocator(messageAddNewComponent.randomACount), messageAddNewComponent.randomSectionCount);Thread.sleep(500);
				
				CommonUtility.dropDownValueSelect(addComponentPageElements.randContentBlockGenericLocator(messageAddNewComponent.randomLibrary), messageAddNewComponent.sampleLibraryName);Thread.sleep(500);
				
				break;
				
			default:
				break;
			}			
			
			GlobalConstants.getDriver().switchTo().defaultContent();
			
			Thread.sleep(2000);

			//click on save button
			CommonUtility.eleWaitAndClick(addComponentPageElements.saveTextContent);
			

		} catch (Exception e) {

			GlobalConstants.getDriver().switchTo().defaultContent();
			e.printStackTrace();
			throw new CustomException(messageAddNewComponent.ltiZoomErrorWhileEditingZoom);
		} 

	}
	
	/**
	 * This method to be used only for scorm where file upload is being performed
	 * @throws CustomException
	 */
	public void scormPkgNotificationWait() throws CustomException {
		
		//new method which will wait for quick notifications to disappear
//		CommonUtility.isElementNotPresent(addComponentPageElements.quickNotification);
		
//		CommonUtility.elementDisplayed(addComponentPageElements.previewBtnWaitScormOnly, 120);
		
		CommonUtility.threadWait(200000);
		
		
	}
	
	/**
	 * This method is used to click on Preview button on course outline page
	 * @throws CustomException
	 */
	public void previewBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(addComponentPageElements.previewBtn);
			
		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.previewButtonError);
		} 

	}
	
	/**
	 * This method is used to click on View Live Version button on course outline page
	 * @throws CustomException
	 */
	public void viewLiveBtnClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(addComponentPageElements.viewLiveVersionBtn);
			
		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.viewLiveButtonError);
		} 

	}

	/**
	 * This method is used to click on Problem button to create new component
	 * @throws CustomException
	 */
	public void problemComponentButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click ProblemComponent button
			CommonUtility.eleWaitAndClick(addComponentPageElements.componentButton(messageAddNewComponent.Problem));

		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.problemButtonError);
		} 

	}

	/**
	 * This method is used select Dropdown option inside the Problem component
	 * @throws CustomException
	 */
	public void selectDropDownOption() throws CustomException{

		try {

			Thread.sleep(3000);

			//select dropdown option from the dropdown
			CommonUtility.eleWaitAndClick(addComponentPageElements.problemComponentOption(messageAddNewComponent.dropdownType));

		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.problemButtonError);
		} 

	}

	/**
	 * This method is used to click on Video component button
	 * @throws CustomException
	 */
	public void videoComponentButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click ProblemComponent button
			CommonUtility.eleWaitAndClick(addComponentPageElements.componentButton(messageAddNewComponent.Video));
			
			Thread.sleep(2000);

		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.videoButtonError);
		} 

	}

	/**
	 * This method is used to add/edit video details inside video component
	 * @throws CustomException
	 */
	public void editVideoContent() throws CustomException{

		try {


			Thread.sleep(3000);

			//click on edit button above text section
			CommonUtility.eleWaitAndClick(addComponentPageElements.editContent);

			Thread.sleep(4000);

			String myWindowHandle = GlobalConstants.getDriver().getWindowHandle();
			GlobalConstants.getDriver().switchTo().window(myWindowHandle );

			CommonUtility.removePrevTextInputNew(addComponentPageElements.defaultVideoUrlId, messageAddNewComponent.videoUrl);

			Thread.sleep(1000);

			CommonUtility.removePrevTextInputNew(addComponentPageElements.videoIdInputXpath, messageAddNewComponent.videoId);				

			GlobalConstants.getDriver().switchTo().defaultContent();

			//click on save button
			CommonUtility.eleWaitAndClick(addComponentPageElements.saveTextContent);



		} catch (Exception e) {
			
			GlobalConstants.getDriver().switchTo().defaultContent();
			e.printStackTrace();
			throw new CustomException(messageAddNewComponent.videoButtonError);
		} 

	}

	/**
	 * This method is used to click on advanced component button 
	 * @throws CustomException
	 */
	public void advancedComponentButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click ProblemComponent button
			CommonUtility.eleWaitAndClick(addComponentPageElements.componentButton(messageAddNewComponent.Advanced));

		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.errorInAdvanceComponentBtn);
		} 

	}

	/**
	 * This method is used to click on discussion component button
	 * @throws CustomException
	 */
	public void discussionComponentButton() throws CustomException{

		try {

			Thread.sleep(4000);

			//click ProblemComponent button
			CommonUtility.eleWaitAndClick(addComponentPageElements.componentButton(messageAddNewComponent.Discussion));

		} catch (Exception e) {


			throw new CustomException(messageAddNewComponent.errorInDiscForumComponentBtn);
		} 

	}

	/**
	 * This method is used to add/edit discussion component
	 * @throws CustomException
	 */
	public void editDiscussionContent() throws CustomException{

		try {


			Thread.sleep(3000);

			//click on edit button above text section
			CommonUtility.eleWaitAndClick(addComponentPageElements.editContent);

			Thread.sleep(3000);

			String myWindowHandle = GlobalConstants.getDriver().getWindowHandle();
			GlobalConstants.getDriver().switchTo().window(myWindowHandle );

			CommonUtility.removePrevTextInputNew(addComponentPageElements.discussionNameInput, messageAddNewComponent.discForumName);

			Thread.sleep(500);

			CommonUtility.removePrevTextInputNew(addComponentPageElements.discussionCategoryInput, messageAddNewComponent.discForumCategory);				

			GlobalConstants.getDriver().switchTo().defaultContent();

			//click on save button
			CommonUtility.eleWaitAndClick(addComponentPageElements.saveTextContent);



		} catch (Exception e) {

			GlobalConstants.getDriver().switchTo().defaultContent();
			e.printStackTrace();
			throw new CustomException(messageAddNewComponent.discForumEditError);
		} 

	}

	/**
	 * This method is used to add different components in the system
	 * @param componentTypes
	 * @throws CustomException
	 */
	public void addNewSection_NewComponent_Type(String componentTypes) throws CustomException {

		//addComponentPageElements.setComponentList = new ArrayList<Object>(Arrays.asList(componentTypes.split(",")));
		addComponentPageElements.setComponentList(Arrays.asList(componentTypes.split(",")));

		System.out.println(addComponentPageElements.getComponentList());

		new CourseOutlinePage().displayCourseNameTopClick();

		for (int i = 0; i < addComponentPageElements.getComponentList().size(); i++) {

			int sectionId = i+2;
			
			//comp name
			String compName = addComponentPageElements.getComponentList().get(i).toString().trim();

			//Click on new section
			new CourseOutlinePage().newDynamicSectionButton(sectionId, compName);

			//Click on new sub section
			new CourseOutlinePage().newDynamicSubSectionButton(sectionId, compName);

			//Click on new Unit
			new CourseOutlinePage().newDynamicUnitButton(sectionId, compName);


			switch (compName) {

			case "HTML-Text":

				htmlComponentButton();
				selectTextOption();
				editContent_TextComponent(messageAddNewComponent.demoTextinAutomation, true);


				break;

			case "Scorm":

				advancedComponentButton();
				subComponentSelect(compName);
				editScormV2Component(compName);
				scormPkgNotificationWait();

				break;

			case "ScormV2":

				advancedComponentButton();
				subComponentSelect(compName);
				editScormV2Component(compName);
				CommonUtility.threadWait(20000);

				break;

			case "Problem-Dropdown":
	
			case "Problem-Checkboxes":
				
				selectProbComp(compName);
				
				break;

			case "Video":

				videoComponentButton();
				editVideoContent();

				break;

			case "Discussion":

				discussionComponentButton();
				editDiscussionContent();

				break;


			case "Zoom-Int":

				advancedComponentButton();
				subComponentSelect(compName);
				editLtiConsumerZoomComponent();

				break;
				

			case "RandomA":

				advancedComponentButton();
				subComponentSelect(compName);
				editScormV2Component(compName);

				break;

			default:
				break;
			}

			System.out.println(messageAddNewComponent.addedCompPrefix +AddComponentPageElements.componentList.get(i).toString());	

			new CourseOutlinePage().displayCourseNameTopClick();


		}

	}
	
	/**
	 * This method is used to items from under Problem type with options
	 * @param probType
	 * @throws CustomException
	 */
	private void selectProbComp(String probType) throws CustomException {
		
		problemComponentButton();
		
		switch (probType) {
		
		case "Problem-Checkboxes":
			
			CommonUtility.eleWaitAndClick(addComponentPageElements.problemComponentOption(messageAddNewComponent.checkBoxType));
			
			break;
			

		case "Problem-Dropdown":
			
			CommonUtility.eleWaitAndClick(addComponentPageElements.problemComponentOption(messageAddNewComponent.dropdownType));
			
			break;

		default:
			break;
		}
	}

}
