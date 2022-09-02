package test.Pom;




import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.Constants.GlobalConstants;
import core.CustomExceptions.CustomException;
import core.Utils.CommonUtility;
import test.PageElements.AdvancedSettingsPageElements;
import test.PageElements.StudioHomeElements;
import test.PageMessages.MessagesAdvancedSettingPage;




public class AdvancedSettingsPage {

	public AdvancedSettingsPageElements advancedSettingElements = null;
	public MessagesAdvancedSettingPage messagesAdvSetting = null;
	public StudioHomeElements  studioHomePageLocators= null;

	public AdvancedSettingsPage() {
		advancedSettingElements = new AdvancedSettingsPageElements(GlobalConstants.getDriver());
		messagesAdvSetting = new MessagesAdvancedSettingPage(GlobalConstants.getDriver());
		studioHomePageLocators = new StudioHomeElements(GlobalConstants.getDriver());
	}



	/**
	 * This method is used to update course visibility on advanced settings page
	 * @throws CustomException
	 */
	public void courseVisbilityUpdateNotUsed() throws CustomException{

		try {

			Thread.sleep(2000);

			//*******************TO TEST

			String tempUrl = GlobalConstants.Target_CC_URL.replace("-lms-", "-cms-");

			//initialise homeportal URL
			String launchPortalUrl = tempUrl+"settings/advanced/"
					+"course-v1:ACOrg18Oct003349+ACNumber18Oct003349+ACRun18Oct003349";

			//navigate to Home portal url
			GlobalConstants.getDriver().get(launchPortalUrl);

			Thread.sleep(3000);

			JavascriptExecutor jse;
			WebElement we;
			jse = (JavascriptExecutor) GlobalConstants.getDriver();
			try {

				WebElement weBlock = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/textarea"));

				String policyId = weBlock.getAttribute("id");
				//System.out.println(policyId);

				WebElement scrollEle = GlobalConstants.getDriver().findElement(By
						.xpath("//textarea[@id='"+policyId+"']"));

				System.out.println(scrollEle.getText());



				Thread.sleep(2000);

				WebElement eleClick = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div"));

				jse.executeScript("arguments[0].scrollIntoView(true);", eleClick);

				jse.executeScript("arguments[0].click();", eleClick);

				//jse.executeScript("arguments[0].setAttribute('style','visiblity: visible !important')", weBlock);

				GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();

				jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('')");

				Thread.sleep(2000);
				jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('public_outline')");

				Thread.sleep(2000);

				//jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('"+Keys.SPACE+"')");
				//weBlock.click();

				GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();

				//save button
				GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/div[5]/div/div/nav/ul/li[1]/button")).click();

				//saveButtonClick();

				Thread.sleep(2000);

				//				CommonUtility.eleWaitAndClick(GlobalConstants.getDriver().findElement(By
				//						.xpath("/html/body/div[7]/div/div[2]/div/div[3]/ul/li[2]/a")));

				Thread.sleep(2000);


				GlobalConstants.getDriver().navigate().refresh();

				jse.executeScript("arguments[0].setAttribute('value','abc')", weBlock);

				jse.executeScript("document.getElementById('policy_value_165').style.display='block';");


				we = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div"));

				//working element - - /html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div

				jse.executeScript("arguments[0].scrollIntoView(true);", we);
				String overflowVisibleCmd00 = "arguments[0].contentEditable = 'true'";
				jse.executeScript(overflowVisibleCmd00, we);
				jse.executeScript("arguments[0].setAttribute('style','disply: block')", we);

				jse.executeScript("arguments[0].setAttribute('value','abc')", we);

				System.out.println(	we.getText());

				jse.executeScript("arguments[0].click();", we);
				we.click();


				//part2
				WebElement we2 = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[1]"));
				String overflowVisibleCmd = "arguments[0].setAttribute('style','overflow: visible')";
				//String overflowVisibleCmd1 = "arguments[0].setAttribute('style','disply: block')";
				jse.executeScript(overflowVisibleCmd, we2);



				//part3
				WebElement we3 = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]"));
				String we3VisibleCmd = "arguments[0].setAttribute('style','visibility: visible')";
				jse.executeScript(we3VisibleCmd, we3);		


				//part4
				WebElement we4 = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[4]"));
				String we4VisibleCmd = "arguments[0].setAttribute('style','visibility: visible')";
				jse.executeScript(we4VisibleCmd, we4);	


				//part5
				WebElement we5 = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
				String we5VisibleCmd = "arguments[0].setAttribute('style','visibility: visible')";
				jse.executeScript(we5VisibleCmd, we5);

				//part6
				WebElement we6 = GlobalConstants.getDriver().findElement(By
						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span"));
				String we6VisibleCmd = "arguments[0].setAttribute('style','visibility: visible')";
				String overflowVisibleCmd6 = "arguments[0].setAttribute('style','disply: block')";
				String overflowVisibleCmd61 = "arguments[0].contentEditable = 'true'";


				jse.executeScript(we6VisibleCmd, we6);
				jse.executeScript(overflowVisibleCmd6, we6);
				jse.executeScript(overflowVisibleCmd61, we6);


				jse.executeScript("arguments[0].value='"+ "*" +"';", we6);
				jse.executeScript("arguments[0].setAttribute('value','abc')", we6);

				we6.sendKeys("Data Entered");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}








			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();



			WebElement clickedwe = 				
					GlobalConstants.getDriver().findElement(By
							.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[1]"));

			String unblockCmd = "arguments[0].setAttribute('style','overflow: visible')";

			jse.executeScript(unblockCmd, clickedwe);

			//jse.executeScript("arguments[0].click();", we);

			//jse.executeScript("arguments[0].value='"+ "*" +"';", we);



			//String new1 = "arguments[0].setAttribute('style','display: block')";

			//jse.executeScript(new1, publicOUtline);

			jse.executeScript("document.getElementById('policy_value_119').style.display='block';");

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_119']")).sendKeys("Data Entered");

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_119']")).sendKeys(Keys.TAB	);

			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[1]/div[2]/div")).sendKeys("Data Entered below");



			//jse.executeScript("arguments[0].value='xyz';", publicOUtline);



			//jse.executeScript(new1, publicOUtline);

			//jse.executeScript("arguments[0].value='xyz';", publicOUtline);


			//				WebElement uploadImage = GlobalConstants.getDriver().findElement(By.xpath("//textarea[@id='policy_value_119']"));


			GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[1]/div[2]/div/div[6]/div[1]/div/div")).click();


			//WebElement uploadImage = publicOUtline;

			//String scriptOn = "arguments[0].setAttribute('style','visibility: visible')";

			//jse.executeScript(scriptOn, uploadImage);

			// jse.executeScript("arguments[0].value='xyz';", uploadImage);

			//String blockOn = "arguments[0].removeAttribute('style','display: block')";

			//jse.executeScript(blockOn, uploadImage);

			//jse.executeScript("arguments[0].value='xyz';", uploadImage);

			//uploadImage.sendKeys("URL");

			jse.executeScript("document.getElementById('policy_value_119').click();");


			jse.executeScript("arguments[0].value='xyz';", GlobalConstants.getDriver().findElement(By.xpath("//textarea[@id='policy_value_119']")));

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_119']")).click();

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_119']")).sendKeys("{}");

			GlobalConstants.getDriver().findElement(By
					.cssSelector("#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div")).click();

			GlobalConstants.getDriver().findElement(By
					.cssSelector("#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div")).sendKeys("ABC");



			jse.executeScript("document.getElementById('policy_value_165').style.display='inline';");

			//CodeMirror-cursors

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_165']")).sendKeys("Data Entered");


			jse.executeScript("document.getElementsByClassName('/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span/span[@class='cm-string']')"
					+ "[0].value = 'XXX' ");



			//				jse.executeScript("arguments[0].value='"+ "HAHA" +"';", 
			//						
			//						GlobalConstants.getDriver().findElement(By
			//								.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span/span")));
			jse.executeScript("document.querySelector('#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div > div.CodeMirror-scroll > div.CodeMirror-sizer > div > div > div > div.CodeMirror-code > pre > span > span')"
					+ ".value='Data entered'");



			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span/span"))
			.sendKeys("DONE");





			WebElement tempEley = GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[1]"));

			//jse.executeScript("arguments[0].removeAttribute('style')", tempEley);

			jse.executeScript("document.getElementById('policy_value_165').style.display='block';");
			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_165']")).sendKeys("Data Entered");
			jse.executeScript("document.getElementById('policy_value_165').style.display='none';");


			//tempEley.clear();
			tempEley.sendKeys("RRR");

			jse.executeScript("document.getElementById('policy_value_165').removeAttribute('style')");
			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_165']")).sendKeys("Data Entered");

			//				WebElement tempEley = GlobalConstants.getDriver().findElement(By
			//						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[4]"));

			tempEley.click();

			//jse.executeScript("document.getElementById('policy_value_165').style.display='block';");
			jse.executeScript("arguments[0].removeAttribute('style')", tempEley);

			tempEley.sendKeys("RAJEEV");
			//				
			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();

			Thread.sleep(3000);

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_HOME);


			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE); robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE); robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			robot.keyPress(KeyEvent.VK_DELETE);robot.keyRelease(KeyEvent.VK_DELETE);

