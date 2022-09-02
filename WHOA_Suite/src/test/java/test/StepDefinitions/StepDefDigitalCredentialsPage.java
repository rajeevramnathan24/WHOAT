package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import test.Pom.DigitalCredentialsPage;

public class StepDefDigitalCredentialsPage {

@And("user clicks on add Digital Credentials")
public void user_clicks_on_add_Digital_Credentials() throws CustomException {
	
	//click on add new digital certificates
	new DigitalCredentialsPage().addDigitalCredentialsButtonClick();

}

@When("user adds new Digital Credentials for the course")
public void user_adds_new_Digital_Credentials_for_the_course() throws CustomException {
	
	
	new DigitalCredentialsPage().radioBtnClickCompleteActivities();
	
	new DigitalCredentialsPage().nextButtonClick();
	
	new DigitalCredentialsPage().inputAllTextAreasDigCredPopUp();
	
	new DigitalCredentialsPage().saveButtonClick();
	
	new DigitalCredentialsPage().activateDeactivateClick();
	
	new DigitalCredentialsPage().verifyDigitalCredentialsActivated_Deactivated("Activate");
}

@And("user enters new digital credentials")
public void test()	throws CustomException {
	
	new DigitalCredentialsPage().radioBtnClickPassingAssessment();
	
	new DigitalCredentialsPage().updateSliderValues();
}

}
