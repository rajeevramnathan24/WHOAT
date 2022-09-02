package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesLxpAssessmentPage {

	public MessagesLxpAssessmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String thisIsTBAText = "This is a timed assessment!";
	public String thisIsTBADescText = "This assessment has a time limit associated with it. "
			+ "To pass this assessment, you must complete within 1 minutes. All the responses provided will be considered for evaluation "
			+ "and awarding credentials at the end of assessment. The timer starts as you select “start” below.";
	public String oopsText = "Oops! Time’s up, you missed your turn";
	public String missedTurnMessage = "You missed your turn";
	public String incompleteAssessmentMsg = "You couldn’t complete the assessment in time."
			+ " You may use discussions to request an extending attempt from the instructors.";
	public int randomAssessmentSectionCount = 2;
	public String prevBtn = "left";
	public String nextBtn = "right";
	public String ok = "Ok";
	public String program = "Program";
}
