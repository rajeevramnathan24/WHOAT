package test.PageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;

public class CourseDetailsPageElements {

	public CourseDetailsPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//-----------------------------------#page elements--------------------------------------------

	@FindBy(xpath = "*//div[@class='cd-main__container']//button[./img[@alt='enroll']]") //*[@id='app']/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/button")
	public WebElement enrollButton;
	
	@FindBy(xpath = "*//div[@class='d-flex align-items-center']//div[contains(@class,'ac-mc__dropdown')]/button") //"/html/body/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[2]/button")
	public WebElement courseOptionButton;
	
	@FindBy(xpath = "*//div[@class='d-flex align-items-center']//div[contains(@class,'ac-mc__dropdown')]/ul[@role='menu']//a") //"//p[contains(text(),'Unenroll')]")			"/html/body/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[2]/ul/li/a"
	public WebElement unEnrollButton;
	
	@FindBy(xpath = "//button[contains(text(),'Unenroll')]")
	public WebElement confirmUnenrollButton;	
	
	@FindBy(xpath="*//div[@id='enroll-modal___BV_modal_content_']//div[@class='cd-sec__footer col']/button[1]")
	public WebElement continueBtnPopUp;
	
	@FindBy(xpath = "*//button[contains(text(),'Continue')]") //html/body/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/button[1]") 
	public WebElement continueEnrollButton;

	@FindBy(xpath = "*//button[contains(text(),'Start Learning')]") //html/body/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[1]/button")
	public WebElement startLearningButton;

	@FindBy(xpath = "//button[contains(text(),'Review')]")
	public WebElement reviewProgrammeButton;

	@FindBy(xpath = "//p[contains(text(),'Enrolled')]")
	public WebElement enrolledStatusLabel;
	
	@FindBy(xpath = "//h3[contains(text(),'Enrolled Successfully')]")
	public WebElement enrollSuccessLabel;
		
	@FindBy(xpath = "//p[contains(text(),'Completed successfully')]")
	public WebElement courseCompletedLabel;
	
	@FindBy(xpath = "*//div[@class='cd__prg-overview-wrapper']")
	public WebElement courseWrapperTable;	
	

//	public String enrolled = "Enrolled";
//	public String enroll = "Enroll";
//	public String completedSuccessfully = "Completed successfully";
//	public String reviewProgramme = "Review Programme";

	@FindBy(xpath = "*//div[@class='cd__prg-overview-wrapper']//div[@class='col']/h3")
	public WebElement courseNameOnMainBoard;
	
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div")
	public List<WebElement> continueLearningCardList;	
	
	@FindBy(xpath = "//div[contains(@class, 'tab-content mt-3')]//div[contains(@class, 'tab-pane')]/div[contains(@class, 'd-block')]/div[contains(@class, 'd-block')]//div[contains(@class, 'course-card')][1]")
	public WebElement firstCardInMylearningResults;	
	
	@FindBy(xpath="*//div[@class='d-block']//div/div[@class='course-card']")
	public List<WebElement> courseCardList;
	
	public WebElement getSpecificCard (int cardCount) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='d-block']//div/div[@class='course-card']/div[@id='cl-course-card-"+cardCount+"']//div[@class='lxp-card']/h4[@class='card-title']"));
	}
	
	public static WebElement courseCardLocator;
	
		
	@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div")
	public WebElement specificCard;	
	
	private String myLearningCourseCardList = ".//div[@class='row m-0 p-3 lxp-card__content']/div/div[@class='lxp-card']/h4";
	
	
	/**
	 * This method is used to find out if card is present in continue learning page and returns true if found else false
	 * @param searchValue
	 * @return
	 * @throws InterruptedException 
	 */
	public String cardPresent(String searchValue) throws Exception {

		String cardName = "No Text";
	
		try {
			for (WebElement parentElement : continueLearningCardList ) {
				
				Thread.sleep(3000);				
				
				CommonUtility.isElementVisible(parentElement.findElement(By.xpath(myLearningCourseCardList)));

				String textValue = parentElement.findElement(By.xpath(myLearningCourseCardList)).getText();

				if(searchValue.contentEquals(textValue)) {

					cardName = searchValue;
				} 

			}
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cardName;

	}
	
	/**
	 * This method is used to return the course card webElement when user inputs the card name on continue learning page
	 * @param searchValue
	 * @return
	 */
	public WebElement dynamicCourseCardLocator(String searchValue) {

		WebElement wb = null;
	
		for (WebElement parentElement : continueLearningCardList ) {

			String textValue = parentElement.findElement(By.xpath(myLearningCourseCardList)).getText();

			if(searchValue.contentEquals(textValue)) {

				wb = parentElement.findElement(By.xpath(myLearningCourseCardList));
			} 

		}

		return wb;

	}
	
	public String returnLanglocator(String languageType) {

		String valueText = "Incorrect Language";

		switch (languageType) {

		case "Arabic":

			valueText = "العربية";

			break;


		case "Chinese":

			valueText = "中文";

			break;


		case "French":

			valueText = "Français";

			break;


		case "Russian":

			valueText = "Русский";

			break;


		case "Spanish":

			valueText = "Español";

			break;


		case "English":

			valueText = "English";

			break;

		default:
			break;
		}
		
		return valueText;
	}

	public WebElement getLangLabel (String returnLanglocator) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[@class='cd__prg-overview-wrapper']/div[@class='row']/div[@class='col']/p[@class='cd-sec__category']/span[contains(text(),'"+returnLanglocator(returnLanglocator)+"')]"));
	}
	
	public WebElement leftMenuXpath (String menuName) {

		return GlobalConstants.getDriver().findElement(By.xpath("*//div[contains(@class,'expand')]//span[contains(text(),'"+menuName+"')]"));
	}
	
	

}
