package pageobject;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonUtils.PropertiesFile;

public class Test2object {
	public WebDriver driver;
	Properties prop = new Properties();
	
	public Test2object(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement email() throws IOException
	{
		String path = "C:\\Users\\stanl\\Desktop\\Automation\\MAVEN_TESTING\\src\\test\\java\\testData\\Register.properties";
		PropertiesFile pf = new PropertiesFile();
		Object Email = pf.propertiesdata(path,"Email");
		System.out.println(Email);
		return driver.findElement(By.id((String) Email));
	}
}