			Thread.sleep(2000);

			robot.keyPress(KeyEvent.VK_P);robot.keyRelease(KeyEvent.VK_P); robot.keyPress(KeyEvent.VK_U);robot.keyRelease(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_B);robot.keyRelease(KeyEvent.VK_B); robot.keyPress(KeyEvent.VK_L);robot.keyRelease(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_I);robot.keyRelease(KeyEvent.VK_I); robot.keyPress(KeyEvent.VK_C);robot.keyRelease(KeyEvent.VK_C);

			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_MINUS);robot.keyRelease(KeyEvent.VK_MINUS); 
			robot.keyRelease(KeyEvent.VK_SHIFT); 

			robot.keyPress(KeyEvent.VK_O);robot.keyRelease(KeyEvent.VK_O);robot.keyPress(KeyEvent.VK_U);robot.keyRelease(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_T); robot.keyPress(KeyEvent.VK_L);robot.keyRelease(KeyEvent.VK_L);
			robot.keyPress(KeyEvent.VK_I);robot.keyRelease(KeyEvent.VK_I); robot.keyPress(KeyEvent.VK_N);robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_TAB);robot.keyRelease(KeyEvent.VK_TAB);

			saveButtonClick();

			System.out.println("Deleted");

			//				
			//				Thread.sleep(3000);
			//				
			//				GlobalConstants.getDriver().findElement(By
			//						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div")).sendKeys("TEST");

			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();

