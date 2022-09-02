package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCourseTeamPage {

	public MessagesCourseTeamPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------

	public String staff = "STAFF";
	public String admin = "ADMIN";
	public String userEmailId = "skiran_cv@yahoo.co.in";
	
	
}
