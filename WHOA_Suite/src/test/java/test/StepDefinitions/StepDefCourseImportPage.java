package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.CourseImportPage;

public class StepDefCourseImportPage {


	@When("user clicks on choose file to import or replace Course Content button")
	public void user_clicks_on_choose_file_to_import_or_replace_Course_Content_button() throws CustomException {

		//click on Import course content button
		new CourseImportPage().importCourseContentBtnClick();

	}
	
	@When("user imports Sanity course content into current course")
	public void user_imports_Sanity_course_content_into_current_course() throws CustomException {

		//clicks to import Sanity course
		new CourseImportPage().importSanityCourse();

	}
	
	@And("user also clicks on replace course with selected file button")
	public void user_also_clicks_on_replace_course_with_selected_file_button() throws CustomException {
		
		//click on replace course content button
		new CourseImportPage().replaceCourseContentBtnClick();
	}

	@Then("verify course content is imported successfully")
	public void verify_course_content_is_imported_successfully() throws CustomException {

		//verify success message
		new CourseImportPage().verifyCourseImportedText();
		
		//verify View updated outine course button
		new CourseImportPage().verifyViewUpdatedOutlineBtnText();
		
		//click on view updated course content
		new CourseImportPage().viewUpdatedCourseBtnClick();

	}
	
	@Then("Course import page should be displayed")
	public void Course_import_page_should_be_displayed() throws CustomException {

		//new CourseExportPage().verifyCourseExportPageText();
	}

}
