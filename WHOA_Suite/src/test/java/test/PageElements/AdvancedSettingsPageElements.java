package test.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class AdvancedSettingsPageElements {

	public AdvancedSettingsPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//-----------------------------------#page elements--------------------------------------------

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Course Visibility For Unenrolled Learners')]]/textarea") //"/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/textarea")
	public WebElement courseVisibilityTextAreaInput;

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Course Visibility For Unenrolled Learners')]]/div" ) // "/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")
	public WebElement courseVisibilityTextAreaClick;

	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/nav/ul/li[1]/button")
	public WebElement saveButtonClick;

	public String publicOutlineValue = "public_outline";

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Advanced Module List')]]/textarea") //"/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[1]/div[2]/textarea")
	public WebElement advancedModuleListTextAreaInput;

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Advanced Module List')]]/div")
	public WebElement advancedModuleListTextAreaClick;

	public String advancedModuleListValue = "\"scorm_v2\",\"scorm\",\"lti_consumer\",\"library_content\"";

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'LTI Passports')]]/textarea") //"/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[44]/div[2]/textarea")
	public WebElement ltiPassPortTextAreaInput;

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'LTI Passports')]]/div") //"/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[44]/div[2]/div")
	public WebElement ltiPassPortTextAreaClick;

	public String ltiPassPortValue = "\"zoom:ScgAXmGlQNS0oyAOYgghhA:e2KoDytTdN8WID3wC5i6IqV5uLXzf1mnex3k\"";

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Enable Subsection Prerequisites')]]/textarea")
	public WebElement EnableSubSecPreReqValueTextAreaInput;

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Enable Subsection Prerequisites')]]/div")
	public WebElement EnableSubSecPreReqValueTextAreaClick;

	public String trueValue = "true";

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Enable Timed Exams')]]/textarea")
	public WebElement EnableTimedExamTextAreaInput;

	@FindBy(xpath = "//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'Enable Timed Exams')]]/div")
	public WebElement EnableTimedExamTextAreaClick;

	public WebElement textAreaInput(String TxtAreafieldName) {

		return GlobalConstants.getDriver().findElement(By
				.xpath("//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'"+TxtAreafieldName+"')]]/textarea"));
	}

	public WebElement textAreaClick(String clickFieldName) {

		return GlobalConstants.getDriver().findElement(By
				.xpath("//*[@id='settings_advanced']/section/ul/li/div[2][./label[contains(text(),'"+clickFieldName+"')]]/div"));
	}
}
