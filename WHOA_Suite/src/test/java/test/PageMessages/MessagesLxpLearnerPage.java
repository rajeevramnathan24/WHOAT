package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesLxpLearnerPage {

	public MessagesLxpLearnerPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String welcomeLXPTextLabel = "Welcome to the WHO Academy";
	
}
