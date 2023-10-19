package testDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import commonUtils.PropertiesFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.Test2object;

public class RegisterTest {
	public WebDriver driver;
	public Logger log;
	PropertiesFile pf = new PropertiesFile();
	@Given("Access the index page url")
	public void Access_the_index_page_url() throws IOException
	{
		log = LogManager.getLogger(RegisterTest.class);
		driver = new ChromeDriver();
		String path = "C:\\Users\\stanl\\Desktop\\Automation\\MAVEN_TESTING\\src\\test\\java\\testData\\Register.properties";
		String key = "url";
		Object url = pf.propertiesdata(path, key);
		driver.get((String) url);
		log.info(driver.getCurrentUrl());
	}
	
	@Then("Enter the valid email id")
	public void Enter_the_valid_email_id() throws IOException
	{
		Test2object t2 = new Test2object(driver);
		t2.email().sendKeys("srinivasanje007@gmail.com");
		log.error("This is a error info");
	}
	@Then("Take the Screenshot of the page")
	public void Take_the_Screenshot_of_the_page() throws IOException
	{
		TakesScreenshot s = (TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		String path ="C:\\Users\\stanl\\Desktop\\Automation\\MAVEN_TESTING\\Screenshots";
		File des = new File(path+"//test1.jpg");
		Files.copy(src,des);
	}
}
