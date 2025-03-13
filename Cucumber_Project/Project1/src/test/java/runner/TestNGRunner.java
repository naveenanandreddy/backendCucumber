package runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import reports.Report;
import utils.TestContextSetup;


@CucumberOptions(features = "src/test/java/features",
				 glue={"cucumberOptions", "stepDefinition"},
				 tags="@Sanity",
				 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
				 monochrome = true
				 )
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	TestContextSetup testContextSetup;
	
	public TestNGRunner() {
		
	}
	
	public TestNGRunner(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@BeforeSuite
	public void initialize() {
		
	System.out.println("-------------Initialize Start...................");	
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("-------------tearDown Start...................");	
		Report.generateReport();
		System.out.println("-------------tearDown End...................");
	}

}
