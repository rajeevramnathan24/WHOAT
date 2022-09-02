package test.PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class AddComponentPageElements {
	
	public AddComponentPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/section/article/section/div/article/div/div/div[1]/ul/li[3]/button")
	public WebElement htmlComponentBtn;

	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'Text')]]")
	public WebElement texthtmlComponentOption;
	
	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'LTI Consumer')]]")
	public WebElement ltiConsumerOption;
	
	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'Scorm')]]")
	public WebElement scormOnlyComponentOption;
	
	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'v2')]]")
	public WebElement scormV2ComponentOption;
	
	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'Randomized Content Block')]]")
	public WebElement randomContentBlockOption;

	@FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/button[1]")
	public WebElement editTextContent;

	public String textFramePath="mce_0_ifr";

	@FindBy(how = How.ID, id = "tinymce") //tinymce
	public WebElement frameId;

	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public WebElement saveTextContent;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/section/article/section/div/article/div/div/div[1]/ul/li[1]/button")
	public WebElement advancedComponentBtn;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/section/article/section/div/article/div/div/div[1]/ul/li[4]/button")
	public WebElement problemComponentBtn;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/section/article/section/div/article/div/div/div[1]/ul/li[5]/button")
	public WebElement videoComponentBtn;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/section/article/section/div/article/div/div/div[1]/ul/li[2]/button")
	public WebElement discussionComponentBtn;
	
	@FindBy(xpath = "*//div[contains(@class,'new-component-item')]")
	public WebElement componentBlock;
	
	public WebElement componentButton(String compName) {
		
		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='new-component']/ul[@class='new-component-type']/li/button[@data-type='"+compName+"']"));
	}
	
	@FindBy(xpath= "//input[@id='xb-field-edit-display_name']")
	public WebElement discussionNameInput;
	
	@FindBy(xpath= "//input[@id='xb-field-edit-discussion_category']")
	public WebElement discussionCategoryInput;
	
	@FindBy(xpath= "//input[@id='xb-field-edit-display_name']")
	public WebElement ltiNameInput;
	
	@FindBy(xpath= "//input[@id='xb-field-edit-lti_id']")
	public WebElement ltiIdInput;
	
	@FindBy(xpath= "//input[@id='xb-field-edit-launch_url']")
	public WebElement ltiUrlInput;
	
	@FindBy(xpath= "//textarea[@id='xb-field-edit-custom_parameters']")
	public WebElement ltiCustomParamInput;
	
	@FindBy(xpath= "//select[@id='xb-field-edit-launch_target']")
	public WebElement ltiLaunchWindowInput;
	
	@FindBy(xpath="*//div[@id='settings-tab']/ul/li/div[./label[contains(text(),'SCORM')]]/input[@id='field_scorm_file']")//(how = How.ID, using = "field_scorm_file")
	public WebElement scormV2FileNameInput;
	
//	@FindBy(xpath = "//input[@id='scorm_file']")
	@FindBy(xpath = "/html/body/div[16]/div/div[2]/div/div[2]/div/div/div/ul/li[2]/div/input")
	public WebElement scormFileUploadBtn;
	
	@FindBy(xpath = "//label[contains(text(),'zip')]")
	public WebElement scormFileUploadLabel;
		
	
	@FindBy(xpath= "/html/body/div[8]/div/div[2]/div/div[2]/div/div/div/section/div[2]/div[1]/div/ul/li[2]/div[1]/div/div[1]/input")
	public WebElement defaultVideoUrlId;
	
	@FindBy(xpath= "/html/body/div[8]/div/div[2]/div/div[2]/div/div/div/section/div[2]/div[1]/div/ul/li[3]/div/input") 
	public WebElement videoIdInputXpath;
	
	@FindBy(xpath= "//span[contains(text(),'View Live Version')]") 
	public WebElement viewLiveVersionBtn;
	
	@FindBy(xpath= "//span[contains(text(),'Preview')]") 
	public WebElement previewBtn;
	
	@FindBy(xpath = "//header/div[1]/div[2]/ul[1]/li[1]/button[span[contains(text(),'Edit')]]")
	public WebElement editContent;

	@FindBy(xpath = "//*[@id='tab1']//ul//li//button[span[contains(text(),'Dropdown')]]")
	public WebElement dropDownProblemComponentOption;
	
	@FindBy(xpath = "//*[@id='page-notification']/div[contains(@class,'is-shown')]")
	public WebElement quickNotification;
	
	@FindBy(xpath = "*//nav[@class='nav-actions']/ul/li[contains(@class,'preview')]/a")
	public WebElement previewBtnWaitScormOnly;
	
	
	public WebElement problemComponentOption(String type) {
		
		return GlobalConstants.getDriver().findElement(By.xpath("//*[@id='tab1']//ul//li//button[span[contains(text(),'"+type+"')]]"));
	}
	
	//Define Arraylist for list of components to be added
	public static List<String> componentList;
	
	/**
	 * This getter method is used to retrieve value from setter
	 * @return
	 */
	public List<String> getComponentList() {
		return componentList;
	}

	/**
	 * This setter method is used to set component list selected dynamically from feature file
	 * @return
	 */
	public void setComponentList(List<String> componentListName) {
		AddComponentPageElements.componentList = componentListName;
	}
	
	/**
	 * This method is used to return webelement when label name is input param for randomised content edit screen
	 * @param fieldName
	 * @return WebElement locator
	 */
	public WebElement randContentBlockGenericLocator(String fieldName) {
		
		WebElement finalLocator = null;
		
		switch (fieldName) {
		
		case "Count":
			
			finalLocator = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='wrapper-comp-setting'][./label[contains(text(),'Count')] and ./input]/input"));
			
			break;
			

		//For dropdown
		case "Library":
			
			finalLocator = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='wrapper-comp-setting'][./label[contains(text(),'Library')] and ./select]/select"));
			
			break;


		default:
			break;
		}
		
		return finalLocator;		
	}
	
	@FindBy(xpath = "*//div[./label[contains(@text(),'Library')]]/select[@class='input setting-input']")
	public WebElement librarySelectLocator;
	
	
	
}
