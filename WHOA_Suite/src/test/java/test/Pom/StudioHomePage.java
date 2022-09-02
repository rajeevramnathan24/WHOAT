package test.Pom;




import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CourseDiscoveryPageElements;
import test.PageElements.CourseOutlinePageElements;
import test.PageElements.LaunchCourseCreatorElements;
import test.PageElements.StudioHomeElements;
import test.PageMessages.MessagesStudioHomePage;




public class StudioHomePage {

	public StudioHomeElements  studioHomePageElements= null;
	public LaunchCourseCreatorElements  signOutPageElements= null;
	public MessagesStudioHomePage msgsStudioHomePage = null;
	public CourseOutlinePageElements courseOutlineElements = null;

	public StudioHomePage() {
		studioHomePageElements = new StudioHomeElements(GlobalConstants.getDriver());
		signOutPageElements = new LaunchCourseCreatorElements(GlobalConstants.getDriver());
		msgsStudioHomePage = new MessagesStudioHomePage(GlobalConstants.getDriver());
		courseOutlineElements = new CourseOutlinePageElements(GlobalConstants.getDriver());
	}

	public void verifyWelcomeText()throws CustomException {

		String actTxt, expTxt=null;
		
		try {

			CommonUtility.isElementVisible(studioHomePageElements.newToAcademyTextLocator);
			CommonUtility.isElementVisible(studioHomePageElements.getStartedLocator);
			CommonUtility.isElementClickable(studioHomePageElements.getStartedLocator);
			
			CommonUtility.isElementVisible(studioHomePageElements.xpathStudioHomeLabel);
			CommonUtility.jsWaitTillPageLoadingComplete();

			CommonUtility.highlightElement(studioHomePageElements.xpathStudioHomeLabel, 
					GlobalConstants.highlighterFlag);

			Thread.sleep(3000);
			
			actTxt = studioHomePageElements.xpathStudioHomeLabel.getText();
			expTxt = msgsStudioHomePage.Label_StudioHomePage.toString();
			
			
			
//			SoftAssert sa = new SoftAssert();
//
//
//			sa.assertEquals(studioHomePageElements.xpathStudioHomeLabel.getText(),msgsStudioHomePage.Label_StudioHomePage.toString());
		} catch (Exception e) {
			throw new CustomException("Studio Home page - Welcome label was not displayed after waiting for more than 30sec");
		}
		
		CommonUtility.verifyAndReport(actTxt, expTxt);
	}




