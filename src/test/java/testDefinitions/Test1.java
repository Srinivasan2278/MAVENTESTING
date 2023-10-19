package testDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobject.Test1object;

public class Test1 {
	public WebDriver driver;
	@Given("Access the url {string}")
	public void access_the_url(String string) {
	    driver = new ChromeDriver();
	    driver.get(string);
	}

	@When("page loads expand the page")
	public void page_loads_expand_the_page() {
	    driver.manage().window().maximize();
	}

	@Then("verify the page title")
	public void verify_the_page_title() {
	    String title = driver.getTitle();
	 //  String title = "fail";
	    Assert.assertEquals("Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo", title);
	}
	

	@Then("close the page")
	public void close_the_page() {
	    driver.close();
	//	driver.quit();
	}
	       
	@When("page loads wait for ten seconds")
	public void page_loads_wait_for_ten_seconds () {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));              
	}

	@Then("alert popup should be displayed")
	public void alert_popup_should_be_displayed () {
	  Test1object to = new Test1object(driver);
	  String alertText = to.alert().getText();
	  System.out.println(alertText);
	}
	

	@Then("User should click on cancel")
	public void User_should_click_on_cancel () {
		Test1object to = new Test1object(driver);
		to.alertCancel().click();
	}
}

 
