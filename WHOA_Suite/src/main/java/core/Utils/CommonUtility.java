package core.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.google.gson.Gson;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;


public class CommonUtility  {
	
	public static LangParser lngParser = null;
	public static LangParserNew lngParserNew = null;

	/**
	 * captureScreenshot
	 * @throws CustomException
	 */
	public static void captureScreenshot() throws CustomException {

		String screenshotFileName = null;

		String ts = getCurrentTimestamp();
		ts = ts.replace(' ', '_');
		ts = ts.replace(':', '.');

		screenshotFileName = System.getProperty("user.dir") 
				+ "/target/screenshots/" + "screenshot" + "_" + ts + "_original.png";

		File scrFile = ((TakesScreenshot)GlobalConstants.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(screenshotFileName));

			//start resize image
			String resizedScreenshotFileName = System.getProperty("user.dir") 
					+ "/target/screenshots/" + "screenshot" + "_" + ts + ".png";

			ImageUtil.resizeImage(screenshotFileName, resizedScreenshotFileName);
			//end resize image

			GlobalConstants.addTestEvidenceScreenshot(resizedScreenshotFileName);

		} catch (IOException e) {
			throw new CustomException("CommonUtils.captureScreenshot() - error - " + e.getMessage());
		}
	}



	/**
	 * getCurrentTimestamp
	 * @return
	 */
	public static String getCurrentTimestamp(){

		Timestamp ts = new Timestamp(Calendar.getInstance().getTimeInMillis());
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss.SSS");
		String oldFormatedDate = formatter.format(new Date());

		String tsString = ts.toString();
		int msSeparatorPos = tsString.indexOf('.', tsString.length()-4);
		String msString = tsString.substring(msSeparatorPos+1);

		if (msString.length() == 1){
			msString =  msString + "00";
		}else if (msString.length() == 2){
			msString = msString + "0" ;
		}
		tsString = tsString.substring(0, msSeparatorPos + 1);
		tsString = tsString + msString;
		return oldFormatedDate.replace(" ", "_").replace(":", "_").replace(".", "_");
	}


	/**
	 * createScreenshotDirectory
	 * @throws CustomException
	 */
	public static void createScreenshotDirectory() throws CustomException {
		File screenshot = new File(System.getProperty("user.dir") + 
				"/target/screenshots/");
		if(!(screenshot.exists() && screenshot.isDirectory())) {
			screenshot.mkdirs();
		}
	}

	/**
	 * This is used to highlight a WebElement during execution. WebElement will be highlighted based on the boolean value of the status
	 * @param element
	 * @param status
	 * @throws CustomException 
	 */
	public static void highlightElement(WebElement element, Boolean status) throws CustomException {
		try {

			if (status) { 

				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) GlobalConstants.getDriver();
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",
						element);

			}

			//			((JavascriptExecutor) wd)
			//				.executeScript("arguments[0].setAttribute('style', 'border: 2px solid blue;');", element);
			//			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
			//					element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * highlightElement
	 * @param element
	 * @throws CustomException 
	 */
	public static void highlightClick(WebElement element, Boolean status)  {
		try {

			if (status) { 

				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) GlobalConstants.getDriver();
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;');",
						element);

			}

			//			((JavascriptExecutor) wd)
			//				.executeScript("arguments[0].setAttribute('style', 'border: 2px solid blue;');", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used for implicit wait
	 * @throws CustomException
	 */
	public static void implicitWaitForElement() throws CustomException {

		GlobalConstants.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * visibilityOf
	 * @param element
	 * @throws CustomException
	 */
	public static void isElementVisible(WebElement element) throws CustomException {

		try {
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 60,10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}

	}
	
	/**
	 * visibilityOf
	 * @param element
	 * @throws CustomException
	 */
	public static void isElementVisibleNew(Object element) throws CustomException {

		try {
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 30);
			wait.until(ExpectedConditions.visibilityOf((WebElement) element));
		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}

	/**
	 * This method is used as javascript wait for page loading until document status is complete
	 */
	public static void jsWaitTillPageLoadingComplete() {

		JavascriptExecutor js = (JavascriptExecutor)GlobalConstants.getDriver();
		js.executeScript("return document.readyState").toString().equals("complete");
	}

	public void jsWait() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) GlobalConstants.getDriver();
		String result = js.executeScript("return document.readyState").toString();
		if (!result.equals("complete")) {
			Thread.sleep(1000);
		} 
	}

	/**
	 * This method is used to click on edit button using class name
	 * @param className
	 * @throws CustomException
	 */
	public static void jSclickByClassName(String className) throws CustomException {

		JavascriptExecutor executor = (JavascriptExecutor)GlobalConstants.getDriver();

		executor.executeScript("document.getElementsByClassName"+className+".click();");

	}

	/**
	 * This method is used to scroll till the element and hightlight it
	 * @param scrollHighlight
	 * @throws CustomException
	 */
	public static void scrollHighlightElement(WebElement scrollHighlight) throws CustomException {

		scrollTLocator(scrollHighlight);
		highlightElement(scrollHighlight, GlobalConstants.highlighterFlag);

	}

	/**
	 * This method is used to click on link using jquery via class name
	 * @param className
	 * @throws CustomException
	 */
	public static void jQueryClickByClassName(String className) throws CustomException {

		JavascriptExecutor executor = (JavascriptExecutor)GlobalConstants.getDriver();

		executor.executeScript("document.querySelector('"+className+"').click();");

	}
	/**
	 * This javascript method is used to extract string value from webelement
	 * @param className
	 * @throws CustomException
	 */
	public static String javaScriptExtractText(WebElement wStrElement) throws CustomException {


		String wStr = (String) ((JavascriptExecutor) GlobalConstants.getDriver()).executeScript("return arguments[0].value;"
				,wStrElement);

		return wStr;

	}


	public static void isElementClickable(WebElement element) throws CustomException {

		try {
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 30,10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}

	}

	/**
	 * This method is used to navigate to first tab of browser
	 * @throws CustomException
	 */
	public static void navigateBrowserFirstTab() throws CustomException {

		GlobalConstants.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "1");

	}




	/**
	 * This method is used to wait for element and then click
	 * @param eleLocator
	 * @throws CustomException
	 */
	public static void eleWaitAndClick(WebElement eleLocator) throws CustomException {

		try {

			//wait for the element
			isElementVisible(eleLocator);

			isElementClickable(eleLocator);

			highlightClick(eleLocator, GlobalConstants.highlighterFlag);

			//click on element
			eleLocator.click();

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}


	/**
	 * This method is used to wait for element and then input value
	 * @param eleLocatorInput
	 * @throws CustomException
	 */
	public static void eleWaitAndSendValue(WebElement eleLocatorInput, Object valueToSend) throws CustomException {

		try {
			//wait for the element
			isElementVisible(eleLocatorInput);

			highlightElement(eleLocatorInput, GlobalConstants.highlighterFlag);

			//send that value into it
			eleLocatorInput.sendKeys(valueToSend.toString());

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}


	/**
	 * This method is used to input text after selecting and deleting previous text values inside
	 * @param eleLocatorInput
	 * @throws CustomException
	 */
	public static void removePrevTextInputNew(WebElement eleLocatorInput, Object valueToSend) throws CustomException {

		try {

			//wait for the element
			isElementVisibleNew(eleLocatorInput);

			eleLocatorInput.click();

			//click on shift and select all text to delete
			eleLocatorInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), Keys.DELETE);

			//delete text
			eleLocatorInput.sendKeys(valueToSend.toString());			

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}


	/**
	 * This method is used to wait for elements that may not be intractable
	 * @param eleLocatorInput
	 * @throws CustomException
	 */
	public static void sendTextRB(WebElement eleLocatorInput, Object valueToSend) throws CustomException {

		try {

			//			JavascriptExecutor jse = (JavascriptExecutor) GlobalConstants.getDriver();
			//			jse.executeScript("arguments[0].value='"+ valueToSend +"';", eleLocatorInput);
			//			
			//			jse.executeScript("arguments[0].scrollIntoView(true);", eleLocatorInput);
			//
			//			jse.executeScript("window.scrollBy(0,-100)");
			//
			//			eleLocatorInput.sendKeys(Keys.TAB);
			//
			//			eleLocatorInput.sendKeys(Keys.BACK_SPACE);

			//			jse.executeScript("arguments[0].value='"+ valueToSend +"';", eleLocatorInput);

			eleLocatorInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), Keys.DELETE);

			//eleLocatorInput.sendKeys(Keys.ENTER);

			eleLocatorInput.sendKeys(valueToSend.toString());

			//eleLocatorInput.sendKeys(Keys.HOME, Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);



			//((JavascriptExecutor) eleLocatorInput).executeScript("arguments[0].setAttribute('value', '" + valueToSend +"')", eleLocatorInput);
			//			JavascriptExecutor ex = (JavascriptExecutor) GlobalConstants.getDriver();
			//			
			//			ex.executeScript("arguments[0].value='"+ valueToSend +"';", eleLocatorInput);

			//JavascriptExecutor jse = (JavascriptExecutor)GlobalConstants.getDriver();
			//			jse.executeScript("document.getElementById("+eleLocatorInput+").setAttribute('value', '"+valueToSend+"')");

			//jse.executeScript("arguments[0].value='"+ valueToSend +"';", eleLocatorInput);

			//			eleLocatorInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
			//			eleLocatorInput.sendKeys(valueToSend.toString());
			//			eleLocatorInput.click();

			//			//send that value into it
			//			eleLocatorInput.sendKeys(valueToSend.toString());

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}

	/**
	 * This method is used to change focus from current webelement
	 * @param tabElement
	 */
	public static void tabFromElement(WebElement tabElement) throws CustomException {		

		try {
			//Change focus from the element by clicking tab
			tabElement.sendKeys(Keys.TAB);

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}

	}

	/**
	 * This method is used to select value from drop down
	 * @param eleLocatorInput
	 * @throws CustomException
	 */
	public static void dropDownValueSelect(WebElement eleLocatorInput, Object valueToSend) throws CustomException {

		try {
			//wait for the element
			isElementVisible(eleLocatorInput);

			//initialise dropdown and select value
			Select selectText = new Select(eleLocatorInput);
			selectText.selectByVisibleText(valueToSend.toString());

		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}


	public static void switchToTab(int tabNumber) throws CustomException {

		try {
			ArrayList<String> switchTabTo = new ArrayList<String> (GlobalConstants.getDriver().getWindowHandles());
			GlobalConstants.getDriver().switchTo().window(switchTabTo.get(tabNumber));
		} catch (Exception e) {


			throw new CustomException("Incorrect tab number or could not open or refer to the new tab");
		} 

	}

	/**
	 * Jswait for element
	 * @param Webelement
	 * @throws CustomException
	 */
	public void JSPageWait() throws CustomException {

		//Initializing JS wait

		WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 30);
		//JavascriptExecutor w = (JavascriptExecutor) GlobalConstants.getDriver();

		wait.until((ExpectedCondition<Boolean>) wd ->
		((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
		//		System.out.println(readyState);

		//		wait.until((ExpectedCondition<Boolean>) GlobalConstants.getDriver() ->, ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

		//wait.Until(ExpectedConditions.jsReturnsValue("return window.document.hasHomeMounted").equals("complete"));

		//For java application
		//		((JavascriptExecutor) JDriver).executeScript("return document.readyState").equals("complete"));	

		//					or use the below code
		//					wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));	

	}
	
	
	public static WebElement replaceText(WebElement webE, String newText) {
		
		int start,end = 0;
		String xpathString = null;
		
		start = webE.toString().indexOf(",'")+2;
		end = webE.toString().indexOf("')");
		
//		System.out.println(webE.equals(xpathString));
		
		
		 
		String extractedText = webE.toString().substring(start, end);
		System.out.println(extractedText);
		
		xpathString = webE.toString().replace(extractedText, newText);
				//webElementText.toString().replace(temp, newText);
		//webElementText = webElementText.toString().replace(temp, newText).;
		System.out.println(xpathString);
		return  GlobalConstants.getDriver().findElement(By.xpath(xpathString));
				//webElementText.toString().replace(temp, newText);
	}
	
public static WebElement replaceWebElementString(String webElementText, String newText) {
		
		int start,end = 0;
		Object obj = webElementText;
		//WebElement newWebElement = null;
		
		start = webElementText.toString().indexOf(",'")+2;
		end = webElementText.toString().indexOf("')");
		
//		System.out.println(webElementText);
//		System.out.println(start );
//		System.out.println(end);
		
		//int len = end- start;
		 
		String temp = webElementText.toString().substring(start, end);
//		System.out.println(temp);
		
		obj = obj.toString().replace(temp, newText);
				//webElementText.toString().replace(temp, newText);
//		System.out.println(obj);
		
		webElementText = webElementText.replace(temp, newText);
		
		//newWebElement = GlobalConstants.getDriver().findElement(By.xpath(webElementText));
		return  GlobalConstants.getDriver().findElement(By.xpath(webElementText));
	}
	
	public static LangParser getLanguageDataFromJson(String langClass) {

		String dataFilePath = System.getProperty("user.dir") 
				+ "/src/test/resources/jsonFiles/";

		//JSONObject testObject = null; 

		switch (langClass) {
		case "English":

			dataFilePath = dataFilePath+"eng.json";
			System.out.println("English language selected");

			break;

		case "Arabic":

			dataFilePath = dataFilePath+"ara.json";
			System.out.println("Arabic language selected");

			break;

		case "Chinese":

			dataFilePath = dataFilePath+"zhu.json";
			System.out.println("Chinese language selected");

			break;
			

		case "French":

			dataFilePath = dataFilePath+"frn.json";
			System.out.println("French language selected");

			break;
			

		case "Russian":

			dataFilePath = dataFilePath+"rus.json";
			System.out.println("Russian language selected");

			break;
			

		case "Spanish":

			dataFilePath = dataFilePath+"esp.json";
			System.out.println("Spanish language selected");

			break;

		default:
			break;
		}





		try {
			//FileReader reader = new FileReader(dataFilePath);                        
			//JSONParser jsonParser = new JSONParser();
			String reader = Files.lines(Paths.get(dataFilePath)).collect(Collectors.joining());
			JSONObject jsonObject = new JSONObject(reader);

			Gson newgSon = new Gson();

			lngParser = newgSon.fromJson(jsonObject.toString(), LangParser.class);
			//String discoverlearning = lngParser.getDashboard().getDiscoverLearning();
			return lngParser;
			//testObject = (JSONObject) jsonObject;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	//New parser method

	public static LangParserNew getLanguageDataFromJsonNew(String langClass) {

		String dataFilePath = GlobalConstants.jsonFolderPath;

		//JSONObject testObject = null; 

		switch (langClass) {
		case "English":

			dataFilePath = dataFilePath+"eng.json";
			
			break;

		case "Arabic":

			dataFilePath = dataFilePath+"ara.json";
			
			break;

		case "Chinese":

			dataFilePath = dataFilePath+"zhu.json";
			
			break;
			

		case "French":

			dataFilePath = dataFilePath+"frn.json";
			
			break;
			

		case "Russian":

			dataFilePath = dataFilePath+"rus.json";
			
			break;
			

		case "Spanish":

			dataFilePath = dataFilePath+"esp.json";
			
			break;

		default:
			break;
		}


		System.out.println(langClass+" language selected");


		try {
			//FileReader reader = new FileReader(dataFilePath);                        
			//JSONParser jsonParser = new JSONParser();
			String reader = Files.lines(Paths.get(dataFilePath)).collect(Collectors.joining());
			JSONObject jsonObject = new JSONObject(reader);

			Gson newgSon = new Gson();

			lngParserNew = newgSon.fromJson(jsonObject.toString(), LangParserNew.class);
			//String discoverlearning = lngParser.getDashboard().getDiscoverLearning();
			return lngParserNew;
			//testObject = (JSONObject) jsonObject;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/**
	 * This method is used to scroll page up to the mentioned webelement
	 * @param locator
	 */
	public static void scrollTLocator(WebElement locator) throws CustomException{

		try {
			JavascriptExecutor jse;
			jse = (JavascriptExecutor) GlobalConstants.getDriver();

			WebElement scrollToElement = locator;

			jse.executeScript("arguments[0].scrollIntoView(true);", scrollToElement);
		} catch (Exception e) {
			throw new CustomException("Not able to locate the element- " + e.getMessage());
		}
	}

	/**
	 * This method is used to set value of course visiblity using javascript set value
	 * @param idValue
	 * @param valueToSet
	 * @throws CustomException
	 */
	public static void js_SetValueUsing_CodeMirror(String idValue, String valueToSet) throws CustomException {

		try {
			JavascriptExecutor jse;
			jse = (JavascriptExecutor) GlobalConstants.getDriver();

			//remove intial value and set to blank
			jse.executeScript("document.getElementById('"+idValue+"').nextSibling.CodeMirror.setValue('')");

			//wait and update new value
			Thread.sleep(500);
			jse.executeScript("document.getElementById('"+idValue+"').nextSibling.CodeMirror.setValue('"+valueToSet+"')");

		} catch (Exception e) {
			throw new CustomException("Not able to locate the element- " + e.getMessage());
		}
	}
	
	/**
	 * This method is used in slider where moving from x position to y position with reference to slider locator as webelement
	 * @param targetElement
	 * @param offSet
	 */
	public static void dragAndDrop(WebElement targetElement, int offSet) {
		
		Actions move = new Actions(GlobalConstants.getDriver());
        Action action = (Action) move.dragAndDropBy(targetElement, offSet, 0).build();
        action.perform();
	}
	
	/**
	 * This method uses javascript click using ID
	 * @param eleToClick
	 * @throws CustomException
	 */
	public static void jsClickUsingID(String eleToClick) throws CustomException {
		
		try {
			JavascriptExecutor jse;
			jse = (JavascriptExecutor) GlobalConstants.getDriver();

			//remove intial value and set to blank
			jse.executeScript("document.getElementById('"+eleToClick+"').click();");
//			jse.executeScript("document.querySelector('"+className+"').click();");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* This method is used to set value of advanced Module List using javascript set value
	 * @param idValue
	 * @param valueToSet
	 * @throws CustomException
	 */
	public static void js_SetValueadvancedModuleList_LTIpassport_CodeMirror(String idValue, String valueToSet) throws CustomException {

		try {
			JavascriptExecutor jse;
			jse = (JavascriptExecutor) GlobalConstants.getDriver();

			//remove intial value and set to blank
			jse.executeScript("document.getElementById('"+idValue+"').nextSibling.CodeMirror.setValue('')");

			//wait and update new value
			Thread.sleep(2000);
			jse.executeScript("document.getElementById('"+idValue+"').nextSibling.CodeMirror.setValue('"+"["+valueToSet.trim()+"]"+"')");

		} catch (Exception e) {
			throw new CustomException("Not able to locate the element- " + e.getMessage());
		}
	}
	
	public static void runAutoItExeProgram_Windows(String exePathName) throws CustomException {

		try {
			Runtime.getRuntime().exec(exePathName);

		} catch (IOException e) {
			
			e.printStackTrace();
			throw new CustomException("could not run the program for the following: either exe file not found or file is being executed in OS other than windows");
		}
	}
	
	public static void runUploadProcess(String courseLocation,String courseFileName) throws CustomException {

		try {						
			
			String exeFileWithPath;
			
			try {
				
				exeFileWithPath = GlobalConstants.libFolderPath+GlobalConstants.executableFileName;
			} catch (FileSystemNotFoundException fn) {
				
				throw new CustomException("Executable file not found in the location");
			}					
		
			courseLocation = GlobalConstants.libFolderPath+" "+courseFileName;
			String finalExeString = exeFileWithPath +" "+courseLocation+" "+courseFileName;					
			Runtime.getRuntime().exec(finalExeString);

		} catch (IOException e) {
			
			e.printStackTrace();
			throw new CustomException("could not run the program for the following: either exe file not found or file is being executed in OS other than windows");
		}
	}
	
	public static void runImportProcess() {
		
		try {
			
			Runtime.getRuntime().exec(GlobalConstants.importProcessPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runFileUploadProcess(Object processLocation, Object processArgument) throws CustomException {
		
		try {
//			Runtime run  = Runtime.getRuntime();
//            Process proc = run.exec(processLocation.toString());
//            
//            run.exec(processLocation.toString());
//            run.exec(processName.toString(),processArgument.toCharArray());
			
//			processLocation = System.getProperty("user.dir") 
//					+ "\\src\\test\\resources\\Lib\\FileUploadProcess.exe";
//			
//			processArgument = System.getProperty("user.dir") 
//					+ "\\src\\test\\resources\\Lib\\"+"course.uskyzq60.tar.gz";
			
//			System.out.println(processLocation);System.out.println(processArgument);
//            
			ProcessBuilder pb = new ProcessBuilder();
			Thread.sleep(2000);
            pb.command(processLocation.toString(),processArgument.toString());
            pb.start();
//            System.out.println("FileUploaded");
            
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("could not run the program for the following: either exe file not found or file is being executed in OS other than windows");
		}
		
	}

	/**
	 * This generic method is used to verify actual and expected values and report
	 * @param actualVal
	 * @param expVal
	 * @throws CustomException
	 */
	public static void verifyAndReport(Object actualVal, Object expVal) throws CustomException {

		try {
			
			SoftAssert newSoftAssertion = new SoftAssert();
			
			newSoftAssertion.assertEquals(actualVal, expVal);
			
			newSoftAssertion.assertAll();

			GlobalConstants.scGlobal.write("Following has been successfully verified - "+ actualVal);
			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);
		} catch (AssertionError e) {

			CommonUtility.captureScreenshot();
			TestExecutionManager.embedScreenShot(GlobalConstants.scGlobal);

			throw new CustomException("Test Step failed, as Expected value '"+expVal+ "' and Actual value '"+actualVal+ "' did not match");

		} catch (Exception e) {

			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 
		
		
	}
	

	public static void testProgramNotToPush() throws CustomException {
		
		
		try {
			
			
			WebElement langFZ = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'zh')]]/label[contains(@class, 'custom-control-label')]"));
			
			langFZ.click();
			
			WebElement langF1Z = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'zh')]]/label[contains(@class, 'custom-control-label')]/span"));
			
			System.out.println(langF1Z.getText());
			
			
			
			WebElement langFZfr = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'fr')]]/label[contains(@class, 'custom-control-label')]"));
			
			langFZfr.click();
			
			WebElement langF1Zfr = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'fr')]]/label[contains(@class, 'custom-control-label')]/span"));
			
			System.out.println(langF1Zfr.getText());
			
			
			
			WebElement langFZru = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'ru')]]/label[contains(@class, 'custom-control-label')]"));
			
			langFZru.click();
			
			WebElement langF1Zru = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'ru')]]/label[contains(@class, 'custom-control-label')]/span"));
			
			System.out.println(langF1Zru.getText());
			
			
			WebElement langFZes = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'es')]]/label[contains(@class, 'custom-control-label')]"));
			
			langFZes.click();
			
			WebElement langF1Zes = GlobalConstants.getDriver().findElement(By
					.xpath("//div[contains(@class, 'lxp-radio-group')]/div[contains(@class, 'custom-control')][.//input[contains(@value, 'es')]]/label[contains(@class, 'custom-control-label')]/span"));
			
			System.out.println(langF1Zes.getText());
			
		
			
			WebElement w1 = GlobalConstants.getDriver().findElement(By
					.xpath("//input[contains(@value, 'ar')]"));
			
			w1.click()	;
			
			System.out.println(w1.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		List<WebElement> sectionCounter = GlobalConstants.getDriver().findElements(By
				.xpath("/html/body/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div"));
		
		System.out.println(sectionCounter.size());
		
		
		for (WebElement specificCard : sectionCounter ) {
			
			
//			String cardName1 = specificCard.findElement(By.xpath("/div/div/div/div/div/div[2]/div/div[1]/h4"))
//					.getAttribute("title");
//			
//			System.out.println(cardName1);
//			
//			String cardName3 = specificCard.findElement(By.xpath("/div/div/div/div/div/div[2]/div/div[1]/h4")).getText();
//					
//			
//			System.out.println(cardName3);
			
			String cardName4 = specificCard.findElement(By.xpath(".//div[@class='row m-0 p-3 lxp-card__content']/div/div[@class='lxp-card']/h4")).getText()	;
			System.out.println(cardName4);
			
			
			String cardName2 = specificCard.findElement(By.xpath(".//div[@class='row m-0 p-3 lxp-card__content']/div/div[@class='lxp-card']/h4"))
					.getAttribute("title");
			System.out.println(cardName2);
			
			}
		
		
		
//		String tempUrl = "https://cms-staging.lxp.academy.who.int/course/course-v1:HTM22Nov175949Org+HTM22Nov175949Number+HTM22Nov175949Run";
//		
//		GlobalConstants.getDriver().navigate().to(tempUrl);
//		
//		GlobalConstants.getDriver().findElement(By.xpath("//a[contains(text(),'View Live')]")).click();
//		
//		CommonUtility.switchToTab(1);
//		
//		WebElement cname = GlobalConstants.getDriver().findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/h3"));
//		
//		System.out.println(cname.getAttribute("title"));
//		
//		CommonUtility.switchToTab(0);
//		
//		//https://cms-staging.lxp.academy.who.int/course/course-v1:HTML22Nov231237Org+HTML22Nov231237Number+HTML22Nov231237Run
//		
//		GlobalConstants.getDriver().findElement(By.xpath("//div[@class='subsection-header']//h3/span[2]/span[contains(text(),'Subsection')] ")).click();
//		
//		GlobalConstants.getDriver().findElement(By.xpath("//div[@class='unit-header']//h3/span/span/a[contains(text(),'HTML-Text')]")).click();
//		
//		try {
//			Thread.sleep(3000);
//			
//			  
//		
//		
//		System.out.println(GlobalConstants.getDriver().findElement(By.xpath("//span[contains(text(),'HTM22Nov175949')]")).getText());
//		
//		CommonUtility.switchToTab(0);
//		
//		CommonUtility.switchToTab(1);
//		
//		WebElement getTxt = GlobalConstants.getDriver().findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/h3"));
//		
//		System.out.println(getTxt.getAttribute("title"));
		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	/**
	 * This method is used to return boolean value based on windows OS or not
	 * @throws CustomException
	 */
	public static Boolean windowsOsCheck() throws CustomException {
		
		Boolean isWindowsOS=false;
		
		String osName = System.getProperty("os.name").toLowerCase();

		if(osName.contains(GlobalConstants.windowsOS)) {
			
			isWindowsOS = true;
		}
		
		return isWindowsOS;
		
	}
	
	public static void threadWait(int milliSec)  {
		
		try {
			
			Thread.sleep(milliSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to wait for invisiblity of the element
	 * @param locator
	 * @throws CustomException
	 */
	public static void isElementNotPresent(WebElement locator) throws CustomException {
		
		try {
			
			isElementVisible(locator);
			
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), 60,10);
			wait.until(ExpectedConditions.invisibilityOf(locator));
		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}
	
	/**
	 * This method is used to Long wait for visibility of the element
	 * @param locator
	 * @throws CustomException
	 */
	public static void elementDisplayed(WebElement locator, int waitTime) throws CustomException {
		
		try {
			
			isElementVisible(locator);
			
			WebDriverWait wait = new WebDriverWait(GlobalConstants.getDriver(), waitTime,5);
			wait.until(ExpectedConditions.visibilityOf(locator));
		} catch(Exception e) {
			throw new CustomException("Not able to locate the element, after waiting - " + e.getMessage());
		}
	}
	
}
