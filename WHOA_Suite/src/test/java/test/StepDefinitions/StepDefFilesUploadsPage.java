package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.Pom.FileUploadPage;

public class StepDefFilesUploadsPage {


	@And("user uploads new scorm package by clicking on upload button")
	public void user_uploads_new_scorm_package_by_clicking_on_upload_button() throws CustomException {

		//click on browse file button
		new FileUploadPage().browseBtnClick();

	}
	

	@Then("new scorm package should be be successfully uploaded to the course")
	public void new_scorm_package_should_be_be_successfully_uploaded_to_the_course() throws CustomException {

		//run window exe file of autoit to upload file
		new FileUploadPage().uploadScormPackage();
	}

}
