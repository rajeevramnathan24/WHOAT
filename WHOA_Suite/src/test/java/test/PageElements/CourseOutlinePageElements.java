package test.PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class CourseOutlinePageElements {

	public CourseOutlinePageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//-----------------------------------#page elements--------------------------------------------



	@FindBy(xpath = "/html/body/div[1]/main/div/div[1]/header/nav/ul/li[1]")
	public WebElement newSectionBtn;

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[2]/div[1]/h3/span[2]/div[2]/form/label/input")
	public WebElement addNewSectionNameInput;

	@FindBy(xpath = "//html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[")
	public WebElement parentElement; 
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/p")
	public WebElement centralNewSection;
	
	@FindBy(xpath = "*//div[@class='no-content add-section']/p")
	public WebElement noContentLocator;
	
	
	/**
	 * This method is used to click on delete button for any section or subsection
	 * @param type is the section or subsection or unit name
	 * @return WebElement
	 */
	public WebElement deleteUnitBtn(String sectionName, String type){
		if (type.contentEquals("unit")) {
			return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='" + type.toLowerCase()
					+ "-header' and ./h3/span/span/a[contains(text(),'" + sectionName + "')]]//div[@class='"
					+ type.toLowerCase() + "-header-actions']/ul/li[@class='action-item action-delete']/a"));
		} else {
			
			return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='" + type.toLowerCase()
			+ "-header' and ./h3/span[2]/span[contains(text(),'" + sectionName + "')]]//div[@class='"
			+ type.toLowerCase() + "-header-actions']/ul/li[@class='action-item action-delete']/a"));
		}
		//div[@class='unit-header' and ./h3/span/span/a[contains(text(),'UnitName')]]//div[@class='unit-header-actions']/ul/li[@class='action-item action-delete']/a
	}
	
	
	
	public WebElement subSectionExpand(String subSectionName) {
		return GlobalConstants.getDriver().findElement(By.xpath("//span[contains(text(),'"+subSectionName+"')]"));
	
	}
	
	/**
	 * This method is used to return popup button locator of confirm delete
	 * @param catType
	 * @return
	 */
	public WebElement deletePopUpConfirm(String catType) {
		return GlobalConstants.getDriver().findElement(By
				.xpath("//button[contains(text(),'Yes, delete this "+catType+"')]"));
			
	}
	
	/**
	 * This method returns the configure button locator of corresponding subsection name
	 * @param subSecName
	 * @return
	 */
	public WebElement configureSubSectionBtn(String subSecName)  {
		
		return GlobalConstants.getDriver().findElement(By
				.xpath("*//div[@class='subsection-header' and ./h3/span[2]/span[contains(text(),'"+subSecName+"')]]//div[@class='subsection-header-actions']/ul/li[@class='action-item action-configure']/a"));
		
		//*//div[@class='subsection-header' and ./h3/span[2]/span[contains(text(),'SSH-Zoom-Int')]]//div[@class='subsection-header-actions']/ul/li[@class='action-item action-configure']/a
	}
	
	@FindBy(xpath = "//button[contains(text(),'Advanced')]")
	public WebElement advancedTabBtn;
	
	@FindBy(xpath = "*//div[@class='field-checkbox checkbox-cosmetic'][./input[@id='is_prereq']]/label")
	public WebElement makeSectionPreqCheckbox;
	
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public WebElement saveBtn;
	
	@FindBy(xpath = "//select[@id='prereq']")
	public WebElement preReqDropDown;
	
	@FindBy(xpath = "*//div[@class='status-message']//p")
	public WebElement preReqTextDisplayed;
	
	@FindBy(xpath = "*//div[@class='list-fields list-input exam-types']/label[2]")
	public WebElement radioBtnTimed;
	
	@FindBy(xpath = "*//div[@class='field field-text field-time-limit']/label/input[@type='text']")
	public WebElement inputAllotedTime;
	
	@FindBy(xpath = "//span[contains(text(),'Ungraded')]")
	public WebElement unGradedText;
	
	@FindBy(xpath = "*//div[@class='status-timed-proctored-exam']/p/span[5]")
	public WebElement timedExamText;
	
	@FindBy(xpath = "//select[@id='grading_type']")
	public WebElement gradingDropDownValue;
	
	@FindBy(xpath = "*//div[@class='outline-content course-content']/ol/li")
	public List<WebElement> sectionCount;
	
	
	//******************
	private String genericSecSubSecUnitLocator = "//html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[";
	private String sectionInputXpath = "]/div[1]/h3/span[2]/div[2]/form/label/input";
	private String subSectionBtnXpath="]/div[3]/div";
	private String subSectionInputXpath = "]/div[3]/ol/li[2]/div[1]/h3/span[2]/div[2]/form/label/input";
	private String newUnitButtonXpath = "]/div[3]/ol/li[2]/div[3]/div";
	private String publishButtonXpath = "]/div[1]/div/ul/li[1]/a/span[1]";

	public WebElement getSectionNameInputXpath(int count){
		return GlobalConstants.getDriver().findElement(By.xpath(genericSecSubSecUnitLocator+count+sectionInputXpath));
	}

	public WebElement getSubSectionButtonXpath(int count){
		return GlobalConstants.getDriver().findElement(By.xpath(genericSecSubSecUnitLocator+count+subSectionBtnXpath));
	}

	public WebElement getSubSectionInputXpath(int count){
		return GlobalConstants.getDriver().findElement(By.xpath(genericSecSubSecUnitLocator+count+subSectionInputXpath));
	}

	public WebElement getNewUnitButtonXpath(int count){
		return GlobalConstants.getDriver().findElement(By.xpath(genericSecSubSecUnitLocator+count+newUnitButtonXpath));
	}
	
	public WebElement getPublishButtonXpath(int count){
		return GlobalConstants.getDriver().findElement(By.xpath(genericSecSubSecUnitLocator+count+publishButtonXpath));
	}
	
	public WebElement getNewPublishButton(String sectionName) {
		return GlobalConstants.getDriver().findElement(By
				.xpath("*//div[@class='section-header' and ./h3/span[2]/span[contains(text(),'"+
						sectionName+"')]]//div[@class='section-header-actions']/ul/li[@class='action-item action-publish']/a"));
		//ref :*//div[@class='section-header' and ./h3/span[2]/span[contains(text(),'Video')]]//div[@class='section-header-actions']/ul/li[@class='action-item action-publish']/a
	}

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[2]/div[3]/div")
	public WebElement newSubSectionBtn;

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[2]/div[3]/ol/li[2]/div[1]/h3/span[2]/div[2]/form/label/input")
	public WebElement addNewSubSectionNameInput;

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[2]/div[3]/ol/li[2]/div[3]/div")
	public WebElement newUnitBtn;
	
	@FindBy(xpath = "//*[@id='content']/div[1]/header/div[1]/div[1]/div[2]/form/label/input")
	public WebElement unitNameInput;

	@FindBy(xpath = "//html/body/div[1]/main/div/div[2]/section/article/div[2]/article/div/ol/li[2]/div[1]/div/ul/li[1]/a/span[1]")
	public WebElement publishFirstSectionBtn;

	@FindBy(xpath = "//a[contains(text(),'Publish')]")
	public WebElement publishPopupBtn;

	@FindBy(xpath = "//header/div[1]/h2[1]/a[1]")
	public WebElement headerCourseName;
	
	@FindBy(xpath = "//span[contains(text(),'Tools')]")
	public WebElement toolsMainMenu;

	@FindBy(xpath = "//*[@id='view-top']//header/div[1]/nav[1]/ol[1]/li[1]/h3[1]/span[1]")
	public WebElement contentMainMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Files & Uploads')]")
	public WebElement fileUploadsSubMenu;	
	
	@FindBy(xpath = "//*[@id='view-top']//header/div[1]/nav[1]/ol[1]/li[2]/h3[1]/span[1]")
	public WebElement settingsMainMenu;

	@FindBy(xpath = "//a[contains(text(),'Schedule & Details')]")
	public WebElement scheduleDetailSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Advanced Settings')]")
	public WebElement advancedSettingsSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Grading')]")
	public WebElement gradingSubMenu;

	@FindBy(xpath = "//a[contains(text(),'Certificates')]")
	public WebElement certificateSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Course Team')]")
	public WebElement courseTeamSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'View Live')]")
	public WebElement viewliveButton;
	
	@FindBy(xpath = "//a[contains(text(),'Export')]")
	public WebElement exportSubMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Import')]")
	public WebElement importSubMenu;
	

	@FindBy(xpath = "//a[contains(text(),'Digital Credentials')]")
	public WebElement digitalCredentialsSubMenu;
	
	private String subSectionPrefix = "//div[@class='subsection-header']//h3/span[2]/span[contains(text(),'";
	private String subSectionUnitNameSuffix = "')]";
	public WebElement clickOnSubSectionName(String subSectionName){
		return GlobalConstants.getDriver().findElement(By.xpath(subSectionPrefix+subSectionName+subSectionUnitNameSuffix));
	}
	
	private String unitNamePrefix = "//div[@class='unit-header']//h3/span/span/a[contains(text(),'";
	
	public WebElement clickOnUnitName(String unitName){
		return GlobalConstants.getDriver().findElement(By.xpath(unitNamePrefix+unitName+subSectionUnitNameSuffix));
	}

	public static String courseName_OutlinePageUrl;


	public String getCourseName_OutlinePageUrl() {
		return courseName_OutlinePageUrl;
	}


	public void setCourseName_OutlinePageUrl(String courseID) {
		CourseOutlinePageElements.courseName_OutlinePageUrl = courseID;
	}

}
