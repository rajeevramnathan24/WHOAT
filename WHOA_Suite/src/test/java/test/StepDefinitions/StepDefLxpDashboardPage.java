package test.StepDefinitions;



import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.LxpLearnerDashboardPage;



public class StepDefLxpDashboardPage {



	@Then("LXP Dashboard page is displayed with Discover learning link")
	public void LXP_Dashboard_page_is_displayed_with_Discover_learning_link() throws CustomException	{

		try {
			new LxpLearnerDashboardPage().verifyRecommendationHeader();


			//Thread.sleep(3000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Then("LXP Dashboard page is displayed with My Programme link")
	public void LXP_Dashboard_page_is_displayed_with_My_Programme_link() throws CustomException	{
		
		new LxpLearnerDashboardPage().verifyMyProgrammeHeader();

	}
	
	@Then("new profile should get updated and can be verified by the user")
	public void new_profile_should_get_updated_and_can_be_verified_by_the_user() throws CustomException {
		
		new LxpLearnerDashboardPage().updateVerifyProfile();
	}
	
	@Then("user should be able to revert back to old profile")
	public void user_should_be_able_to_revert_back_to_old_profile() throws CustomException {
		
		new LxpLearnerDashboardPage().revertVerifyProfile();
	}

	@Then("new goals should get updated and can be verified by the user")
	public void new_goals_should_get_updated_and_can_be_verified_by_the_user() throws CustomException{

		new LxpLearnerDashboardPage().updateGoal_Verify();

		//new LxpLearnerDashboardPage().verifyUpdatedGoalText();
	}

	@Then("old goals should be reverted back and visible to the user")
	public void old_goals_should_be_reverted_back_and_visible_to_the_user() throws CustomException {

		new LxpLearnerDashboardPage().revertGoal_Verify();

		//new LxpLearnerDashboardPage().verifyOldGoalText();
	}

	@When("clicks on edit goals button to revert back the goals")
	public void clicks_on_edit_goals_button_to_revert_back_the_goals() throws CustomException {

		new LxpLearnerDashboardPage().editGoalButtonClick();
	}

	@And("clicks on edit goals button to update the goals")
	public void clicks_on_edit_goals_button_to_update_the_goals() throws CustomException {

		new LxpLearnerDashboardPage().editGoalButtonClick();

	}
	
	@And("clicks on edit profile button to update his profile")
	public void clicks_on_edit_profile_button_to_update_his_profile() throws CustomException {
		
		new LxpLearnerDashboardPage().editProfileButtonClick();
	}

	@When("User clicks on image icon on left menu")
	public void User_clicks_on_image_icon_on_left_menu() throws CustomException {

		new LxpLearnerDashboardPage().userImageLabelClick();
	}
	
	@When("User clicks on Settings tab on left menu")
	public void User_clicks_on_Settings_tab_on_left_menu() throws CustomException {

		new LxpLearnerDashboardPage().settingsTabClick();
	}
	
	@And("verify if base language is correctly set to english language")
	public void verify_if_base_language_is_correctly_set_to_english_language() throws CustomException {
		
		new LxpLearnerDashboardPage().verifySetBaseLangIsEnglish();
		
//		new LxpLearnerDashboardPage().sameLanguageCheck(englishLanguage, englishLanguage);
				
	}
	
	@When("User navigates to myprofile link and updates the language from {string} language to {string}")
	public void User_navigates_to_myprofile_link_and_updates_the_language_from_sourceLanguage_to_targetLanguage(String sourceLang, String tgtLang) throws CustomException {
		
		//Check base language here
		//new LxpLearnerDashboardPage().baseLanguageCheck("English", tgtLang);
		
		//Update the language
		new LxpLearnerDashboardPage().updateLanguage(sourceLang, tgtLang);
			
	}
			
	@Then("On Dashboard page entire text is translated and user is able to verify texts in {string} language")
	public void On_Dashboard_page_entire_text_is_translated_and_user_is_able_to_verify_texts(String selectedLanguage)throws CustomException {
		
		//verify the translated text
//		new LxpLearnerDashboardPage().verifyhomeTextLocalLanguage();
//		new LxpLearnerDashboardPage().verifyMyLearningTextLocalLanguage();
		new LxpLearnerDashboardPage().verifyFeedbackTextLocalLanguage();
		
	}
	
	@When("User has clicked on logout link on LXP page")
	public void User_has_clicked_on_logout_link_on_LXP_page() throws CustomException	{


		new LxpLearnerDashboardPage().clickLogOut();


	}

	@Then("verify that only those language specific course cards are displayed as selected in the filter")
	public void verify_that_only_those_language_specific_course_cards_are_displayed_as_selected_in_the_filter() throws CustomException {

		new LxpLearnerDashboardPage().verifyLanguageOnCourseCard();
	}

	@When("User has clicked on logout link on LXP page in preferred language")
	public void User_has_clicked_on_logout_link_on_LXP_page_in_preferred_language() throws CustomException	{

				
		new LxpLearnerDashboardPage().clickLogOut();
	
	}
	
	@And("user clicks on {string} radio button filter")
	public void user_clicks_on_radio_button_filter(String langFilter) throws CustomException 
	{

		new LxpLearnerDashboardPage().langRadioBtnClick(langFilter);

	}

	@When ("user clicks on Discover learning search button")
	public void user_clicks_on_Discover_learning_search_button() throws CustomException {

//		new LxpLearnerDashboardPage().searchDiscoverLearningButtonClick();
	}

}
