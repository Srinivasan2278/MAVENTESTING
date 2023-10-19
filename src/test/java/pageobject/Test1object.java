package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1object {
	
  public WebDriver driver;
  
  public Test1object(WebDriver driver) 
  
  {
	  PageFactory.initElements( driver,this);
  }
  
  @FindBy(xpath="// div[@class='wzrk-alert wiz-show-animate']/div[2]")
  WebElement alert;
   
  public WebElement alert()
  {
	  return alert;
  }
  
  @FindBy(xpath="//button[@id='wzrk-cancel']") 
  WebElement alertCancel;
  
  public WebElement alertCancel ()
  {
	  return alertCancel;
  }
}
