package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class MessagesInstructor_MembershipPage {

	public MessagesInstructor_MembershipPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------

	public String successEnrollMessageUnRegisteredUsers = "Successfully sent enrollment emails to the following users. They will be enrolled once they register:";
	public String successEnrollMessageRegisteredUsers = "Successfully enrolled and sent email to the following users:";
	public String successUnenrollMessage = "Emails successfully sent. The following users are no longer enrolled in the course:";
	public String emailIdToEnroll = "ta01@yopmail.com";
	public String verifyFailed = "Actual and Expected results are different, hence test failed";
	public String enroll = "Enroll";
	public String unEnroll = "Unenroll";
	public String enUnrollProblem = "Enroll/ unenroll method had problems";
	public String dynamicEmailId() {		
		return "ta"+GlobalConstants.localDateTime+"@yopmail.com";
	}
}
