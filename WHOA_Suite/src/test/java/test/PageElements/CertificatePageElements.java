package test.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Constants.GlobalConstants;

public class CertificatePageElements {
	
	public CertificatePageElements(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
//-----------------------------------#page elements--------------------------------------------
	

@FindBy(xpath = "//button[contains(text(),'Create')]")
public WebElement createCertificateBtn;

@FindBy(xpath = "//h2[@id='alert-confirmation-title']")
public WebElement confirmationTitle;

@FindBy(xpath = "//span[contains(text(),'Activate')]")
public WebElement activateCertificateBtn;

@FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/section[1]/article[1]/div[1]/div[2]/div[1]/p[1]/a[1]")
public WebElement setupCertificateBtn;
	
public WebElement activateDeactivateBtn(String buttonText){
	return GlobalConstants.getDriver().findElement(By.xpath("//span[contains(text(),'"+buttonText+"')]"));
}	
	
}
