package test.Pom;



import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.LaunchLxpLearnerElements;
import test.PageMessages.MessagesLxpLearnerPage;



public class LaunchLxpLearnerPage {

	public LaunchLxpLearnerElements  Launch_LXP= null;
	public MessagesLxpLearnerPage  Launch_LXPMsg= null;


	public LaunchLxpLearnerPage() {
		Launch_LXP = new LaunchLxpLearnerElements(GlobalConstants.getDriver());		
		Launch_LXPMsg = new MessagesLxpLearnerPage(GlobalConstants.getDriver());

	}

	//public MessagesLaunchCourseCreatorPage  Launch_CCMsg= null;

	/**
	 * This method is used to verify welcome text on LXP Dashboard page
	 * @throws CustomException
	 */
	public void verifyText() throws CustomException {

		CommonUtility.isElementVisible(Launch_LXP.xpathLXPWelcomeLabel);

		CommonUtility.highlightElement(Launch_LXP.xpathLXPWelcomeLabel, 
				GlobalConstants.highlighterFlag);
		
		CommonUtility.verifyAndReport(Launch_LXP.xpathLXPWelcomeLabel.getText().trim(),Launch_LXPMsg.welcomeLXPTextLabel.trim());
		
	}
	
	public void verifyFindProgramText() throws CustomException {
		
		String actText, expText;
		
		CommonUtility.isElementVisible(Launch_LXP.findProgramText);
		
		try {
			actText = Launch_LXP.findProgramText.getText();
		} catch (Exception e) {
			throw new CustomException("Program text locator not found");
		}
		
		expText = "Let’s find a Programme that you’ll love!";
		
		CommonUtility.verifyAndReport(actText, expText);
	}

	public void signInLink ()	{


		try {

			CommonUtility.isElementVisible(Launch_LXP.xpathLoginButton);

			CommonUtility.highlightClick(Launch_LXP.xpathLoginButton, 
					GlobalConstants.highlighterFlag);
			
			Launch_LXP.xpathLoginButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
