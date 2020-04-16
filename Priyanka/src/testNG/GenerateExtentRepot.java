package testNG;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GenerateExtentRepot {
	
	
	String Reports_path= "D:\\Selenium Workspace\\Priyanka\\ExtentReports\\report1.html";
	ExtentReports report;
	ExtentTest test;
	

	  @BeforeTest
	  public void StartReport() {
		  
		  report = new ExtentReports(Reports_path, true);
		  report.addSystemInfo("Hostname", "Goutham");
		  report.addSystemInfo("Environment", "Tester");
		  report.addSystemInfo("Username", "Priyanka");
		  report.loadConfig(new File("D:\\Selenium Workspace\\Priyanka\\test-output\\ExtentReports\\extent-config.xml"));

	  }
	  
	  @Test
	  public void DemoReportPass() {
		  	
		  	test = report.startTest("DemoReportPasses");
			Assert.assertTrue(true);
			test.log(LogStatus.PASS, "Assert pass condition is true");
	  }

	  @Test
	  public void DemoReportFail() {
		  	
		  	test = report.startTest("DemoReportFails");
			Assert.assertTrue(true);
			test.log(LogStatus.FAIL, "Assert pass condition is FALSE");
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
	
	
	  @AfterTest
	  public void afterTest() {
	  }
	
	  @BeforeSuite
	  public void beforeSuite() {
	  }
	
	  @AfterSuite
	  public void afterSuite() {
	  }
	
	}
