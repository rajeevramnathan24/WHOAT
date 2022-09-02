package test.PageElements;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class LxpHomePageElements {

	public LxpHomePageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//-----------------------------------#page elements--------------------------------------------

	@FindBy(xpath = "//h5[contains(text(),'Discover learning')]")
	public WebElement xpathLxpDiscoverLearning;
	
	@FindBy(xpath = "*//div[@class='lxp-dashboard__recommendations']/div[@class='lx-dashboard-section-heading']")
	public WebElement recommendationLocator;
	
	@FindBy(xpath = "*//div[@class='lxp-dashboard__my-programmes']/div")
	public WebElement myProgramme;	

	@FindBy(xpath = "*//div[@class='lxp-dashboard__discover-learning']/div[@class='lx-dashboard-section-heading is-link'][contains(text(),'Discover')]")
	public WebElement BtnDiscoverLearning;
	public String Lang_BtnDiscoverLearning = "//p[contains(text(),'Discover learning')]";

	@FindBy(xpath = "//h5[contains(text(),'To replace >')]")
	public WebElement xpathLxpDiscoverLearningNew  ;

	//@FindBy(xpath = "//div[@id='app' and contains(@class, 'app-en')]/div[contains(@class, 'ul-container')]/div[contains(@class, 'row')]/div[contains(@class, 'h-100')][2]/div[contains(@class, 'row')]/div[contains(@class, 'h-100')][2]/div[contains(@class, 'ul-top__search')]/img[contains(@class, 'ml-3') and contains(@role,'button')]") //"//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/img[1]")
	@FindBy(xpath="*//div[@class='user-fluid-layout__profile-dropdown']/div/button/img")
	public WebElement xpathLxpLogoutUser;
	public String logoutString = ".ml-3.c-pointer";

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement xpathLxpLogOutBtn;
	
	@FindBy(xpath="//*[@id='logout-modal___BV_modal_footer_']/button[contains(text(),'Log Out')]")
	public WebElement logoutModalPopUp;
	//*[@id='logout-modal___BV_modal_footer_']/button[contains(text(),'Log Out')]

	@FindBy(xpath =  "//div[@id='app']")
	public WebElement langTypeId;

//	@FindBy(how = How.XPATH, using = "//*[@id='app']/div[1]//div[1]/div[2]//div[@class='ul-left__name c-pointer'][1]/label") //"//*[@id='app']/div/div/div/div/div/div[1]/div[2]/div/div/div[1]")
	//"//*[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]")
	@FindBy(xpath = "/html/body//div[1]//div[1]/div[2]//div[1]/label")
	public WebElement profileImage;
	//*[@id='app']//div//div[1]//div[2]//div//ul/li[1]") 
	//"//*[@id='app']//div[@class='ul-left__name c-pointer']//img")
	////*[@id='app']//div[@class='h-100 p-0 ul-left col-3']//div[@class='ul-left__menu']//div[@class='ul-left__name c-pointer']//img
	//*[@id='app']//div[@class='h-100 p-0 ul-left col-3']//div[@class='ul-left__menu']//div[@class='ul-left__name c-pointer']//img


	@FindBy(how = How.XPATH, using = "//*[@id='app']//div[1]/div[2]/button[contains(@class, 'btn')]")
	//"//*[@id='app']//div[2]//div[2]//div[1]//div[1]//div[2]/button") //"//*[@id='app']//div[1][@class='row m-0 pr-sections']//button")
	public WebElement languageEditBtn;

	//@FindBy(xpath =  "//*[@id='__BVID__177__BV_toggle_']/div/label") //"//label[contains(text(),'English')]")
	@FindBy(xpath =  "*//div[@class='lx-select__div']/div[@class='dropdown b-dropdown btn-group']/button") //"//label[contains(text(),'English')]")
	public WebElement selectedLanguage;

	@FindBy(xpath =  "//a[contains(text(),'中文')]")
	public WebElement selectChineseLanguage;

	@FindBy(xpath =  "//a[contains(text(),'English')]")
	public WebElement selectEnglishLanguage;
	
	
	
	public WebElement selectTargetLangFromDropDownLocator(String langCode) {
		
		String langText = null;
		switch (langCode) {
		
		case "English":
			
			langText = "English";
			
			break;

		case "Chinese":
			
			langText = "中文";
			
			break;

		case "Arabic":
			
			langText = "العربية";
			
			break;

		case "French":
			
			langText = "Français";
			
			break;

		case "Russian":
			
			langText = "Русский";
			
			break;

		case "Spanish":
			
			langText = "Español";
			
			break;
			
		default:
			break;
		}
		
		return GlobalConstants.getDriver().findElement(By.xpath("//ul[@class='dropdown-menu show']//li/a[contains(text(),'"+langText+"')]")); ////a[contains(text(),'"+langText+"')]
		////ul[@class='dropdown-menu show']//li/a[contains(text(),'Français')]
	}

	@FindBy(xpath =  "//*[@id='app']//div[@class='ul-left__menu']//ul//li[1]")
	public WebElement homeLinkLeftMenu;

	@FindBy(xpath =  "//span[contains(text(),'My Learning')]")
	public WebElement myLearningLinkLeftMenu;

	@FindBy(xpath =  "//label[contains(text(),'Feedback')]")
	public WebElement feedbackLeftMenu;
	public String lang_FeedbackLeftMenu = "//label[contains(text(),'Feedback')]";
	public WebElement feedbackLeftMenuNew (String localLangText) {
		
		return GlobalConstants.getDriver().findElement(By.xpath("//span[contains(text(),'"+localLangText+"')]"));
	}
	

	//***********************************************************************
	//[contains(@class, 'Caption') and text()='Model saved']
	//TO be deleted
	@FindBy(xpath = "//p[contains(text(),'非常高兴您的加入！')]")
	public WebElement xpathChGoodToHave  ;
	
	//***********************************************************************
	
	@FindBy(xpath =  "//div[contains(@class, 'h-100')]//div[contains(@class, 'ul-left__menu')]//div[contains(@class, 'ul-left__name')]")
	public WebElement userLabelLeftMenu;
	
	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	public WebElement settingsTab;
	
	/**
	 * Accessing edit button via javascript hence webelement is not used
	 */
	public String editButton = "('btn')[1]";
	
	/**
	 * This method is used to click on edit button of language or goals
	 * @param toEdit
	 * @return
	 */
	public WebElement editSettings(String toEdit) {
		
		return GlobalConstants.getDriver()
				.findElement(By
				.xpath("*//div[@class='pr-det__div h-100']/div[@class='row m-0 pr-sections'][./div[@class='col-8 text-left'][./label[contains(text(),'"
				+ toEdit
				+"')]]]/div[@class='col-4 p-0 text-right']/button"));
	}
	
	@FindBy(xpath =  "//button[contains(text(),'Edit Profile')]")
	public WebElement editProfileBtn;
	
	@FindBy(xpath =  "//textarea[@id='textarea']")
	public WebElement inputGoalTextArea;
	
	@FindBy(xpath =  "//button[contains(text(),'Save')]")
	public WebElement saveBtn;
	
	@FindBy(xpath =  "//button[contains(text(),'Close')]")
	public WebElement closeBtn;
	
	public static ArrayList<Object> oldText = new ArrayList<Object>();
	public static Boolean sameLanguageFlag = false;
	
	@FindBy(xpath =  "//input[@id='first_name']")
	public WebElement firstNameInput;
	
	@FindBy(xpath =  "//input[@id='last_name']")
	public WebElement lastNameInput;
	
	@FindBy(xpath = "//div[contains(@class, 'col-12')][3]//button/div[./label]") // "//label[contains(text(),'Male')]")
	public WebElement genderDropDownClick;
	
	@FindBy(xpath =  "//div[contains(@class, 'dropdown')]/ul[contains(@class, 'dropdown-menu')]/li[2]/a")
	public WebElement selectFemaleGender;
	
	//a[contains(text(),'Female')]
	
	@FindBy(xpath =  "//div[contains(@class, 'col-12')][5]//button/div[./label]")
	public WebElement ageDropDownClick;
	@FindBy(xpath =  "//div[contains(@class, 'dropdown')]/ul[contains(@class, 'dropdown-menu')]/li[1]/a")
	public WebElement selectAgeGroup;
	
	
	@FindBy(xpath =  "//div[contains(@class, 'col-12')][6]//button/div[./label]")
	public WebElement roleDropDownClick;
	@FindBy(xpath =  "//div[contains(@class, 'dropdown')]/ul[contains(@class, 'dropdown-menu')]/li[8]/a")
	public WebElement selectRoleType;
	
	@FindBy(xpath =  "//div[contains(@class, 'col-12')][7]//button/div[./label]")
	public WebElement yearsDropDownClick;	
	@FindBy(xpath =  "//div[contains(@class, 'dropdown')]/ul[contains(@class, 'dropdown-menu')]/li[1]/a")
	public WebElement selectYears;
	
//	@FindBy(xpath =  "/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/span[3]")
	@FindBy(xpath="//*[@id='course-card-0']//div[2]//div[2]//div/span[3]")
	public WebElement languageOnCard;

	private String prefixRadioBtnXpath = "//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, '";
	private String suffixRadioBtnXpath = "')]]/label[contains(@class, 'custom-control-label')]";
	
	public String langCheck(String langClass) {
		
		String langFound = null;
		
		switch (langClass) {
		
		case "app-en":
			
			langFound="English";
			
			break;

		case "app-ar":
			
			langFound="Arabic";
			
			break;

		case "app-fr":
			
			langFound="French";
			
			break;

		case "app-zh":
			
			langFound="Chinese";
			
			break;

		case "app-ru":
			
			langFound="Russian";
			
			break;

		case "app-es":
			
			langFound="Spanish";
			
			break;

		default:
			break;
		}
		
		return langFound;
	}

	private String returnLangAttributeValue(String languageType) {

		String valueText = "Incorrect Language";

		switch (languageType) {

		case "Arabic":

			valueText = "ar";

			break;


		case "Chinese":

			valueText = "zh";

			break;


		case "French":

			valueText = "fr";

			break;


		case "Russian":

			valueText = "ru";

			break;


		case "Spanish":

			valueText = "es";

			break;


		case "English":

			valueText = "en";

			break;

		default:
			break;
		}
		
		return valueText;
	}

	public WebElement getRadioBtnLangLabel (String langCat) {

		return GlobalConstants.getDriver().findElement(By.xpath(prefixRadioBtnXpath+returnLangAttributeValue(langCat)+suffixRadioBtnXpath+"/span"));
	}

	public WebElement getDynamicRadioBtnXpath (String langType) {
		
		return GlobalConstants.getDriver().findElement(By.xpath("*//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, '"+returnLangAttributeValue(langType)+"')]]/label[contains(@class, 'custom-control-label')]"));
	}
	
	private static String languageName;

	/**
	 * This getter method is used to retrieve language value from setter
	 * @return
	 */
	public String getLanguage() {
		return languageName;
	}

	/**
	 * This setter method is used to set language value dynamically from feature file
	 * @return
	 */
	public void setLanguage(String languageSelected) {
		LxpHomePageElements.languageName = languageSelected;
	}



}
