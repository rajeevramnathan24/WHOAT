package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesLxpLearnerDashboardPage {

	public MessagesLxpLearnerDashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String Label_DiscoverLearning = "Discover learning";
	
	public String editMode = "Edit";
	public String update = "Update";
	public String revertMode = "Revert";
	public String updatedText = " Updated";
	public String genderFemale = "Female";
	public String ageGroup = "65-74";
	public String role = "Educator";
	public String years = "2-3 years";
	public String methodGoalProblem = "Input Goal/ Profile method/ locators had problems";
	
	public String recommendationText = "Recommendations";
	public String myProg = "My Program";
	public String settings = "Settings";
	public String language = "Language";
	public String learning = "Learning";
	public String recommendationTextNotFound = "Unable to find recommendation text on the page";
	public String editGoalLang = "Edit language or Goal button";
	
	public String TBA = "TBA";
	public String INTBA = "INTBA";
	public String SEQL = "SEQL";
	public String RDMA = "RDMA";
	public String ALL = "ALL";
	public String SCORM = "Scorm";
	public String HTM = "HTM";
	public String PROB="PROB";
	public String VID="VID";
	public String ZOOM="ZOM";
	public String DISC="DISC";
	
	public String locatorNotFound(String nameNotFound) {
		
		return "Locator related to "+nameNotFound +" was not found";
	}
	
	public String getDynamicLanguage(String langText) {
		
		String localLangText = null;
		
		switch (langText) {

		case "Arabic":

			localLangText = "العربية";

			break;


		case "Chinese":

			localLangText = "中文";

			break;


		case "French":

			localLangText = "Français";

			break;


		case "Russian":

			localLangText = "Русский";

			break;


		case "Spanish":

			localLangText = "Español";

			break;


		case "English":

			localLangText = "English";

			break;

		default:
			break;
		}
		
		return localLangText;
	}
	
}
