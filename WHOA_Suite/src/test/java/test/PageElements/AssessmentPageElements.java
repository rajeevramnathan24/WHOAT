package test.PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class AssessmentPageElements {

	public AssessmentPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//-----------------------------------#page elements--------------------------------------------


	@FindBy(xpath = "*//div[@class='sp__left-nav-container']//div[@class='sp__left-nav__module-wrapper sp__left-nav__module-wrapper--open']/div/div")
	public List<WebElement> leftSectionTab;

	@FindBy(xpath = "*//div[@class='course-unit__wrapper']/iframe[@title='Course Unit']") //"//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	public WebElement assessmentFrame;

	@FindBy(xpath = "//*[@id='app']//div[2]//div[2]/div[2]//div[1]/h3")
	public WebElement topSectionHeader;

	public WebElement unitHeader(String headerName) {

		return GlobalConstants.getDriver().findElement(By.xpath("//h2[contains(text(),'"+headerName+"')]"));
	}

	@FindBy(xpath = "//*[@id='main']/div/h2")
	public WebElement headerInsideFrame;

	@FindBy(xpath = "*//iframe[@class='scorm_object']")
	public WebElement scormObjectIframe;

	@FindBy(xpath = "*//div[@class='sp-header']//div[contains(@class,'sp-header__div')]/div[contains(@class,'lxp-icon')]") //*//div[@class='sp__left-nav-wrapper']/div[@class='sp__left-nav-container']/div[@class='sp__toggle-left-nav']/a[@title='Show']")
	public WebElement expandLeftMenu;

	@FindBy(xpath = "*//div[@class='sp__left-nav-wrapper is-open']/div[@class='sp__left-nav-container']/div[@class='sp__toggle-left-nav']/div[contains(@class,'left')]")
	public WebElement collapseLeftMenu;

	@FindBy(xpath = "/html/body/div[4]/div/section/main/div/div/div/div/div/div[2]/div/div[5]/div[2]/div[1]/button")
	public WebElement videoPlayButton;	

	@FindBy(xpath = "/html/body/div[4]/div/section/main/div/div/div/div/div/div[2]/div[1]/div/div/select")
	public WebElement selectOption;	

	@FindBy(xpath = "/html/body/div[4]/div/section/main/div/div/div/div/div/div[2]/div[1]/div/div/select/option[3]")
	public WebElement correctAnswerValue;

	@FindBy(xpath = "/html/body/div[4]/div/section/main/div/div/div/div/div/div[2]/div[2]/div[2]/button")
	public WebElement submitButton;

	@FindBy(xpath = "//button[contains(text(),'Finish')]")
	public WebElement finishCourseButton;

	@FindBy(xpath = "*//div[@class='sp-header__btns']/div")
	public List<WebElement> countButtons;

	@FindBy(xpath = "*//div[@class='sp-header__btns']//button[./img[@alt='Next']]")
	public WebElement nextModuleButton;

	@FindBy(xpath = "**//div[@class='sp-header__btns']//button[./img[@alt='Previous']]")
	public WebElement prevModuleButton;

	@FindBy(xpath = "*//div[@class='cd-sec__additional']//div[@class='cd-sec__footer col']/div/button[normalize-space()='Dismiss']")
	public WebElement dismissButton;

	@FindBy(xpath = "*//div[contains(@class,'sp-header__right')]/div[@role='button']") //"*//div[contains(@class,'sp-header__right')]/div[@role='button']")
	public WebElement backHomeButton;
	
	@FindBy(xpath = "//*[contains(@id,'modal_footer')]//div/button[contains(text(),'back')]") //"*//div[contains(@class,'sp-header__right')]/div[@role='button']")
	public WebElement goBackPopUpButton;
	
	@FindBy(xpath = "//*[contains(@id,'modal_footer')]//div/button[contains(text(),'Program')]")
	public WebElement closeProgramPopUpButton1;

	@FindBy(xpath = "//h3[contains(text(),'Congratulations!!')]")
	public WebElement congratsLocator;

	@FindBy(xpath = "//h5[contains(text(),'Learning Programme Completed')]")
	public WebElement learningProgCompletedLocator;

	@FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/button[3]")
	public WebElement oldCloseBtn;

	@FindBy(how = How.ID,id="lastPageVisitedPopupHolderL")
	public List<WebElement> lasVisitPopupBlock;

	@FindBy(xpath = "*//div[@id='lastPageVisitedPopupHolderL']/a")
	public WebElement closeLastVistedPopup;

	@FindBy(xpath = "*//div[@class='scrollWrapperC']/div[@class='screenContentC']//div[@class='layoutColumnWrapperC col-sm-6 ']//div[@class='genericAssetWrapperC lastAssetC displayedAssetMarkerC']//button")
	public WebElement startScormAssessment;

	@FindBy(xpath = "*//div[@class='strapControls header__controls']/div[@class='control'][./a[@id='accessibleVersionL']]")
	public WebElement settingsSormAssessment;

	@FindBy(how = How.ID,id="p138155i04s10lay04")
	public WebElement sect1QnAblock;

	@FindBy(xpath = "*//div[@id='mcqAsset_YYp138155i04s10a08YY_Option1WrapperL']/label")
	public List<WebElement> section1ScormAnswerLabelisPresent;

	@FindBy(xpath = "*//div[@id='mcqAsset_YYp138155i04s10a08YY_Option1WrapperL']/label")
	public WebElement section1ScormAnswerLabel;

	@FindBy(xpath = "*//div/a[@id='mcqAsset_YYp138155i04s10a08YY_Option1WrapperL']")
	public WebElement section1ScormAnswerOption;

	@FindBy(xpath = "*//div[@class='genericAssetWrapperC  lastAssetC  displayedAssetMarkerC']/div[@class='assetWrapperC mcqAssetWrapperC undefinedImportedC']//span/a/span[contains(text(),'Confirm')]")
	public WebElement section1ConfirmBtn;

	@FindBy(xpath = "*//div[contains(@class,'bottomCenterSubScreenC')]/span/a")
	public WebElement section1ClosePopup;

	@FindBy(xpath = "//*[@id='mcqAsset_YYp138155i04s10a08YY_Option1WrapperL']/input")
	public List<WebElement> inputLabelLocator;

	@FindBy(xpath = "//*[@id='mcqAsset_YYp138155i04s10a08YY_Option1WrapperL']/span")
	public WebElement SpanLocator;


	public WebElement section2ScormAnswerLabel(int opt) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@id='sflAsset_YYp138155i04s18a04YY_Option"+opt+"WrapperL']/label"));
	}

	public WebElement section2ScormAnswerOption(int opt) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div/a[@id='sflAsset_YYp138155i04s18a04YY_Option"+opt+"WrapperL']"));
	}

	@FindBy(xpath = "*//div[@id='sflAsset_YYp138155i04s18a04YY_WrapperL']/span/a/span[contains(text(),'Confirm')]")
	public WebElement section2ConfirmBtn;

	@FindBy(xpath = "*//div[@id='subScreenWrapper_p138155i04s18sub03L']/span/a")
	public WebElement section2ClosePopup;

	@FindBy(xpath = "//h4[contains(text(),'This is a timed assessment!')]")
	public WebElement timeBasedAssessmentTextLocator;

	@FindBy(xpath = "//p[contains(text(),'This assessment has a time limit associated with i')]")
	public WebElement tbaDescTextLocator;

	@FindBy(xpath = "//button[contains(text(),'START')]")
	public WebElement startTimeBasedAssessmentBtn;

	@FindBy(xpath = "//*[@id='timed-assessment-alert-modal___BV_modal_body_']//div[contains(@class,'text-center')]/h5[contains(text(),'Oop')]")
	public WebElement tba_OopMessageText;

	@FindBy(xpath = "*//div[@id='timed-assessment-alert-modal___BV_modal_content_']/div[@id='timed-assessment-alert-modal___BV_modal_body_']/div[@class='text-center']/h5[contains(text(),'missed')]")
	public WebElement tba_MissedMessageText;

	@FindBy(xpath = "*//div[@id='timed-assessment-alert-modal___BV_modal_content_']/div[@id='timed-assessment-alert-modal___BV_modal_body_']/div[contains(@class,'text-center')]/p[@class='cd-sec__des']")
	public WebElement tba_MissedMessageText2;

	@FindBy(xpath = "*//div[@id='timed-assessment-alert-modal___BV_modal_content_']/footer[@id='timed-assessment-alert-modal___BV_modal_footer_']//button[contains(text(),'Finish')]")
	public WebElement tba_FinishBtn1;

	@FindBy(xpath="*//div[contains(@class,'sp-header__btns')]/button[contains(text(),'SUBMIT')]")
	public WebElement submitAssessmentBtn;

	@FindBy(xpath="*//div[@id='timed-assessment-confirmation-modal___BV_modal_content_']/footer[@id='timed-assessment-confirmation-modal___BV_modal_footer_']//button[contains(text(),'SUBMIT')]")
	public WebElement confirmSubmitAssessment; 

	@FindBy(xpath="*//div[@id='timed-assessment-success-modal___BV_modal_content_']/footer[@id='timed-assessment-success-modal___BV_modal_footer_']//button[contains(text(),'Finish')]")
	public WebElement finishAssessmentBtn; 

	@FindBy(xpath="*//div[@id='unfinish-modal___BV_modal_content_']/footer[@id='unfinish-modal___BV_modal_footer_']/button[contains(text(),'Back')]")
	public WebElement unFinishedModulesBackBtn; 

	public WebElement section1RDMA(int sectionNumber) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//main[@id='main']//div[@class='vert-mod']//div[@class='vert vert-0']//div[@class='vert-mod']//div[@class='vert vert-"+sectionNumber+"']//h3"));
	}
	
	@FindBy(xpath="*//main[@id='main']//div[@class='vert-mod']//div[@class='vert vert-0']//div[@class='vert-mod']/div")
	public List<WebElement> sectionCount;
	
	@FindBy(xpath="*//main[@id='main']//div[@class='vert-mod']//div[@class='vert vert-0']//h3")
	public WebElement oneSectionName;

	@FindBy(xpath="*//div[@class='inputtype option-input ']/select")
	public WebElement dropDownClickLocator;

	public WebElement selectProblemAnswer(String problemType, int option) {

		WebElement correctAnswerElement = null;

		switch (problemType) {

		case "Checkboxes":

			correctAnswerElement = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='field']["+option+"][./input[@type='checkbox']]/label"));

			break;


		case "Multiple Choice":

			correctAnswerElement = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='field']["+option+"][./input[@type='radio']]/label"));

			break;


		case "Dropdown":

			correctAnswerElement = GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='inputtype option-input ']/select/option["+option+"]"));

			break;

		default:
			break;
		}

		return correctAnswerElement;
	}

	public WebElement submitButtonSection(String sectionName) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='action'][./input[@value='"+sectionName+"']]//div[@class='submit-attempt-container']/button"));
	}

	@FindBy(xpath = "*//div[contains(@class,'b-toast-warning')]")
	public WebElement toastWindow;
	
	@FindBy(xpath = "*//div[@class='toast']/header[@class='toast-header']/button")
	public WebElement closeToastWindow;
	
	@FindBy(xpath = "*//div[@class='toast']/div[@class='toast-body']")
	public WebElement toastMessage;

	public WebElement prevNextButton(String leftRightBtn) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='sp-header__btns']/div[contains(@class,'"+leftRightBtn+"')]"));
	}
	
	public WebElement popUpBtnClick(String buttonTxt) {

		return GlobalConstants.getDriver().findElement(By.xpath("//*[contains(@id,'modal_footer')]//div/button[contains(text(),'"+buttonTxt+"')]"));
	}
	
	@FindBy(xpath = "//*[contains(@id,'modal_footer')]//div/button[2]")
	public WebElement popBtnTxt; 
		
	@FindBy(xpath = "*//div[contains(@class,'sp-timer__container green')]/h5")
	public List<WebElement> timerClock;
	
}
