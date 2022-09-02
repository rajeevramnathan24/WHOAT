package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchLxpLearnerElements {
	
	public LaunchLxpLearnerElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(xpath = "//*[@id='navbar-toggle-collapse']/a/div[contains(@class,'lp-nav')]/button[contains(@class,'btn-link')]")//"//button[contains(text(),'login')]")
	public WebElement xpathLoginButton;
	
	@FindBy(xpath = "//button[contains(text(),'signup')]")
	public WebElement xpathSignUpButton;

//	@FindBy(xpath = "//h1[contains(text(),'Welcome to the WHO Academy')]")
	@FindBy(xpath = "*//div[contains(@class,'ld-sec__one-left')]/h1")
	public WebElement xpathLXPWelcomeLabel;
	
	@FindBy(xpath = "*//div[@class='lp-one__heading']/h5")
	public WebElement findProgramText;
	
	
}
