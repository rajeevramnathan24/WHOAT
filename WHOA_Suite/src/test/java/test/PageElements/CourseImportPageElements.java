package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CourseImportPageElements {
	
	public CourseImportPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(how = How.XPATH, xpath = "//form[@id='fileupload']/a")
public WebElement importCourseContentBtn;

@FindBy(how = How.XPATH, xpath ="*//input[@id='replace-courselike-button']")
public WebElement replaceCourseContentBtn;

@FindBy(how = How.ID, id = "view-updated-button")
public WebElement viewUpdatedCourseContentBtn;

@FindBy(xpath = "//p[contains(text(),'Your imported content has now been integrated into')]")
public WebElement importSuccessTextPath;

public String courseNamToImport = "course.uskyzq60.tar.gz";
public String processName = "FileUploadProcess.exe";
public String sanityCourseName = "course.SanityPack.tar.gz"; //Dev-SMK-R6-All-Features.tar.gz 		course.SanityPack.tar.gz
//
//@FindBy(xpath = "//p[contains(text(),'Your exported course can now be downloaded')]")
//public WebElement courseCanBeDownloadedText;
//
//@FindBy(xpath = "//div[contains(@class, 'wrapper wrapper-view')]/main[@id='main']/div[@id='content']/div[2]/section/article/div[3]/ol/li[4]/div/h3")
//public WebElement successText;
//	
//@FindBy(xpath = "//small[contains(text(),'Tools')]")
//public WebElement toolsTextOnTop;
	
}
