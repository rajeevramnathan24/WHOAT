package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.Pom.CertificatesPage;

public class StepDefCertificatesPage {


	@And("user clicks on setup certificates")
	public void user_clicks_on_setup_certificates() throws CustomException {

		//click on setup certificate button
		new CertificatesPage().setUpCertificateButtonClick();

	}

	@When("user creates new certificate and clicks on activate button")
	public void user_creates_new_certificate_and_clicks_on_activate_button() throws CustomException {

		//create new certificate and activate
		new CertificatesPage().createCertificateButtonClick();

		new CertificatesPage().activateCertificateClick();
	}

	@Then("Course and certificates are activated")
	public void Course_and_certificates_are_activated() throws CustomException {

		//Assert the new created certificate message
		new CertificatesPage().certificateGenerated();
	}
	
	@And("user reactivates the certificates for the course")
	public void user_reactivates_the_certificates_for_the_course() throws CustomException {

		//Deactivate certificate
		new CertificatesPage().DeactivateCertificateClick();
		
		//reactivate certificates
		new CertificatesPage().activateCertificateClick();
	}

}
