package test.StepDefinitions;


import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.CourseOutlinePage;
import test.Pom.Unit_AddNewComponentPage;




public class StepDefCourseOutlinePage {


	@Then("course outline page should be displayed")
	public void course_outline_page_should_be_displayed() {

		new CourseOutlinePage().setCourseOutlineURL();
	}

	@And("User has navigated to the sanity course details page")
	public void User_has_navigated_to_the_sanity_course_details_page() throws CustomException {

		new CourseOutlinePage().navigateToSanityCourseDetails();
	}


	@When("user clicks on new section button followed by new subsection button and new unit button")
	public void user_clicks_on_new_section_button_followed_by_new_subsection_button_and_new_unit_button() throws CustomException{

		//Click on new section
		new CourseOutlinePage().newSectionButton();

		//Click on new sub section
		new CourseOutlinePage().newSubSectionButton();

		//Click on new Unit
		new CourseOutlinePage().newUnitButton();

	}

	@And("further user clicks on delete buttons of section or subsection or unit")
	public void further_user_clicks_on_delete_buttons_of_section_or_subsection_or_unit() throws CustomException {

		//click on course outline page
		new CourseOutlinePage().displayCourseNameTopClick();

		//expand subsection
		new CourseOutlinePage().subSectionExpand();

		//delete section
		new CourseOutlinePage().deleteUnit();

		//delete section
		new CourseOutlinePage().deleteSubSection();

		//delete section
		new CourseOutlinePage().deleteSection();

	}

	@Then("verify the dependant Subsection is displayed with lock icon")
	public void verify_the_dependant_Subsection_is_displayed_with_lock_icon() throws CustomException {

		new CourseOutlinePage().verifyDependantSubsectionLockIcon();
	}

	@Then("verify Timed Exam text is displayed below the section")
	public void verify_Timed_Exam_text_is_displayed_below_the_section() throws CustomException {

		new CourseOutlinePage().verifyTimedExamText();
	}

	@Then("course outline page should be displayed without any section or subsection or unit")
	public void course_outline_page_should_be_displayed_without_any_section_or_subsection_or_unit () throws CustomException {

		//verify no content
		new CourseOutlinePage().verifyNoContentAdded();
	}

	@When("user creates new section each component and adds them one by one for the following {string}")
	public void user_creates_new_section_each_component_and_adds_them_one_by_one_for_the_following(String componentNamesTypes) throws CustomException {

		new Unit_AddNewComponentPage().addNewSection_NewComponent_Type(componentNamesTypes);

	}

	@And("user configures Subsection dependency using sequential logic")
	public void user_configures_Subsection_dependency_using_sequential_logic() throws CustomException {

		new CourseOutlinePage().clickConfigureFirstSubSection();

		new CourseOutlinePage().advancedTabClick();

		new CourseOutlinePage().enableSectionPreqLabelClick();

		new CourseOutlinePage().saveButtonClick();

		new CourseOutlinePage().clickConfigureSecondSubSection();

		new CourseOutlinePage().advancedTabClick();

		new CourseOutlinePage().selectSubSectionDropDown();

		new CourseOutlinePage().saveButtonClick();

	}

	@And("user configures chapter 1, chapter 2 and chapter 3 for sequential logic")
	public void user_configures_chapter_1_chapter_2_and_chapter_3_for_sequential_logic () throws CustomException {

		new CourseOutlinePage().configureSubSecChapter1();

		new CourseOutlinePage().advancedTabClick();

		new CourseOutlinePage().enableSectionPreqLabelClick();

		new CourseOutlinePage().saveButtonClick();

		//adding further chapter dependencies---------------chapter 2 dependencies
		new CourseOutlinePage().configureSubSecChapter2();

		new CourseOutlinePage().advancedTabClick();

		new CourseOutlinePage().enableSectionPreqLabelClick();

		new CourseOutlinePage().selectChapt2DependantChp1();

		new CourseOutlinePage().saveButtonClick();

		//adding further chapter dependencies---------------chapter 3 dependencies
		new CourseOutlinePage().configureSubSecChapter3();

		new CourseOutlinePage().advancedTabClick();
		
		new CourseOutlinePage().selectChapt3DependantChp2();

		new CourseOutlinePage().saveButtonClick();

	}

	@And("user configures Time Based Assessments on Course Outline page")
	public void user_configures_Time_Based_Assessments_on_Course_Outline_page() throws CustomException {

		new CourseOutlinePage().clickConfigureFirstSubSection();

		new CourseOutlinePage().advancedTabClick();

		new CourseOutlinePage().timeBasedRadioBtnClick();

		new CourseOutlinePage().inputTimeValue();

		new CourseOutlinePage().saveButtonClick();

	}
	
