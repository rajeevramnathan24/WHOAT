package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginLxpLearnerPageElements {
	
	public LoginLxpLearnerPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(how = How.ID, id = "username")
//	@FindBy(xpath = "//input[@id='username']")
	public WebElement lxpUserNameXpath;
	
	@FindBy(how = How.ID, id = "password")
//	@FindBy(xpath = "//input[@id='password']")
	public WebElement lxpPasswordXpath;
	
	@FindBy(how = How.ID, id = "kc-login")
//	@FindBy(xpath = "//button[@id='kc-login']")
	public WebElement lxpLoginButtonXpath;

}
