package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCertificatePage {

	public MessagesCertificatePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String certificateCreationConfirmation = "You have enabled digital credentials, you can now set up digital credential at a modular level.";
	public String activate="Activate";
	public String deActivate="Deactivate";
	
}
