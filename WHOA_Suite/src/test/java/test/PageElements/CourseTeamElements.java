package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CourseTeamElements {
	
	public CourseTeamElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//*[@id='content']/div[2]/section/article/div[2]/ul/li/a[contains(text(),'Add a New Team Member')]")
public WebElement addNewTeamMemberBtn;

@FindBy(how = How.ID, id = "user-email-input")
public WebElement userEmailInput;

@FindBy(xpath = "//button[contains(text(),'Add User')]")
public WebElement addUserBtn;

@FindBy(xpath = "//*[@id='user-list']//li[@data-email='skiran_cv@yahoo.co.in']/span/span/span[@class='value']")
public WebElement LabelTextStaff;

@FindBy(xpath = "//a[contains(text(),'Add Admin Access')]")
public WebElement adminAccessBtn;

@FindBy(xpath = "//*[@id='user-list']/li[@data-email='skiran_cv@yahoo.co.in']/span/span/span[2][contains(text(),'ADMIN')]")
public WebElement LabelTextAdmin;

@FindBy(xpath = "//*[@id='user-list']/li[@data-email='skiran_cv@yahoo.co.in']//ul//li//a[contains(text(),'Remove Admin Access')]")
public WebElement removeAdminAccessBtn;

@FindBy(xpath = "//ol[@id='user-list']/li[contains(@class, 'user-item')][2]/ul[contains(@class, 'item-actions')]/li[contains(@class, 'action')][2]/a[contains(@class, 'delete')]")//"//*[@id='user-list']//li/ul//li/a[@class='delete remove-user action-icon']")
public WebElement deleteUserBtn;

@FindBy(xpath = "//button[contains(text(),'Delete')]")
public WebElement deleteUserPopUpBtn;


	
	
	
}
