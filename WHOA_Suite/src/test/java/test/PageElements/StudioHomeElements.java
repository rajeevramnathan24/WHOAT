package test.PageElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudioHomeElements {
	
	public StudioHomeElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(xpath = "//h1[contains(text(),'Studio Home')]")
	public WebElement xpathStudioHomeLabel;
	
	@FindBy(xpath = "//*[@id='view-top']/header/div[2]/nav/ol/li[2]/h3") //"//span[contains(text(),'ta01')]")
	public WebElement xpathCurrentlySignedInBy;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement xpathLogOut;
	
	@FindBy(xpath = "//*[@id='content']/div[1]/header/nav/ul/li/a[1]")
	public WebElement newCourseBtn;
	
	@FindBy(how = How.ID, id = "new-course-name") //input[@id='new-course-name'] 
	public WebElement newCourseNameInput;
	
	@FindBy(how = How.ID, id = "new-course-org") //input[@id='new-course-org']
	public WebElement newCourseOrgInput;

	@FindBy(how = How.ID, id = "new-course-number") //input[@id='new-course-number'] 
	public WebElement newCourseNumberInput;

	@FindBy(how = How.ID, id = "new-course-run") //input[@id='new-course-run']
	public WebElement newCourseRunInput;

	@FindBy(xpath = "//*[@id='create-course-form']/div[3]/input[2]")
	public WebElement createCourseBtn;
	
	@FindBy(xpath = "//div[@id='react-course-listing']/ul[contains(@class, 'list-courses')]/li")
	public List<WebElement> courseListing;
	
	//@FindBy(xpath = "./a/h3[@class='course-title']")
	public String courseNameLocator ="./a/h3[@class='course-title']" ;
	
	public Boolean courseFoundFlag = false;
	
	//CourseDisplayName
	public String courseDisplayName = "course-v1:";
	public String courseOrg = ""; //"Org";
	public String courseNumber = "";//Number";
	public String courseRun = ""; //Run";
	public static String courseName = "";
	public static String courseType = "Novalue";
	
	
	

	/**
	 * This getter method is used to retrieve value from setter
	 * @return
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * This setter method is used to set course name dynamically from feature file
	 * @return
	 */
	public void setCourseName(String courseName) {
		StudioHomeElements.courseName = courseName;
	}
	
	@FindBy(xpath = "*//div[@class='bit']//h3[contains(text(),'New to WHO Academy')]")
	public WebElement newToAcademyTextLocator;
	
	@FindBy(xpath="*//div[@class='bit']/ol[@class='list-actions']/li[@class='action-item']/a[contains(text(),'Getting Started')]")
	public WebElement getStartedLocator;
	
}
