package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.Pom.CourseTeamPage;

public class StepDefCourseTeamPage {

@And("user adds new team member to the course")
public void user_adds_new_team_member_to_the_course () throws CustomException {
	
	new CourseTeamPage().addNewTeamMemberBtnClick();
	
}

@Then("user is able to successfully add and remove the team member and verify the roles")
public void user_is_able_to_successfully_add_and_remove_the_team_member_and_verify_the_roles () throws CustomException {
	
	new CourseTeamPage().inputEmailId();
	
	new CourseTeamPage().addUserBtnClick();
	
	new CourseTeamPage().verifyUserLabel("STAFF");
	
	new CourseTeamPage().adminAccessBtnClick();
	
	new CourseTeamPage().verifyUserLabel("ADMIN");
	
	new CourseTeamPage().removeAdminAccessBtnClick();
	
	new CourseTeamPage().verifyUserLabel("STAFF");
	
	new CourseTeamPage().deleteUserBtnClick();
	
}


}
