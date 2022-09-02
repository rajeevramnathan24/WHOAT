package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import test.Pom.AdminPortalPage;

public class StepDef_AdminPortalPage {


	@And("user navigates to admin portal course modes")
	public void user_updates_Course_Visibility_on_advanced_settings_page() throws CustomException {
		
		//launch admin portal page
		new AdminPortalPage().adminPortalLaunch();
		
	}

	
	@And("updates the course modes to honor")
	public void updates_the_course_modes_to_honor() throws CustomException {
		
		//update course mode on admin portal page
		new AdminPortalPage().courseModeUpdate();
		
	}
}
