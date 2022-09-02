package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCourseImportPage {

	public MessagesCourseImportPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String failureText = "Fail";
	
	public String importCourseSuccessText ="Your imported content has now been integrated into this course";
	public String viewUpdatedOutlineBtnText = "View Updated Outline";
	
}
