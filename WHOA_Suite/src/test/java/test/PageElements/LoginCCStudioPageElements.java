package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginCCStudioPageElements {
	
	public LoginCCStudioPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(how = How.ID, id = "username")
	public WebElement userNameXpath;
	
	@FindBy(how = How.ID, id = "password")
	public WebElement passwordXpath;
	
	@FindBy(how = How.ID, id = "kc-login")
	public WebElement loginButtonXpath;

}
