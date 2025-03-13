package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reports.Report;
import utils.TestContextSetup;

public class firstStepDefinition {
	
	TestContextSetup testContextSetup;
	
	public firstStepDefinition() {
		
	}
	
	public firstStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
	@Given("Updation of data in excel sheet")
	public void updation_of_data_in_excel_sheet() {
	   
		System.out.println("Preparation of message is in progresss");
		Report.log(testContextSetup.scenario, "Preparation of message is in progresss");
	
	}
	@When("Generation of ISO message from excelSheet {string} and subSheet {string} with rowNumber {int}")
	public void generaReion_of_iso_message_from_excel_sheet_and_sub_sheet(String filePath, String sheetName, Integer int1) {
	   
		System.out.println("Message Generated");
		
		
		Report.log(testContextSetup.scenario, "Message Generated");
	}
	@Then("Posting the message in queue")
	public void posting_the_message_in_queue_row_number() {
	 
		System.out.println("Message Posted Successfully");
		Report.log(testContextSetup.scenario, "Message Posted Successfully");
	}

}
