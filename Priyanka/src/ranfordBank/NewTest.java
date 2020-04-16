package ranfordBank;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
		
  	WebDriver driver=null;
	String Driver_Path="D:\\Selenium Workspace\\Browser_drivers\\chromedriver.exe";
	ExtentReports report;
	String Reports_Path="D:\\Selenium Workspace\\Extent Reports\\Reports.html";
	ExtentTest test;
	String url="http://192.168.1.97/ebank2/Home.aspx";
	String Screen_Path="D:\\Selenium Workspace\\Screens\\";

  public void f() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
