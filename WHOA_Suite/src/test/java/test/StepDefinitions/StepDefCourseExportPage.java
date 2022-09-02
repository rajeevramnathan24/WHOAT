package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.CourseExportPage;

public class StepDefCourseExportPage {


	@When("user clicks on Export Course Content button")
	public void user_clicks_on_Export_Course_Content_button() throws CustomException {

		//click on export course content button
		new CourseExportPage().exportCourseContentBtnClick();

	}

	@Then("verify export status updated as success and user can download the exported course")
	public void verify_export_status_updated_as_success_and_user_can_download_the_exported_course() throws CustomException {

		//verify export course button
		new CourseExportPage().verifyDownloadExportCourseBtn();

		//verify text message message
		new CourseExportPage().verifyExportSuccessText();

		//verify success message
		new CourseExportPage().verifyCourseCanBeDownloadedText();

		//click on on download exported course content
		new CourseExportPage().downloadExportedCourseBtnClick();		

	}

	@Then("Course export page should be displayed")
	public void Course_export_page_should_be_displayed() throws CustomException {

		//new CourseExportPage().verifyCourseExportPageText();
	}
	
	

}
