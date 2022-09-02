package test.Pom;




import core.Constants.GlobalConstants;
import core.Utils.CommonUtility;
import test.PageElements.LoginLxpLearnerPageElements;




public class LoginLxpLearnerPage {
	
	public LoginLxpLearnerPageElements  LxpElements= null;

	public LoginLxpLearnerPage() {
		LxpElements = new LoginLxpLearnerPageElements(GlobalConstants.getDriver());
	}
	
	public void loginApplicationCC(String userName, String password)  {
		
		try {
			
			CommonUtility.isElementVisible(LxpElements.lxpUserNameXpath);
			
			CommonUtility.highlightClick(LxpElements.lxpUserNameXpath, GlobalConstants.highlighterFlag);
			LxpElements.lxpUserNameXpath.sendKeys(GlobalConstants.lxpUsername);
			
			CommonUtility.highlightClick(LxpElements.lxpPasswordXpath, true);
			LxpElements.lxpPasswordXpath.sendKeys(GlobalConstants.lxpPassword);			
						
			CommonUtility.highlightClick(LxpElements.lxpLoginButtonXpath, 
					GlobalConstants.highlighterFlag);
			LxpElements.lxpLoginButtonXpath.click();		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
