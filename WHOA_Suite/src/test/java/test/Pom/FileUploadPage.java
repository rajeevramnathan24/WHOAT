package test.Pom;




import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.FileUploadPageElements;
import test.PageMessages.MessagesAddNewComponentPage;




public class FileUploadPage {

	public FileUploadPageElements fileUploadElements = null;
	public MessagesAddNewComponentPage msgAddNewComp = null;
	

	public FileUploadPage() {
		
		fileUploadElements = new FileUploadPageElements(GlobalConstants.getDriver());
		msgAddNewComp = new MessagesAddNewComponentPage(GlobalConstants.getDriver());
		
	}
	
	/**
	 * This method is used to click on browse button on file uploads page
	 * @throws CustomException
	 */
	public void browseBtnClick() throws CustomException{

		try {

			Thread.sleep(500);
			
			CommonUtility.eleWaitAndClick(fileUploadElements.browseBtn);

			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on browse file button. Either the button was not displayed or the locator has changed");
		} 

	}
	
	/**
	 * This method is used to upload file using RUN EXE file on file uploads page. This will work only for windows OS
	 * @throws CustomException
	 */
	public void uploadScormPackage() throws CustomException{

		try {

			Thread.sleep(500);
			
//			CommonUtility.runAutoItExeProgram_Windows(GlobalConstants.exeFileLocation);
			CommonUtility.runUploadProcess(GlobalConstants.libFolderPath, msgAddNewComp.v2ScormPackName);
			
			Thread.sleep(9000);

		} catch (Exception e) {

			e.printStackTrace();
			throw new CustomException("Could not click on browse file button. Either the button was not displayed or the locator has changed");
		} 

	}

}
