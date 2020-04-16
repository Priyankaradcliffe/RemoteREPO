package testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseHardAssertion {
  @Test
  public void f() throws InterruptedException {

		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("email"));
		WebElement pw = driver.findElement(By.id("pass"));
		
		
		//This is to check if the check box is displayed or not
		//This will only continue if the below statement is true
		Assert.assertTrue(un.isDisplayed());
		un.sendKeys("abc@gmail.com");
		Assert.assertTrue(pw.isDisplayed());
		pw.sendKeys("A123comsdas");
		
		
		//Assert.assertFalse(pw.isDisplayed());
		//pw.sendKeys("A123comsdas");
		
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
		driver.close();
		
  }
}
