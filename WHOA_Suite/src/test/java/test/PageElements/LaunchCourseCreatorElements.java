package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchCourseCreatorElements {
	
	public LaunchCourseCreatorElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(xpath = "//a[contains(text(),'Sign in / Register')]")
	public WebElement signInRegisterXpath;
	
//	@FindBy(xpath = "//h1[contains(text(),'Welcome to WHO Academy Course Studio')]")
	@FindBy(xpath = "*//section[@class='page_main_section']/h1")
	public WebElement xpathWelcomeLabel;

}
