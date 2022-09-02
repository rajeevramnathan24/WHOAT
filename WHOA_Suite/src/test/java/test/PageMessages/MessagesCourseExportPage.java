package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCourseExportPage {

	public MessagesCourseExportPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String toolsText = "Tools";
	public String failureText = "Fail";
	public String successText = "Success";
	
	public String courseCanBeDownloadedText ="Your exported course can now be downloaded";
	public String downloadExportedCourse = "Download Exported Course";
	
}
