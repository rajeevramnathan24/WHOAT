package test.Pom;




import org.openqa.selenium.Keys;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CourseDiscoveryPageElements;
import test.PageElements.StudioHomeElements;
import test.PageMessages.MessagesLxpLearnerDashboardPage;




public class CourseDiscoveryPage {

	public StudioHomeElements  StudioHomePage= null;
	public CourseDiscoveryPageElements courseDiscoveryElements = null;
	public MessagesLxpLearnerDashboardPage msgLxpDashboardPage = null;

	public CourseDiscoveryPage() {
		StudioHomePage = new StudioHomeElements(GlobalConstants.getDriver());
		courseDiscoveryElements = new CourseDiscoveryPageElements(GlobalConstants.getDriver());
		msgLxpDashboardPage = new MessagesLxpLearnerDashboardPage(GlobalConstants.getDriver());
	}


	public String returnCourseName(String courseCat) throws CustomException {

		String courseName = null;

		switch (courseCat) {

		case "HTM":

			courseName = CourseDiscoveryPageElements.htmlCourseName;

			break;


		case "PROB":

			courseName =CourseDiscoveryPageElements.problemCourseName;

			break;


		case "VID":

			courseName = CourseDiscoveryPageElements.videoCourseName;

			break;


		case "ZOM":

			courseName =CourseDiscoveryPageElements.zoomCourseName;

			break;


		case "DISC":

			courseName =CourseDiscoveryPageElements.discussionForumCourseName;

			break;


		case "ALL":

			courseName = CourseDiscoveryPageElements.generalCourseName;

			break;


		case "Arabic":

			courseName = CourseDiscoveryPageElements.araCourseName;

			break;


		case "French":

			courseName = CourseDiscoveryPageElements.frenCourseName;

			break;


		case "Russian":

			courseName = CourseDiscoveryPageElements.russCourseName;

			break;


		case "Spanish":

			courseName = CourseDiscoveryPageElements.espCourseName;

			break;


		case "Chinese":

			courseName = CourseDiscoveryPageElements.zhuCourseName;

			break;

		case "Scorm":

			courseName = CourseDiscoveryPageElements.scormPkgCourseName;

			break;

		case "RDMA":

			courseName = CourseDiscoveryPageElements.randomCourseName;

			break;

		case "TBA":

			courseName = CourseDiscoveryPageElements.timeBasedCourseName;

			break;

		case "SEQL":

			courseName = CourseDiscoveryPageElements.seqLogicCourseName;

			break;

		case "INTBA":

			courseName = CourseDiscoveryPageElements.incompletetimeBasedCourseName;

			break;

		default:

			System.out.println("Course Created with general category");

			break;
		}

		return courseName;
	}

	/**
	 * This method is used to input course name to search on course discovery page
	 * @throws CustomException
	 */
	public void enterCourseNameToSearch() throws CustomException{

		try {

			Thread.sleep(2000);

			//pass course name created in studio
			//			String courseNameDesc = StudioHomePage.getCourseName();
			String courseNameDesc = CourseDiscoveryPageElements.runtimeCourseName;

			//enter course name to search
			CommonUtility.eleWaitAndSendValue(courseDiscoveryElements.courseNameSearch, courseNameDesc);



		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used only for direct input of course name from feature file for LXP specific scripts to complete course enrollment and completion
	 * @throws CustomException
	 */
	public void enterCourseNameToSearch_LXP(String courseNameText) throws CustomException{

		try {

			Thread.sleep(6000);
			
			CommonUtility.eleWaitAndClick(courseDiscoveryElements.courseNameSearch);
			
			CommonUtility.isElementVisible(courseDiscoveryElements.learningProgHeader);

			//StudioHomePage.courseType = courseNameText;
			//System.out.println("Hard coded course displayed here ... "+courseNameText);

			//Uncomment below if only LXP has to be separately executed with hardcoded course name
			//			String tempString = courseNameText;
			//			CourseDiscoveryPageElements.htmlCourseName = tempString;
			CourseDiscoveryPageElements.runtimeCourseName = returnCourseName(courseNameText); //returnCourseName(courseNameText); courseNameText

			//enter course name to search
			CommonUtility.eleWaitAndSendValue(courseDiscoveryElements.courseNameSearch, CourseDiscoveryPageElements.runtimeCourseName);

		} catch (Exception e) {


			throw new CustomException("Could not search for the specific course in LXP");
		} 

	}
	
	
	
	
//	This method is used to input dynamic html course name in LXP after creating in studio
	
	/**
	 * This method is used to input dynamic html course name in LXP after creating in studio
	 * @throws CustomException
	 */
	public void retrieveAndInputHTMCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.HTM);
	}
	
	public void clickDiscoveryLink() throws CustomException {
		
		CommonUtility.threadWait(2000);

		CommonUtility.eleWaitAndClick(courseDiscoveryElements.discoveryLink);

		CommonUtility.threadWait(2000);
	}

