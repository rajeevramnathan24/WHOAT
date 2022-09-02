package test.Pom;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.LoginCCStudioPageElements;




public class LoginCCStudioPage {
	
	public LoginCCStudioPageElements  Login_CC= null;

	public LoginCCStudioPage() {
		Login_CC = new LoginCCStudioPageElements(GlobalConstants.getDriver());
	}
	
	public void loginApplicationCC(String userName, String password)  {
		
		try {
			
			CommonUtility.highlightClick(Login_CC.userNameXpath, 
					GlobalConstants.highlighterFlag);
			Login_CC.userNameXpath.sendKeys(GlobalConstants.studioUserName);
			
			CommonUtility.highlightClick(Login_CC.passwordXpath, 
					GlobalConstants.highlighterFlag);
			Login_CC.passwordXpath.sendKeys(GlobalConstants.studioPassword);			
						
			CommonUtility.highlightClick(Login_CC.loginButtonXpath, 
					GlobalConstants.highlighterFlag);
			Login_CC.loginButtonXpath.click();				
			
			
			//Thread.sleep(4000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void customLogin(String userId, String userPwd) throws CustomException {
		
		try {
			CommonUtility.eleWaitAndSendValue(Login_CC.userNameXpath, userId);
			
			CommonUtility.eleWaitAndSendValue(Login_CC.passwordXpath, userPwd);
			
			CommonUtility.eleWaitAndClick(Login_CC.loginButtonXpath);
		} catch (CustomException e) {
			throw new CustomException("Login fields user name/ password field had issues with locators");
		}
	}
	
	public void generateOTP() throws CustomException {
		
		try {
			//Totp totp = new Totp("PFXG IOJV PJZG 64SP PJJD ONRZ O42F G3LX"); // 2FA secret key
			// String twoFactorCode = totp.now(); //Generated 2FA code here
			 
//			 CommonUtility.eleWaitAndSendValue(GlobalConstants.getDriver().findElement(By
//					 .xpath("//input[@id='otp']")), twoFactorCode);
			 
			 
			 WebElement otpOkayBtn = GlobalConstants.getDriver().findElement(By
					 .xpath("//input[@id='kc-login-mf']"));
				
				
				CommonUtility.eleWaitAndClick(otpOkayBtn);
				
				System.out.println("Login with OTP...");
			 
		} catch (CustomException e) {
			
			e.printStackTrace();
		}
	     
	   
	     
	}
	
}
