package testDefinitions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTest {
	@Given("Login to the page {string}")
	public void login_to_the_page(String string) {
	    
	}
	@When("page loads")
	public void page_loads() throws IOException {
	    XSSFWorkbook xssf = new XSSFWorkbook("D:\\Srini\\Qeads online course\\documents\\sheet.xlsx");   
	    XSSFSheet sheet = xssf.getSheet("Sheet1");
	    String name = sheet.getRow(0).getCell(0).getStringCellValue();
	    System.out.println(name);
	     
	}
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    System.out.println(string);
	    System.out.println(string2);
	    
	}
	@Then("Entered <username> is correct")
	public void entered_username_is_correct(io.cucumber.datatable.DataTable dataTable) {
	   System.out.println(dataTable.cell(0, 0));
	   System.out.println(dataTable.cell(0, 1));
	   System.out.println(dataTable.cell(0, 2));
	}
}
