package core.CustomExceptions;

import core.Constants.GlobalConstants;
import core.Utils.CommonUtility;
import core.Utils.TestExecutionManager;

public class CustomException extends Exception {

	/**
	 * Adding default serial ID since this is custom exception class
	 */
	private static final long serialVersionUID = 1L;
	

	public CustomException(String s) {
		
		
		super(s);
		
		try {
			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
		//Logs.error(s);
	}
	
	
	
}
