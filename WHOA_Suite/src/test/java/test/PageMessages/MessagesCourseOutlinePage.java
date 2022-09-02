package test.PageMessages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MessagesCourseOutlinePage {

	public MessagesCourseOutlinePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------#page messages/ labels/ Texts--------------------------------------------
	
	public String sectionName = "MainSectionName";
	public String subSectionName = "SubSectionName";
	public String unitName = "UnitName";
	public String FileUploadFailed = "Could not click or locate File uploads sub menu button";
	public String section = "section";
	public String subSection = "subsection";
	public String unit = "unit";
	public String deleteSectionMethodProblem = "Delete section had problems";
	public String deleteSubSectionMethodProblem = "Delete Sub-section had problems";
	public String deleteUnitMethodProblem = "Delete Unit had problems";
	public String expandSubSectionProblem = "Problem with expanding sub-section";
	public String noContentAddedMsg = "You haven't added any content to this course yet. New Section";
	public String secHeaderName = "SH-";
	public String subSecHeaderName = "SSH-";
	public String unitHeaderName = "Unit-";
	public String timeValue = "00:01";
	public String timedExamTxt = "Timed Exam";
	public String courseText = "course/";
	public String chapter1 = "CHP1";
	public String chapter2 = "CHP2 Dependent on CHP1";
	public String chapter3 = "CHP3 Dependent on CHP2";
	
}
