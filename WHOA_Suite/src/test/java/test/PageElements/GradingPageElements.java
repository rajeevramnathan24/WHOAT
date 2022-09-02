package test.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradingPageElements {
	
	public GradingPageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

	@FindBy(xpath="/html/body/div[1]/main/div/div[2]/section/article/form/section[3]/ol/li[4]/div[3]/input") //input[@id='id_course']
	public WebElement finalExamGrade;


	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div/nav/ul/li[1]/button")
	public WebElement saveButtonClick;
	
	
}
