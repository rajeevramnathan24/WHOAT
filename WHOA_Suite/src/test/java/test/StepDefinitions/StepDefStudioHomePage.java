package test.StepDefinitions;



import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.StudioHomePage;



public class StepDefStudioHomePage {



	@Then("Course creator Dashboard page is displayed with Studio home text")
	public void Course_creator_Dashboard_page_is_displayed_with_Studio_home_text()	throws CustomException{
		
//		new StudioHomePage().courseSearchAndClick("");
		
		new StudioHomePage().verifyWelcomeText();
		
	}

	@When("User clicks on logout link")
	public void User_clicks_on_logout_link()	{

		new StudioHomePage().clickLogOut();
		
	}

	@And("User closes the active Course Creator browser session")
	public void User_closes_the_active_Course_Creator_browser_session() {
		
		new core.Utils.WebDriverSetup().closeBrowser();
	}


	@When("user clicks on New course button on Dashboard page")
	public void user_clicks_on_New_course_button_on_Dashboard_page() throws CustomException {
		
		//CommonUtility.testProgramNotToPush();
		
		new StudioHomePage().newCourseButton();
	}
	
	@When("user searches for existing {string} or creates new course")
	public void user_searches_for_existing_Course_Name_or_creates_new_course(String courseName) throws CustomException {
		
		new StudioHomePage().courseSearchAndClick(courseName);
		
	}

	@And("user has entered new course details like {string}, Organization, Course Number, Course Run clicks on create button")
	public void user_has_entered_new_course_details_like_CourseName_Organization_CourseNumber_CourseRun_clicks_on_create_button(String courseName) throws CustomException{
		
		new StudioHomePage().createNewCourse(courseName);
	}

}