//			WebElement courseVisible = GlobalConstants.getDriver().findElement(By
//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div"));

			Thread.sleep(3000);


			//jse.executeScript("arguments[0].click();", courseVisible);

			//WORKS HERE
			//jse.executeScript("document.getElementById('policy_value_165').style.display='block';");



			//html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div

			jse.executeScript("document.querySelector('#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div > div:nth-child(1)').style.display='block';");

			//String id = driver.findElement(By.xpath("//label[text()='First Name(s)']")).getAttribute("for");

			GlobalConstants.getDriver().findElement(By
					.cssSelector("#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div > div:nth-child(1)")).sendKeys("Data Entered");


			//document.querySelector('#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div > div:nth-child(1) > textarea')

			jse.executeScript("window.scrollBy(0,60)");

			//jse.executeScript("document.querySelector('#settings_advanced > section > ul > li:nth-child(24) > div.field.text.value > div').value='DEMO'");

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_165']")).sendKeys("Data Entered");

			GlobalConstants.getDriver().findElement(By
					.xpath("//textarea[@id='policy_value_165']")).sendKeys(Keys.TAB);

			GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).sendKeys(Keys.TAB);

			//				CommonUtility.sendTextRB(GlobalConstants.getDriver().findElement(By
			//						.xpath("//textarea[@id='policy_value_165']")), "Data Entered");



			System.out.println("Data Entered");

			//				GlobalConstants.getDriver().findElement(By
			//						.xpath("//textarea[@id='policy_value_165']")).sendKeys("Data Entered");
			//				
			//				
			//				jse.executeScript("arguments[0].value='"+ "TEST" +"';", courseVisible);
			//				
			//				GlobalConstants.getDriver().findElement(By
			//						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div")).sendKeys(Keys.ENTER);
			//				
			//				CommonUtility.sendTextRB(GlobalConstants.getDriver().findElement(By
			//						.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")), "TEST");




			Thread.sleep(3000);






			//TESTING COMPLETE****************************************************************************************************




			//			System.out.println(GlobalConstants.getDriver().findElement(By
			//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/textarea")).getText());
			//			
			//			System.out.println(GlobalConstants.getDriver().findElement(By
			//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]")).getText());
			//			
			//			System.out.println(GlobalConstants.getDriver().findElement(By
			//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[1]")).getText());
			//			
			System.out.println(GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div")).getText());

			System.out.println(GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span/span")).getText());

			CommonUtility.sendTextRB(GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div"))
					,"public_outline");

			///html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div

			//			CommonUtility.eleWaitAndSendValue(GlobalConstants.getDriver().findElement(By
			//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div")),"public_outline");

			//update course visibility
			CommonUtility.eleWaitAndSendValue(GlobalConstants.getDriver().findElement(By
					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/pre/span/span")),"public_outline");




		} catch (Exception e) {

			//e.printStackTrace();
			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}


	public void courseVisbilityUpdateNew() throws CustomException{

		try {

			Thread.sleep(2500);

			


			WebElement weBlock = advancedSettingElements.courseVisibilityTextAreaInput;
					
//					GlobalConstants.getDriver().findElement(By
//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/textarea"));

			String policyId = weBlock.getAttribute("id");
			//System.out.println(policyId);

			Thread.sleep(1000);

			//assign scroll to webelement and scroll followed by click
			WebElement eleScrollClick = advancedSettingElements.courseVisibilityTextAreaClick;
			
			CommonUtility.scrollTLocator(eleScrollClick);
					
//					GlobalConstants.getDriver().findElement(By
//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div"));				
//			jse.executeScript("arguments[0].scrollIntoView(true);", eleScrollClick);

			//element click
			CommonUtility.eleWaitAndClick(advancedSettingElements.courseVisibilityTextAreaClick);
			//GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();
			
			Thread.sleep(500);
			
			CommonUtility.js_SetValueUsing_CodeMirror(policyId, advancedSettingElements.publicOutlineValue);
			
			///***********WORKING IMP
			
//			JavascriptExecutor jse;
//			jse = (JavascriptExecutor) GlobalConstants.getDriver();
//
//			//remove intial value and set to blank
//			jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('')");
//			
//			//wait and update new value
//			Thread.sleep(2000);
//			jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('public_outline')");

			
			////////////////ENDS HERE

			//wait and click again
			Thread.sleep(500);
			CommonUtility.eleWaitAndClick(advancedSettingElements.courseVisibilityTextAreaClick);
			//GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();
						
			//wait after save
			Thread.sleep(500);


		} catch (Exception e) {

			//e.printStackTrace();
			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 


	}
	
	public void advancedModuleListUpdate() throws CustomException{

		try {

			Thread.sleep(4000);

			


			WebElement weBlock = advancedSettingElements.advancedModuleListTextAreaInput;
					
//					GlobalConstants.getDriver().findElement(By
//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/textarea"));

			String policyId = weBlock.getAttribute("id");
			//System.out.println(policyId);

			Thread.sleep(2000);

			//assign scroll to webelement and scroll followed by click
			//WebElement eleScrollClick = advancedSettingElements.advancedModuleListTextAreaClick;
			
			//CommonUtility.scrollTLocator(eleScrollClick);
					
//					GlobalConstants.getDriver().findElement(By
//					.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div"));				
//			jse.executeScript("arguments[0].scrollIntoView(true);", eleScrollClick);

			//element click
			CommonUtility.eleWaitAndClick(advancedSettingElements.advancedModuleListTextAreaClick);
			//GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();
			
			Thread.sleep(1000);
			
			CommonUtility.js_SetValueadvancedModuleList_LTIpassport_CodeMirror(policyId, advancedSettingElements.advancedModuleListValue);
			
			///***********WORKING IMP
			
//			JavascriptExecutor jse;
//			jse = (JavascriptExecutor) GlobalConstants.getDriver();
//
//			//remove intial value and set to blank
//			jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('')");
//			
//			//wait and update new value
//			Thread.sleep(2000);
//			jse.executeScript("document.getElementById('"+policyId+"').nextSibling.CodeMirror.setValue('public_outline')");

			
			////////////////ENDS HERE

			//wait and click again
			//Thread.sleep(1000);
			/////////////////////////////////////////////////////////////////////////CommonUtility.eleWaitAndClick(advancedSettingElements.advancedModuleListTextAreaClick);
			//GlobalConstants.getDriver().findElement(By.xpath("/html/body/div[1]/main/div/div[2]/section/article/form/section/ul/li[24]/div[2]/div")).click();
						
			//wait after save
			Thread.sleep(2000);


		} catch (Exception e) {

			//e.printStackTrace();
			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 


	}


	public void ltiPassPortUpdate() throws CustomException{

		try {

			Thread.sleep(4000);

			WebElement weBlock = advancedSettingElements.ltiPassPortTextAreaInput;

			String policyId = weBlock.getAttribute("id");
			
			Thread.sleep(2000);
			
			//assign scroll to webelement and scroll followed by click
			WebElement eleScrollClick = advancedSettingElements.ltiPassPortTextAreaClick;
			
			CommonUtility.scrollTLocator(eleScrollClick);

			//element click
			CommonUtility.eleWaitAndClick(advancedSettingElements.ltiPassPortTextAreaClick);
			
			Thread.sleep(1000);
			
			CommonUtility.js_SetValueadvancedModuleList_LTIpassport_CodeMirror(policyId, advancedSettingElements.ltiPassPortValue);
										
			//wait after save
			Thread.sleep(2000);


		} catch (Exception e) {

			//e.printStackTrace();
			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 


	}

	/**
	 * This method is used to enable section pre-req flag to true
	 * @throws CustomException
	 */
	public void enableSectionPreReqFlag() throws CustomException{

		try {

			Thread.sleep(4000);

			WebElement weBlock = advancedSettingElements.EnableSubSecPreReqValueTextAreaInput;

			String policyId = weBlock.getAttribute("id");
			
			Thread.sleep(2000);
			
			//assign scroll to webelement and scroll followed by click
			WebElement eleScrollClick = advancedSettingElements.EnableSubSecPreReqValueTextAreaClick;
			
			CommonUtility.scrollTLocator(eleScrollClick);

			//element click
			CommonUtility.eleWaitAndClick(advancedSettingElements.EnableSubSecPreReqValueTextAreaClick);
			
			Thread.sleep(1000);
			
			CommonUtility.js_SetValueadvancedModuleList_LTIpassport_CodeMirror(policyId, advancedSettingElements.trueValue);
										
			//wait after save
			Thread.sleep(2000);


		} catch (Exception e) {

			//e.printStackTrace();
			e.printStackTrace();
			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 


	}
	
	public void enableTimedExam () throws CustomException {
		
		try {
			Thread.sleep(2000);
			
			//call common method to update
			updateAdvancedSettings(messagesAdvSetting.enableTimedExam, messagesAdvSetting.trueValue, true);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Could not update timed exam value");
		}
		
	}
	
	/**
	 * This method is used to update the course display name
	 * @throws CustomException
	 */
	public void updateCourseDisplayName() throws CustomException {
		
		CommonUtility.threadWait(2000);
		
		try {
			
			//call common method to update
//			updateAdvancedSettings(messagesAdvSetting.courseDisplayNameLabel, studioHomePageLocators.getCourseName(), false);
			updateAdvancedSettings(messagesAdvSetting.courseDisplayNameLabel, messagesAdvSetting.digCourse, false);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Could not update Course Display Name");
		}
	}
	
	/**
	 * This method is used to update the certificate behaviour value
	 * @throws CustomException
	 */
	public void updateCertificateBehaviourValue() throws CustomException {
		
		CommonUtility.threadWait(2000);
		
		try {
			
			//call common method to update
//			updateAdvancedSettings(messagesAdvSetting.courseDisplayNameLabel, studioHomePageLocators.getCourseName(), false);
			updateAdvancedSettings(messagesAdvSetting.certBehaviour, messagesAdvSetting.certBehaviourValue, false);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException("Could not update Certificate Behaviour Name");
		}
	}
	
	/**
	 * This method is used to update advanced settings values based on field names
	 * @param fieldName
	 * @param valueToUpdate
	 * @param flagUpdate TODO
	 * @throws CustomException
	 */
	private void updateAdvancedSettings(String fieldName, String valueToUpdate, Boolean flagUpdate) throws CustomException {
		
		try {
			
			WebElement inputBlockText = advancedSettingElements.textAreaInput(fieldName);
			WebElement textAreaClick =  advancedSettingElements.textAreaClick(fieldName);

			String policyId = inputBlockText.getAttribute("id");
			
			Thread.sleep(2000);
						
			CommonUtility.scrollTLocator(textAreaClick);

			//element click
			CommonUtility.eleWaitAndClick(textAreaClick);
			
			Thread.sleep(1000);
			
			if (flagUpdate) {
				CommonUtility.js_SetValueadvancedModuleList_LTIpassport_CodeMirror(policyId, valueToUpdate);
			} else {
				CommonUtility.js_SetValueUsing_CodeMirror(policyId, valueToUpdate);
				
			}
			//wait after save
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new CustomException("Error occured while updating advanced settings");
		} catch (CustomException e) {
			e.printStackTrace();
			throw new CustomException("Error occured while updating advanced settings");
		}
	}
	
	/**
	 * This method is used to click on Save button on schedule details page
	 * @throws CustomException
	 */
	public void saveButtonClick() throws CustomException{

		try {
			
			CommonUtility.eleWaitAndClick(advancedSettingElements.saveButtonClick);
			
			//wait after save
			Thread.sleep(6000);

			
		} catch (Exception e) {


			throw new CustomException("Unexpected error occured due to element not found or invalid locator");
		} 

	}
}
