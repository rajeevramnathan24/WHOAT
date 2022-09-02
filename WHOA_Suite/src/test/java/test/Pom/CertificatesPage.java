package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.CertificatePageElements;
import test.PageElements.CourseDiscoveryPageElements;
import test.PageElements.StudioHomeElements;
import test.PageMessages.MessagesCertificatePage;




public class CertificatesPage {

	public StudioHomeElements  StudioHomePage= null;
	public CertificatePageElements certificateElements = null;
	public MessagesCertificatePage messageCertificate = null;

	public CertificatesPage() {
		StudioHomePage = new StudioHomeElements(GlobalConstants.getDriver());
		certificateElements = new CertificatePageElements(GlobalConstants.getDriver());
		messageCertificate = new MessagesCertificatePage(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to click on create certificate button on certificates page
	 * @throws CustomException
	 */
	public void createCertificateButtonClick() throws CustomException{

		try {

			Thread.sleep(3000);
			
			//create new certificate
			CommonUtility.eleWaitAndClick(certificateElements.createCertificateBtn);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}

	/**
	 * This method is used to verify successful generation on certificates page
	 * @throws CustomException
	 */
	public void certificateGenerated() throws CustomException{

		String actualText,ExpText = null;
		try {
			
			Thread.sleep(3000);
			
			CommonUtility.isElementVisible(certificateElements.confirmationTitle);						
			actualText = certificateElements.confirmationTitle.getText();
			ExpText = messageCertificate.certificateCreationConfirmation;
			CommonUtility.highlightElement(certificateElements.confirmationTitle, GlobalConstants.highlighterFlag);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
		
		CommonUtility.verifyAndReport(actualText, ExpText);
		
		GlobalConstants.scGlobal.write("New Course created successfully --- " + StudioHomePage.getCourseName());

	}
	
	//To be deleted later
	/**
	 * This method is used to segregate course names based on course types. This will be consumed by LXP system
	 * @throws CustomException
	 */
	public void courseNameAsTypeNOTUSED(String courseTypeCat) throws CustomException{

		try {
			
			switch (courseTypeCat) {
			
			case "HTM":
				
				CourseDiscoveryPageElements.htmlCourseName = StudioHomePage.getCourseName()	;
				
				break;
				

			case "PROB":
				
				CourseDiscoveryPageElements.problemCourseName = StudioHomePage.getCourseName()	;
				
				break;
				

			case "VID":
				
				CourseDiscoveryPageElements.videoCourseName = StudioHomePage.getCourseName()	;
				
				break;
				

			case "ZOM":
				
				CourseDiscoveryPageElements.zoomCourseName = StudioHomePage.getCourseName()	;
				
				break;
				

			case "DISC":
				
				CourseDiscoveryPageElements.discussionForumCourseName = StudioHomePage.getCourseName()	;
				
				break;
				

			case "ALL":
				
				CourseDiscoveryPageElements.generalCourseName = StudioHomePage.getCourseName()	;
				
				break;
				
			case "SCORM":
				
				CourseDiscoveryPageElements.scormPkgCourseName = StudioHomePage.getCourseName()	;
				
				break;
				
				
			case "SCOV2":
				
				CourseDiscoveryPageElements.scormV2CourseName = StudioHomePage.getCourseName()	;
				
				break;
				
			default:
				
				System.out.println("Course Created with general category");
				
				break;
			}
			
		} catch (Exception e) {


			throw new CustomException("Failed to create course name and fetch or course could not be created");
		} 

	}

	/**
	 * This method is used to activate certificate on certificates page
	 * @throws CustomException
	 */
	public void activateCertificateClick() throws CustomException{

		try {
			
			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(certificateElements.activateDeactivateBtn(messageCertificate.activate));
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
	
	/**
	 * This method is used to Deactivate certificate on certificates page
	 * @throws CustomException
	 */
	public void DeactivateCertificateClick() throws CustomException{

		try {
			
			Thread.sleep(2000);

			CommonUtility.eleWaitAndClick(certificateElements.activateDeactivateBtn(messageCertificate.deActivate));
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}


	/**
	 * This method is used to click on setup certificates button on certificates page
	 * @throws CustomException
	 */
	public void setUpCertificateButtonClick() throws CustomException{

		try {
			
			Thread.sleep(3000);

			CommonUtility.eleWaitAndClick(certificateElements.setupCertificateBtn);
			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
}
