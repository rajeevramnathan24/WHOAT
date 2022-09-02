package test.Pom;



import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.LaunchCourseCreatorElements;
import test.PageMessages.MessagesLaunchCourseCreatorPage;
import test.PageMessages.MessagesLoginCCStudioPage;



public class LaunchCourseCreatorPage {

	public LaunchCourseCreatorElements  Launch_CC= null;
	public MessagesLaunchCourseCreatorPage  Launch_CCMsg= null;
	public MessagesLoginCCStudioPage  Login_CC= null;

	public LaunchCourseCreatorPage() {
		Launch_CC = new LaunchCourseCreatorElements(GlobalConstants.getDriver());		
		Launch_CCMsg = new MessagesLaunchCourseCreatorPage(GlobalConstants.getDriver());
		Login_CC = new MessagesLoginCCStudioPage(GlobalConstants.getDriver());
	}

	/**
	 * This method is used to verify Welcome message
	 * @throws CustomException
	 */
	public void verifyStudioWelcomeText() throws CustomException {

		String actText, expText = null;

		try {

			CommonUtility.isElementVisible(Launch_CC.xpathWelcomeLabel);

			CommonUtility.highlightElement(Launch_CC.xpathWelcomeLabel, 
					GlobalConstants.highlighterFlag);
			Thread.sleep(2000);
			
			actText = Launch_CC.xpathWelcomeLabel.getText();
			expText = Launch_CCMsg.welcomeTextLabel;
						
		} catch (Exception e) {
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		}
		
		CommonUtility.verifyAndReport(actText, expText);
		
	}
	
	public void waitAfterRefreshIndex() throws CustomException {
		
		CommonUtility.threadWait(6000);
	}

	

	public void signInLink ()	 throws CustomException{

		//	SoftAssert sa = new SoftAssert();
		//	
		//	sa.assertEquals(Launch_CC.signInRegisterXpath.getText(),Login_CC.welcomeTextLabel.toString());

		//Assert.assertEquals(true, false);

		CommonUtility.highlightClick(Launch_CC.signInRegisterXpath, 
				GlobalConstants.highlighterFlag);

		Launch_CC.signInRegisterXpath.click();
	}

	/**
	 * verify OS Check initially to continue with execution
	 * @throws CustomException
	 */
	public void osCheck() throws CustomException {

		Boolean isWinOS = CommonUtility.windowsOsCheck();

		try {						

			if(isWinOS) {

				System.out.println(Launch_CCMsg.windowsOS);
				
				if(GlobalConstants.headlessMode) {
					
					GlobalConstants.scGlobal.write("This test case cannot be executed in headless mode");
					
					CommonUtility.verifyAndReport("Headless mode flag was true", "found Headless mode flag as false");					
				}
				
			} else {
				
				GlobalConstants.scGlobal.write("This test case cannot be executed in different OS other than Windows");
				
				CommonUtility.verifyAndReport("Non-Windows OS detected", "Windows OS required");

			}

		}catch (AssertionError e) {

			throw new CustomException(Launch_CCMsg.testCaseFailedOScheck);
		
		}catch (Exception e) {

			throw new CustomException(Launch_CCMsg.couldNotRetrieveOsName);
		}

		
	}

}
