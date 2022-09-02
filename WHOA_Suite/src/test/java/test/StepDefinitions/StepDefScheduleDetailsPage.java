package test.StepDefinitions;

import core.CustomExceptions.CustomException;
import io.cucumber.java.en.And;
import test.Pom.ScheduleDetailsPage;

public class StepDefScheduleDetailsPage {


	@And("user updates course start and end date time, enrollment start and end date time on Schedule & Details")
	public void user_updates_course_start_and_end_date_time_enrollment_start_and_end_date_time_on_Schedule_Details() throws CustomException {
		
		//select instructor or self paced learning
		new ScheduleDetailsPage().coursePacingSelf();
		
		//Click on save button
		new ScheduleDetailsPage().saveButtonClick();

		//input course schedule
		new ScheduleDetailsPage().courseScheduleUpdate();

		//Click on save button
		new ScheduleDetailsPage().saveButtonClick();
	}
	
	@And("user updates course start and end date time, enrollment start and end date time on Schedule & Details in specific {string}")
	public void user_updates_course_start_and_end_date_time_enrollment_start_and_end_date_time_on_Schedule_Details_in_specific_language(String selectLang) throws CustomException {

		//input course schedule
		new ScheduleDetailsPage().courseScheduleUpdate();
		
		new ScheduleDetailsPage().selectCourseLanguage(selectLang);

		//Click on save button
		new ScheduleDetailsPage().saveButtonClick();
	}

}
