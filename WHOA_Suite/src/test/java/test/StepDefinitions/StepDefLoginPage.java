package test.StepDefinitions;


import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.LoginCCStudioPage;




public class StepDefLoginPage {
	
	@When("User enters valid UserName as {string} and password as {string} and clicks on login button")
	public void User_enters_valid_UserName_as_username_and_password_as_password_and_clicks_on_login_button
	(String userName, String password)	{

				new LoginCCStudioPage().loginApplicationCC(userName, password);
		

	}
	
	@When("User enters custom UserName as {string} and password as {string} and clicks on login button")
	public void User_enters_custom_UserName_as_username_and_password_as_password_and_clicks_on_login_button
	(String userName, String password)throws CustomException	{

				new LoginCCStudioPage().customLogin(userName, password);
		

	}

	@Then("Login page should be displayed with username, password and login button")
	public void Login_page_should_be_displayed_with_username_password_and_login_button() {
		
		
	}
	
	//Demo condition to be removed later
	@And("User enters valid OTP on the screen")
	public void User_enters_valid_OTP_on_the_screen() throws CustomException {
		
		new LoginCCStudioPage().generateOTP();
		
	}
	
}
