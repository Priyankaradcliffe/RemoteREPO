package testNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	
		public static void main(String[] args) throws Exception 
		{
			
			String file_path="D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
			//Create object for extentReports
			ExtentReports reports=new ExtentReports("D:\\Selenium Workspace\\Priyanka\\test-output\\Myreports.html",true);
			
			
			//Create test using extentReports
			ExtentTest test=reports.startTest("Gmail_Signin_invalid");
			
		
			System.setProperty("webdriver.chrome.driver", file_path);
						    
			//browser initiation
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			test.log(LogStatus.INFO, "browser launched");
			
			//Identify email editbox
			
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			test.log(LogStatus.INFO, "Email validation completed");
			
			Thread.sleep(500);
			test.log(LogStatus.INFO, "Waiting 1/2 seconds to load password ");
			
			//Identify password editbox
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys("HELLOcDM0");
			test.log(LogStatus.INFO, "Password Entry sucessfull");
			
			Thread.sleep(2000);
			test.log(LogStatus.INFO, "Waiting 2 second to click Login");
			
			driver.findElement(By.id("u_0_b")).click();
			test.log(LogStatus.INFO, "Facebook Login Completed");
	
			reports.endTest(test);
			
		
			//Clear and update all reports
			reports.flush();

		}

}
