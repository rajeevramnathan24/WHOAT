package core.Utils;

import java.nio.file.Files;
import java.nio.file.Paths;

//import org.junit.After;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
//import io.cucumber.core.api.Scenario;
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
import io.cucumber.java.Before;



public class TestExecutionManager {


	//	
	//	@AfterStep
	//	public void afterStepTest() throws CustomException {
	//		CommonUtility.captureScreenshot();
	//		
	//	}

	
	/**
	 * This method is used to embed the captured screen shot on the html report
	 * @param scenario
	 * @throws CustomException
	 */
	public static void embedScreenShot(Scenario scenario) throws CustomException {

		try {
			//verify screenshot list size
			if(GlobalConstants.getTestEvidenceScreenshots().size() > 0) {
				//scenario.write("File path of the screenshot(s) captured during this test step execution:");
				for(String filePath : GlobalConstants.getTestEvidenceScreenshots()) {
					//scenario.write("embeddings\\" + new File(filePath).getName());
					byte[] encoded = Files.readAllBytes(Paths.get(filePath));	
					scenario.embed(encoded, "image/png"); 
				}

				//clear screen shot list
				GlobalConstants.clearTestEvidenceScreenshots();
			} else {

				scenario.write("No screenshots captured during this test step execution.");

			}
		} catch(Exception e) {
			throw new CustomException("TestExecutionManager.showTestStepExecutionStatus() - error - " + e.getMessage());
		}
	}

	@Before
	public void testDataSetup(Scenario scenario) throws CustomException {


		//System.out.println("Check");

		//Initializing the setup
		//GlobalConstants.intializeData();

		//Log4jReader.loadLog4jFile();
		GlobalConstants.loadConfigFileData();
		GlobalConstants.scGlobal = scenario;
				
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy 'T' HH:mm:ss");
		//scenario.write("Test Scenario Execution Started at = " + formatter.format(Calendar.getInstance().getTime()));
		//Logs.info("Test Scenario Execution Started at = " + formatter.format(Calendar.getInstance().getTime()));

		try {
			//CommonUtils.createScreenshotDirectory();
			CommonUtility.createScreenshotDirectory();

			//Environment_Name
			//
			String envNameFromCommandLineOrJenkinsJob = System.getenv("Environment_Name");
			if(envNameFromCommandLineOrJenkinsJob != null && envNameFromCommandLineOrJenkinsJob != "") {
				GlobalConstants.setEnvironmentName(envNameFromCommandLineOrJenkinsJob);
			} else {
				String envNameFromConfigProperties = GlobalConstants.Environment;
				GlobalConstants.setEnvironmentName(envNameFromConfigProperties);
			}
			System.out.println("ENVIORNMENT=" + GlobalConstants.getEnvironmentName());

			//Browser_Name
			//
			String browserNameFromCommandLineOrJenkinsJob = System.getenv("Browser_Name");
			if(browserNameFromCommandLineOrJenkinsJob != null && browserNameFromCommandLineOrJenkinsJob != "") {
				GlobalConstants.setBrowserName(browserNameFromCommandLineOrJenkinsJob);
			} else {
				String browserNameFromConfigProperties = GlobalConstants.BrowserType;
				GlobalConstants.setBrowserName(browserNameFromConfigProperties);
			}
			System.out.println("BROWSER=" + GlobalConstants.getBrowserName());

		} catch (CustomException e) {
			throw new CustomException("TestExecutionStatusManager.testCaseExecutionStarted() - error - " + e.getMessage());
		}
	}


	@After
	/**
	 * This method will be called after every scenario/ feature file execution. To be used to quit browser
	 * @param scenario
	 */
	public void quitBrowserInstance(Scenario scenario) {
		
		GlobalConstants.getDriver().quit();
	}


	//	@AfterStep
	//	public void showTestStepExecutionStatus(Scenario scenario) throws CustomException {
	//		
	//		
	//		if(scenario.isFailed()) {
	//			scenario.write("Test Step Execution Status = FAILED");
	//			//Logs.error("Test Step Execution Status = FAILED, scenario : " + scenario.getName());
	//			
	//		} else {
	////			myScenario.attach("This String Data", "This is Mediatype string", "This is name of attachment");
	////			myScenario.log("This is demo text****************");
	//			
	//			
	//			scenario.write("Test Step Execution Status = PASSED");
	//			//Logs.info("Test Step Execution Status = PASSED, scenario : " + scenario.getName());
	//		}
	//
	//		if(GlobalConstants.getTestEvidenceMessages().size() > 0) {
	//			for (String message : GlobalConstants.getTestEvidenceMessages()) {
	//				scenario.write(message);
	//			}
	//			GlobalConstants.clearTestEvidenceMessages();
	//		}
	//
	//		try {
	//			if(GlobalConstants.getTestEvidenceScreenshots().size() > 0) {
	//				scenario.write("File path of the screenshot(s) captured during this test step execution:");
	//				for(String filePath : GlobalConstants.getTestEvidenceScreenshots()) {
	//					scenario.write("embeddings\\" + new File(filePath).getName());
	//					byte[] encoded = Files.readAllBytes(Paths.get(filePath));	
	//					scenario.embed(encoded, "image/png"); 
	//				}
	//				GlobalConstants.clearTestEvidenceScreenshots();
	//			} else {
	//				if(scenario.isFailed()) {
	//					if(GlobalConstants.getDriver() != null) {
	//						scenario.write("On test step failure, captured page screenshot with path mentioned as below as "
	//								+ "No screenshots were captured during this test step execution:");
	//						
	//						CommonUtility.captureScreenshot();
	//						//CommonUtils.captureScreenshot();
	//						if(GlobalConstants.getTestEvidenceScreenshots().size() > 0) {
	//							scenario.write("File path of the screenshot(s) captured during this test step execution:");
	//							for(String filePath : GlobalConstants.getTestEvidenceScreenshots()) {
	//								scenario.write("embeddings\\" + new File(filePath).getName());
	//								byte[] encoded = Files.readAllBytes(Paths.get(filePath));	
	//								scenario.embed(encoded, "image/png"); 
	//							}
	//							GlobalConstants.clearTestEvidenceScreenshots();
	//						}
	//					}
	//				} else {
	//					scenario.write("No screenshots captured during this test step execution.");
	//				}
	//			}
	//		} catch(Exception e) {
	//			throw new CustomException("TestExecutionStatusManager.showTestStepExecutionStatus() - error - " + e.getMessage());
	//		}
	//	}

}
