package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPortalPageElements {
	
	public AdminPortalPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------

@FindBy(how = How.ID, id = "id_course") //input[@id='id_course']
public WebElement searchCourseNameInput;

@FindBy(how = How.ID, id = "id_mode_slug") //select[@id='id_mode_slug']
public WebElement courseTypeSelect;

@FindBy(how = How.ID, id = "id_mode_display_name") //input[@id='id_mode_display_name']
public WebElement courseNameInput;

@FindBy(xpath = "//*[@id='coursemode_form']/div/div/input[1]")
public WebElement saveBtn;

public String lms = "-lms-";
public String cms = "-cms-";
public String stageLms = "lms-";
public String stageCms = "cms-";
public String courseTypeValue = "Honor";
public String courseStringUrl = "course/";
public String adminPortalCourseModeStringUrl = "admin/course_modes/coursemode/add/";
	
	
}
