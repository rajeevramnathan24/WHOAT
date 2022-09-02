package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.InstructorTab_MemberShipPage;

public class StepDefInstructorTabPage {

	@Then("Instructor Dashboard page should be displayed")
	public void Instructor_Dashboard_page_should_be_displayed() throws CustomException {


	}

	@When("User clicks on Membership tab on Instructor Dashboard")
	public void User_clicks_on_Membership_tab_on_Instructor_Dashboard() throws CustomException {

		new InstructorTab_MemberShipPage().membershipTabClick();
	}

	@Then("On Membership tab verify user should be able to enroll or unenroll the users and switches to first tab")
	public void On_Membership_tab_verify_user_should_be_able_to_enroll_or_unenroll_the_users_and_switches_to_first_tab() throws CustomException {

		new InstructorTab_MemberShipPage().inputRegisteredEmailIds();

		new InstructorTab_MemberShipPage().enrollBtnClick();

		new InstructorTab_MemberShipPage().verifyEnrollSuccessText();
		
		new InstructorTab_MemberShipPage().inputRegisteredEmailIds();

		new InstructorTab_MemberShipPage().unEnrollBtnClick();

		new InstructorTab_MemberShipPage().verifyUnEnrollSuccessText();

		CommonUtility.switchToTab(0);
	}
}
