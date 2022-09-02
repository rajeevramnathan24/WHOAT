package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCourseDetailsPage {

	public MessagesCourseDetailsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String courseStatusEnrolled = "Course status verified as Enrolled";
	public String courseCompletedSuccessfully = "Course status updated as Completed successfully";
	
	public String enrolled = "Enrolled";
	public String enroll = "Enroll";
	public String unEnroll = "Unenroll";
	public String completedSuccessfully = "Completed successfully";
	public String reviewProgramme = "Review Learning Programme";
	public String enrollSuccessful = "Enrolled Successfully";
	public String enrollBtnError = "LXP course details page - Enroll button could not clicked or enroll confirmation(continue enroll) button could not be clicked";
	public String unEnrollBtnError = "Unenroll button click error";
	public String myLearnBtnError = "My learnings click error";
	public String cardNotPresent = "Card not present in the search results";
	public String myLearning = "My Learning";
	public String dashboard = "Dashboard";
	public String settings = "Settings";
	public String feedback = "Feedback";
}
