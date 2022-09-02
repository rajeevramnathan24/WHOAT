package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import test.Pom.GradingPage;

public class StepDefGradingPage {

	@And("user updates the final exam grading on grading page")
	public void test() throws CustomException {

		//inputs grading weight
		new GradingPage().inputFinalExamGrade();
		
		new GradingPage().saveButtonClick();

	}

	

}
