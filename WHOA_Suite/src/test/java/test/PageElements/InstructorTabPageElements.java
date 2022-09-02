package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstructorTabPageElements {
	
	public InstructorTabPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//button[contains(text(),'Membership')]")
public WebElement membershipTab;

@FindBy(xpath = "//*[@id='membership']/fieldset[@class='batch-enrollment membership-section']/label/textarea[@name='student-ids']")
public WebElement batchEnrollmentInput;

@FindBy(xpath = "//*[@id='membership']/fieldset[@class='batch-enrollment membership-section']/div/input[@value='Enroll']")
public WebElement enrollButton;

@FindBy(xpath = "//*[@id='membership']/fieldset[@class='batch-enrollment membership-section']/div/input[@value='Unenroll']")
public WebElement unEnrollButton;

@FindBy(xpath = "//*[@id='membership']/fieldset[@class='batch-enrollment membership-section']/div[@class='request-response']/div/h3")
public WebElement enrollUnenrollResponse;	
	
}