	/**
	 * This method will click on New course button on dashboard page
	 * @throws CustomException
	 */
	public void newCourseButton() throws CustomException {

		try {

			CommonUtility.isElementVisible(studioHomePageElements.newCourseBtn);
			CommonUtility.eleWaitAndClick(studioHomePageElements.newCourseBtn);
		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method will search for specific course on the course listing page
	 * @throws CustomException
	 */
	public void courseSearchAndClick(String courseName) throws CustomException {

		try {			

			List<WebElement> courseLists = studioHomePageElements.courseListing;
			int courseCount = courseLists.size();
			String childNode = studioHomePageElements.courseNameLocator;
			ArrayList<Object> fetchCourseName = new ArrayList<Object>();


			for (int j = 0; j < courseCount; j++) {

				WebElement specificCourse = courseLists.get(j);

				String getCourseName = specificCourse
						.findElement(By.xpath(childNode)).getText();
				
				fetchCourseName.add(j, getCourseName);

//				if (getCourseName.equalsIgnoreCase(courseName)) {
//
//					specificCourse.click();
//
//					studioHomePageElements.courseFoundFlag = true;
//
//					break;
//				}
			} 

			if (!studioHomePageElements.courseFoundFlag) {

				System.out.println("Course not found, hence new course will be created");

				createNewCourse("");
			}			

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/** This method will add course details and create
	 * @throws CustomException
	 */
	public void createNewCourse(String nameOfCourse) throws CustomException {

		try {

			StudioHomeElements.courseType = nameOfCourse;
			
			//Set course name from feature file
			studioHomePageElements.setCourseName(nameOfCourse + GlobalConstants.localDateTime);
			//create org, number and course run
			studioHomePageElements.courseOrg = GlobalConstants.currentDay
					+ studioHomePageElements.courseOrg;
			studioHomePageElements.courseNumber = GlobalConstants.currentMonth
					+ studioHomePageElements.courseNumber;
			studioHomePageElements.courseRun = GlobalConstants.currentTime
					+ studioHomePageElements.courseRun;

			//Add course name
			CommonUtility.eleWaitAndSendValue(studioHomePageElements.newCourseNameInput,
					studioHomePageElements.getCourseName());
			//Add course Org
			CommonUtility.eleWaitAndSendValue(studioHomePageElements.newCourseOrgInput,
					studioHomePageElements.courseOrg);
			//Add course Number
			CommonUtility.eleWaitAndSendValue(studioHomePageElements.newCourseNumberInput,
					studioHomePageElements.courseNumber);
			//Add course Run
			CommonUtility.eleWaitAndSendValue(studioHomePageElements.newCourseRunInput,
					studioHomePageElements.courseRun);


			studioHomePageElements.courseDisplayName = studioHomePageElements.courseDisplayName 
					+ studioHomePageElements.courseOrg + "+" + studioHomePageElements.courseNumber + "+"
					+ studioHomePageElements.courseRun;
			System.out.println(studioHomePageElements.courseDisplayName);
			
//			//Set the course id
//			String courseID = studioHomePageElements.courseDisplayName;
//			courseOutlineElements.setCourseName_OutlinePageUrl(courseID);
			
			storeCourseNameforLXP(nameOfCourse);

			//Click on create button
			CommonUtility.eleWaitAndClick(studioHomePageElements.createCourseBtn);


		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
	}
	
	/**
	 * This method is used to segregate course names based on course types. This will be consumed by LXP system
	 * @throws CustomException
	 */
	public void storeCourseNameforLXP(String courseTypeCat) throws CustomException{

		try {
			
			switch (courseTypeCat) {
			
			case "HTM":
				
				CourseDiscoveryPageElements.htmlCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "PROB":
				
				CourseDiscoveryPageElements.problemCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "VID":
				
				CourseDiscoveryPageElements.videoCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "ZOM":
				
				CourseDiscoveryPageElements.zoomCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "DISC":
				
				CourseDiscoveryPageElements.discussionForumCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "ALL":
				
				CourseDiscoveryPageElements.generalCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
			case "ARAC":
				
				CourseDiscoveryPageElements.araCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
				
			case "FRNC":
				
				CourseDiscoveryPageElements.frenCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
				
			case "ESPC":
				
				CourseDiscoveryPageElements.espCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
				
			case "RUSC":
				
				CourseDiscoveryPageElements.russCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
				
			case "ZHUC":
				
				CourseDiscoveryPageElements.zhuCourseName = studioHomePageElements.getCourseName()	;
				
				break;				

			case "SCORM":
				
				CourseDiscoveryPageElements.scormPkgCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				
				
			case "SCOV2":
				
				CourseDiscoveryPageElements.scormV2CourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "RDMA":
				
				CourseDiscoveryPageElements.randomCourseName = studioHomePageElements.getCourseName()	;
				
				break;
				

			case "TOP":
				
				CourseDiscoveryPageElements.timeBasedCourseName = studioHomePageElements.getCourseName();
				
				break;
				
			case "INTBA":
				
				CourseDiscoveryPageElements.incompletetimeBasedCourseName = studioHomePageElements.getCourseName();
				
				break;				

			case "SEQL":
				
				CourseDiscoveryPageElements.seqLogicCourseName = studioHomePageElements.getCourseName()	;
				
				break;
			default:
				
				GlobalConstants.scGlobal.write("Course created in general category");
				
				break;
			}
			
		} catch (Exception e) {


			throw new CustomException("Failed to create course name and fetch or course could not be created");
		} 

	}


	public void clickLogOut() {

		try {

			CommonUtility.isElementVisible(studioHomePageElements.xpathCurrentlySignedInBy);
			CommonUtility.isElementClickable(studioHomePageElements.xpathCurrentlySignedInBy);

			studioHomePageElements.xpathCurrentlySignedInBy.click();
			CommonUtility.highlightClick(studioHomePageElements.xpathCurrentlySignedInBy, 
					GlobalConstants.highlighterFlag);

			//Thread.sleep(3000);

			CommonUtility.isElementVisible(studioHomePageElements.xpathLogOut);
			CommonUtility.isElementClickable(studioHomePageElements.xpathLogOut);

			CommonUtility.highlightClick(studioHomePageElements.xpathLogOut, 
					GlobalConstants.highlighterFlag);		
			studioHomePageElements.xpathLogOut.click();

			Thread.sleep(3000);



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
