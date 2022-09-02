package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesAdvancedSettingPage {

	public MessagesAdvancedSettingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String enableTimedExam = "Enable Timed Exams";
	public String trueValue = "true";
	public String courseDisplayNameLabel = "Course Display Name";
	public String digCourse = "DIGITAL COURSE";
	public String certBehaviour = "Certificates Display Behavior";
	public String certBehaviourValue = "early_with_info";
	
}
