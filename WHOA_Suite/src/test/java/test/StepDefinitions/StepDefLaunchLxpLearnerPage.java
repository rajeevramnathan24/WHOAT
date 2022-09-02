package test.StepDefinitions;


import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.WebDriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.LaunchLxpLearnerPage;




public class StepDefLaunchLxpLearnerPage {

	
//	@Before
//	public void setup() throws CustomException {
////		
////		TestCase tc
////		Scenario sc = new Scenario();
////		//CommonUtility.captureScreenshot();
//		///sc.write("Setup method called");
//		//sc1 = sc;
////		GlobalConstants.intializeData();
//		//Pickle pk = null;
//		
//		
//		//System.out.println(pk.getName());
////		
//	}
	
	@Given("User has Launched LXP Learner web application")
	public void User_has_Launched_LXP_Learner_web_application() {

		try {

			//TestStep ts = new TestStep() {
			
			//commenting this for Studio + LXP combined run in single browser instance***********************
			//Setting Browser category 
			//GlobalConstants.setDriver(WebDriverSetup.setBrowser(GlobalConstants.BrowserType));
//			System.out.println("Waiting for course to reflect................");
//			Thread.sleep(120000);
//			System.out.println("---------------------------------------------");
//			System.out.println("Continuing run...............................");
			//Link to navigate
			new WebDriverSetup().launchBrowser_NavigateToURL(GlobalConstants.Target_LXP_URL);			
					
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Given("User has Launched LXP portal")
	public void User_has_Launched_LXP_portal() {

		try {

			//TestStep ts = new TestStep() {
			
			//commenting this for Studio + LXP combined run in single browser instance***********************
			//Setting Browser category 
			//GlobalConstants.setDriver(WebDriverSetup.setBrowser(GlobalConstants.BrowserType));
//			System.out.println("Waiting for course to reflect................");
//			Thread.sleep(120000);
//			System.out.println("---------------------------------------------");
//			System.out.println("Continuing run...............................");
			//Link to navigate
			new WebDriverSetup().launchBrowser_NavigateToURL(GlobalConstants.Target_LXP_URL);			
					
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Then("Launch page should be displayed with welcome text")
	public void Launch_page_should_be_displayed_with_welcome_text() throws CustomException  {
		
		new LaunchLxpLearnerPage().verifyFindProgramText();
		
		
	}

	@When("User has clicked on Login button")
	public void User_has_clicked_on_Login_button()throws CustomException {
		
		try {
			new LaunchLxpLearnerPage().signInLink();
			
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
