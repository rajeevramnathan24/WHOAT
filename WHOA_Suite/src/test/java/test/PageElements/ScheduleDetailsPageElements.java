package test.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class ScheduleDetailsPageElements {
	
	public ScheduleDetailsPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	public String zeroHours = "00:00";
	@FindBy(how = How.ID, id = "course-start-date") //input[@id='course-start-date']
	public WebElement courseStartDate;
	public String courseStartDateInput = "10/01/2021";

	@FindBy(how = How.ID, id = "course-start-time") //input[@id='course-start-time']
	public WebElement courseStartTime;

	@FindBy(how = How.ID, id = "course-end-date") //input[@id='course-end-date']
	public WebElement courseEndDate;
	public String courseEndDateInput = "10/01/2023";

	@FindBy(how = How.ID, id = "course-end-time") //input[@id='course-end-time']
	public WebElement courseEndTime;

	@FindBy(how = How.ID, id = "course-enrollment-start-date") //input[@id='course-enrollment-start-date']
	public WebElement enrollmentStartDate;
	public String enrollmentStartDateInput = "01/01/2021";

	@FindBy(how = How.ID, id = "course-enrollment-start-time") //input[@id='course-enrollment-start-time']
	public WebElement enrollmentStartTime;
	
	@FindBy(how = How.ID, id = "course-enrollment-end-date") //input[@id='course-enrollment-end-date']
	public WebElement courseEnrollmentEndDate;
	public String enrollmentEndDateInput = "12/12/2022";

	@FindBy(how = How.ID, id = "course-enrollment-end-time") //input[@id='course-enrollment-end-time']
	public WebElement enrollmentEndTime;

	@FindBy(xpath = "//button[contains(text(),'Save Changes')]")
	public WebElement saveChangesBtn;
	
	@FindBy(xpath = "//select[@id='course-language']")
	public WebElement courseLanguage;
	
	public String english = "English";
	public String arabic = "Arabic";
	public String french = "French";
	public String spanish = "Spanish";
	public String russian = "Russian";
	public String chinese = "Chinese";
	
	
	
	public WebElement paceTypeLocator(String paceName){
		return GlobalConstants.getDriver().findElement(By.xpath("//*[@id='course-pace-"+paceName+"-label']"));
	}
	
}
