package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.AssessmentPage;
import test.Pom.CourseDetailsPage;

public class StepDefCourseDetailsPage {

	@And("user enrolls for course after clicking on enroll button on course details page")
	public void user_enrolls_for_course_after_clicking_on_enroll_button_on_course_details_page() throws CustomException {

		//click on enroll button
		new CourseDetailsPage().enrollBtnClick();
	}
	
	@Then("verify course card details page is displayed in that local {string}")
	public void verify_course_card_details_page_is_displayed_in_that_local_language(String langName) throws CustomException {
		
		new CourseDetailsPage().verifyCourseNameinLocalLang(langName);
	}

	@Then("course status should be updated to Enrolled on course details page")
	public void course_status_should_be_updated_to_Enrolled_on_course_details_page() throws CustomException {

		//verify enroll status
		new CourseDetailsPage().courseStatusVerify_Enroll_Unenroll("Enroll");
	}

	@When ("user clicks on start learning button on course details page")
	public void user_clicks_on_start_learning_button_on_course_details_page() throws CustomException {

		//click on start learning button
		new CourseDetailsPage().startLearningBtnClick();
	}
	
	@When("user clicks on My Learnings tab on left menu")
	public void user_clicks_on_My_Learnings_tab_on_left_menu() throws CustomException {
		
		new CourseDetailsPage().myLearningClick();
		
	}
	
	@Then("course status should be updated to Unenrolled on course details page")
	public void course_status_should_be_updated_to_Unenrolled_on_course_details_page() throws CustomException {
		
		new CourseDetailsPage().courseStatusVerify_Enroll_Unenroll("Unenroll");
	}
	
	@And("user unenrolls for course after clicking on unenroll button on course details page")
	public void user_unenrolls_for_course_after_clicking_on_unenroll_button_on_course_details_page() throws CustomException {
		
		new CourseDetailsPage().unEnrollBtnClick();
	}
	
	@Then("course details page should be displayed")
	public void course_details_page_should_be_displayed() throws CustomException {
		
		
	}
	
	@When("user clicks on course card")
	public void user_clicks_on_course_card() throws CustomException {
		
//		new CourseDetailsPage().myLearningsClickCourseCard();
	}
	
	@Then("verify course card should be displayed under continue learning tab")
	public void verify_course_card_should_be_displayed_under_continue_learning_tab() throws CustomException {
		
		new CourseDetailsPage().verifyCourseCardPresent();
	}
	
	@When("user clicks on continue learning button on course details page")
	public void user_clicks_on_continue_learning_button_on_course_details_page() throws CustomException {
		
		//click on start learning button
		new CourseDetailsPage().continueLearningBtnClick();
		
	}

	@Then("course status should be updated as completed successfully on course details page")
	public void course_status_should_be_updated_as_completed_successfully_on_course_details_page() throws CustomException {

		//verify completion status * 4-Apr-code commented since status is not getting updated correctly
		new CourseDetailsPage().courseCompletionVerify();
	}
	
	@Then("LXP page is displayed with the corresponding course")
	public void LXP_page_is_displayed_with_the_corresponding_course() throws CustomException {
		
		new CourseDetailsPage().verifyCourseName();
	}
	
	@And ("user clicks on review programme button on course details page")
	public void user_clicks_on_review_programme_button_on_course_details_page() throws CustomException {

		//click on start learning button
		new CourseDetailsPage().reviewProgrmBtnClick();
		
		new AssessmentPage().closeAssessmentBtnClick();
	}

}