	@And("user updates grading for all subsections to final exam")
	public void test() throws CustomException {
		
		//update grading for all sections
		new CourseOutlinePage().updateAllSectionForGrading();
		
//		new CourseOutlinePage().saveButtonClick();
		
	}

	@When("user clicks on Subsection and Unit level of the component")
	public void user_clicks_on_Subsection_and_Unit_level_of_the_component() throws CustomException {

		new CourseOutlinePage().clickSubSection();

		new CourseOutlinePage().clickUnitName();

	}

	@Then("Add new Component page is diplayed with Preview and View Live version buttons")
	public void Add_new_Component_page_is_diplayed_with_Preview_and_View_Live_version_buttons() throws CustomException {



	}

	@When("User clicks on Preview button")
	public void User_clicks_on_Preview_button() throws CustomException {

		new Unit_AddNewComponentPage().previewBtnClick();

	}


	@When("User clicks on View Live Version button")
	public void User_clicks_on_View_button() throws CustomException {
		new Unit_AddNewComponentPage().viewLiveBtnClick();

	}

	@Then("new unit should be displayed with html button, problem button should be displayed")
	public void new_unit_should_be_displayed_with_html_button_problem_button_should_be_displayed (){

	}

	@When("user clicks on course name on the top and navigates to course outline page")
	public void user_clicks_on_course_name_on_the_top_and_navigates_to_course_outline_page() throws CustomException {

		//click on display course name on top
		new CourseOutlinePage().displayCourseNameTopClick();
	}

	@And("publishes section on course outline page")
	public void publishes_section_on_course_outline_page() throws CustomException {

		//publish the section
		new CourseOutlinePage().publishSectionButton();
	}

	@And("publishes each section one by one on course outline page")
	public void publishes_each_section_one_by_one_on_course_outline_page() throws CustomException {

		//publish each section one by one
		new CourseOutlinePage().dynamicPublishSectionButton();
	}

	@And("User clicks on View Live button on course outline page")
	public void User_clicks_on_View_Live_button_on_course_outline_page() throws CustomException {

		new CourseOutlinePage().viewLiveButton();
	}

	@When("user navigates on course outline page, under settings dropdown select Schedule & Details")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_Schedule_Details() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on schedule & details sub menu
		new CourseOutlinePage().scheduleDetailSubMenuClick();
	}

	@When("user navigates on course outline page, under Content Main menu clicks on  Files & Uploads")
	public void user_navigates_on_course_outline_page_under_Content_Main_menu_clicks_on__Files_Uploads() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().contentMainMenuClick();

		//click on schedule & details sub menu
		new CourseOutlinePage().fileUploadsSubMenuClick();

	}

	@When("user navigates on course outline page, under settings dropdown select advanced settings")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_advanced_settings() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on advanced settings sub menu
		new CourseOutlinePage().advancedSettingSubMenuClick();

	}
	
	@When("user navigates on course outline page, under settings dropdown select grading")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_grading() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on advanced settings sub menu
		new CourseOutlinePage().gradingSubMenuClick();

	}

	@When("user navigates on course outline page, under settings dropdown select Certificates")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_Certificates() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on advanced settings sub menu
		new CourseOutlinePage().certificateSubMenuClick();

	}

	@When("user navigates on course outline page, under tools main menu selects export option")
	public void user_navigates_on_course_outline_page_under_tools_main_menu_selects_export_option() throws CustomException {

		//click on tools main menu
		new CourseOutlinePage().toolsMainMenuClick();

		//click on Export course sub menu
		new CourseOutlinePage().exportSubMenuClick();

	}

	@When("user navigates on course outline page, under tools main menu selects import option")
	public void user_navigates_on_course_outline_page_under_tools_main_menu_selects_import_option() throws CustomException {

		//click on tools main menu
		new CourseOutlinePage().toolsMainMenuClick();

		//click on Import course sub menu
		new CourseOutlinePage().importSubMenuClick();

	}

	@When("user navigates on course outline page, under settings dropdown select Course Team")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_Course_Team() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on advanced settings sub menu
		new CourseOutlinePage().courseTeamSubMenuClick();

	}

	@When("user navigates on course outline page, under settings dropdown select Digital Credentials")
	public void user_navigates_on_course_outline_page_under_settings_dropdown_select_Digital_Credentials() throws CustomException {

		//click on settings main menu
		new CourseOutlinePage().settingsMainMenuClick();

		//click on advanced settings sub menu
		new CourseOutlinePage().digitalCredentialsSubMenuClick();

	}


}
