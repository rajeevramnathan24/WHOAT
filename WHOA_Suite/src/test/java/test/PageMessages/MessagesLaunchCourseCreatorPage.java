package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesLaunchCourseCreatorPage {

	
	public MessagesLaunchCourseCreatorPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String welcomeTextLabel = "Welcome to WHO Academy Course Studio";
	public String testCaseFailedOScheck = "Test case failed possibly due these reasons: \n"
			+ "1. Different OS detected. This test case requires Windows OS as it uses executable files for File uploads \n"
			+ "2. The headless browser property is set to 'true'. Try setting headless property to 'false' in config.properties";
	public String windowsOS = "Windows OS identified";
	public String couldNotRetrieveOsName = "Could not retrieve current OS";
	
}
