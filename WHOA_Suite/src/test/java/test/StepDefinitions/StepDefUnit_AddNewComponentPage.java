package test.StepDefinitions;


import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.Unit_AddNewComponentPage;




public class StepDefUnit_AddNewComponentPage {


	@When("user clicks on html component")
	public void user_clicks_html_component() throws CustomException {

		//Click on Html component
		new Unit_AddNewComponentPage().htmlComponentButton();

	}

	@And("user selects Text type from dropdown")
	public void user_selects_Text_from_dropdown() throws CustomException {

		//select text type from drop down
		new Unit_AddNewComponentPage().selectTextOption();

	}	

@Then("user should be able edit the text and add new text")
public void user_should_be_able_edit_the_text_and_add_new_text() throws CustomException {
	
	//edit text value in the text component
	new Unit_AddNewComponentPage().editContent_TextComponent("This is demo text entered during Test Automation", true);
	
}

@When("user clicks on problem component")
public void user_clicks_on_problem_component() throws CustomException {
	
	//click on problem component
	new Unit_AddNewComponentPage().problemComponentButton();
}

@And("user selects dropdown option")
public void user_selects_dropdown_option() throws CustomException{
	
	//selects dropdown option
	new Unit_AddNewComponentPage().selectDropDownOption();
}























}
