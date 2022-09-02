package test.StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.LoginLxpLearnerPage;




public class StepDefLxpLoginPage {
	
	@When("User logs into LXP with valid UserName as {string} and password as {string} and clicks on login button")
	public void user_logs_into_LXP_with_valid_UserName_and_password(String userName, String password)	{

				new LoginLxpLearnerPage().loginApplicationCC(userName, password);
				

	}

@Then("LXPLogin page is displayed with username, password and login button")
public void LXPLogin_page_is_displayed_with_username_password_and_login_button(){
	
}



}
