package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseExportPageElements {
	
	public CourseExportPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//span[contains(text(),'Export Course Content')]")
public WebElement exportCourseContentBtn;

@FindBy(xpath = "//a[@id='download-exported-button']")
public WebElement downloadExportContentBtn;

@FindBy(xpath = "//p[contains(text(),'Your exported course can now be downloaded')]")
public WebElement courseCanBeDownloadedText;

@FindBy(xpath = "//div[contains(@class, 'wrapper wrapper-view')]/main[@id='main']/div[@id='content']/div[2]/section/article/div[3]/ol/li[4]/div/h3")
public WebElement successText;
	
@FindBy(xpath = "//small[contains(text(),'Tools')]")
public WebElement toolsTextOnTop;
	
}
