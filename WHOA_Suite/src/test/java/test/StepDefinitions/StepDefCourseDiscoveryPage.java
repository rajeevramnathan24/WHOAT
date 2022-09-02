package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.CourseDiscoveryPage;
import test.Pom.LxpLearnerDashboardPage;

public class StepDefCourseDiscoveryPage {

	//	@And("user has entered course name in searchbox and clicked on search button on course discovery page")
	//	public void user_has_entered_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {
	//
	//		//enter course name
	//		new CourseDiscoveryPage().enterCourseNameToSearch();
	//
	//		//click on search button
	//		new CourseDiscoveryPage().searchCourseButtonClick();
	//	}

	@Then("course name should be displayed under the learning programmes search result on course discovery page")
	public void course_name_should_be_displayed_under_the_learning_programmes_search_result_on_course_discovery_page() throws CustomException {


	}

	@When("user clicks on the course card under learning programmes on course discovery page")
	public void user_clicks_on_the_course_card_under_learning_programmes_on_course_discovery_page()throws CustomException{

		//click on course card
		new CourseDiscoveryPage().courseCardClick();
	}

	@And("user has entered {string} in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_pageforLXP(String langType) throws CustomException {

		//enter course name
		new CourseDiscoveryPage().langSpecificCourses(langType);
		
		//click on language specific radio button
		new LxpLearnerDashboardPage().langRadioBtnClick(langType);

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}
	
	@And("user has entered Scorm Package course name in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_Scorm_Package_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().enterScormCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();

	}

	@And("user has entered course name containing Sequential logic in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_Sequential_logic_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputSeqLogicCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();

	}

	@And("user has entered Time Based Assessment course name in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_Time_Based_Assessment_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//click on discovery link
		new CourseDiscoveryPage().clickDiscoveryLink();/////////////////////////************************************************
		
		//enter course name
		new CourseDiscoveryPage().retrieveAndInputTBACourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered Time Based Assessment course name in searchbox and clicked on search button on course discovery page to verify time out")
	public void user_has_entered_Time_Based_Assessment_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_page_to_verify_time_out() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputTimeOutCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered Randomised Assessment course name in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_Randomised_Assessment_course_name_in_searchbox_and_clicked_on_search_button_on_course_discovery_pageforLXP() throws CustomException {

		//click on discovery link
				new CourseDiscoveryPage().clickDiscoveryLink();/////////////////////////************************************************
		
		//enter course name
		new CourseDiscoveryPage().enterRandomAssessmentCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered course name containing html text based assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_html_text_based_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputHTMCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}



	@And("user has entered course name containing dropdown value based selection assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_dropdown_value_based_selection_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputQnACourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered course name containing video based assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_video_based_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputVideoCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered course name containing zoom based assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_zoom_based_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputZoomCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered course name containing discussion forum based assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_discussion_forum_based_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().retrieveAndInputDiscForumCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

	@And("user has entered course name containing all types of assessment in searchbox and clicked on search button on course discovery page")
	public void user_has_entered_course_name_containing_all_types_of_assessment_in_searchbox_and_clicked_on_search_button_on_course_discovery_page() throws CustomException {

		//enter course name
		new CourseDiscoveryPage().enterAllCompCourseName();

		//click on search button
		new CourseDiscoveryPage().searchCourseButtonClick();
	}

}
