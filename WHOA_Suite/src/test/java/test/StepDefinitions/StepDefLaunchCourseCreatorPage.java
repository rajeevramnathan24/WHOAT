package test.StepDefinitions;


import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.WebDriverSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.LaunchCourseCreatorPage;




public class StepDefLaunchCourseCreatorPage {

	@Given("User has Launched Course Creator Studio")
	public void User_has_Launched_Course_Creator_Studio() {

		//Link to navigate
		new WebDriverSetup().launchBrowser_NavigateToURL
		(GlobalConstants.Target_CC_URL);

	}
	
	@Given("User has Launched Refresh Index page")
	public void User_has_Launched_Refresh_Index_page() throws CustomException, InterruptedException {

		//Link to navigate
		new WebDriverSetup().launchBrowser_NavigateToURL
		(GlobalConstants.refreshIndexUrl);
		
		new LaunchCourseCreatorPage().waitAfterRefreshIndex();
		
	}

	@Given("User has Launched Course Creator Studio in Windows OS")
	public void User_has_Launched_Course_Creator_Studio_in_Windows_OS() throws CustomException {

		//below is to check OS - only for scorm & V2
		new LaunchCourseCreatorPage().osCheck();

		//Link to navigate
		new WebDriverSetup().launchBrowser_NavigateToURL
		(GlobalConstants.Target_CC_URL);

	}

	@Then("Launch page should be displayed with sign or register link")
	public void Launch_page_should_be_displayed_with_sign_or_register_link() throws CustomException {

		new LaunchCourseCreatorPage().verifyStudioWelcomeText();

	}

	@Then("Launch page should be displayed with sign or register link for sample scenario")
	public void Launch_page_should_be_displayed_with_sign_or_register_link_for_sample_scenario() throws CustomException{


		

		//		GlobalConstants.scGlobal.write("This step has been passed");			
		//		AfterStepValidate.showTestStepExecutionStatus(GlobalConstants.scGlobal);
	}

	@And("User has landed on Login page")
	public void User_has_landed_on_Login_page() throws CustomException {

		new LaunchCourseCreatorPage().verifyStudioWelcomeText();
	}

	@When("User has clicked on signin link")
	public void User_has_clicked_on_signin_link() throws CustomException {

		new LaunchCourseCreatorPage().signInLink();
	}


	@Then("Close application")
	public void Close_application() {

		new core.Utils.WebDriverSetup().closeBrowser();
	}

}
