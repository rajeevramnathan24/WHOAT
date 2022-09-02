package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.AssessmentPage;

public class StepDefAssessmentPage {

	//@And("user clicks on submit button by selecting the appropriate answer on assessment page")
	//public void user_clicks_on_submit_button_by_selecting_the_appropriate_answer_on_assessment_page() throws CustomException {
	//	
	//	//select the answer
	//	new AssessmentPage().selectAnswer();
	//	
	//	//click on submit button
	////	new AssessmentPage().submitBtnClick();
	//		
	//	//close assessment
	//	new AssessmentPage().closeAssessmentBtnClick();
	//}

	@And("user starts assessment for the course")
	public void user_starts_assessment_for_the_course() throws CustomException {

		new AssessmentPage().completeAssessment();
		
		new AssessmentPage().closeProgramBtnClick();
	}

	@And("user clicks on next module without completing the pre-requisite module")
	public void And_user_clicks_on_next_module_without_completing_the_prerequisite_module() throws CustomException {

		new AssessmentPage().clickNextModuleWithoutCompleting();

	}

	@Then("verify appropriate message is displayed for completing mandatory unit and navigates back to course details page")
	public void verify_appropriate_message_is_displayed_for_completing_mandatory_unit_and_navigates_back_to_course_details_page() throws CustomException {

		new AssessmentPage().verifyToastSequentialLogic();

		new AssessmentPage().backHomeBtnClick();
		
		new AssessmentPage().closeProgramBtnClick();

	}

	@When("user does not complete the course during the specified time")
	public void user_does_not_complete_the_course_during_the_specified_time() throws CustomException {

		new AssessmentPage().userDoesnotCompleteCourse();
	}

	@Then("verify time elapse message is displayed for the course")
	public void verify_time_elapse_message_is_displayed_for_the_course() throws CustomException {

		new AssessmentPage().verifyOopsMessageText();

		//new AssessmentPage().verifyCourseMissedMessageText();

		new AssessmentPage().verifySecondCourseMissedMessageText();

		new AssessmentPage().finishBtnClick();

		new AssessmentPage().backBtnClick();

		new AssessmentPage().backHomeBtnClick();
		
		new AssessmentPage().closeProgramBtnClick();

	}

	@Then("System displays note on Time based Assessment and user verifies the text and continues by clicking on start button")
	public void System_displays_note_on_Time_based_Assessment_and_user_verifies_the_text_and_continues_by_clicking_on_start_button() throws CustomException {

		new AssessmentPage().verifyTimeBasedAssessmentText();

		//	new AssessmentPage().verifyTimeBasedAssessmentDescriptionText();

		new AssessmentPage().startTimeAssessmentCourse();
	}


}
