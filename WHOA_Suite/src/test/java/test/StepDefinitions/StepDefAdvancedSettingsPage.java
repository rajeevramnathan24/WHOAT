package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import test.Pom.AdvancedSettingsPage;

public class StepDefAdvancedSettingsPage {

	@And("user updates only course outline on advanced settings page")
	public void user_updates_only_course_outline_on_advanced_settings_page() throws CustomException {

		//update course outline and click on save button
		new AdvancedSettingsPage().courseVisbilityUpdateNew();

		//save changes
		new AdvancedSettingsPage().saveButtonClick();

	}
	
	@And("user updates certificate behaviour and course outline on advanced settings page")
	public void user_updates_certificate_behaviour_and_course_outline_on_advanced_settings_page() throws CustomException {

		//Update certificate behaviour
		new AdvancedSettingsPage().updateCertificateBehaviourValue();
		
		
		//update course outline and click on save button
		new AdvancedSettingsPage().courseVisbilityUpdateNew();

		//save changes
		new AdvancedSettingsPage().saveButtonClick();

	}


	@And("user updates Course Visibility on advanced settings page")
	public void user_updates_Course_Visibility_on_advanced_settings_page() throws CustomException {

		//update advanced module list with libraries
		new AdvancedSettingsPage().advancedModuleListUpdate();

		//update course outline and click on save button
		new AdvancedSettingsPage().courseVisbilityUpdateNew();

		//update course outline and enable section dependency pre-req
		new AdvancedSettingsPage().enableSectionPreReqFlag();

		//update LTI Passport value for zoom integration
		new AdvancedSettingsPage().ltiPassPortUpdate();

		//save changes
		new AdvancedSettingsPage().saveButtonClick();

	}

	@And("user updates Course Visibility, advanced modulelist update and enable timed exams on advanced settings page")
	public void user_updates_Course_Visibility_advanced_modulelist_update_and_enable_timed_exams_on_advanced_settings_page() throws CustomException {

		//update advanced module list with libraries
		new AdvancedSettingsPage().advancedModuleListUpdate();

		//update course outline and click on save button
		new AdvancedSettingsPage().courseVisbilityUpdateNew();

		new AdvancedSettingsPage().enableTimedExam();

		//save changes
		new AdvancedSettingsPage().saveButtonClick();

	}

	@And("user updates Course Visibility on advanced settings page for Zoom, Scorm and Randomised Assessments")
	public void user_updates_Course_Visibility_on_advanced_settings_page_for_Zoom_Scorm_and_Randomised_Assessments() throws CustomException {

		//update advanced module list with libraries
		new AdvancedSettingsPage().advancedModuleListUpdate();

		//update course outline and click on save button
		new AdvancedSettingsPage().courseVisbilityUpdateNew();

		//update LTI Passport value for zoom integration
		new AdvancedSettingsPage().ltiPassPortUpdate();

		//save changes
		new AdvancedSettingsPage().saveButtonClick();

	}

	@And("user updates Course Display Name on advanced settings page for Sanity pack course")
	public void user_updates_Course_Display_Name_on_advanced_settings_page_for_Sanity_pack_course() throws CustomException {

		//update advanced module list with libraries
		new AdvancedSettingsPage().updateCourseDisplayName();
		
		//save changes
		new AdvancedSettingsPage().saveButtonClick();
	}

}
