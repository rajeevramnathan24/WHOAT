package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesScheduleDetailsPage {

	public MessagesScheduleDetailsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String selfPaced = "self-paced";
	public String instructPaced = "instructor";
	
}
