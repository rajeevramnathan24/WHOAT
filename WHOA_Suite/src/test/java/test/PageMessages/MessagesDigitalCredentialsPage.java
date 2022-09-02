package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesDigitalCredentialsPage {

	public MessagesDigitalCredentialsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------

	public String digitalCredentialsActivatedMessage = "Digital credentials activated!";
	public String admissionCriteria = "Admission Criteria";
	public String moduleRequirements = "Module Requirements";
	public String moduleDesc = "Module Description";
	public String moduleActivities = "Module Activities";

	public String moduleOutcomes = "Module Outcomes";

	public String moduleAssessment = "Module Assessment";
	public String evidenceOfAssessment = "Evidence Of Achievement";
	public String demoText = "This is demo text";
	public String validtyYears = "10 years";

	public String passingAssessment = "Passing an assessment";
	public String completingActivities = "Completing the activities";
	public int sliderPosition_90_passing = 130;
}
