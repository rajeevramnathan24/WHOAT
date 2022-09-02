package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Preview_LivePageElements {
	
	public Preview_LivePageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//p[contains(text(),'This is demo text entered during Test Automation')]")
public WebElement previewLiveText;

@FindBy(xpath = "//a[contains(text(),'Instructor')]")
public WebElement instructorTabClick;


	
	
}