	/**
	 * This method is used to retrieve time based assessment course name created in Studio
	 * @throws Exception 
	 */
	public void retrieveAndInputTBACourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.TBA);
	}

	/**
	 * This method is used to retrieve time based assessment course name created in Studio to verify time out
	 * @throws Exception 
	 */
	public void retrieveAndInputTimeOutCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.INTBA);
				
	}

	/**
	 * This method is used to retrieve Sequential Logic course name created in Studio
	 * @throws Exception 
	 */
	public void retrieveAndInputSeqLogicCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.SEQL);
	}

	/**
	 * This method is used to input all components course name on LXP search page
	 * @throws CustomException
	 */
	public void enterAllCompCourseName() throws CustomException {
		
		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.ALL);
		
	}
	
	/**
	 * This method is used to input Scorm package or Scorm V2 course name on LXP search page
	 * @throws CustomException
	 */
	public void enterScormCourseName() throws CustomException {
		
		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.SCORM);
		
	}
	
	/**
	 * This method is used to input specific random assessment course name on LXP search page
	 * @throws CustomException
	 */
	public void enterRandomAssessmentCourseName() throws CustomException {
		
		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.RDMA);
		
	}
	
	/**
	 * This method is used to input dynamic Prb Q&A course name in LXP after creating in studio
	 * @throws Exception 
	 */
	public void retrieveAndInputQnACourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.PROB);
	}
	
	/**
	 * This method is used to input dynamic Video course name in LXP after creating in studio
	 * @throws Exception 
	 */
	public void retrieveAndInputVideoCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.VID);
	}
	
	/**
	 * This method is used to input dynamic Zoom course name in LXP after creating in studio
	 * @throws Exception 
	 */
	public void retrieveAndInputZoomCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.ZOOM);
	}
	
	/**
	 * This method is used to input dynamic Discussion forum course name in LXP after creating in studio
	 * @throws Exception 
	 */
	public void retrieveAndInputDiscForumCourseName() throws CustomException {

		//retrieve course name and input
		retrieveCourseAndInputCourseName(msgLxpDashboardPage.DISC);
	}
	
	
	public void langSpecificCourses(String langType) throws CustomException {
		
		//retrieve course name and input
		retrieveCourseAndInputCourseName(langType);
	}
	
	private void retrieveCourseAndInputCourseName(String courseType) throws CustomException {
		
//		clickWaitLoadCourses();

		//retrieve course name
		CourseDiscoveryPageElements.runtimeCourseName = "RDMA26Aug203242"; //returnCourseName(courseType);

		//input course name
		inputCourseNameinLXP(CourseDiscoveryPageElements.runtimeCourseName);
	}
	
	private void clickWaitLoadCourses() throws CustomException {
		
		CommonUtility.eleWaitAndClick(courseDiscoveryElements.courseNameSearch);
		
//		CommonUtility.isElementVisible(courseDiscoveryElements.FirstCourseCard);
		
		CommonUtility.threadWait(3000);
	}
	
	/**
	 * This method is used to set course name value in search field of LXP page
	 * @param courseName
	 * @throws CustomException
	 * @throws Exception 
	 */
	private void inputCourseNameinLXP(String courseName) throws CustomException {		

		if (CourseDiscoveryPageElements.runtimeCourseName != null) {

			//				GlobalConstants.getDriver().navigate().refresh();

//			CommonUtility.threadWait(2000);	
			
//			CommonUtility.threadWait(3000);
//			
//			CommonUtility.eleWaitAndClick(courseDiscoveryElements.courseNameSearch);
			
			CommonUtility.threadWait(4000);

			//enter course name to search
			CommonUtility.eleWaitAndSendValue(courseDiscoveryElements.courseNameSearch, CourseDiscoveryPageElements.runtimeCourseName);
			
			System.out.println();

		} else {

			GlobalConstants.scGlobal.write("Either the course was not created in studio or could not be found in LXP");
			CommonUtility.verifyAndReport("appropriate course Name created in Studio", CourseDiscoveryPageElements.runtimeCourseName);

		}
	}

	
	//*********** END of fetching dynamic course name 
	
	
	/**
	 * This method is used to click on particular course card on course discovery page
	 * @throws CustomException
	 */
	public void courseCardClick() throws CustomException{

		try {

			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(courseDiscoveryElements.FirstCourseCard);

			Thread.sleep(3000);

		} catch (Exception e) {


			throw new CustomException("The created course was not reflected in LXP or the search results did not return any course");
		} 

	}

	/**
	 * This method is used to click on search button on course discovery page
	 * @throws CustomException
	 */
	public void searchCourseButtonClick() throws CustomException{

		try {

			CommonUtility.threadWait(3000);
			
			CommonUtility.eleWaitAndClick(courseDiscoveryElements.searchIcon);
//			CommonUtility.eleWaitAndSendValue(courseDiscoveryElements.courseNameSearch, Keys.ENTER);

		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
}
