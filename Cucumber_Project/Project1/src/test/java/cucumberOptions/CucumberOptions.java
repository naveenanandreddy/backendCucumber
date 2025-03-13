package cucumberOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class CucumberOptions {
	
	
	TestContextSetup testContextSetup;
	
	public CucumberOptions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	} 
	
	@Before
	public void beforeMethod(Scenario scenario) {
	
	testContextSetup.scenario=scenario;
		
	System.out.println("beforeMethod invoked");	
	}
	
	@After
	public void afterMethod() {
		
	System.out.println("afterMethod invoked");	
		
	}

}
