package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.Pom.PreviewCoursePage;

public class StepDefPreviewAndViewPage {

@Then("Preview details page is displayed where user can verify the details of the component")
public void Preview_details_page_is_displayed_where_user_can_verify_the_details_of_the_component() throws CustomException {
	
	//verify text on preview page
	new PreviewCoursePage().verifyPreviewText();

}

@Then ("View Live Version page is displayed where user can verify the details of the component")
public void View_Live_Version_page_is_displayed_where_user_can_verify_the_details_of_the_component() throws CustomException {
	
	//verify text on View live version page
		new PreviewCoursePage().verifyPreviewText();
					
}

@And("user switches to new tab clicks on Instructor tab on Preview page")
public void user_switches_to_new_tab_clicks_on_Instructor_tab_on_Preview_page() throws CustomException {
	
	CommonUtility.switchToTab(1);
	
	new PreviewCoursePage().instructorTabClick();
}

}
