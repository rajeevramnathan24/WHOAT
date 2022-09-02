package test.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class DigitalCredentialsPageElements {
	
	public DigitalCredentialsPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//*[@id='content']//div/section/article/div/div/p/a[@class='button new-button credential-cta__btn']")
public WebElement addDigitalCredentialsBtn;

@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/label")
public WebElement radioBtnCompletingActivities;

@FindBy(xpath = "//a[contains(text(),'Next')]")
public WebElement nextBtn;

@FindBy(xpath = "//*[@id='content']/div[2]/section/article//div//section/div[1]/div[2]/div[2]//div//nav[.//h2[contains(text(),'Digital Credentials Actions')]]/ol/li/h3")
public WebElement digCredentialsOptionBtn;

@FindBy(xpath = "//*[@id='content']/div[2]/section/article/div/div/div/section/div[1]/div[2]/div[2]/div/div/nav/ol/li/div/div/ul/li[1]/a[@class='credential-cta__activate activate']")
public WebElement activateDeactivateBtn;

@FindBy(xpath = "//button[contains(text(),'Activate')]")
public WebElement activatePopUp;

@FindBy(xpath = "//h2[contains(text(),'Digital credentials activated!')]")
public WebElement digitalCredentialsActivatedTextXpath;


@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/input[@placeholder='Title override']") //"//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[./p[contains(text(),'Section Title Override')] and ./input[@type='text']]")
public WebElement inputTitleOverRide;

@FindBy(xpath = "//a[contains(text(),'Save')]")
public WebElement clickSaveBtn;

@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[3]/div/div/select")
public WebElement selectValidityPeriod;

String textAreaPrefix = "//*[@id='app']/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[";

public WebElement getDynamicLocatorTextArea(String credType){
	
	int txtAreaPosition = 0;
		
	switch (credType) {
	

	case "Admission Criteria":
		
		txtAreaPosition = 4;
						
		break;
		

	case "Module Requirements":
		
		txtAreaPosition = 5;
						
		break;
		

	case "Module Description":
		
		txtAreaPosition = 6;
						
		break;
		

	case "Module Activities":
		
		txtAreaPosition = 7;
						
		break;
	
	case "Module Outcomes":
		
		txtAreaPosition = 8;
				
		break;
		

	case "Module Assessment":
		
		txtAreaPosition = 9;
				
		break;
		

	case "Evidence Of Achievement":
		
		txtAreaPosition = 10;
				
		break;

	default:
		break;
	}	
		
	return GlobalConstants.getDriver().findElement(By.xpath(textAreaPrefix+txtAreaPosition+"]/div/div[.//p[contains(text(),'"+credType+"')]]/div/textarea"));
}

public WebElement digCredAwardedRdoBtn(String labelTxt){
	return GlobalConstants.getDriver().findElement(By.xpath("*//div[contains(@class,'form-field')]/div/label[contains(text(),'"+labelTxt +"')]"));
}

@FindBy(xpath = "//*[@id='slider']/div//div[contains(@class,'handle-lower')]")
public WebElement sliderElement;


}
