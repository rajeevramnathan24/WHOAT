package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesAddNewComponentPage {

	public MessagesAddNewComponentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String htmlButtonLocatorIssue = "Could not click on HTML Button locator";
	public String textComponentLocatorIssue = "Could not click on Text component locator";
	public String compNotAvailable = "Lti consumer/ Scorm package/ Scorm V2 - one of the values were not available for selection or there is change in locator";
	public String frameNotAvailable = "Could switch between frame as frame id might not be available";
	
	public String ltiNameText = "Automation Zoom Demo";
	public String ltiIdText = "zoom";
	public String ltiURL = "https://applications.zoom.us/lti/rich";
	public String ltiCustomParamInputText ="[\"instructor_email=kannanm@who.int\"]";
	public String ltiLaunchWindow = "New Window";
	public String ltiZoomErrorWhileEditingZoom = "Could not update Zoom component properties";
	
	public String v2ScormPackName = "IMCI_M3_L01_p138155_2021_12_08_12_06_55.zip";
	public String randomACount = "Count";
	public String randomLibrary = "Library";
	public String sampleLibraryName = "Sample library";
	public String randomSectionCount = "2";
	
	public String previewButtonError = "Error in Preview button locator";
	public String viewLiveButtonError = "Error in View Live button locator";
	public String problemButtonError = "Error in Problem Component or dropdown button locator";
	public String videoButtonError = "Error in Video Component button locator";
	public String videoUrl = "https://www.youtube.com/watch?v=7egUec9i8gc";
	public String videoId = "7egUec9i8gc";
	
	public String discForumName = "Automation Discussion Forum";
	public String discForumCategory = "Demo Category";
	public String discForumEditError = "Error while editing Discussion forum fields";
	
	public String demoTextinAutomation = "This is demo text entered during Test Automation";
	public String addedCompPrefix = "Added - ";
	
	public String errorInAdvanceComponentBtn = "Error while trying to click on Advanced Component button";
	public String errorInDiscForumComponentBtn = "Error while trying to click on Discussion Forum Component button";
	public String HTML = "html";
	public String Video = "video";
	public String Problem = "problem";
	public String Discussion = "discussion";
	public String Advanced = "advanced";
	public String dropdownType = "Dropdown";
	public String checkBoxType = "Checkboxes";
	
}
