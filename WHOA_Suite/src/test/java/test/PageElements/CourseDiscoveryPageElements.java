package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDiscoveryPageElements {
	
	public CourseDiscoveryPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------

	@FindBy(xpath = "*//div[@class='input-group']/input[@type='text']") //"/html/body/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/input")
	public WebElement courseNameSearch;
	
	@FindBy(xpath = "*//div[@class='col-10']/h5[@class='cd-main__title']")
	public WebElement learningProgHeader;
	
	@FindBy(xpath = "//*[@id='course-card-0']/div/div/div/div")
	public WebElement FirstCourseCard;
	
	@FindBy(xpath = "*//div[@class='user-fluid-layout__side-nav-menu expand']/ul//li/span[contains(text(),'Discovery')]")
	public WebElement discoveryLink;
	
	
	@FindBy(xpath="*//div[@class='input-group-prepend']/div[@class='input-group-text']")
	public WebElement searchIcon;  //*//div[@class='input-group-prepend']/div[@class='input-group-text']  -- ///*//div[./img[@alt='search']]
	
	public static String htmlCourseName, problemCourseName, videoCourseName, zoomCourseName, discussionForumCourseName, generalCourseName, scormPkgCourseName, scormV2CourseName, runtimeCourseName = "";
	public static String araCourseName, frenCourseName, espCourseName, zhuCourseName, russCourseName;
	public static String seqLogicCourseName, timeBasedCourseName, randomCourseName,incompletetimeBasedCourseName = "";
		
}
