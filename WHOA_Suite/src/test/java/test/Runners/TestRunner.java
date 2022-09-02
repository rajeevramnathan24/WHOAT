package test.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import com.cucumber.listener.ExtentProperties;
//import com.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(
		glue = {"test.StepDefinitions","core.Utils"},
		features = {"src/test/resources/features"},
//				features = GlobalConstants.content,
		 
		
		
//				format= {"pretty","html:target/cucumber-reports",
//        "json:target/cucumber-reports/CucumberTestReport.json"},
//		
		plugin = {	"pretty",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml",
				"html:target/cucumber-reports"},
		
		
				monochrome = true, 
		tags = "@LXPRDMA"
//		tags = "@DemoCS or @RefreshIndex or  @Demopass or @Demofail"
//		tags = {"~@Ignore"} //"@Studiosanity, @LXPsanity, @LXPCompleteCourse, @sample"//, "@LXPsanity","@StudioLXPsanity"}
//		tags = "@LXPSanity or CCSanity or @sample or @createCourse or @LXPCompleteCourse or @Studiosanity"
//		tags = "@TOP or @RefreshIndex or @LXPTOP or @LXPTOPIncomplete"
		)
		
//		plugin = {	"com.cucumber.listener.ExtentCucumberFormatter:", 
//				"json:target/cucumber-reports/cucumber.json"}
		
//		plugin = {
//				"pretty", 
//				"json:target/cucumber-reports/cucumber.json",
//				"junit:target/cucumber-reports/cucumber.xml",
//				"html:target/cucumber-reports"
//				}
		//)



public class TestRunner {
	
//	@Before
//	public static void setFeatureFile() {
//		
////		Main.main(new String[]{"-g", "StepDefinition", "-t", "<your tag what you need to test", "/STAF/src/main/java/CucumberFeature/GmailLoginLogout.feature"});
//		Main.main(new String[]{"test.StepDefinitions","core.Utils",
//				"-t", "~@Ignore",				
//				"src/test/resources/features"});
		
//		List<String> args = new ArrayList<String>();
//		args.addAll(featurePaths);
//		RuntimeOptions runtimeOptions = new RuntimeOptions(args);
//		
//		try {
//			args.add("1");
//			RuntimeOptions runtimeOptions = new RuntimeOptions(args);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//	}
	
	
}
	
//	static String ReportName= CF.ReportName(); //function which creates file name as per the execution and saved in string.
//    @BeforeClass
//    public static void setup() {
//        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//        extentProperties.setReportPath("target/cucumber-reports/"+ReportName+".html"); //used same string name to create the file with the same name.
//        PropertyConfigurator.configure(".//src//log4j.properties");
//    }
	



