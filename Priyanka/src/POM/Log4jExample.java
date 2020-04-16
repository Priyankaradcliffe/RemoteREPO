package POM;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.log.Logger;



public class Log4jExample {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Logger logger = Logger.getLogger("Log4jExample");
		//DOMConfigurator.configure("Log4j.xml"); // for log4j XML File
		PropertyConfigurator.configure("Log4j.properties");
		
		String path = "D:\\Selenium Workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  	//Launch browser
		
		logger.info("Browser Opened");
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		logger.info("entering Signin info");

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("A123comsdas");
		Thread.sleep(4000);
		driver.findElement(By.id("u_0_b")).click();
		
		
		logger.info("Validation started");

		
	}	

}
